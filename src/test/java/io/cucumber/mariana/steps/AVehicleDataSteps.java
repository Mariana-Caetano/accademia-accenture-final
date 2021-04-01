package io.cucumber.mariana;

import io.cucumber.mariana.servicos.Configuracao;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.java.pt.*;

public class AVehicleDataSteps extends Configuracao {

	@Quando("estou no site Tricentis")
	public void estou_no_site_Tricentis() {
		open("http://sampleapp.tricentis.com/101/app.php");
        browser.manage().window().maximize();
	}

	@Quando("clico no campo Make e seleciona uma opcao")
    public void clico_no_campo_Make_e_seleciono_uma_opcao() {
        Configuracao.seletorQueryCss("#make>option:nth-child(5)").click();
    }
	
	@Quando("clico no campo Model e seleciono uma opcao")
	public void clico_no_campo_Model_e_seleciono_uma_opcao() {
		Configuracao.seletorQueryCss("#model>option:nth-child(4)").click();
	}
	
	@Quando("digito no campo Cylinder Capacity")
	public void digito_no_campo_Cylinder_Capacity() {
		Configuracao.seletorQueryCss("#cylindercapacity").sendKeys("1000");
	}
	
	@Quando("digito no campo Engine Performance")
	public void digito_no_campo_Engine_Performance() {
		Configuracao.seletorQueryCss("#engineperformance").sendKeys("150");
	}
	
	@Quando("digito no campo Date of Manufacture")
	public void digito_no_campo_Date_of_Manufacture() {
		Configuracao.seletorQueryCss("#dateofmanufacture").sendKeys("04/31/2021");
	}
	
	@Quando("clico no campo Number of Seats")
	public void clico_no_campo_Number_of_Seats() {
		Configuracao.seletorQueryCss("#numberofseats > option:nth-child(2)").click();
	}
	
	@Quando("clico no campo Right Hand Drive e seleciono")
	public void clico_no_campo_Right_Hand_Drive_e_seleciono() {
		Configuracao.seletorQueryCss("#insurance-form > div > section:nth-child(1) > div:nth-child(7) > p > label:nth-child(2) > span").click();
	}
	
	@Quando("clico no campo Number of Seats e seleciono")
	public void clico_no_campo_Number_of_Seats_e_seleciono() {
		Configuracao.seletorQueryCss("#numberofseatsmotorcycle > option:nth-child(3)").click();
	}
	
	@Quando("clico no campo Fuel Type e seleciono")
	public void clico_no_campo_Fuel_Type_e_seleciono() {
		Configuracao.seletorQueryCss("#fuel > option:nth-child(2)").click();
	}
	
	@Quando("digito no campo Payload")
	public void digito_no_campo_Payload() {
		Configuracao.seletorQueryCss("#payload").sendKeys("120");
	}
	
	@Quando("digito no campo Total Weight")
	public void digito_no_campo_Total_Weight() {
		Configuracao.seletorQueryCss("#totalweight").sendKeys("7891");
	}
	
	@Quando("digito no campo List Price")
	public void digito_no_campo_List_Price() {
		Configuracao.seletorQueryCss("#listprice").sendKeys("2000");
	}
	
	@Quando("odigito no campo License Plate Number")
	public void odigito_no_campo_License_Plate_Number() {
		Configuracao.seletorQueryCss("#licenseplatenumber").sendKeys("L-561gA");
	}
	
	@Quando("digito no campo Annual Mileage")
	public void digito_no_campo_Annual_Mileage() {
		Configuracao.seletorQueryCss("#annualmileage").sendKeys("10000");
	}
	
	@Entao("clico em Next")
	public void clico_em_Next() {
		Configuracao.seletorQueryCss("#nextenterinsurantdata").click();
	}

}