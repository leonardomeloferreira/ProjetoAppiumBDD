package br.com.rsinet.hub_bdd.stepDefinitions;


import br.com.rsinet_hub.managers.DriverManager;
import br.com.rsinet_hub.managers.TestContext;
import br.com.rsinet_hub.projetoappium.pageFactory.Home_Page;
import br.com.rsinet_hub.projetoappium.pageFactory.Products_Page;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.android.AndroidDriver;

public class ProductsPageSteps {

	private AndroidDriver driver;
	private TestContext testContext;
	private Home_Page homePage;
	private DriverManager manager;
	private Products_Page productsPage;
	
	public ProductsPageSteps(TestContext context) {
		testContext = context;
		homePage = testContext.getPageFactoryManager().getHomePage();
		productsPage = testContext.getPageFactoryManager().getProductsPage();
		manager = testContext.getDriverManager();
		driver = manager.getDriver();
	}
	// Busca pela home
	@Quando("^usuario clicar no produto desejado$")
	public void usuario_clicar_no_produto_desejado() throws Throwable {
		String nomeProduto = "HP ENVY - 17T TOUCH LAPTOP";
		productsPage.click_Laptopescolhido(nomeProduto);

	}
	
	@Entao("^A pagina do produto escolhido sera exibida na tela$")
	public void a_pagina_do_produto_escolhido_sera_exibida_na_tela() throws Throwable {
		System.out.println("laptop exibido");
	}
	
	//Busca pela lupa
	@E("^usuario clica no produto$")
	public void usuario_clica_no_produto() throws Throwable {
		String nomeProduto2 = "HP PAVILION 15T TOUCH LAPTOP";
		productsPage.click_Laptopescolhido(nomeProduto2);
		Thread.sleep(3000);
	}
	@Entao("^o produto sera exibido na tela$")
	public void o_produto_sera_exibido_na_tela() throws Throwable {
		System.out.println("laptop exibido");

	}
	@Entao("^Nenhum resultado sera exibido$")
	public void nenhum_resultado_sera_exibido() throws Throwable {
		productsPage.getMensagemErro();
	}
}
