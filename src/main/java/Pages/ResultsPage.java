package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ResultsPage extends AbstractPage {
    public WebDriver driver ;
    private final static By title =  By.xpath("//span[@class='title']");


    public ResultsPage(WebDriver driver) {
        super(driver);
    }

    public void checkLogin(){
        String text =getDriver().findElement(title).getText();
        Assert.assertEquals(text, "Products");
    }

}
