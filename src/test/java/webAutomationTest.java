import Pages.HomePage;
import Pages.ResultsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class webAutomationTest {
    private WebDriver driver;
    HomePage homePage;
    ResultsPage resultsPage;

    @BeforeClass
    public void initWebDriver() {
        driver = new ChromeDriver();
    }

    @Test
    public void happyScenario() {
        homePage = new HomePage(driver);
        homePage.loadHomePage();
        homePage.enterUsername("standard_user");
        homePage.enterPassword("secret_sauce");
        homePage.login();

        resultsPage = new ResultsPage(driver);
        resultsPage.checkLogin();
    }

    @Test
    public void missingUsernameScenario() {
        homePage = new HomePage(driver);
        homePage.loadHomePage();
        homePage.enterPassword("secret_sauce");
        homePage.login();
        homePage.assertError("Username is required");
    }

    @Test
    public void missingPasswordScenario() {
        homePage = new HomePage(driver);
        homePage.loadHomePage();
        homePage.enterUsername("standard_user");
        homePage.login();
        homePage.assertError("Password is required");
    }

    @AfterClass
    public void quitWebDriver() {
        driver.quit();
    }
}

