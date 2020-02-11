package br.com.rsinet_hub.projetoappium.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.hub_bdd.util.Scroll;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Register_Page {
	AndroidDriver driver;

	public Register_Page(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextUserName']/child::*[1]")
	private WebElement txtbx_Username;

	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextEmail']/child::*[1]")
	private WebElement txtbx_Email;

	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextPassword']/child::*[1]")
	private WebElement txtbx_Senha;

	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextConfirmPassword']/child::*[1]")
	private WebElement txtbx_ConfirmaSenha;

	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextFirstName']/child::*[1]")
	private WebElement txtbx_Nome;
	
	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextLastName']/child::*[1]")
	private WebElement txtbx_Sobrenome;


	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextPhoneNumber']/child::*[1]")
	private WebElement txtbx_Telefone;

	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextState']/child::*[1]")
	private WebElement txtbx_Estado;

	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextStreet']/child::*[1]")
	private WebElement txtbx_Endereco;

	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextCity']/child::*[1]")
	private WebElement txtbx_Cidade;

	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextZip']/child::*[1]")
	private WebElement txtbx_CEP;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/linearLayoutCountry")
	private WebElement txtbx_Pais;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/buttonRegister")
	private WebElement btn_Registrar;

	public void username(String username) {
		txtbx_Username.click();
		txtbx_Username.sendKeys(username);
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	}
	public void email(String email) {
		txtbx_Email.click();
		txtbx_Email.sendKeys(email);
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	}
	public void senha(String senha) {
		txtbx_Senha.click();
		txtbx_Senha.sendKeys(senha);
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	}
	public void confirmaSenha(String confirmaSenha) {
		txtbx_ConfirmaSenha.click();
		txtbx_ConfirmaSenha.sendKeys(confirmaSenha);
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	}	
	public void nome(String nome) {
		txtbx_Nome.click();
		txtbx_Nome.sendKeys(nome);
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	}
	public void sobrenome(String sobrenome) {
		txtbx_Sobrenome.click();
		txtbx_Sobrenome.sendKeys(sobrenome);
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	}
	public void telefone(String telefone) {
		txtbx_Telefone.click();
		txtbx_Telefone.sendKeys(telefone);
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	}
	public void endereco(String endereco) {
		txtbx_Endereco.click();
		txtbx_Endereco.sendKeys(endereco);
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	}
	public void estado(String estado) {
		txtbx_Estado.click();
		txtbx_Estado.sendKeys(estado);
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	}
	public void cidade(String cidade) {
		txtbx_Cidade.click();
		txtbx_Cidade.sendKeys(cidade);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	public void cep(String cep) {
		txtbx_CEP.click();
		txtbx_CEP.sendKeys(cep);
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	}
	public void pais(String pais) {
		txtbx_Pais.click();
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		Scroll.scrollAndClick(driver, pais);
	}
	public void click_Register() {
		Scroll.scroll(driver, "REGISTER");
		Scroll.swipe(523, 1400, 523, 1300, driver);
		btn_Registrar.click();
	}
	public Boolean verificarBtnRegistrar() {
		Scroll.swipe(523, 1400, 523, 1300, driver);
		return btn_Registrar.isEnabled();
	}
}
