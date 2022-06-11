package lab11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class GlovoBO {
    public static WebDriver chromeDriver;

    HomePO homePO = new HomePO();
    SignUpPO signUpPO;

    public void goToHome() {
        homePO.goToHome();

    }

    public void signUp() {
        signUpPO = homePO.clickSignUp();
    }

    public void verifySingUpPageIsOpen() {
        Assert.assertTrue(SignUpPO.isOpen());

    }
}
