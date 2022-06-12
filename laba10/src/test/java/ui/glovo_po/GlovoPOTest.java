package ui.glovo_po;

import lab11.GlovoBO;
import lab12.BaseUITest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;

public class GlovoPOTest  extends BaseUITest {

    private ThreadLocal<WebDriver> chromeDriver = new InheritableThreadLocal<>();

    @DataProvider(parallel = true)
    public static Object[][] testDataProvider() {
        System.setProperty("webdriver.chrome.driver","driver" + File.separator+"chromedriver.exe");
        return new Object[][]{
        {"user_1"},
        {"user_2"}};
    }

//    @BeforeTest
//    void initDriver(){
//        String driverPath = "driver/chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver", driverPath);
//
//        chromeDriver = new ChromeDriver();
//    }

    @Test(dataProvider = "testDataProvider")
    void glovoTest(String userLogIn){
        chromeDriver.set(new ChromeDriver());
        GlovoBO glovoBO = new GlovoBO(chromeDriver.get());

        //chromeDriver.set(new ChromeDriver());


        //go to page
        glovoBO.goToHome();

        //click sign up
        glovoBO.signUp();

        //verify I am on sign up page
        glovoBO.verifySingUpPageIsOpen();

        //put Log in
        GlovoBO.putLogIn(userLogIn);
    }

    @AfterTest

    void closeDriver(){
        //chromeDriver.close();
        chromeDriver.get().quit();
    }
}
