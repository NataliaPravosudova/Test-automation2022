package framework.PO;

import framework.decorator.MyButton;
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

    @FindBy(xpath = "//*[@id=\"popover-search-color-filter\"]/button")
    private MyButton filterButton;

    @FindBy(xpath = "//*[@id=\"popover-search-color-filter\"]/div/div/div/div/ul/li[3]/div/div/div[2]/a[5]")
    private WebElement redFilter;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/h1")
    private WebElement notFoundLabel;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div/div[2]/div/div[2]/button[2]")
    private WebElement applyFilter;

    @FindBy(xpath = "//*[@id=\"popover-search-color-filter\"]/button/span/div")
    private WebElement filterLabel;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[3]/div[4]/div/div/div/div[1]/figure[1]/div/div/a/div/div[2]/div/img")
    private static WebElement chosenPhoto;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/div/div/div[2]/div[2]/div/div[1]/div/a")
    private static MyButton choosecat;




    public boolean LabelCheck(){
        return redFilter.isDisplayed();
    }

    public boolean SearchResultCheck(){
        return notFoundLabel.isDisplayed();
    }

    public void ClickFilter() {
        filterButton.TestClick();

    }

    public void ApplyFilter() {
        applyFilter.click();
    }

    public void ParamsClick() {
        redFilter.click();

    }

    public boolean FilterCheck() {
        return filterLabel.isDisplayed();
    }

    public static PhotoPO clickPhoto(){
        chosenPhoto.click();
        return new PhotoPO(driver);
    }

    public static CategoryPO chooseCat() {
        choosecat.TestClick();
        return new CategoryPO(driver);
    }
}