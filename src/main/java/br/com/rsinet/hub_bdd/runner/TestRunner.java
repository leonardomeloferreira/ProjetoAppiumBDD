package br.com.rsinet.hub_bdd.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature"
, glue = { "br.com.rsinet.hub_bdd.stepDefinitions" }
//, tags = {"@BuscaPelaLupa"}
, plugin = { "pretty", "json:target/cucumber-reports/json-report.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" }
, monochrome = true)
public class TestRunner {

	public static String folderPath = System.getProperty("user.dir") + "/target/";

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(System.getProperty("user.dir") + "/configs/extent-config.xml"));
	}
}
