package br.com.rsinet_hub.managers;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import br.com.rsinet_hub.dataProviders.ReadProperties;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DriverManager {
	private static String URL = "http://127.0.0.1:4723/wd/hub";
	private static AndroidDriver<WebElement> driver;
	private static Logger logger = Logger.getLogger("ReadProperties.class");
	
	public AndroidDriver<WebElement> getDriver() {
		if (driver == null)
			driver = createDriver();
		return driver;
	}
	
	public static AndroidDriver<WebElement> createDriver() {
		ReadProperties prop = new ReadProperties("Configuration");
		Properties props = prop.getProperty();
		String deviceName = props.getProperty("deviceName");
		String platformVersion = props.getProperty("platformVersion");
		String platformName = props.getProperty("platformName");
		String appPackage = props.getProperty("appPackage");
		String appActivity = props.getProperty("appActivity");
		String port = props.getProperty("port");

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", deviceName);
		capabilities.setCapability("platformName", platformName);
		capabilities.setCapability("appPackage", appPackage);
		capabilities.setCapability("appActivity", appActivity);
		try {
			driver = new AndroidDriver<WebElement>(new URL(URL), capabilities);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (MalformedURLException e) {
			logger.info(e.getMessage());
			e.printStackTrace();
		}
		return driver;
	}

	public void closeDriver() {
		driver.closeApp();
	
	}

	
}
