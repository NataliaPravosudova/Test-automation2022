package framework.decorator;

import org.openqa.selenium.WebElement;

import java.util.Objects;

public class MyInput extends Element {

    public MyInput(WebElement webElement) {
        super(webElement);
        this.webElement = webElement;
    }

    public void input(String inputText){
        System.out.println("Input: '"+inputText+"'");
        webElement.sendKeys(inputText);
    }

    public void inputNotNull(String inputText){
        if(Objects.equals(inputText, "")){
            System.out.println("You have to input smth!!!");
        }
        else{
            System.out.println("Input: '"+inputText+"'");
        }
        webElement.sendKeys(inputText);
    }

}
