package br.com.rsinet.hub_bdd.stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;

import br.com.rsinet_hub.managers.DriverManager;
import br.com.rsinet_hub.managers.TestContext;
import br.com.rsinet_hub.runner.TestRunner;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
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

	@After(order = 1)
	public void afterScenario(Scenario scenario) throws IOException, InterruptedException {

		String screenshotName = scenario.getName().replaceAll(" ", "_");
		File sourcePath = ((TakesScreenshot) testContext.getDriverManager().getDriver())
				.getScreenshotAs(OutputType.FILE);
		File destinationPath = new File(TestRunner.folderPath + screenshotName + ".png");

		FileUtils.copyFile(sourcePath, destinationPath);

		Reporter.addScreenCaptureFromPath(destinationPath.toString());
	}

	@After(order = 0)
	public void AfterSteps() {
		testContext.getDriverManager().closeDriver();
	}

}
