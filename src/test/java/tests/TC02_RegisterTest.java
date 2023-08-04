package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P02_homePage;
import pages.P03_RegisterPage;

public class TC02_RegisterTest extends TC01_PageBaseTest  {
     P02_homePage homePage ;
     P03_RegisterPage registerPage ;

    @Test
      public void ValidRegisteration()
    {
        homePage =  new P02_homePage(driver);
        homePage.registerLink.click();
        registerPage =new P03_RegisterPage(driver);
        registerPage.registerAction("ali","test","ali35@test.com","123456","123456");

        SoftAssert softAssert = new SoftAssert();
        String actual01="Your registration completed";
        softAssert.assertEquals(actual01,registerPage.assertResult01.getText());
        System.out.println(registerPage.assertResult01.getText());

    }



}
