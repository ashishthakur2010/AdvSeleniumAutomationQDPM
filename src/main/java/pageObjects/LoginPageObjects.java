package pageObjects;

import org.openqa.selenium.By;
import testBase.DriverFactory;
import testBase.TestBase;

public class LoginPageObjects extends TestBase {

//    @FindBy(name = "login[email]")
//    public WebElement txt_login;
//    @FindBy(name = "login[password")
//    public WebElement txt_password;
//    @FindBy(xpath = "//button[@type='submit' and text()='Login ']") //button[normalize-space()='Login']
//    public WebElement btn_login;

    By EMAIL = By.name("login[email]");
    By PASSWORD = By.name("login[password]");
    By LOGIN_BTN = By.xpath("//button[@type='submit' and text()='Login ']");
//PageFactory: is a class provided by Selenium WebDriver that helps initialize elements of a Page Object.
//initElements(): method initializes elements of the current class (this) with the WebDriver instance provided (driver).
//initElements: This is a method call. It's used to initialize elements of a page object.
//in_short this code initializes all the web elements declared in the LoginPageObjects class using the provided WebDriver instance.
//    public LoginPageObjects(WebDriver driver) {
//        PageFactory.initElements(driver, this); //this refers current class u may also write "LoginPageObjects"
//    }

//Now inorder to call the "login" method i have to create an object of this class which will call the above constructor and
// initElements() will initializes all the web elements declared in the LoginPageObjects class.


    public void login(String email, String password) {
       type(DriverFactory.getInstance().getDriver().findElement(EMAIL),"LoginEmailField", email);
       type(DriverFactory.getInstance().getDriver().findElement(PASSWORD),"LoginPasswordField", password);

       clickOn(DriverFactory.getInstance().getDriver().findElement(LOGIN_BTN),"LoginButton");
    }
}
