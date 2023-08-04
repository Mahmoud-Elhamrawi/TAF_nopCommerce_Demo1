package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P02_homePage;
import pages.P03_RegisterPage;
import pages.P06_SearchPage;
import pages.P10_AddReivewPage;

public class TC10_AddReviewTest extends TC01_PageBaseTest{


    //1-register
    P02_homePage homePage ;
    P03_RegisterPage registerPage ;

    @Test(priority = 1)
    public void ValidRegisteration() throws InterruptedException {
        homePage =  new P02_homePage(driver);
        homePage.registerLink.click();
        registerPage =new P03_RegisterPage(driver);
        registerPage.registerAction("ali","test","ali37@test.com","123456","123456");

        SoftAssert softAssert = new SoftAssert();
        String actual01="Your registration completed";
        softAssert.assertEquals(actual01,registerPage.assertResult01.getText());
        System.out.println(registerPage.assertResult01.getText());
       Thread.sleep(5000);
    }

    //2-search
    P06_SearchPage searchPage ;
    SoftAssert softAssert;
    String searchItem="App";

    @Test(priority = 2)
    public void searchFromUl() throws InterruptedException {

        searchPage = new P06_SearchPage(driver);
        searchPage.selectFromSearchList(searchItem);

        softAssert = new SoftAssert();

        String actulUrl ="https://demo.nopcommerce.com/apple-macbook-pro-13-inch";
        String expectUrl =driver.getCurrentUrl();
        softAssert.assertEquals(actulUrl,expectUrl);

        softAssert.assertTrue(searchPage.assertSearch2.getText().contains("Apple MacBook Pro 13-inch"));



        softAssert.assertAll();



    }

    //3-add review
     @Test(priority = 3)
    public void AddReview() throws InterruptedException {
         P10_AddReivewPage addReivewPage = new P10_AddReivewPage(driver);
         addReivewPage.GoToReviewKink();
         Thread.sleep(2000);
         addReivewPage.fillReviewForm("apple" , "good");




     }





}
