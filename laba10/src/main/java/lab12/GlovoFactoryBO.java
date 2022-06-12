package lab12;

import io.qameta.allure.Step;
import lab11.SignUpPO;
import lab12.po.HomeFactoryPO;
import lab12.po.SignUpFactoryPO;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class GlovoFactoryBO {
    private WebDriver chromeDriver;

    private HomeFactoryPO homePO;

    public static void main(String[] args) {

    }
    SignUpFactoryPO signUpPO;

    public GlovoFactoryBO(WebDriver chromeDriver){
        this.chromeDriver=chromeDriver;
    }

    @Step
    public void goToHome() {
        homePO = new HomeFactoryPO(chromeDriver);
        homePO.goToHome();

    }

    @Step
    public void signUp() {
        signUpPO = homePO.clickSignUp();
    }

    @Step
    public void verifySingUpPageIsOpen() {
        Assert.assertTrue(SignUpPO.isOpen());

    }
    @Step
    public void putLogIn(String userLogIn) {
        signUpPO.insertLogIn(userLogIn).clickSignUp();
    }

}







