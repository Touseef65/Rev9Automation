package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import config.configProperties;


public class eDocAutomation {
    public static WebDriver driver=config.driverManager.Driver();
    @Test
    public static void Login(){

        driver.get(configProperties.URL);
        driver.findElement(By.name("email")).sendKeys(configProperties.userName);
        driver.findElement(By.name("password")).sendKeys(configProperties.pass);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//a[@href='https://staging.ewaiverpro.app/edoc-admin']")).click();
        driver.quit();
    }
}
