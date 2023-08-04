package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class P11_HoverElePage extends P01_pageBase{

    public P11_HoverElePage(WebDriver driver) {
        super(driver);

        action = new Actions(driver);

    }




    //locate computer link to hover
    @FindBy(linkText ="computers")
    public WebElement ComputersLink;

    @FindBy(linkText ="Notebooks")
    public WebElement  NotebooksLink;



    public void hoverActions()
    {

        action.moveToElement(ComputersLink)
                .moveToElement(NotebooksLink)
                .click()
                .build()
                .perform();
    }



}
