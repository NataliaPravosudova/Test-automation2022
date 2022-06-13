package lab14;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import lab12.BrowserFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

import java.io.ByteArrayInputStream;

public class AllureTestListener implements ITestListener {
    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
        //getScreenshot();
    }

    @Attachment(value = "Page Screen", type = "image/png")
    public byte[] getScreenshot(){
        Allure.addAttachment("Screenshot", new ByteArrayInputStream(((TakesScreenshot) BrowserFactory.getChromedriver()).getScreenshotAs(OutputType.BYTES)));

        return ((TakesScreenshot) BrowserFactory.getChromedriver()).getScreenshotAs(OutputType.BYTES);
    }

    @Attachment(value = "{0}", type = "text/plain")
    public  String getDom(){
        return BrowserFactory.getChromedriver().getPageSource();
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
        getScreenshot();
        getDom();
    }
}
