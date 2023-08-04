package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P02_homePage;
import pages.P04_loginPage;
import pages.P05_myAccountPage;

public class TC04_changePaasswordTest extends TC01_PageBaseTest{

    P05_myAccountPage myAccountPage ;
    P04_loginPage loginPage;
    P02_homePage homePage;
    TC03_LoginTest loginTest;
    @Test
    public void changePass()
    {

        SoftAssert softAssert = new SoftAssert();
//       String  actualUrl = driver.getCurrentUrl();
//       String expectUrl ="https://demo.nopcommerce.com/customer/changepassword" ;
//       softAssert.assertEquals(actualUrl,expectUrl);


        myAccountPage = new P05_myAccountPage(driver) ;
        myAccountPage.fillChangePassword("123456","1234567","1234567");
        //asser msg success
        softAssert.assertEquals("Password was changed",myAccountPage.sucessMsg.getText());
        softAssert.assertAll();
        //close msg success
        myAccountPage.closesucessMsg.click();

        myAccountPage.logOutKink.click();
        homePage.loginLink.click();
        loginTest.loginPage.fillLoginInputs("ali14@test.com","1234567");


        System.out.println(myAccountPage.sucessMsg.getText());

    }

}
