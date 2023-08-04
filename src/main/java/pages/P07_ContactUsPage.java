package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P07_ContactUsPage extends P01_pageBase{
    public P07_ContactUsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Contact us")
    public WebElement contactLink ;


    @FindBy(css = "div[class=\"page-title\"] h1")
    public  WebElement assertTitle;

    @FindBy(id = "FullName")
    public  WebElement fullNameInput ;


    @FindBy(id = "Email")
    public  WebElement EmailInput ;

    @FindBy(id = "Enquiry")
    public  WebElement EnquiryInput ;



    @FindBy(css="button[class=\"button-1 contact-us-button\"]")
    public  WebElement btnSubmit ;



    public void goToContactPage(String name , String email ,String msg)
    {

        fullNameInput.sendKeys(name);
        EmailInput.sendKeys(email);
        EnquiryInput.sendKeys(msg);
        btnSubmit.click();
    }




}
