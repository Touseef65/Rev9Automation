package general;

import config.configProperties;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class reusebleFunctions {
    public static WebDriver driver=mainCall.driver;
//    public static  void clickElementByText(String text) throws InterruptedException {
//        driver.findElement(By.xpath("//*[contains(text(), '" + text + "')]")).click();
//        Thread.sleep(1000);
//    }

    public static  void navigateURL(String url) {
        driver.get(url);
    }

    public static  void inputTextByElementName(String element,String text) {
        driver.findElement(By.name(element)).sendKeys(text);
    }

    public static  void clickElementByxpath(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }

    public static String generateRandomString(int length) {
        String name = RandomStringUtils.randomAlphabetic(length);
        String first_letter = name.substring(0, 1).toUpperCase();
        String other_letters = name.substring(1).toLowerCase();
        String finalname = first_letter + other_letters;
        return finalname;
    }
}
