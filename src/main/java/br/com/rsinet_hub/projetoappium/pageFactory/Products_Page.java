package br.com.rsinet_hub.projetoappium.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.hub_bdd.util.Scroll;
import io.appium.java_client.android.AndroidDriver;

public class Products_Page {

	AndroidDriver driver;

	public Products_Page(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewProductName")
	private WebElement titulo_Produto;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewNoProductsToShow")
	private WebElement txt_NoProducts;
	
	public String getMensagemErro() {
		return txt_NoProducts.getText();
	}
	public String getTituloProduto() {
		return titulo_Produto.getText();
	}
	public void click_Laptopescolhido(String nomeLaptop) {
		Scroll.scrollAndClick(driver, nomeLaptop);
	}
}
