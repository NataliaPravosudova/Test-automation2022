package lab11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPO {

    private WebDriver driver;

    public SignUpPO(WebDriver driver) {

        this.driver=driver;
    }
    public boolean isOpen() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div/div[2]/a")).isDisplayed();
    }



    public SignUpPO insertLogIn(String userLogIn) {
        //TODO
        return this;
    }

    public void clickSignUp() {
        //TODO
    }
}

