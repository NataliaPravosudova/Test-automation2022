package lab12.po;

import lab12.decorator.MyFieldDecorator;
import lab12.decorator.MyInput;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignUpFactoryPO {

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[2]/div/div/div[2]/a")
    private WebElement textLabel;

    @FindBy(xpath = "//*[@id=\"user_username\"]")
    private MyInput logInInput;

    @FindBy(xpath = "//*[@id=\"new_user\"]/div[5]/a")
    private WebElement signUpButton;

    private WebDriver driver;

    public SignUpFactoryPO(WebDriver driver) {


        this.driver = driver;
        PageFactory.initElements(new MyFieldDecorator(driver),this);

    }

    public boolean isOpen() {
        return textLabel.isDisplayed();
    }

    public SignUpFactoryPO insertLogIn(String userLogIn){

        logInInput.input(userLogIn);
        return this;
    }

    public SignUpFactoryPO clickSignUp() {
        signUpButton.click();
        return this;
    }
}
