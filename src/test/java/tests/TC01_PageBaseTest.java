package tests;

import helper.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TC01_PageBaseTest {
    public static WebDriver driver;
    @BeforeSuite
    @Parameters({"Browser"})
    public void openDiriver(@Optional("chrome") String broswerName)

    {
        if (broswerName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (broswerName.equalsIgnoreCase("firefox")) {
            driver =new FirefoxDriver();
        } else if (broswerName.equalsIgnoreCase("IE")) {
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.navigate().to("https://demo.nopcommerce.com/");
    }










    @AfterSuite
    public void closeDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    //run after each method to verify tc status
    @AfterMethod
    public void screenshotfail(ITestResult result)
    {

        System.out.println("Fail");
        System.out.println("taking screenshot.....");
        Helper.capturescreenshot(driver,result.getName());
    }



}
