package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P03_RegisterPage extends P01_pageBase{

    public P03_RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "gender-male")
    public WebElement maleGeneder;

    @FindBy(id = "FirstName")
    public WebElement FirstNameInput;

    @FindBy(id = "LastName")
    public WebElement LastNameInput;

    @FindBy(id = "Email")
    public WebElement EmailInput;

    @FindBy(id = "Password")
    public WebElement PasswordInput;

   @FindBy(id = "ConfirmPassword")
    public WebElement ConfirmPasswordInput;

    @FindBy(id = "register-button")
    public WebElement registerbutton;


    @FindBy(xpath = "//div[@class=\"result\"]")
    public WebElement assertResult01;

   public void registerAction(String fName ,String lName ,String email , String pass ,String Conpass)
   {
       maleGeneder.click();
       FirstNameInput.sendKeys(fName);
       LastNameInput.sendKeys(lName);
       EmailInput.sendKeys(email);
       PasswordInput.sendKeys(pass);
       ConfirmPasswordInput.sendKeys(Conpass);
       registerbutton.click();
   }



}
