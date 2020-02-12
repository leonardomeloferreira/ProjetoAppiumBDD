package br.com.rsinet_hub.projetoappium.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.hub_bdd.util.Scroll;
import io.appium.java_client.android.AndroidDriver;

public class Home_Page {

	private AndroidDriver driver;

	public Home_Page(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewMenu")
	private WebElement btn_Home;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/linearLayoutLogin")
	private WebElement lnk_Login;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/editTextSearch")
	private WebElement txtbx_Search;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewSingUpToday")
	private WebElement lnk_CreateAccount;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewSearch")
	private WebElement btn_lupa;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewSingUpToday")
	private WebElement lnk_SignUp;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView")
	private WebElement lnk_Laptop;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewMenuUser")
	private WebElement txt_User;

	public void clicarHome() {
		btn_Home.click();
	}

	public void clicarLogin() {
		lnk_Login.click();
	}

	public void clicarCriarNovaConta() {
		lnk_CreateAccount.click();
	}

	public void escreverPesquisa(String produto) {
		txtbx_Search.sendKeys(produto);
	}

	public void click_Lupa() {
		btn_lupa.click();
	}

	public void click_SignUp() {
		lnk_SignUp.click();
	}

	public void click_Laptop() {
		lnk_Laptop.click();
	}

	public String user() {
		return txt_User.getText();
	}

	public void click_Categoria(String categoria) {
		Scroll.scrollAndClick(driver, categoria);
	}
}
