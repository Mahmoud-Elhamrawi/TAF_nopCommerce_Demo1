package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P04_loginPage extends P01_pageBase{

    public P04_loginPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "Email")
    public WebElement emailInput;

    @FindBy(id = "Password")
    public WebElement PassInput;

    @FindBy(xpath = "//input[@id=\"RememberMe\"]")
    public WebElement RememberMeCheck;


    @FindBy(xpath = "//button[@class=\"button-1 login-button\"]")
    public WebElement loginBtn;



    @FindBy(linkText = "Log out")
    public  WebElement logoutLink;

    @FindBy(linkText = "My account")
    public  WebElement MyaccountLink;



    @FindBy(className = "ico-account")
    public WebElement myAccountLink;
    public void fillLoginInputs(String email , String pass)
    {
        emailInput.sendKeys(email);
        PassInput.sendKeys(pass);
        RememberMeCheck.click();
        loginBtn.click();


        myAccountLink.click();
    }

}
