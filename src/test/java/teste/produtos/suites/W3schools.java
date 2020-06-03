package teste.produtos.suites;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import teste.Support;

public class W3schools extends Support {

    @Before
    public void bf(){
        createChrome();
    }

    @After
    public void af(){
        killChrome();
    }

    @Test
    public void teste2() throws InterruptedException {

        // Getting de browser id
        navigate("https://www.w3schools.com/jsref/met_win_alert.asp");
        Thread.sleep(2000);
        System.out.println(getWebDriver().getWindowHandles());

        click("//a[@href=\"tryit.asp?filename=tryjsref_alert2\"]");
        Thread.sleep(2000);
        System.out.println(getWebDriver().getWindowHandles());

        // Finding the ID's and navigating on the second page
        int contador = 0;
        for (String pagina:getWebDriver().getWindowHandles()){
            System.out.println(pagina);
            contador++;
            if(contador==2) {
                getWebDriver().switchTo().window(pagina);
            }
        }
        Thread.sleep(2000);

        // Navigating on the iframe to alert
        WebElement frame = getWebDriver().findElement(By.xpath("//iframe[@id=\"iframeResult\"]"));

        getWebDriver().switchTo().frame(frame);

        click("//button[@onclick=\"myFunction()\"]");

        Thread.sleep(2000);

        // Navigating on the Alert:
        Alert alert = getWebDriver().switchTo().alert();

        System.out.println(alert.getText());
        alert.accept();

        Thread.sleep(2000);

        // Returning to main page and clicking on atob()
        contador = 0;
        for (String pagina:getWebDriver().getWindowHandles()){
            System.out.println(pagina);
            contador++;
            if(contador==1) {
                getWebDriver().switchTo().window(pagina);
            }
        }
        Thread.sleep(2000);

        click("//a[@href=\"met_win_atob.asp\"]");
        Thread.sleep(2000);
    }
}
