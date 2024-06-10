package testBase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import reusableComponents.ReadProperties;

import java.util.concurrent.TimeUnit;

public class TestBase {
    BrowserFactory browser = new BrowserFactory();
    @BeforeMethod
        public void setUp() throws Exception {
            WebDriver browserInstance = browser.createBrowserInstance(ReadProperties.getPropertyValueByKey("browser"));
            DriverFactory.getInstance().setDriver(browserInstance);
            WebDriver driver = DriverFactory.getInstance().getDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get(ReadProperties.getPropertyValueByKey("url"));
        }
   // @BeforeMethod
    @AfterMethod
    public void closeBrowser() throws InterruptedException {
        DriverFactory.getInstance().closeDriver();
    }



}
