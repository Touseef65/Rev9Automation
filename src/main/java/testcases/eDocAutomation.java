package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import config.configProperties;
import general.mainCall;
import general.reusebleFunctions;

public class eDocAutomation extends mainCall{
    @Test
    public static void Login(){

        reusebleFunctions.navigateURL(configProperties.URL);
        reusebleFunctions.inputTextByElementName("email",configProperties.userName);
        reusebleFunctions.inputTextByElementName("password",configProperties.pass);
        reusebleFunctions.clickElementByxpath("//button[@type='submit']");
        reusebleFunctions.clickElementByxpath("//a[@href='https://staging.ewaiverpro.app/edoc-admin']");
    }
}
