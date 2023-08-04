package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P10_AddReivewPage extends P01_pageBase{
    public P10_AddReivewPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(linkText ="Add your review")
    public WebElement  addReviewLink;


    @FindBy(id ="AddProductReview_Title")
    public WebElement  addProductReviewInput;


    @FindBy(id ="AddProductReview_ReviewText")
    public WebElement  addProductReviewTextInput;



    @FindBy(id ="addproductrating_3")
    public WebElement  addproductratingRadio;


    //button-1 write-product-review-button
    @FindBy(css ="button.button-1.write-product-review-button")
    public WebElement  btnSubmit;


    public void GoToReviewKink()
    {
        addReviewLink.click();
    }
    public void fillReviewForm(String reviewTitle ,String reviewTxt )
    {
        addProductReviewInput.sendKeys(reviewTitle);
        addProductReviewTextInput.sendKeys(reviewTxt);
        addproductratingRadio.click();
        btnSubmit.click();



    }


}
