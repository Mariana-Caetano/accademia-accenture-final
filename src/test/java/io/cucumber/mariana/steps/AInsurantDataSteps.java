package io.cucumber.mariana;

import io.cucumber.mariana.servicos.Configuracao;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.java.pt.*;

public class AInsurantDataSteps extends Configuracao {
    @Dado("que digito no campo First Name")
    public void que_digito_no_campo_First_Name() {
        Configuracao.seletorQueryCss("#firstname").sendKeys("Mariana");
    }

    @Dado("digito no campo Last Name")
    public void digito_no_campo_Last_Name() {
        Configuracao.seletorQueryCss("#lastname").sendKeys("Pereira");
    }

    @Dado("escolho Date of Birth")
    public void escolho_Date_of_Birth() {
        Configuracao.seletorQueryCss("#birthdate").sendKeys("10/23/1992");
    }

    @Dado("clico na opcao de Gender")
    public void clico_na_opcao_de_Gender() {
        Configuracao.seletorQueryCss("#insurance-form>div>section:nth-child(2)>div:nth-child(4)>p>label:nth-child(2)>span").click();
    }

    @Dado("digito no campo Street Adress")
    public void digito_no_campo_Street_Adress() {
        Configuracao.seletorQueryCss("#streetaddress").sendKeys("Deer Haven Drive, 1431");
    }

    @Dado("escolho Country")
    public void escolho_Country() {
        Configuracao.seletorQueryCss("#country>option:nth-child(32)").click();
    }

    @Dado("digito no campo Zip Code")
    public void digito_no_campo_Zip_Code() {
        Configuracao.seletorQueryCss("#zipcode").sendKeys("13820000");
    }

    @Dado("digito no campo City")
    public void digito_no_campo_City() {
        Configuracao.seletorQueryCss("#city").sendKeys("Jaguariúna");
    }

    @Dado("escolho Occupation")
    public void escolho_Occupation() {
        Configuracao.seletorQueryCss("#occupation>option:nth-child(6)").click();
    }

    @Dado("escolho Hobbies")
    public void escolho_Hobbies() {
        WebElement other = Configuracao.seletorQueryCss("#other");
        Actions actions = new Actions(browser);
		actions.moveToElement(other).click().perform();
    }

    @Dado("digito o Website")
    public void digito_o_Website() {
        Configuracao.seletorQueryCss("#website").sendKeys("www.google.com.br");
    }

    @Dado("clico em Picture")
    public void clico_em_Picture() {
        Configuracao.seletorQueryCss("#picture").click();
    }

    @Entao("clico no botao Next")
    public void clico_no_botao_Next() {
        Configuracao.seletorQueryCss("#nextenterproductdata").click();
    }
}
