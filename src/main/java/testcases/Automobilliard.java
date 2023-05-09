package testcases;

import config.driverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pageObjects.automobillia_PO;

public class Automobilliard {

    public static WebDriver driver= driverManager.Driver();
    @Test
    public static void HybridCars()
    {
        automobillia_PO.HybridCarsPage();
    }

    @Test
    public static void LoginFailure()
    {
        String Loginalert=automobillia_PO.LoginAutomobllia("noor@gmail.com","123123");
        Assert.assertEquals(Loginalert,"Please check your credentials");
    }

    @Test
    public static void LoginSuccess()
    {
        String Loginalert=automobillia_PO.LoginAutomobllia("noorulain2k@gmail.com","khansa123");
        Assert.assertEquals(Loginalert,"You have signed-in :)");
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
