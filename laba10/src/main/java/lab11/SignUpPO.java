package lab11;

import org.openqa.selenium.By;

import static lab11.GlovoBO.chromeDriver;

public class SignUpPO {
    public static boolean isOpen() {
        return chromeDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div/div[2]/a")).isDisplayed();
    }
}
