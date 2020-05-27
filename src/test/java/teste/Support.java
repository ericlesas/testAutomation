package teste;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class Support {
    private static ChromeDriver webDriver = null;

    protected void createChrome(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    protected void killChrome(){
        webDriver.quit();
    }

    protected void navigate(String url){
        webDriver.get(url);
    }

    protected void send(String xpath, String text){
        webDriver.findElement(By.xpath(xpath)).sendKeys(text);
    }

    protected void sendSaoPauloRobot(){
        try {
            Robot r = new Robot();
            r.keyPress(KeyEvent.VK_TAB);
            r.keyRelease(KeyEvent.VK_TAB);
            Thread.sleep(200);
            r.keyPress(KeyEvent.VK_S);
            r.keyRelease(KeyEvent.VK_S);
            Thread.sleep(200);
            r.keyPress(KeyEvent.VK_A);
            r.keyRelease(KeyEvent.VK_A);
            Thread.sleep(200);
            r.keyPress(KeyEvent.VK_O);
            r.keyRelease(KeyEvent.VK_O);
            Thread.sleep(200);
            r.keyPress(KeyEvent.VK_SPACE);
            r.keyRelease(KeyEvent.VK_SPACE);
            Thread.sleep(200);
            r.keyPress(KeyEvent.VK_P);
            r.keyRelease(KeyEvent.VK_P);
            Thread.sleep(200);
            r.keyPress(KeyEvent.VK_A);
            r.keyRelease(KeyEvent.VK_A);
            Thread.sleep(200);
            r.keyPress(KeyEvent.VK_U);
            r.keyRelease(KeyEvent.VK_U);
            Thread.sleep(200);
            r.keyPress(KeyEvent.VK_L);
            r.keyRelease(KeyEvent.VK_L);
            Thread.sleep(200);
            r.keyPress(KeyEvent.VK_O);
            r.keyRelease(KeyEvent.VK_O);
            Thread.sleep(2000);
            r.keyPress(KeyEvent.VK_ENTER);
            r.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected void click(String xpath){
        webDriver.findElement(By.xpath(xpath)).click();
    }

    protected void scrollUp(){
        webDriver.executeScript("window.scrollBy(0, -2500)");
    }
}
