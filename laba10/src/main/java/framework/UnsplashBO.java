package framework;

import framework.PO.*;
import io.qameta.allure.Step;
import lab11.HomePO;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import framework.PO.CategoryPO;

public class UnsplashBO {
    public static WebDriver driver;
    private static HomeFactoryPO homePO;
    private static SearchPO searchPO;
    private static PhotoPO photoPO;
    private static CategoryPO categoryPO;

    public static void main(String[] args) {
    }

    static LoginPO loginPO;

    public UnsplashBO(WebDriver chromeDriver){
        this.driver = chromeDriver;
    }

    @Step
    public static void goToHome() {
        homePO = new HomeFactoryPO(driver);
        homePO.goToHome();
    }

    @Step
    public void loginClick() {
        loginPO = homePO.clickLogin();
    }

    @Step
    public void verify() {
        Assert.assertTrue(LoginPO.isOpen());
    }

    @Step
    public void putLogin(String userLogin, String password) {
        loginPO
                .insertLogin(userLogin, password)
                .clickEnter();
    }

    @Step
    public void verifyLogged() {
        Assert.assertTrue(LoginPO.isOpenLogged());
    }
    @Step
    public void search() {
        searchPO = loginPO.Search();
    }

    @Step
    public void inputSearch(String searchWord){
        loginPO.inputSearch(searchWord);
    }

    @Step
    public void verifySearch(){
        Assert.assertTrue(searchPO.SearchResultCheck());
    }

    public void filter() {
        searchPO.ClickFilter();
    }

    public void filterApply() {
        searchPO.ApplyFilter();
    }

    public void setParams() {
        searchPO.ParamsClick();
    }

    public void verifyFilter() {
        Assert.assertTrue(searchPO.FilterCheck());
    }

    public void homePage() {

        homePO.Home();
    }


    @Step
    public void chooseIMG(){
        photoPO = SearchPO.clickPhoto();
    }


    @Step
    public void VerifyPhoto(){
        Assert.assertTrue(photoPO.IsOpen());
    }

    public void closePhoto() {
        photoPO.closePhoto();
    }

    public void ChooseCategory() {
        categoryPO = SearchPO.chooseCat();

    }

    public void VerifyCategory() {
        Assert.assertTrue(categoryPO.isOpen());
    }


}