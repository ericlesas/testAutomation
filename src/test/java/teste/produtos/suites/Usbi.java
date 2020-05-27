package teste.produtos.suites;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import teste.Support;

import static java.lang.Thread.*;
import static teste.produtos.objetos.Login.*;
import static teste.produtos.objetos.requestEvaluation.*;

public class Usbi extends Support {

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
        send(emailLogin, "ericles.santos@autoavaliar.com.br");
        send(passwordLogin, "AA@102030");
        click(enterLogin);
        Thread.sleep(15000);
        click(ecoMenu);
        click(usbi);
        Thread.sleep(15000);
        click(menuRequestEvaluationButton);
        Thread.sleep(3000);
        click(evaluationType);
        click(chooseEvaluationType);
        send(fillName, "Teste");
        send(fillEmail, "teste@teste.com");
        send(fillPhone, "9999999999");
        send(fillCellphone, "999999999");
        send(fillCRM, "teste");
        send(fillCEP,"13333333");
        send(fillAddress, "Teste");
        send(fillAdressNumber, "5");
        send(fillAdressDetail, "Teste");
        send(fillNeighborhood, "Teste");
        //send(fillUnderline, "_");
        //click(clickCity);
        //send(fillYear, "2020");
        send(fillVehicle, "AUDI A3 1.4 TFSI FLEX SEDAN PRESTIGE PLUS TECH TIPTRONIC");
        send(plate, "EAO7655");
        send(renavam, "00972702725");
        Thread.sleep(3000);
        send(seats, "5");
        send(upholstery, "Teste");
        send(renavam, "00972702725");
        send(engineNumber, "5");
        send(power, "5");
        send(expectedValue, "5");
        //send(vehicleCity, "São Paulo");
        //click(vehicleCity);
        Thread.sleep(1000);
        sendSaoPauloRobot();
        //click(selectCity);
        click(clickObservations);
        send(textObservations, "teste");
        scrollUp();
        click(solicitationButton);
        Thread.sleep(9000);
    }
}
