package testBase;

import lombok.Getter;
import org.openqa.selenium.WebDriver;

public class DriverFactory {

    //java.lang --> Threading --> Synchronized methods
    //ThreadLocal -->     //ThreadLocal --> we don't need to create Synchronized methods for thread local as enables to crate a variable that can only be read and write by same thread.
                         // ThreadLocal is a class in Java that allows you to maintain separate copies of a variable for each thread. This means that each thread can have its own instance
                        //  of a variable, and changes made to the variable in one thread do not affect the variable in another thread.
                      // we don't need to create Synchronized methods for thread local as enables to crate a variable that can only be read and write by same thread.
                    //  we can create multiple threads, but they can only be read and write by same thread other threads cant access this thread.

 //so, each thread maintain separate copies of data. so the copy is maintained in a form of -->HashMap<k,v>(aka ThreadLocal Map)

    //Singleton design pattern --> only one instance exit ever, provide global access to that instance by creating getInstance method
      private  DriverFactory(){}

      //@Getter
      //  public static DriverFactory getInstance() {
      //        return instance;
      //     }
      @Getter
      private static DriverFactory instance = new DriverFactory();

    //Factory design pattern --> // define separate factory methods for creating objects and Create objects by calling that methods
      ThreadLocal <WebDriver> driver = new ThreadLocal<>();

      public WebDriver getDriver(){
            return driver.get();
      }
      public void setDriver(WebDriver driverParam){
          driver.set(driverParam);
      }
      public void closeDriver() throws InterruptedException {
          Thread.sleep(3000);
            driver.get().quit();
            driver.remove();
      }


}
