package framework;

import framework.UnsplashBO;
import com.automation.remarks.video.annotations.Video;
import lab12.BaseUITest;
import lab12.BrowserFactory;
import lab13.CustomSuiteListener;
import lab13.CustomTestListener;
import lab14.AllureTestListener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import java.time.Duration;
import java.time.temporal.ChronoUnit;


@Listeners({
        CustomTestListener.class,
        CustomSuiteListener.class,
        AllureTestListener.class
})
public class MainTest extends BaseUITest {
    private ThreadLocal<WebDriver> driver = new InheritableThreadLocal<>();
    @Test
    @Video
    void LoginUnsplashTest() {
        WebDriver driver = BrowserFactory.getChromedriver();
        driver.manage().timeouts().implicitlyWait(Duration.of(10, ChronoUnit.SECONDS));
        UnsplashBO unsplashBO = new UnsplashBO(
                driver
        );
        // Step 1 "Go to website"
        unsplashBO.goToHome();

        // Step 2 "Click"
        unsplashBO.loginClick();

        // Step 3 "verify"
        unsplashBO.verify();

        //Step 4 put Login
        unsplashBO.putLogin("natalia.pravosudova@gmail.com", "Natalia111");

        //Step 5 verify user is loggen in
        unsplashBO.verifyLogged();
    }

    @Test
    void SearchTest() {
        //driver.set(new ChromeDriver());
        WebDriver driver = BrowserFactory.getChromedriver();
        //driver.manage().timeouts().implicitlyWait(Duration.of(10, ChronoUnit.SECONDS));

        UnsplashBO unsplashBO = new UnsplashBO(
                driver
        );
//        // Step 1 "Go to website"
//        unsplashBO.goToHome();
//        // Step 2 "Click"
//        unsplashBO.loginClick();
//        // Step 3 "verify"
//        unsplashBO.verify();
//        // Step 4 put Login and password
//        unsplashBO.putLogin("natalia.pravosudova@gmail.com", "Natalia111");
        // Step 5 Search field text
        unsplashBO.inputSearch("Grass");
        //Step 7 click search Button
        unsplashBO.search();
        //Step 8 verify search is completed
        unsplashBO.verifySearch();
    }
//
//
//    @DataProvider()
//    public static Object[][] SearchDataProvider() {
//        return new Object[][]{
//                {"Warrior cats"},
//                {"She-ra"},
//                {"pjfoiejiofje"}
//        };
//    }
//    @Test(dataProvider = "SearchDataProvider")
//    void SearchWattpadTest(String searchWord) {
//        driver.set(new ChromeDriver());
//        UnsplashBO catLifeBO = new UnsplashBO(
//                driver.get()
//        );
//        // Step 1 "Go to website"
//        catLifeBO.goToHome();
//        // Step 2 "Click"
//        catLifeBO.loginClick();
//        // Step 3 "verify"
//        catLifeBO.verify();
//        // Step 4 put Login
//        catLifeBO.putLogin("kate_newAT", "12022002kate");
//        //Step 5 Input search word
//        catLifeBO.inputSearch("searchWord");
//        //Step 6 click search
//        catLifeBO.search();
//    }
//
//    @Test
//    void AddBook(){
//        driver.set(new ChromeDriver());
//        WebDriver driver = BrowserFactory.getChromedriver();
//        driver.manage().timeouts().implicitlyWait(Duration.of(10, ChronoUnit.SECONDS));
//        UnsplashBO catLifeBO = new UnsplashBO(
//                driver
//        );
//        // Step 1 "Go to website"
//        catLifeBO.goToHome();
//        // Step 2 "Click"
//        catLifeBO.loginClick();
//        // Step 3 "verify"
//        catLifeBO.verify();
//        // Step 4 put Login
//        catLifeBO.putLogin("kate_newAT", "12022002kate");
//        //Step 5 Input search word
//        catLifeBO.inputSearch("Warrior cats");
//        //Step 6 click search
//        catLifeBO.search();
//        //Step 7 click on the book
//        catLifeBO.chooseBook();
//        //Step 8 Adding book to library
//        catLifeBO.AddBookToLibrary();
//        //Step 9 check if the book in the library
//        catLifeBO.CheckTheBookInLibrary();
//    }
//
//    @Test
//    void DeleteBook(){
//        driver.set(new ChromeDriver());
//        WebDriver driver = BrowserFactory.getChromedriver();
//        driver.manage().timeouts().implicitlyWait(Duration.of(10, ChronoUnit.SECONDS));
//        UnsplashBO catLifeBO = new UnsplashBO(
//                driver
//        );
//        // Step 1 "Go to website"
//        catLifeBO.goToHome();
//        // Step 2 "Click"
//        catLifeBO.loginClick();
//        // Step 3 "verify"
//        catLifeBO.verify();
//        // Step 4 put Login
//        catLifeBO.putLogin("kate_newAT", "12022002kate");
//        //Step 9 check if the book in the library
//        catLifeBO.CheckTheBookInLibrary();
//        //Step 10 Delete the Book from library
//        catLifeBO.DeleteBook();
//    }
//    @AfterTest
//    void CloseDriver(){
//        driver.get().quit();
//        //driver.quit();
//    }


}
