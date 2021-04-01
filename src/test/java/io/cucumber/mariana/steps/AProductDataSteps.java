package io.cucumber.mariana;

import io.cucumber.mariana.servicos.Configuracao;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.java.pt.*;

public class AProductDataSteps extends Configuracao {
    @Quando("seleciono uma data  no campo Start Date")
    public void seleciono_uma_data_no_campo_Start_Date() {
        Configuracao.seletorQueryCss("#startdate").sendKeys("04/31/2021");
    }

    @Quando("seleciono um valor em Insurance Sum")
    public void seleciono_um_valor_em_Insurance_Sum() {
        Configuracao.seletorQueryCss("#insurancesum>option:nth-child(3)").click();
    }

    @Quando("escolho no campo Merit Rating")
    public void escolho_no_campo_Merit_Rating() {
        Configuracao.seletorQueryCss("#meritrating>option:nth-child(12)").click();
    }

    @Quando("escolho no campo Damage Insurance")
    public void escolho_no_campo_Damage_Insurance() {
        Configuracao.seletorQueryCss("#damageinsurance>option:nth-child(3)").click();
    }

    @Quando("seleciono uma opcao em Optional Products")
    public void seleciono_uma_opcao_em_Optional_Products() {
        WebElement euro = Configuracao.seletorQueryCss("#EuroProtection");
        Actions actions = new Actions(browser);
		actions.moveToElement(euro).click().perform();
    }

    @Quando("seleciono uma opcao em Courtesy Car")
    public void seleciono_uma_opcao_em_Courtesy_Car() {
        Configuracao.seletorQueryCss("#courtesycar>option:nth-child(3)").click();
    }

    @Entao("clico em Next para preencher Price Option")
    public void clico_em_Next_para_preencher_Price_Option() {
        Configuracao.seletorQueryCss("#nextselectpriceoption").click();
    }
        
    
}
