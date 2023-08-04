package tests;

import pages.P11_HoverElePage;

public class TC11_HoverTest extends TC01_PageBaseTest{

 P11_HoverElePage hoverActions;

    @Test
    public void moveToEle()
    {

        hoverActions = new P11_HoverElePage(driver);
        hoverActions.hoverActions();


    }







}
