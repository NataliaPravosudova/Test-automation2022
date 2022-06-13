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
    //private ThreadLocal<WebDriver> IEdriver = new InheritableThreadLocal<>();
    @Test
    @Video
    void LoginUnsplashTest() {
        WebDriver driver = BrowserFactory.getChromedriver();
        WebDriver IEdriver = BrowserFactory.getIEdriver();
        //driver.manage().timeouts().implicitlyWait(Duration.of(10, ChronoUnit.SECONDS));
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

    @DataProvider()
    public static Object[][] SearchDataProvider() {
        return new Object[][]{
                {"Grass"},
                {"Tree"},
                {"House"}
        };
    }
    @Test(dataProvider = "SearchDataProvider")
    void SearchTest(String searchWord) {
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
        //Step 4 Go to HomePage
        unsplashBO.homePage();
        // Step 5 Input search text
        unsplashBO.inputSearch(searchWord);
        //Step 7 click search Button
        unsplashBO.search();
        //Step 8 verify search is completed
        unsplashBO.verifySearch();
    }


    @Test
    void SearchFilterTest() {
        //driver.set(new ChromeDriver());
        WebDriver driver = BrowserFactory.getChromedriver();
        UnsplashBO unsplashBO = new UnsplashBO(
                driver
        );
//        // Step 1 "Go to website"
//        unsplashBO.goToHome();
//        // Step 2 "Click"
//        unsplashBO.loginClick();
//        // Step 3 "verify"
//        unsplashBO.verify();
//        // Step 4 put Login
//        unsplashBO.putLogin("natalia.pravosudova@gmail.com", "Natalia111");
        //Step 4 Go to HomePage
        unsplashBO.homePage();
        //Step 5 Input search word
        unsplashBO.inputSearch("Grass");
        //Step 6 click search button
        unsplashBO.search();
        //Step 7 click filter button
        unsplashBO.filter();
        //Step 8 set filter params
        unsplashBO.setParams();
        //Step 8 apply filter
        //unsplashBO.filterApply();
        //Step 9 verify filter is aplied
        unsplashBO.verifyFilter();
    }

    @Test
    void LzOpenPhoto(){
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
//        // Step 4 put Login
//        unsplashBO.putLogin("natalia.pravosudova@gmail.com", "Natalia111");
        //Step 4 go to homepage
        unsplashBO.homePage();
        //Step 5 Input search word
        unsplashBO.inputSearch("Ukraine");
        //Step 6 click search
        unsplashBO.search();
        //Step 7 click on the image
        unsplashBO.chooseIMG();
        //Step 8 check if the photo is opened
        unsplashBO.VerifyPhoto();
        //Step 9 close photo
        unsplashBO.closePhoto();
    }

    @Test
    void MCheckRelatedCategory(){
        //driver.set(new ChromeDriver());
        WebDriver driver = BrowserFactory.getChromedriver();
        //driver.manage().timeouts().implicitlyWait(Duration.of(10, ChronoUnit.SECONDS));
        UnsplashBO unsplashBO = new UnsplashBO(
                driver
        );
        // Step 1 "Go to website"
        unsplashBO.goToHome();
        // Step 2 "Click"
        unsplashBO.loginClick();
        // Step 3 "verify"
        unsplashBO.verify();
        // Step 4 put Login
        unsplashBO.putLogin("natalia.pravosudova@gmail.com", "Natalia111");
        //Step 4 go to homepage
        unsplashBO.homePage();
        //Step 5 Input search word
        unsplashBO.inputSearch("House");
        //Step 6 click search button
        unsplashBO.search();
        //Step 5 check if the book in the library
        unsplashBO.ChooseCategory();
        //Step 6 Verify category is open
        unsplashBO.VerifyCategory();
    }

//    @AfterTest
//    void CloseDriver(){
//        driver.get().quit();
//        //driver.quit();
//    }


}
