package lab10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Main {
    public static void main(String[] args) {


        String driverPath = "driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);

        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://glovoapp.com");



        WebElement startButton = chromeDriver.findElement(By.xpath("//*[@id=\"user-register\"]"));

        System.out.println(startButton.getText());
        startButton.click();

        chromeDriver.close();
        chromeDriver.quit();


    }
}
