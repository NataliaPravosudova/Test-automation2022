package lab12.po;

import lab12.decorator.MyButton;
import lab12.decorator.MyFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomeFactoryPO {


    @FindBy(xpath = "//*[@id=\"app\"]/div/header/nav/div[5]/a[2]")
    private MyButton signUpButton;

    private final WebDriver driver;

    public HomeFactoryPO(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(new MyFieldDecorator(driver),this);
    }

    public void goToHome() {

        driver.get("https://unsplash.com");
    }

    public SignUpFactoryPO clickSignUp() {
        signUpButton.myClick();
        return new SignUpFactoryPO(driver);
    }


}



