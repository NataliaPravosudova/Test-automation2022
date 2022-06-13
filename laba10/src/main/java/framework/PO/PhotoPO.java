package framework.PO;

import framework.decorator.MyButton;
import lab12.decorator.MyFieldDecorator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhotoPO {

    private static WebDriver driver;
    public PhotoPO(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(new MyFieldDecorator(driver), this);
    }


    @FindBy(xpath = "/html/body/div[4]/div/div/div[4]/div/div/div[1]/div[4]/div[1]/div[1]/h3")
    private static WebElement photoLabel;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[1]/button")
    private static MyButton closePhoto;

    public static boolean IsOpen() {
        return photoLabel.isDisplayed();
    }

    public void closePhoto() {
        closePhoto.TestClick();
    }
}
