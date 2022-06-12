package framework.PO;

import lab12.decorator.MyFieldDecorator;
//import framework.PO.BookPO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPO {

    private static WebDriver driver;
    public SearchPO(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(new MyFieldDecorator(driver), this);
    }

    @FindBy(xpath = "//*[@id=\"component-browsecategories-browse-categories-%2fsearch\"]/div/a[7]")
    private WebElement fanfictionButton;

    @FindBy(xpath = "//*[@id=\"browse-container\"]/div/header/h1")
    private WebElement FanfictionLabel;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/h1")
    private WebElement notFoundLabel;

    //звернення до драйвера
    @FindBy(xpath = "//*[@id=\"component-storycardcontainer-story-card-container-%2fsearch%2fwarrior%2520cats\"]/div/div[1]/ul/li[1]/a/div[2]/div[2]/div[1]")
    private static WebElement chosenBook;

    public void ClickGanre(){
        fanfictionButton.click();
    }

    public boolean LabelCheck(){
        return FanfictionLabel.isDisplayed();
    }

    public boolean SearchResultCheck(){
        return notFoundLabel.isDisplayed();
    }

//    public static BookPO clickBook(){
//        chosenBook.click();
//        return new BookPO(driver);
//    }
}