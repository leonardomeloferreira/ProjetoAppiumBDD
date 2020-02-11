package br.com.rsinet.hub_bdd.stepDefinitions;

import org.openqa.selenium.WebElement;

import br.com.rsinet_hub.managers.DriverManager;
import br.com.rsinet_hub.managers.TestContext;
import br.com.rsinet_hub.projetoappium.pageFactory.Home_Page;
import br.com.rsinet_hub.projetoappium.pageFactory.Register_Page;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class RegistroSteps {
	
	private AndroidDriver<WebElement> driver;
	private TestContext testContext;
	private Home_Page homePage;
	private DriverManager manager;
	private Register_Page register;
	

	public RegistroSteps(TestContext context) {
		testContext = context;
		homePage = testContext.getPageFactoryManager().getHomePage();
		manager = testContext.getDriverManager();
		register = testContext.getPageFactoryManager().getRegisterPage();
		driver = manager.getDriver();

	}

	@E("^usuario preencher os campos com dados validos$")
	public void usuario_preencher_os_campos_com_dados_validos() throws Throwable {
		register.username("leonard45");
		register.email("leoanrdo3@gmail.com");
		register.senha("Test@123");
		register.confirmaSenha("Test@123");
		register.nome("leoanrdo");
		register.sobrenome("ferreira");
		register.telefone("111111111");
		register.estado("Sao Paulo");
		register.endereco("Rua Alto Alegre");
		register.cidade("OZasco");
		register.cep("04324-324");
		register.pais("Brazil");
		
	}

	@E("^clicar no botao registrar$")
	public void clicar_no_botao_registrar() throws Throwable {
		register.click_Register();
	}

	@Entao("^usuario sera registrado com sucesso$")
	public void usuario_sera_registrado_com_sucesso() throws Throwable {
		Thread.sleep(3000);
		homePage.clicarHome();
	}
	@E("^usuario preencher os campos com dados invalidos$")
	public void usuario_preencher_os_campos_com_dados_invalidos() throws Throwable {
		register.username("leon");
		register.email("leoanrdo3@gma#$%il.com");
		register.senha("Test@123");
		register.confirmaSenha("Test@123");
		register.nome("leoanrdo");
		register.sobrenome("ferreira");
		register.telefone("111111111");
		register.estado("sao paulinho");
		register.endereco("Rua Alto Alegre");
		register.cidade("OZ");
		register.pais("Brazil");
		register.cep("043@#$24-324");
	}
	@Entao("^botao registrar estara indisponivel$")
	public void botao_registrar_estara_indisponivel() throws Throwable {
		register.verificarBtnRegistrar();
	}

}
