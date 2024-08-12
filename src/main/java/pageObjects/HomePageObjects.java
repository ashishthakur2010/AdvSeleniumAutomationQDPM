package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import testBase.DriverFactory;
import testBase.TestBase;

public class HomePageObjects extends TestBase {
   // WebDriver driver = DriverFactory.getInstance().getDriver();
   // {
        //Users MainManu
//        @FindBy(xpath = "(//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'Users')])[1]")
//        public WebElement sidebarManu_Users;
//        @FindBy(xpath = "((//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'Users')])[1]/..//following-sibling::ul//span[contains(text(),'View All')])[1]")
//        public WebElement subManu_ViewAll;
//        @FindBy(xpath = "((//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'Users')])[1]/..//following-sibling::ul//span[contains(text(),'Add User')])[1]")
//        public WebElement subManu_AddUser;
//
//        //Configuration MainManu
//        @FindBy(xpath = "(//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'Configuration')])[1]")
//        public WebElement sidebarManu_Configuration;
//        //General SubManu
//        @FindBy(xpath = "((//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'Configuration')])[1]/..//following-sibling::ul//span[contains(text(),'General')])[1]")
//        public WebElement subManu_General;
//        @FindBy(xpath = "((//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'Configuration')])[1]/..//following-sibling::ul//span[contains(text(),'General')])[1]/..//following-sibling::ul//li//span[text()='General']")
//        public WebElement subManu_General_General;
//        @FindBy(xpath = "((//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'Configuration')])[1]/..//following-sibling::ul//span[contains(text(),'General')])[1]/..//following-sibling::ul//li//span[text()='Features']")
//        public WebElement subManu_General_Features;
//        @FindBy(xpath = "((//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'Configuration')])[1]/..//following-sibling::ul//span[contains(text(),'General')])[1]/..//following-sibling::ul//li//span[text()='Email Options']")
//        public WebElement subManu_General_EmailOptions;
//        @FindBy(xpath = "((//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'Configuration')])[1]/..//following-sibling::ul//span[contains(text(),'General')])[1]/..//following-sibling::ul//li//span[text()='LDAP']")
//        public WebElement subManu_General_LDAP;
//        @FindBy(xpath = "((//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'Configuration')])[1]/..//following-sibling::ul//span[contains(text(),'General')])[1]/..//following-sibling::ul//li//span[text()='Login Page']")
//        public WebElement subManu_General_LoginPage;
//        @FindBy(xpath = "((//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'Configuration')])[1]/..//following-sibling::ul//span[contains(text(),'General')])[1]/..//following-sibling::ul//li//span[text()='New User Creation']")
//        public WebElement subManu_General_NewUserCreation;
//        //Users SubManu
//        @FindBy(xpath = "((//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'Configuration')])[1]/..//following-sibling::ul//span[contains(text(),'Users')])[1]")
//        public WebElement subManu_Users;
//        @FindBy(xpath = "((//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'Configuration')])[1]/..//following-sibling::ul//span[contains(text(),'Users')])[1]/..//following-sibling::ul//li//span[text()='Users Groups']")
//        public WebElement subManu_Users_Groups;
//        @FindBy(xpath = "((//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'Configuration')])[1]/..//following-sibling::ul//span[contains(text(),'Users')])[1]/..//following-sibling::ul//li//span[text()='Extra Fields']")
//        public WebElement subManu_Users_ExtraFields;
//        //Projects SubManu
//        @FindBy(xpath = "((//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'Configuration')])[1]/..//following-sibling::ul//span[contains(text(),'Projects')])[1]")
//        public WebElement subManu_Projects;
//        @FindBy(xpath = "((//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'Configuration')])[1]/..//following-sibling::ul//span[contains(text(),'Project')])[1]/..//following-sibling::ul//li//span[text()='Status']")
//        public WebElement subManu_Projects_Status;
//        @FindBy(xpath = "((//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'Configuration')])[1]/..//following-sibling::ul//span[contains(text(),'Project')])[1]/..//following-sibling::ul//li//span[text()='Types']")
//        public WebElement subManu_Projects_Types;
//        @FindBy(xpath = "((//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'Configuration')])[1]/..//following-sibling::ul//span[contains(text(),'Project')])[1]/..//following-sibling::ul//li//span[text()='Default Phases']")
//        public WebElement subManu_Projects_Default_Phases;
//        @FindBy(xpath = "((//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'Configuration')])[1]/..//following-sibling::ul//span[contains(text(),'Project')])[1]/..//following-sibling::ul//li//span[text()='Phases Status']")
//        public WebElement subManu_Projects_Phases_Status;
//        @FindBy(xpath = "((//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'Configuration')])[1]/..//following-sibling::ul//span[contains(text(),'Project')])[1]/..//following-sibling::ul//li//span[text()='Versions Status']")
//        public WebElement subManu_Projects_Versions_Status;
//        @FindBy(xpath = "((//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'Configuration')])[1]/..//following-sibling::ul//span[contains(text(),'Project')])[1]/..//following-sibling::ul//li//span[text()='Extra Fields']")
//        public WebElement subManu_Projects_Extra_Fields;
//        //Task SubManu
//        @FindBy(xpath = "((//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'Configuration')])[1]/..//following-sibling::ul//span[contains(text(),'Tasks')])[1]")
//        public WebElement subManu_Tasks;
//        @FindBy(xpath = "((//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'Configuration')])[1]/..//following-sibling::ul//span[contains(text(),'Tasks')])[1]/..//following-sibling::ul//li//span[text()='Status']")
//        public WebElement subManu_Tasks_Status;
//        @FindBy(xpath = "((//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'Configuration')])[1]/..//following-sibling::ul//span[contains(text(),'Tasks')])[1]/..//following-sibling::ul//li//span[text()='Types']")
//        public WebElement subManu_Tasks_Types;
//        @FindBy(xpath = "((//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'Configuration')])[1]/..//following-sibling::ul//span[contains(text(),'Tasks')])[1]/..//following-sibling::ul//li//span[text()='Labels']")
//        public WebElement subManu_Tasks_Labels;
//        @FindBy(xpath = "((//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'Configuration')])[1]/..//following-sibling::ul//span[contains(text(),'Tasks')])[1]/..//following-sibling::ul//li//span[text()='Priority']")
//        public WebElement subManu_Tasks_Priority;
//        @FindBy(xpath = "((//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'Configuration')])[1]/..//following-sibling::ul//span[contains(text(),'Tasks')])[1]/..//following-sibling::ul//li//span[text()='Tasks Listing']")
//        public WebElement subManu_Tasks_Listing;
//        @FindBy(xpath = "((//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'Configuration')])[1]/..//following-sibling::ul//span[contains(text(),'Tasks')])[1]/..//following-sibling::ul//li//span[text()='Extra Fields']")
//        public WebElement subManu_Tasks_ExtraFields;
//        //Tickets SubManu
//        @FindBy(xpath = "((//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'Configuration')])[1]/..//following-sibling::ul//span[contains(text(),'Tickets')])[1]")
//        public WebElement subManu_Tickets;
//        @FindBy(xpath = "((//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'Configuration')])[1]/..//following-sibling::ul//span[contains(text(),'Tickets')])[1]/..//following-sibling::ul//li//span[text()='Departments']")
//        public WebElement subManu_Tickets_Departments;
//        @FindBy(xpath = "((//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'Configuration')])[1]/..//following-sibling::ul//span[contains(text(),'Tickets')])[1]/..//following-sibling::ul//li//span[text()='Status']")
//        public WebElement subManu_Tickets_Status;
//        @FindBy(xpath = "((//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'Configuration')])[1]/..//following-sibling::ul//span[contains(text(),'Tickets')])[1]/..//following-sibling::ul//li//span[text()='Types']")
//        public WebElement subManu_Tickets_Types;
//        @FindBy(xpath = "((//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'Configuration')])[1]/..//following-sibling::ul//span[contains(text(),'Tickets')])[1]/..//following-sibling::ul//li//span[text()='Extra Fields']")
//        public WebElement subManu_Tickets_ExtraFields;
//        //Discussions SubManu
//        @FindBy(xpath = "((//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'Configuration')])[1]/..//following-sibling::ul//span[contains(text(),'Discussions')])[1]")
//        public WebElement subManu_Discussions;
//        @FindBy(xpath = "((//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'Configuration')])[1]/..//following-sibling::ul//span[contains(text(),'Discussions')])[1]/..//following-sibling::ul//li//span[text()='Status']")
//        public WebElement subManu_Discussions_Status;
//        @FindBy(xpath = "((//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'Configuration')])[1]/..//following-sibling::ul//span[contains(text(),'Discussions')])[1]/..//following-sibling::ul//li//span[text()='Extra Fields']")
//        public WebElement subManu_Discussions_Extra_field;



//    public HomePageObjects(WebDriver driver) {
//        PageFactory.initElements(driver, this);
//        this.driver = driver;
//    }


//    }
//

