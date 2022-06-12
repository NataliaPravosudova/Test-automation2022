package lab12;

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

    public void goToHome() {
        homePO = new HomeFactoryPO(chromeDriver);
        homePO.goToHome();

    }

    public void signUp() {
        signUpPO = homePO.clickSignUp();
    }

    public void verifySingUpPageIsOpen() {
        Assert.assertTrue(SignUpPO.isOpen());

    }
    public void putLogIn(String userLogIn) {
        signUpPO.insertLogIn(userLogIn).clickSignUp();
    }

}







