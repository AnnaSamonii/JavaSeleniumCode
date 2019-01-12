import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

//public class Day3



public class Day3 {
    WebDriver driver;
    String mainPage= "https://www.dice.com/";

    By searchFieldKeyword = By.id("search-field-keyword");
    By fieldLocation = By.id("search-field-location");
    By findTechJobs= By.id("findTechJobs");
    By posiCountId= By.id("posiCountId");
    By signinBtn = By.cssSelector(".signin-btn");
    By email=By.id("email");
    By advanceSearchLink = By.id("advanced-search-link");
    By advSearch= By.id("adv_search");
    By partTime = By.xpath("/html/body/div[5]/div/form/div/div[4]/span[2]/input");
    String keywordForSearch= "WebDriver";
    String location =  "San Francisco";
    String myEmail = "samoniianna@gmail.com";
    String myPasw = "Neho4u4a!8102";

    @Test
    public void Test001() {




        openMainPage();
        typeKeyword(keywordForSearch);
        typeLocation(location);
        submitSearch();
        checkResultOfSearch(posiCountId);
        //driver.findElement(searchFieldKeyword);
    }
    //sing in test
    @Test
    public void testLogin() {

        openMainPage();
        clickSingInButton();
        typeEmail(myEmail);
        typePasw(myPasw);
        clickLoginButton();
        assertThatLogin();
    }

    private void assertThatLogin() {
        boolean finded=  driver.findElement(By.id("profileContactlastName")).isDisplayed();
        Assert.assertTrue(finded);
    }

    private void clickLoginButton() {
        driver.findElement(By.cssSelector(".btn-lg")).click(); //sign-in-button
    }

    private void typePasw(String myPasw) {
        driver.findElement(By.id("password")).sendKeys(myPasw);
    }

    private void typeEmail(String myEmail) {
        driver.findElement(email).sendKeys(myEmail);
    }

    private void clickSingInButton() {
        driver.findElement(signinBtn).click();

    }

    @Test
    public void testAdvSearch() {

        openMainPage();
        clickSingInButton();
        typeEmail(myEmail);
        typePasw(myPasw);
        clickLoginButton();
        clickAdvanceSearch();
        typeKeyWordAdvance(keywordForSearch,By.id("for_one"));
        typeCityAdvance(location,By.id("for_loc"));
        scrollToSlider();
//        moveSliderToHigherValue();
        clickAdvancedSearchBtn();
        checkResultOfSearch(posiCountId);

    }

    private void clickAdvancedSearchBtn() {
        driver.findElement(advSearch).click();
    }

    private void scrollToSlider() {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement radius= driver.findElement(By.id("radiusMileAnchor"));

        js.executeScript("arguments[0].setAttribute('style', 'left: 100%;')",radius);

    }

    private void typeCityAdvance(String location,By field) {
        driver.findElement(field).clear();
        driver.findElement(field).sendKeys(location);
    }


    private void typeKeyWordAdvance(String keywordForSearch,By id) {
        driver.findElement(id).sendKeys(keywordForSearch);
    }

    private void clickAdvanceSearch() {
        waitForElement(advanceSearchLink);
        driver.findElement(advanceSearchLink).click();
    }

    //search for part-time jobs
    @Test
    public void tastPartTime() {
        openMainPage();
        clickSingInButton();
        typeEmail(myEmail);
        typePasw(myPasw);
        clickLoginButton();
        typeKeyWordAdvance(keywordForSearch, By.id("job"));
        typeCityAdvance(location,By.id("location"));
        // clickAdvanceSearch();
        clickCheckBox(partTime);
        checkResultOfSearch(posiCountId);
    }

    private void clickCheckBox(By xpath) {
        driver.findElement(xpath).sendKeys(Keys.SPACE);

    }

    @Test
    public void test_skills_Center() {
        openMainPage();
        clickCareer();
        choseSkillsCenterFromDropdList();
        typeKeyWordAdvance(keywordForSearch, By.id("s"));
        submit();
        checkResultOfSearch(By.id("piechart-canvas"));
    }

    private void submit() {
        driver.findElement(By.id("s")).sendKeys(Keys.ENTER);
    }

    private void choseSkillsCenterFromDropdList() {
        driver.findElement(By.xpath("/html/body/div[5]/header/div[1]/div/div[2]/ul[1]/li[1]/ul/li[2]/a")).click();
    }

    private void clickCareer() {
        driver.findElement(By.id("smart-toggle-Career")).click();
    }

    private void checkResultOfSearch(By elem) {
        waitForElement(elem);
//        boolean finded = false;
//        try {
//            finded=  driver.findElement(posiCountId).isDisplayed();
//        } catch (Exception e){
//            finded = false;
//        }
        boolean finded=  driver.findElement(elem).isDisplayed();
        Assert.assertTrue(finded);
    }

    private void waitForElement(By posiCountId) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        // WebElement element =
        wait.until(ExpectedConditions.visibilityOfElementLocated(posiCountId));
    }


    private void submitSearch() {
        driver.findElement(findTechJobs).click();
    }

    private void typeLocation(String location) {
        driver.findElement(fieldLocation).clear();
        driver.findElement(fieldLocation).sendKeys(location);
    }


    private void typeKeyword(String keywordForSearch) {
        driver.findElement(searchFieldKeyword).sendKeys(keywordForSearch);


    }

    private void openMainPage() {
        driver.get(mainPage);
    }


    @BeforeSuite
    public void setup9(){
        String property = "webdriver.gecko.driver";
        String value = "C:\\JavaBootCampNov-day1\\src\\test\\resources\\geckodriver.exe";
        System.setProperty(property,value);
        driver= new FirefoxDriver();
    }
}
