package general;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class mainCall {
    public static WebDriver driver;
    @BeforeTest
    public static WebDriver driverStart(){
        driver=config.driverManager.Driver();
        return driver;
    }
    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
