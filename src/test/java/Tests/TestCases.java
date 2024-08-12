package Tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.HomePageObjects;
import pageObjects.LoginPageObjects;
import pageObjects.TaskPageObjects;
import reusableComponents.DB_Operations;
import reusableComponents.ExcelOperations;
import reusableComponents.ReadProperties;
import testBase.ExtentFactory;
import testBase.MyLogger;
import testBase.TestBase;

import java.util.HashMap;

public class TestCases extends TestBase {
 LoginPageObjects loginPage = new LoginPageObjects();
 HomePageObjects homePage = new HomePageObjects();
 TaskPageObjects taskPage = new TaskPageObjects();
    DB_Operations dbOps = new DB_Operations();
    ExcelOperations excel = new ExcelOperations("TaskCreationData");

    @Test
    public void TaskCreationTest(Object obj1) throws Throwable {
        @SuppressWarnings("unchecked")
        HashMap<String, String> testData = (HashMap<String, String>) obj1;

        ExtentFactory.getInstance().getExtent().info("Test Data for this execution run is: "+ testData);

        loginPage.login(testData.get("UserName"), testData.get("Password"));
        //check if dashboard page opens
        homePage.checkIfDashBoardPageIsOpened();
        homePage.clickOnSubManu("Tasks", "Add Task");
        //add task
        taskPage.createTask(testData);
        //verify task on UI
        taskPage.Search_Verify_TaskCreationOnUI(testData);

        //verify DB
        String sql = "SELECT * FROM `tasks` where name = '"+testData.get("TaskName")+"'";
        HashMap<String, String> dbData = dbOps.getSqlResultInMap(sql);
        String TaskName = dbData.get("name");
        assertEqualsString_custom("taskFailureName", TaskName, "DB_Task_Name");

    }
//    @Test(enabled = false)
//    public void test2(){
//        System.out.println("testCase2 has started..");
//        MyLogger.startTestCase(new Throwable().getStackTrace()[0].getMethodName());
//        MyLogger.info("testCase2");
//        loginPage.login("admin@localhost.com","12344");
//    }
//    @Test(enabled = false)
//    public void test3(){
//        System.out.println("testCase3 has started..");
//        MyLogger.startTestCase(new Throwable().getStackTrace()[0].getMethodName());
//        MyLogger.info("testCase3");
//    }

    //Dataprovider method --> return object array
    @DataProvider(name = "taskCreationData")
    public Object[][] testDataSupplier() throws Exception {
        Object[][] obj = new Object[excel.getRowCount()][1];
        for (int i = 1; i <= excel.getRowCount(); i++) {
            HashMap<String, String> testData = excel.getTestDataInMap(i);
            obj[i-1][0] = testData;
        }
        return obj;

    }
}
