package br.com.rsinet.hub_bdd.stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import br.com.rsinet_hub.managers.DriverManager;
import br.com.rsinet_hub.managers.TestContext;
import br.com.rsinet_hub.runner.TestRunner;
import cucumber.api.Scenario;
import io.appium.java_client.android.AndroidDriver;

public class Hooks {

	AndroidDriver driver;
	TestContext testContext;
	DriverManager manager;

	public Hooks(TestContext context) {
		testContext = context;
		manager = testContext.getDriverManager();
		driver = manager.getDriver();
	}

	@Before
	public void BeforeSteps() {
		manager.getDriver();
	}

	@AfterClass
	public void afterScenario(Scenario scenario) throws IOException, InterruptedException {

		String screenshotName = scenario.getName().replaceAll(" ", "_");
		File sourcePath = ((TakesScreenshot) testContext.getDriverManager().getDriver()).getScreenshotAs(OutputType.FILE);
		File destinationPath = new File(TestRunner.folderPath + "/" + screenshotName + ".png");

		Files.copy(sourcePath, destinationPath);

		Reporter.addScreenCaptureFromPath(destinationPath.toString());
	}

	@After
	public void AfterSteps() {
		testContext.getDriverManager().closeDriver();
	}

}
