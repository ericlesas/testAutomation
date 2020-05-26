package teste;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Support {
    private static ChromeDriver webDriver = null;

    protected void createChrome(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
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

    protected void click(String xpath){
        webDriver.findElement(By.xpath(xpath)).click();
    }
}
