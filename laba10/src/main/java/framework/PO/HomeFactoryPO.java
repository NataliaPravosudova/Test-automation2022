package framework.PO;

import framework.decorator.MyButton;
import framework.decorator.MyFieldDecorator;
import framework.PO.LoginPO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeFactoryPO {

    @FindBy(xpath = "//*[@id=\"app\"]/div/header/nav/div[5]/a[1]")
    private MyButton signUpButton;


    private WebDriver driver;
    public HomeFactoryPO(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new MyFieldDecorator(driver), this);
    }

    public void goToHome() {
        driver.get("https://unsplash.com");
    }

    public LoginPO clickLogin() {
        signUpButton.myClick();
        return new LoginPO(driver);
    }
}
