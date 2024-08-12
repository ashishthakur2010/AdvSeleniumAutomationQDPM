package testBase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import reusableComponents.ActionEngine;
import reusableComponents.ReadProperties;

import java.time.Duration;

public class TestBase extends ActionEngine {
    BrowserFactory browser = new BrowserFactory();

    @BeforeMethod
        public void setUp() throws Exception {

        String browser = ReadProperties.getPropertyValueByKey("browser");
        String url = 	ReadProperties.getPropertyValueByKey("url");

        DriverFactory.getInstance().setDriver(this.browser.createBrowserInstance(browser));
        WebDriver driver = DriverFactory.getInstance().getDriver();

        DriverFactory.getInstance().getDriver().manage().window().maximize();
        DriverFactory.getInstance().getDriver().manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to(ReadProperties.getPropertyValueByKey("url"));

        }

   // @BeforeMethod
    @AfterMethod
    public void closeBrowser() throws InterruptedException { DriverFactory.getInstance().closeDriver();}



}
