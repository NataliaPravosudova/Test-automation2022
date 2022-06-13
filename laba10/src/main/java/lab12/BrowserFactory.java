package lab12;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;


public class BrowserFactory {
    private static final ThreadLocal<WebDriver> INSTANCE = new InheritableThreadLocal<>();
    public static WebDriver getChromedriver(){
        if(null==INSTANCE.get()){
            System.setProperty("webdriver.chrome.driver","driver" + File.separator+"chromedriver.exe");
//        ChromeDriverManager.getInstance().setup();
        INSTANCE.set(new ChromeDriver());
        }
        return INSTANCE.get();
    }
    public static WebDriver getIEdriver(){
        if(null==INSTANCE.get()){
            System.setProperty("webdriver.ie.driver","driver" + File.separator+"IEDriverServer.exe");
//        ChromeDriverManager.getInstance().setup();
            INSTANCE.set(new InternetExplorerDriver());
            //System.setProperty("", "D:IE Driver ServerIEDriverServer.exe");
        }
        return INSTANCE.get();
    }
}
