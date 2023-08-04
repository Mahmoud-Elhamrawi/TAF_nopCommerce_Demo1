package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class P01_pageBase {
public Actions action;

protected WebDriver driver;
 public P01_pageBase(WebDriver driver)
 {
     PageFactory.initElements(driver,this);

 }





}
