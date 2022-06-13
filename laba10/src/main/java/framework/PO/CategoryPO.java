package framework.PO;

import lab12.decorator.MyFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryPO {
    private static WebDriver driver;
    public CategoryPO(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(new MyFieldDecorator(driver), this);
    }
    @FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/h1")
    private WebElement catLabel;



    public boolean isOpen() {
        return catLabel.isDisplayed();
    }
}