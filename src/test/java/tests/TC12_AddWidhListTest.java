package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P06_SearchPage;
import pages.P12_AddToWishList;

public class TC12_AddWidhListTest extends TC01_PageBaseTest{



    P06_SearchPage searchPage ;
    SoftAssert softAssert;
    String searchItem="App";

    @Test(priority = 1)
    public void searchFromUl() throws InterruptedException {

        searchPage = new P06_SearchPage(driver);
        searchPage.selectFromSearchList(searchItem);

        softAssert = new SoftAssert();

        String actulUrl ="https://demo.nopcommerce.com/apple-macbook-pro-13-inch";
        String expectUrl =driver.getCurrentUrl();
        softAssert.assertEquals(actulUrl,expectUrl);

        softAssert.assertTrue(searchPage.assertSearch2.getText().contains("Apple MacBook Pro 13-inch"));



        softAssert.assertAll();



    }

    P12_AddToWishList wishList ;


    @Test(priority = 2)
    public void addWishListItem() throws InterruptedException {

        wishList = new P12_AddToWishList(driver);
        wishList.addToWishlist();
        Thread.sleep(2000);
        softAssert.assertTrue(wishList.msgNotificationAssert.getText().contains("The product has been added to your wishlist"));

        wishList.goToWishlistPage();
        String currentUrl = "https://demo.nopcommerce.com/wishlist" ;
        String ecpextUrl = driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
        softAssert.assertEquals(currentUrl,ecpextUrl);

//         String searchItemAssert = searchPage.autocompelteliOptin.get(0).getText();
//         String actualsearchItemAssert ="Apple MacBook Pro 13-inch";
//         softAssert.assertEquals(actualsearchItemAssert,searchItemAssert);
//         System.out.println(searchItemAssert);



        wishList.removeWishListEle();
        softAssert.assertTrue(wishList.wishListAsserrtEmpty.getText().contains("The wishlist is empty"));
         softAssert.assertAll();

        System.out.println(wishList.wishListAsserrtEmpty.getText());
        System.out.println(wishList.msgNotificationAssert.getText());


    }





}
