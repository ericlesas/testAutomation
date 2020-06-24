package teste.produtos.suites;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import teste.support.w3schools.CoreW3schools;

import static teste.produtos.objetos.SchoolsEnvironment.*;

public class W3schools extends CoreW3schools {

    @Before
    public void bf(){
        createWebDriver();
    }

    @After
    public void af(){
        killWebDriver();
    }

    @Test
    public void teste2(){

        navigate(url);
        send(searchingW3Schools, "JavaScript Popup Boxes");
        enter();
        sleep(5000);
        navigate(W3Url);
        click(confirmBox);
        nextTab();
        navigateFrame(iframe);
        click(buttonTryIt);
        sleep(5000);
        acceptAlert();
        click(pressOkay);
        sleep(5000);
    }
}
