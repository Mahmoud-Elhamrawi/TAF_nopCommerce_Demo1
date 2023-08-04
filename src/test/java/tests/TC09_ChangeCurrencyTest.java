package tests;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P02_homePage;
import pages.P06_SearchPage;
import pages.P09_ChangeCurrencyPage;

public class TC09_ChangeCurrencyTest extends TC01_PageBaseTest{

    SoftAssert softAssert;
    P06_SearchPage searchPage ;
    P09_ChangeCurrencyPage changeCurrencyPage;
    String searchItem="App";

    @Test(priority = 1 )
    public  void  changeCurrency(){
        changeCurrencyPage = new P09_ChangeCurrencyPage(driver);
        Select select = new Select(changeCurrencyPage.customerCurrencyList);
        select.selectByVisibleText("Euro");

    }

    @Test(priority = 2)
    public void searchToCheckOnCurrency() throws InterruptedException {

        searchPage = new P06_SearchPage(driver);
        searchPage.selectFromSearchList(searchItem);
        softAssert = new SoftAssert();
        changeCurrencyPage = new P09_ChangeCurrencyPage(driver);
        softAssert.assertTrue(changeCurrencyPage.assertCurrency.getText().contains("€"));
        softAssert.assertAll();
        System.out.println(changeCurrencyPage.assertCurrency.getText());
    }









}
