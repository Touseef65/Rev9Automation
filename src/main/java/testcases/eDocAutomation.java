package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import config.configProperties;
import utils.reusebleFunctions;

public class eDocAutomation {
    public static WebDriver driver=config.driverManager.Driver();
    @Test
    public static void Login(){

        driver.get(configProperties.URL);
        reusebleFunctions.enterTextInInputField("email","User01");
        driver.findElement(By.name("password")).sendKeys(configProperties.pass);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//a[@href='https://staging.ewaiverpro.app/edoc-admin']")).click();
        driver.quit();
    }
}
