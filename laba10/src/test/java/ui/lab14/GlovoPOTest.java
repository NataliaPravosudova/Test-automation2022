package ui.lab14;

import com.automation.remarks.testng.UniversalVideoListener;
import com.automation.remarks.video.annotations.Video;
import lab12.BaseUITest;
import lab12.BrowserFactory;
import lab12.GlovoFactoryBO;
import lab13.CustomSuiteListener;
import lab13.CustomTestListener;
import lab14.AllureTestListener;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

@Listeners({CustomTestListener.class, CustomSuiteListener.class, AllureTestListener.class})
public class GlovoPOTest extends BaseUITest {

   // private ThreadLocal<WebDriver> chromeDriver = new InheritableThreadLocal<>();


    @Test
    void glovoFailTest(){

        GlovoFactoryBO glovoBO = new GlovoFactoryBO(driver);

        //chromeDriver.set(new ChromeDriver());


        //go to page
        glovoBO.goToHome();
        Assert.assertFalse(true);

        //click sign up
        glovoBO.signUp();

        //verify I am on sign up page
        glovoBO.verifySingUpPageIsOpen();

        //put Log in
        glovoBO.putLogIn("userLogIn");
    }

    @Test
    void glovoTest(){

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


