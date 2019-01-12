import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class UITestsDay2 {
    WebDriver driver ;


    @Test
    public void test001() {
        String path = "C:\\Users\\Anushka\\Desktop\\JavaBootCampNov-day1\\src\\test\\Resources\\geckodriver-v0.23.0-win64\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", path);


        driver = new FirefoxDriver();

        openMainPage();
        typeQuery();
        submitQuery();
         checkResult();
        openMainPage();
        clickLoginButton();

    }

    private void clickLoginButton() {

    }



    private void checkResult() {
       Boolean isDisplayed =  driver.findElement(By.id("resultStats")).isDisplayed();
        System.out.println("isDisplayed:" + isDisplayed);
    }

    private void submitQuery() {
        driver.findElement(By.cssSelector(".FPdoLc > center:nth-child(1) > input:nth-child(1)")).click();
    }

    private void typeQuery() {
        WebElement webElement = driver.findElement(By.cssSelector(".gLFyf"));
        webElement.sendKeys("Java for Beginners");
    }

    private void openMainPage() {
        driver.get("http://google.com");

    }






    @Test
    public void test002() {
        String path = "C:\\Users\\Anushka\\Desktop\\JavaBootCampNov-day1\\src\\test\\Resources\\chromedriver.exe";
        System.setProperty("webdriver.gecko.driver",path);


        WebDriver driver = new ChromeDriver();




    }




}
