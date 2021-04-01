package io.cucumber.mariana.servicos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Configuracao {

    public static WebDriver browser;
    
    public static void open(String url){
      
      if(browser == null){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        browser = new ChromeDriver();
      }
  
      browser.get(url);
      browser.manage().window().maximize();
    }

    public static void browser(String string) {
    }

    public static void fechar() {
      browser.close();
      browser = null; 
    }
  
    public static WebElement seletorQueryCss(String seletor) {
      return  Configuracao.browser.findElement(By.cssSelector(seletor));
    }
    
}
