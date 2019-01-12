package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;




public class XPathTests {
    WebDriver driver;
    String AccountEmail = "samoniianna@gmail.com";
    String AccountPassword = "Neho4u4a!8102";
    By signinBtn = By.cssSelector(".signin-btn");

    @Test
    public void test001() throws Exception {

        String path = "C:\\Users\\Anushka\\Desktop\\JavaBootCampNov-day1\\src\\test\\Resources\\geckodriver-v0.23.0-win64\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", path);
        driver = new FirefoxDriver();
        String url =  "https://www.dice.com/dashboard/login";
        driver.get(url);
        //String xPath1 = "/html/body/div/div/form/div/div[1]/div/input";
        String xPath1 = "//form/div/div[1]/div/input";
        driver.findElement(By.xpath(xPath1)).sendKeys("samoniianna@gmail.com");

        String xPath2 = "//form/div/div[2]/div/input";
        driver.findElement(By.xpath(xPath2)).sendKeys("Neho4u4a!8102");

        String xPath3= "//form/div/div[3]/div/input";
        driver.findElement(By.xpath(xPath3)).sendKeys("AccountPassword");




    }
}


