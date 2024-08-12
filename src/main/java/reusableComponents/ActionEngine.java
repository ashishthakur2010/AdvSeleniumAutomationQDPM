package reusableComponents;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import testBase.DriverFactory;
import testBase.ExtentFactory;

public class ActionEngine {

    public void type(WebElement element, String fieldName, String textVal) {
       try{
           element.sendKeys(textVal);
           ExtentFactory.getInstance().getExtent().log(Status.PASS, textVal+" was passed successfully to "+fieldName );
       } catch (Exception e) {
           ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Failed to pass "+textVal+" to "+fieldName+" due to "+e.getMessage() );
       }
    }

    public void clickOn(WebElement element, String fieldName) {
        try {
            element.click();
            ExtentFactory.getInstance().getExtent().log(Status.PASS, fieldName + " was clicked.");
        } catch (Exception e) {
            ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Failed to click no "+fieldName+" due to "+e.getMessage() );
        }
    }

    public void clearOn(WebElement element, String fieldName) {
        try{
            element.clear();
            Thread.sleep(250);
            ExtentFactory.getInstance().getExtent().log(Status.PASS, "Clearing "+fieldName );
        }
        catch(Exception e){
            ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Failed to clear "+fieldName+" due to "+e.getMessage() );
        }
    }

    public void mouseHoverManu(WebElement hoverElement, WebElement element ,String fieldName) {
        try{
            Actions actions = new Actions(DriverFactory.getInstance().getDriver());
            actions.moveToElement(hoverElement).perform();
            Thread.sleep(250);
            element.click();
            ExtentFactory.getInstance().getExtent().log(Status.PASS, "Mouse Hover to "+fieldName + " clicked on "+element );
        }
        catch(Exception e){
            ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Failed to click no "+fieldName+" due to "+e.getMessage() );
        }
    }

    public void mouseHoverElement( WebElement element ,String fieldName){
        try{
            JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getInstance().getDriver();
            js.executeScript("arguments[0].scrollIntoView(true);", element);
            Thread.sleep(250);
            Actions actions = new Actions(DriverFactory.getInstance().getDriver());
            actions.moveToElement(element).build().perform();
            ExtentFactory.getInstance().getExtent().log(Status.PASS,"Mouse Hover to "+fieldName + " clicked on "+element);
        }
        catch(Exception e){
            ExtentFactory.getInstance().getExtent().log(Status.FAIL,"Failed to click no "+fieldName+" due to "+e.getMessage() );
        }
    }

    public boolean displayed(WebElement element, String fieldName) {
        boolean flag = element.isDisplayed();
        try{
            Thread.sleep(250);
            ExtentFactory.getInstance().getExtent().log(Status.PASS, fieldName+" was displayed." );
            return flag;
        }
        catch(Exception e){
            ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Can't find "+fieldName+" due to "+e.getMessage() );
            return flag;
        }
    }

    //Select dropdown value value by visibleText
    public void selectDropDownByVisibleText_custom(WebElement element, String fieldName, String ddVisibleText) throws Throwable {
        try {
            Select s = new Select(element);
            s.selectByVisibleText(ddVisibleText);
            ExtentFactory.getInstance().getExtent().log(Status.PASS, fieldName+"==> Dropdown Value Selected by visible text: "+ ddVisibleText);
        } catch (Exception e) {
            ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Dropdown value not selected for field: " +fieldName +"  due to exception: "+e);
        }
    }

    //Select dropdown value value by value
    public void selectDropDownByValue_custom(WebElement element, String fieldName, String ddValue) throws Throwable {
        try {
            Select s = new Select(element);
            s.selectByValue(ddValue);
            ExtentFactory.getInstance().getExtent().log(Status.PASS, fieldName+"==> Dropdown Value Selected by visible text: "+ ddValue);
        } catch (Exception e) {
            ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Dropdown value not selected for field: " +fieldName +"  due to exception: "+e);
        }
    }

    //String Asserts
    public void assertEqualsString_custom(String expvalue, String actualValue, String locatorName) throws Throwable {
        try {
            if(actualValue.equals(expvalue)) {
                ExtentFactory.getInstance().getExtent().log(Status.PASS, "String Assertion is successful on field "+ locatorName + " Expected value was: "+ expvalue + " actual value is: "+actualValue);
            }else {
                ExtentFactory.getInstance().getExtent().log(Status.FAIL, "String Assertion FAILED on field "+ locatorName + " Expected value was: "+ expvalue + " actual value is: "+actualValue);
                Assert.fail();
            }
        } catch (Exception e) {
            Assert.fail(e.toString());
        }
    }

    //Get text from webelement
    public String getText_custom(WebElement element, String fieldName) {
        String text = "";
        try {
            text = element.getText();
            ExtentFactory.getInstance().getExtent().log(Status.PASS, fieldName+"==> Text retried is: "+ text);
            return text;
        } catch (Exception e) {
            ExtentFactory.getInstance().getExtent().log(Status.FAIL, fieldName+"==> Text not retried due to exception: "+ e);

        }
        return text;
    }
}
