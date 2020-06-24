package teste.support.w3schools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class CoreW3schools {
    private WebDriver driver = null;

    protected void click(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }

    protected void navigate(String url){
        driver.get(url);
    }

    protected void createWebDriver(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    protected void killWebDriver(){
        driver.quit();
    }

    protected void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    protected void nextTab(){
        String[] paginas = driver.getWindowHandles().toArray(new String[0]);
        driver.switchTo().window(paginas[paginas.length-1]);
    }

    protected void navigateFrame(String xpath){
        WebElement frame = driver.findElement(By.xpath(xpath));
        driver.switchTo().frame(frame);
    }

    protected void sleep(int tempo){
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected void send(String xpath, String text) {
        driver.findElement(By.xpath(xpath)).sendKeys(text);
    }

    protected void enter() {
        try {
            Robot r = new Robot();
            r.keyPress(KeyEvent.VK_ENTER);
            r.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
