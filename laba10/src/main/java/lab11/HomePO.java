package lab11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class HomePO {
    private WebDriver driver;

    public HomePO(WebDriver driver) {
        this.driver = driver;
    }

    public void goToHome() {

        driver.get("https://unsplash.com");
    }

    public SignUpPO clickSignUp() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/header/nav/div[5]/a[2]")).click();
        return new SignUpPO(driver);
    }


}
