package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P06_SearchPage;

public class TC06_SerchBySelectFromAutoListTest extends TC01_PageBaseTest{
    P06_SearchPage searchPage ;
    SoftAssert softAssert;
    String searchItem="App";

    @Test
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







        }
