package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;

public class P06_SearchPage extends P01_pageBase{

    public P06_SearchPage(WebDriver driver) {
        super(driver);
    }



    @FindBy(css = "input[id=\"small-searchterms\"]")
    public WebElement searchInput;

    @FindBy(css = "button[class=\"button-1 search-box-button\"]")
    public  WebElement btnsearch;


    @FindBy(css= "li[class=\"ui-menu-item\"]")
    public List<WebElement> autocompelteliOptin ;

   @FindBy(linkText="Apple MacBook Pro 13-inch")
   public  WebElement assertSearch ;


    @FindBy(css = "strong[class=\"current-item\"]")
    public  WebElement assertSearch2 ;

//click on search button
    public void fillSearchWord(String searchitem)
    {
        searchInput.sendKeys(searchitem);
        btnsearch.click();
    }

    //select from auto suggest list
    public void selectFromSearchList(String searchitem) throws InterruptedException {
        searchInput.sendKeys(searchitem);
        Thread.sleep(3000);
        autocompelteliOptin.get(0).click();




    }



}
