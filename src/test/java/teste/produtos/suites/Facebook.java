package teste.produtos.suites;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import teste.Support;

import static java.lang.Thread.*;
import static teste.produtos.objetos.Login.*;

public class Facebook extends Support {

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

        navigate(url);
        send(fieldLogin, "your e-mail");
        send(passwordLogin, "your password");
        click(enterLogin);
        Thread.sleep(10000);
    }
}
