package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class P02_homePage extends P01_pageBase{




    public P02_homePage(WebDriver driver) {
        super(driver);

    }

    //locate Register link
    @FindBy(className = "ico-register")
   public WebElement registerLink ;


    //locate Loin Link
    @FindBy(className = "ico-login")
    public  WebElement loginLink;



    //locate change currency list
    @FindBy(id ="customerCurrency")
    public WebElement  customerCurrencyList;






}
