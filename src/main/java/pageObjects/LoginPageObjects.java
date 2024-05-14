package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {

    @FindBy(name = "login[email]")
    public WebElement txt_login;
    @FindBy(name = "login[password")
    public WebElement txt_password;
    @FindBy(xpath = "//button[@type='submit' and text()='Login ']")
    public WebElement btn_login;

//PageFactory: is a class provided by Selenium WebDriver that helps initialize elements of a Page Object.
//initElements(): method initializes elements of the current class (this) with the WebDriver instance provided (driver).
//in_short this code initializes all the web elements declared in the LoginPageObjects class using the provided WebDriver instance.
    public LoginPageObjects(WebDriver driver) {
        PageFactory.initElements(driver, this); //this refers current class u may also write "LoginPageObjects"
    }

//Now inorder to call the "login" method i have to create an object of this class which will call the above constructor and
// initElements() will initializes all the web elements declared in the LoginPageObjects class.
    public void login(String email, String password) {
        txt_login.sendKeys(email);
        txt_password.sendKeys(password);
        btn_login.click();
    }
}
