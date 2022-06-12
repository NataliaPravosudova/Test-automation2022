package lab11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPO {

    private static WebDriver driver;

    public SignUpPO(WebDriver driver) {

        this.driver=driver;
    }
    public static boolean isOpen() {
       //return driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div/div[2]/a")).isDisplayed();
        return  true;
    }



    public SignUpPO insertLogIn(String userLogIn) {
        //TODO
        return this;
    }

    public void clickSignUp() {
        //TODO
    }
}

