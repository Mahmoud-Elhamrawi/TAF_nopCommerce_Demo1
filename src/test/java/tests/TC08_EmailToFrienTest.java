package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P02_homePage;
import pages.P03_RegisterPage;
import pages.P06_SearchPage;
import pages.P08_EmailToFriend;

public class TC08_EmailToFrienTest extends TC01_PageBaseTest{
    //1-register
    P02_homePage homePage ;
    P06_SearchPage searchPage ;
    P03_RegisterPage registerPage ;
    P08_EmailToFriend p08EmailToFriend ;
    SoftAssert softAssert;
    @Test(priority = 1)
    public void ValidRegisteration()
    {
        homePage =  new P02_homePage(driver);
        homePage.registerLink.click();
        registerPage =new P03_RegisterPage(driver);
        registerPage.registerAction("ali","test","ali132@test.com","123456","123456");

        SoftAssert softAssert = new SoftAssert();
        String actual01="Your registration completed";
        softAssert.assertEquals(actual01,registerPage.assertResult01.getText());
        System.out.println(registerPage.assertResult01.getText());

    }
    //2-search
    String searchItem="App";
    @Test(dependsOnMethods = {"ValidRegisteration"})
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

    //3-naviagte to email to friend page
    @Test(dependsOnMethods = {"searchFromUl"})
    public void EamailToMyFriend()
    {

        p08EmailToFriend= new P08_EmailToFriend(driver);
        p08EmailToFriend.fillEmailToFriend("test@test.com" , "ali29@test.com","welcome itis  nice product");



    }










}
