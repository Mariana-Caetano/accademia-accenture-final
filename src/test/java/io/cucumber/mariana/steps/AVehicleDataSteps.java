package io.cucumber.mariana.steps;

import io.cucumber.mariana.servicos.Configuracao;
import io.cucumber.java.pt.*;

public class AVehicleDataSteps {

	@Quando("estou no site Tricentis")
	public void estou_no_site_Tricentis() {
		Configuracao.open("http://sampleapp.tricentis.com/101/app.php");
	}

	@Quando("clico em uma opcao em Make")
	public void clico_em_uma_opcao_em_Make() {
		Configuracao.cssSelector("option[value='Honda']").click();
	}

	
	@Quando("digito no campo Engine Performance {string}")
	public void escrevo_no_campo_Enginee_Performance(String string){
		Configuracao.id("#engineperformance").sendKeys(string);
	}	

	@Quando("escolho Date of Manufacture")
	public void escolho_Date_of_Manufacture() {
		Configuracao.cssSelector("button[class='ui-datepicker-trigger']").click();    
	}

	
	@Quando("seleciono Number of Seats")
	public void seleciono_Number_of_Seats() {
		Configuracao.id("#numberofseats").click();
		    
	}


	@Quando("seleciono Fuel Type")
	public void seleciono_Fuel_Type() {
		Configuracao.id("#fuel").click();
    
	}

	
	@Quando("digito no campo List Price {String}")
	public void digito_no_campo_List_Price(String string) {
		Configuracao.id("#listprice").sendKeys(string);
	}       

	
	@Quando("digito no campo License Plate Number")
	public void digito_no_campo_License_Plate_Number() {     
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();       
	}

	@Quando("digito no campo Annual Mileage{string}")
	public void digito_no_campo_Annual_Mileage(String string) {
		Configuracao.id("#annualmileage").sendKeys(string);       
	}

	@Entao("clico no botao {string}")
	public void clico_no_botao(String string) {
		Configuracao.id("#nextenterinsurantdata").click();   
	}

}