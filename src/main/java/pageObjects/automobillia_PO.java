package pageObjects;

import config.configProperties;
import config.driverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;

public class automobillia_PO {
    //fetching driver information
    public static WebDriver driver= driverManager.Driver();
    //Xpath for selecting Dropdown items from BUY dropdown
    public static String clickBuyDropdown="//a[@id='navbarDropdownMenuLink']";
    public static String selectHybridCars="//button[contains(text(), 'Hybrid Cars')]";
    public static String clickLoginbtn="//a[@href='http://automobiliard.com/login']";
    public static String enterUsername="//input[@name='email']";
    public static String enterPass="//input[@name='password']";
    public static String clickSignIn="//button[contains(text(), 'Login')]";
    public static String alertText="//div[@class='toast-message']";

    public static String LoginAutomobllia(String username,String password){
        driver.get(configProperties.autoURL);
        driver.findElement(By.xpath(clickLoginbtn)).click();
        driver.findElement(By.xpath(enterUsername)).sendKeys(username);
        driver.findElement(By.xpath(enterPass)).sendKeys(password);
        driver.findElement(By.xpath(clickSignIn)).click();

        String Loginalert=driver.findElement(By.xpath(alertText)).getText();
        return Loginalert;

    }
    public static void HybridCarsPage(){
        driver.get(configProperties.autoURL);
        driver.findElement(By.xpath(clickBuyDropdown)).click();
        driver.findElement(By.xpath(selectHybridCars)).click();
    }

}
