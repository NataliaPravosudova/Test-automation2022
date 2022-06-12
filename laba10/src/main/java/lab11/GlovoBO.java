package lab11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GlovoBO {
    private WebDriver chromeDriver;

    private HomePO homePO;

    public static void main(String[] args) {

    }
    static SignUpPO signUpPO;

    public GlovoBO(WebDriver chromeDriver){
        this.chromeDriver=chromeDriver;
    }

    public void goToHome() {
        homePO = new HomePO(chromeDriver);
        homePO.goToHome();

    }

    public void signUp() {signUpPO = homePO.clickSignUp();
    }

    public  static void verifySingUpPageIsOpen() {
        Assert.assertTrue(SignUpPO.isOpen());
    }

    public static void putLogIn(String userLogIn) {
        signUpPO.insertLogIn(userLogIn).clickSignUp();
    }

}
