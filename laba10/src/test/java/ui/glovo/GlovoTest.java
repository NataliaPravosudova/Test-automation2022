package ui.glovo;

import lab12.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import lab12.BaseUITest;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class GlovoTest extends BaseUITest {
    protected WebDriver chromeDriver = BrowserFactory.getChromedriver();

//    @BeforeTest
//    void initDriver(){
//        String driverPath = "driver/chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver", driverPath);
//
//        chromeDriver = new ChromeDriver();
//        chromeDriver.manage().timeouts().implicitlyWait(Duration.of(10, ChronoUnit.SECONDS));
//    }

    @Test
    void glovoTest(){

        chromeDriver.get("https://unsplash.com/");


        chromeDriver.findElement(By.xpath("//*[@id=\"app\"]/div/header/nav/div[5]/a[2]")).click();

        Assert.assertTrue(
        chromeDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div/div[2]/a")).isDisplayed());

    }

    @AfterTest

    void closeDriver(){
        //chromeDriver.close();
        chromeDriver.quit();
    }
}
