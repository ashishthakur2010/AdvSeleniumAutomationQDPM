package testBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserFactory {

    public WebDriver createBrowserInstance(String browserName) {
        WebDriver driver =null;
        if(browserName.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            //System.setProperty("webdriver.chrome.silentOutput", "true");
            ChromeOptions cOptions = new ChromeOptions();
            cOptions.addArguments("--incognito");
            //cOptions.addArguments("--headless");
            driver = new ChromeDriver(cOptions);
        }
        else if(browserName.equalsIgnoreCase("fireFox")){
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions fOptions = new FirefoxOptions();
           // fOptions.addArguments("-privete");
            fOptions.addArguments("--incognito");
            fOptions.addArguments("--no-sandbox");
            driver = new FirefoxDriver(fOptions);

        }
        else if(browserName.equalsIgnoreCase("Edge")){
            WebDriverManager.edgedriver().setup();
            EdgeOptions eOptions = new EdgeOptions();
            eOptions.addArguments("--incognito");
            eOptions.addArguments("--no-sandbox");
            driver = new EdgeDriver(eOptions);
        }
        else{
            System.out.println("Invalid browser name");
        }
        return driver;
    }

}
