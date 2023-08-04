package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P09_ChangeCurrencyPage extends P01_pageBase{
    public P09_ChangeCurrencyPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id ="customerCurrency")
    public WebElement  customerCurrencyList;
    @FindBy(id = "price-value-4")
    public WebElement  assertCurrency;


}
