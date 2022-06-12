package framework.decorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MyButton extends Element {

    public MyButton(WebElement webElement) {
        super(webElement);
        this.webElement = webElement;
    }

    public void myClick(){
        System.out.println("click");
        waitForMe();
        webElement.click();
    }

    public void TestClick(){
        if(webElement.isDisplayed()){
            myClick();
        }
        else{
            System.out.println("Button is not clickable!");
        }
    }


}