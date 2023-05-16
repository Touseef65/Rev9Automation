package general;

import org.openqa.selenium.WebDriver;
public class mainCall {
    public static WebDriver driver;
    public static WebDriver driverStart(){
        driver=config.driverManager.Driver();
        return driver;
    }
}
