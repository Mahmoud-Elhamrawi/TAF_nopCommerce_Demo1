package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P12_AddToWishList extends P01_pageBase {
    public P12_AddToWishList(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "add-to-wishlist-button-4")
    public WebElement wishlistButton ;

    @FindBy(id="bar-notification")
    public WebElement msgNotificationAssert ;


    @FindBy(css = "p a[href=\"/wishlist\"]")
    public WebElement wishlistLink ;



    @FindBy(css="button[class=\"remove-btn\"]")
    public WebElement removeBtn;


    @FindBy(css="div[class=\"no-data\"]")
    public WebElement wishListAsserrtEmpty;



    public void addToWishlist ()
    {
        wishlistButton.click();
    }

    public void goToWishlistPage ()
    {
        wishlistLink.click();
    }
     public void removeWishListEle()
     {
         removeBtn.click();

     }





}
