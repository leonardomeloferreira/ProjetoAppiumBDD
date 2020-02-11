package br.com.rsinet.hub_bdd.stepDefinitions;


import br.com.rsinet_hub.managers.DriverManager;
import br.com.rsinet_hub.managers.TestContext;
import br.com.rsinet_hub.projetoappium.pageFactory.Home_Page;
import br.com.rsinet_hub.projetoappium.pageFactory.Products_Page;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.android.AndroidDriver;

public class HomePageSteps {
	
	private AndroidDriver driver;
	private TestContext testContext;
	private Home_Page homePage;
	private DriverManager manager;
	private Products_Page productsPage;
	
	public HomePageSteps(TestContext context) {
		testContext = context;
		homePage = testContext.getPageFactoryManager().getHomePage();
		manager = testContext.getDriverManager();
		driver = manager.getDriver();

	}

	@Dado("^que o usuario esteja na pagina inicial$")
	public void que_o_usuario_esteja_na_pagina_inicial() throws Throwable {
		System.out.println("pagina inicial");
	}
	@Quando("^usuario navegar para a pagina de registro$")
	public void usuario_navegar_para_a_pagina_de_registro() throws Throwable {
		homePage.clicarHome();
		homePage.clicarLogin();
		homePage.clicarCriarNovaConta();
	}
	//Busca pela home
	@Quando("^usuario clicar na categoria desejada$")
	public void usuario_clicar_na_categoria_desejada() throws Throwable {
		homePage.click_Categoria("LAPTOPS");
	}
	//Busca pela lupa
	@Quando("^usuario buscar na barra de pesquisa por produto valido$")
	public void usuario_buscar_na_barra_de_pesquisa_por_produto_valido() throws Throwable {
		homePage.click_Lupa();
		homePage.escreverPesquisa("hp");
		homePage.click_Lupa();
	}
	@Quando("^usuario buscar na barra de pesquisa por produto invalido$")
	public void usuario_buscar_na_barra_de_pesquisa_por_produto_invalido() throws Throwable {
		homePage.click_Lupa();
		homePage.escreverPesquisa("samsung");
		homePage.click_Lupa();

	}
}
