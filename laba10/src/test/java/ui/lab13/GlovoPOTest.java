package ui.lab13;

import com.automation.remarks.testng.UniversalVideoListener;
import com.automation.remarks.video.annotations.Video;
import lab12.BaseUITest;
import lab12.BrowserFactory;
import lab12.GlovoFactoryBO;
import lab13.CustomSuiteListener;
import lab13.CustomTestListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

@Listeners({CustomTestListener.class, CustomSuiteListener.class, UniversalVideoListener.class})
public class GlovoPOTest extends BaseUITest {

    private ThreadLocal<WebDriver> chromeDriver = new InheritableThreadLocal<>();


    @Test
    @Video
    void glovoTest(){
        WebDriver driver = BrowserFactory.getChromedriver();
        driver.manage().timeouts().implicitlyWait(Duration.of(10, ChronoUnit.SECONDS));

        //chromeDriver.set(new ChromeDriver());
        GlovoFactoryBO glovoBO = new GlovoFactoryBO(driver);

        //chromeDriver.set(new ChromeDriver());


        //go to page
        glovoBO.goToHome();

        //click sign up
        glovoBO.signUp();

        //verify I am on sign up page
        glovoBO.verifySingUpPageIsOpen();

        //put Log in
        glovoBO.putLogIn("userLogIn");
    }

    @AfterTest

    void closeDriver(){
        //chromeDriver.close();
        BrowserFactory.getChromedriver().quit();
    }
}


