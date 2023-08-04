package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P08_EmailToFriend extends P01_pageBase{
    public P08_EmailToFriend(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "button.button-2.email-a-friend-button")
    public WebElement EmailBtn ;



    @FindBy(id = "FriendEmail")
    public WebElement friendEmailInput ;

    @FindBy(id = "YourEmailAddress")
    public WebElement YourEmailAddressInput ;

    @FindBy(id = "PersonalMessage")
    public WebElement personalMessageInput ;

    @FindBy(css = "button.button-1.send-email-a-friend-button")
    public WebElement btnSubmit ;


//    @FindBy(css = "button.button-1.send-email-a-friend-button")
//    public WebElement assertMsg ;


    public void fillEmailToFriend(String emial ,String emailAdd, String msg)
    {
        EmailBtn.click();
        friendEmailInput.sendKeys(emial);
        YourEmailAddressInput.sendKeys(emailAdd);
        personalMessageInput.sendKeys(msg);
        btnSubmit.click();
    }

}
