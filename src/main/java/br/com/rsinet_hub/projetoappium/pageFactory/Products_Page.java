package br.com.rsinet_hub.projetoappium.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.hub_bdd.util.Click;
import br.com.rsinet.hub_bdd.util.Scroll;
import io.appium.java_client.android.AndroidDriver;

public class Products_Page {

	private AndroidDriver driver;

	public Products_Page(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewProductName")
	private WebElement titulo_Produto;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewNoProductsToShow")
	private WebElement txt_NoProducts;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewFilter")
	private WebElement txt_Filters;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewFilter")
	private WebElement txt_FilterDisplay;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewFilter")
	private WebElement txt_FilterColor;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewApply")
	private WebElement btn_Apply;
	

	public String getMensagemErro() {
		return txt_NoProducts.getText();
	}

	public String getTituloProduto() {
		return titulo_Produto.getText();
	}
	public void click_Filtro() {
		txt_Filters.click();
	}
	public void filtro_Compatibilidade() {
		Click.ByVisibleText(driver, "BY COMPATIBILITY");
	}
	public void filtro_SmartPhone() {
		Click.ByVisibleText(driver, "Smart phone");
	}
	
	public void filtro_Conector() {
		Click.ByVisibleText(driver, "BY CONNECTOR");
	}
	public void filtro_BlueTooth() {
		Click.ByVisibleText(driver, "BlueTooth");
	}
	public void click_Apply() {
		btn_Apply.click();
	}
	

	public void click_Laptopescolhido(String nomeLaptop) {
		Scroll.scrollAndClick(driver, nomeLaptop);
	}
}
