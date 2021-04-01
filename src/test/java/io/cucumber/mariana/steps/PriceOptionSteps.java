package io.cucumber.mariana.steps;

import io.cucumber.mariana.servicos.Configuracao;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.java.pt.*;

public class PriceOptionSteps extends Configuracao {
    
    @Quando("escolho um preco")
    public void escolho_um_preco() {
        WebElement plano = Configuracao.seletorQueryCss("#selectultimate");
        Actions actions = new Actions(browser);
		actions.moveToElement(plano).click().perform();       
    }
    
    @Entao("clico no botao seguinte {string}")
    public void clico_no_botao_seguinte(String string) {     
        WebElement botao = Configuracao.seletorQueryCss("#nextsendquote");
        Actions actions = new Actions(browser);
		actions.moveToElement(botao).click().perform();       
    }
}
