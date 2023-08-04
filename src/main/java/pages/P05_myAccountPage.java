package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P05_myAccountPage extends P01_pageBase{

    public P05_myAccountPage(WebDriver driver) {
        super(driver);
    }






    @FindBy(linkText = "Change password")
    public  WebElement ChangepasswordLink;

    @FindBy(linkText = "My account - Change password")
    public  WebElement assertChangepassword;
    @FindBy(id = "OldPassword")
    public  WebElement OldPasswordInput;

    @FindBy(id = "NewPassword")
    public  WebElement NewPasswordInput;
    @FindBy(id = "ConfirmNewPassword")
    public  WebElement ConfirmNewPasswordInput;

    @FindBy(xpath = "//button[@class=\"button-1 change-password-button\"]")
    public WebElement changeBtn;


    @FindBy(xpath = "//p[@class=\"content\"]")
    public WebElement sucessMsg;

    @FindBy(xpath = "//span[@title=\"Close\"]")
    public WebElement closesucessMsg;


    //ico-logout
    @FindBy(className="ico-logout")
    public WebElement logOutKink;


    public void fillChangePassword(String Opass ,String npass, String conNpass)
    {
        ChangepasswordLink.click();
        OldPasswordInput.sendKeys(Opass);
        NewPasswordInput.sendKeys(npass);
        ConfirmNewPasswordInput.sendKeys(conNpass);
        changeBtn.click();


    }


}

