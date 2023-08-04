package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P02_homePage;
import pages.P04_loginPage;

public class TC03_LoginTest extends TC01_PageBaseTest{

    P02_homePage homePage;
    P04_loginPage loginPage;
    @Test
       public void login()
     {
         homePage =new P02_homePage(driver);
         homePage.loginLink.click();

         loginPage = new P04_loginPage(driver);
         loginPage.fillLoginInputs("ali18@test.com","123456");

         SoftAssert softAssert = new SoftAssert();
         softAssert.assertTrue(loginPage.logoutLink.getText().contains("Log out"));

          softAssert.assertAll();
         System.out.println(loginPage.logoutLink.getText());
     }








}
