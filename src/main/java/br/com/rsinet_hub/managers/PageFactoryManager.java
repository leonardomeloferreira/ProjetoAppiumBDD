package br.com.rsinet_hub.managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.rsinet_hub.projetoappium.pageFactory.Home_Page;
import br.com.rsinet_hub.projetoappium.pageFactory.Register_Page;
import io.appium.java_client.android.AndroidDriver;

public class PageFactoryManager {
	private AndroidDriver driver;
	private Home_Page home;
	private Register_Page register;

	public PageFactoryManager(AndroidDriver driver) {
		this.driver = driver;
	}

	public Home_Page getHomePage() {
		return (home == null) ? home = new Home_Page(driver) : home;
	}
	public Register_Page getRegisterPage() {
		return (register == null) ? register = new Register_Page(driver) : register;
	}
}
