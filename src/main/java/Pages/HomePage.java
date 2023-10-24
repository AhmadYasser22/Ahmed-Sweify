package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class HomePage extends AbstractPage {
    private final static By userName   =  By.cssSelector("#user-name");
    private final static By password   =  By.cssSelector("#password");
    private final static By loginButton   =    By.id("login-button");
    private final static By errorField =  By.xpath("//h3[@data-test='error']");

   // WebDriver driver;
    String Homeurl = "https://www.saucedemo.com/";
    String Inventoryurl = "https://www.saucedemo.com/inventory.html";



    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void loadHomePage() {
        getDriver().get(Homeurl);
    }
    public void loadInventoryPage() {
        getDriver().get(Inventoryurl);
    }



    public void enterUsername(String text) {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(userName));
        getDriver().findElement(userName).sendKeys(text);
    }
    public void enterPassword(String text) {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(password));
        getDriver().findElement(password).sendKeys(text);
    }
    public void login(){
        getWait().until(ExpectedConditions.visibilityOfElementLocated(loginButton));
        getDriver().findElement(loginButton).click();
    }
    public void assertError(String errorMessage){
        String text =getDriver().findElement(errorField).getText();
        Assert.assertTrue(text.contains(errorMessage));
    }
}
