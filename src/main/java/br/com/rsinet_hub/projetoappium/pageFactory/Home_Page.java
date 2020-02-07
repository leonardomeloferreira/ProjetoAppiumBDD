package br.com.rsinet_hub.projetoappium.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class Home_Page {

AndroidDriver driver;
	
	public Home_Page(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewMenu")
	private WebElement btn_Home;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/linearLayoutLogin")
	private WebElement lnk_Login;
	
	@FindBy(how = How.ID, using = "menuSearch")
	private WebElement lnk_MenuSearch;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewSingUpToday")
	private WebElement lnk_CreateAccount;
	
	public void clicarHome() {
		btn_Home.click();
	}
	public void clicarLogin() {
		lnk_Login.click();
	}
	public void clicarCriarNovaConta() {
		lnk_CreateAccount.click();
	}
}
