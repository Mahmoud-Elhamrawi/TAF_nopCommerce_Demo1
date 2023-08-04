package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P07_ContactUsPage;

public class TC07_ContactUsTest extends TC01_PageBaseTest{

    P07_ContactUsPage contactUsPage;
    SoftAssert softAssert;



    @Test
    public void ContactUs() throws InterruptedException {

        contactUsPage = new P07_ContactUsPage(driver);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,2500)");
        Thread.sleep(3000);
        contactUsPage.contactLink.click();

        softAssert = new SoftAssert();
        softAssert.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/contactus"));
        System.out.println(driver.getCurrentUrl());
        softAssert.assertEquals("Contact Us",contactUsPage.assertTitle.getText());
        softAssert.assertAll();
        contactUsPage.goToContactPage("mahmodu" , "test@test.com" , "ssss");

    }




}
