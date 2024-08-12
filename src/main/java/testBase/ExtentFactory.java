package testBase;

import com.aventstack.extentreports.ExtentTest;
import lombok.Getter;

public class ExtentFactory {

    //Singleton design Pattern
    //private constructor so that no one else can create object of this class
    private  ExtentFactory(){}

    //@Getter
    //  public static ExtentFactory getInstance() {
    //        return instance;
    //     }
    @Getter
    private static ExtentFactory instance = new ExtentFactory();

    //factory design pattern --> define separate factory methods for creating objects and create objects by calling that methods
    //Factory Design Pattern is a creational pattern that provides an interface for creating objects in a super class but allows subclasses to alter the type of objects that will be created.
    // In Selenium Java, the Factory Design Pattern can be used to create different types of WebDriver instances based on configuration or environment.
    ThreadLocal <ExtentTest> extent = new ThreadLocal<>();

    public ExtentTest getExtent(){
        return extent.get();
    }
    public void setExtent(ExtentTest driverParam){
        extent.set(driverParam);
    }
    public void removeExtentObject() {
        extent.remove();
    }
}