    By sidebarManu_DashBoard = By.xpath("//ul[@class='page-sidebar-menu']//i/following-sibling::span[text()='Dashboard']");




    public void clickOnManu(String manu) {
        String mainManuXpath = "(//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'" + manu + "')])[1]";
        DriverFactory.getInstance().getDriver().findElement(By.xpath(mainManuXpath)).click();
    }

    public void clickOnSubManu(String manu, String subManu) {
        String mainManuXpath = "(//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'" + manu + "')])[1]";
        DriverFactory.getInstance().getDriver().findElement(By.xpath(mainManuXpath)).click();
        String subManuXpath = "((//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'" + manu + "')])[1]/..//following-sibling::ul//span[contains(text(),'" + subManu + "')])[1]";
        DriverFactory.getInstance().getDriver().findElement(By.xpath(subManuXpath)).click();
    }

    public void clickOnSubChildManu(String manu, String subManu, String subChildManu) {
        String mainManuXpath = "(//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'" + manu + "')])[1]";
        DriverFactory.getInstance().getDriver().findElement(By.xpath(mainManuXpath)).click();
        String subManuXpath = "((//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'" + manu + "')])[1]/..//following-sibling::ul//span[contains(text(),'" + subManu + "')])[1]";
        DriverFactory.getInstance().getDriver().findElement(By.xpath(subManuXpath)).click();
        String subChildXpath = "((//ul[@class='page-sidebar-menu']//li//child::span[contains(text(),'" + manu + "')])[1]/..//following-sibling::ul//span[contains(text(),'" + subManu + "')])[1]/..//following-sibling::ul//li//span[text()='" + subChildManu + "']";
        DriverFactory.getInstance().getDriver().findElement(By.xpath(subChildXpath)).click();
    }


    public void checkIfDashBoardPageIsOpened(){
        Assert.assertTrue(displayed(DriverFactory.getInstance().getDriver().findElement(sidebarManu_DashBoard),"DashBoardMenu"));
    }


}
