package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P06_SearchPage;

public class TC05_SearchTest extends TC01_PageBaseTest{
String searchitem ="Apple MacBook Pro 13-inch";
    P06_SearchPage searchPage ;
     SoftAssert softAssert ;
    @Test
    public void searchFunction()
    {
     searchPage = new P06_SearchPage(driver);

     //search by clicking on search button
      searchPage.fillSearchWord(searchitem);

     softAssert =new SoftAssert();
     String actualUrl = "https://demo.nopcommerce.com/search?q=Apple+MacBook+Pro+13-inch";
     String expectUrl  =driver.getCurrentUrl();
     softAssert.assertEquals(actualUrl,expectUrl);
     softAssert.assertTrue(searchPage.assertSearch.getText().contains("Apple MacBook Pro 13-inch"));
     softAssert.assertAll();
    }









}
