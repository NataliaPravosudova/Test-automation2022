package framework.PO;

import framework.decorator.MyFieldDecorator;
import framework.decorator.MyInput;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import framework.PO.LibraryPO;

public class LoginPO {

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/a")
    private static WebElement textLabel;

    @FindBy(xpath = "//*[@id=\"app\"]/div/header/nav/a")
    private static WebElement userImage;

    @FindBy(xpath="//*[@id=\"user_email\"]")
    private MyInput loginInput;

    @FindBy(xpath = "//*[@id=\"user_password\"]")
    private MyInput passwordInput;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div/form/div[3]/input")
    private WebElement signUpButton;

    @FindBy(xpath = "//*[@id=\"app\"]/div/header/nav/div[2]/form/button[1]")
    private WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"app\"]/div/header/nav/div[2]/form/div[1]/input")
    private MyInput searchField;




    private static WebDriver driver;

    public LoginPO(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(new MyFieldDecorator(driver), this);
    }

    public static boolean isOpen() {
        return textLabel.isDisplayed();
    }

    public static boolean isOpenLogged() {
        return userImage.isDisplayed();
    }


    public LoginPO insertLogin(String userLogin, String password) {
        //loginInput.input(userLogin);
        loginInput.inputNotNull(userLogin);
        //passwordInput.input(password);
        passwordInput.inputNotNull(password);

        return this;
    }

    public LoginPO clickEnter() {
        signUpButton.click();
        return this;
    }

    public SearchPO Search(){
        searchButton.click();
        return new SearchPO(driver);
    }



    public void inputSearch(String searchWord){
        searchField.input(searchWord);
    }
}