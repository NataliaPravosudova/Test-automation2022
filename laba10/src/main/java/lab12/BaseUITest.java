package lab12;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class BaseUITest {
    protected WebDriver driver = BrowserFactory.getChromedriver();

    @BeforeTest
    void init(){
        System.setProperty("webdriver.chrome.driver", "driver"+ File.separator+"chromedriver");

        driver.manage().timeouts().implicitlyWait(Duration.of(10, ChronoUnit.SECONDS));
    }
    //protected WebDriver chromeDriver = BrowserFactory.getChromedriver();
}
