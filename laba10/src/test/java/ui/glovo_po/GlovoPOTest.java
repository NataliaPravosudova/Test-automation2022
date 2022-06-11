package ui.glovo_po;

import lab11.GlovoBO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GlovoPOTest {


    @BeforeTest
    void initDriver(){
        String driverPath = "driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);

        lab11.GlovoBO.chromeDriver = new ChromeDriver();
    }

    @Test
    void glovoTest(){

        GlovoBO glovoBO = new GlovoBO();

        //go to page
        glovoBO.goToHome();

        //click sign up
        glovoBO.signUp();

        //
        glovoBO.verifySingUpPageIsOpen();
    }

    @AfterTest

    void closeDriver(){
        //chromeDriver.close();
        lab11.GlovoBO.chromeDriver.quit();
    }
}
