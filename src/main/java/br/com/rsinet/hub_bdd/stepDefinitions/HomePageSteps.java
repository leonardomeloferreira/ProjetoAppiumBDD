package br.com.rsinet.hub_bdd.stepDefinitions;

import org.openqa.selenium.WebElement;

import br.com.rsinet_hub.managers.DriverManager;
import br.com.rsinet_hub.managers.TestContext;
import br.com.rsinet_hub.projetoappium.pageFactory.Home_Page;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.android.AndroidDriver;

public class HomePageSteps {
	
	private AndroidDriver<WebElement> driver;
	private TestContext testContext;
	private Home_Page homePage;
	private DriverManager manager;
	
	public HomePageSteps(TestContext context) {
		testContext = context;
		homePage = testContext.getPageFactoryManager().getHomePage();
		manager = testContext.getDriverManager();
		
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
}
