package lab11;

import org.openqa.selenium.By;

import static lab11.GlovoBO.chromeDriver;

public class HomePO {
    public void goToHome() {

        chromeDriver.get("https://unsplash.com");
    }

    public SignUpPO clickSignUp() {
        chromeDriver.findElement(By.xpath("//*[@id=\"app\"]/div/header/nav/div[5]/a[2]")).click();
        return new SignUpPO();
    }
}
