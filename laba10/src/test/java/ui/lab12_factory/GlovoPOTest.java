package ui.lab12_factory;

import lab12.GlovoFactoryBO;
import lab12.BrowserFactory;
import lab12.BaseUITest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class GlovoPOTest extends BaseUITest {

    private ThreadLocal<WebDriver> chromeDriver = new InheritableThreadLocal<>();


    @Test
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


