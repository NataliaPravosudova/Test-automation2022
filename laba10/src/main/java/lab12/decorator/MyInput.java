package lab12.decorator;

import org.openqa.selenium.WebElement;


public class MyInput extends Element {
    WebElement webElement;

    public MyInput(WebElement webElement){
        super(webElement);
        this.webElement = webElement;
    }

    public void input(String inputText) {
        System.out.println("input " + "'" + inputText + "'");
        webElement.sendKeys(inputText);
    }


}


