package br.com.rsinet_hub.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import br.com.rsinet_hub.managers.DriverManager;
import br.com.rsinet_hub.managers.FileReaderManager;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(features = "Feature"
	, glue = {"br.com.rsinet.hub_bdd.stepDefinitions"}
	, tags = {"@BuscaPelaLupa"},
//	, plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" },
	monochrome = true
	)
	public class TestRunner {
			
		public static String folderPath = System.getProperty("user.dir") + "/target/";

		@AfterClass
		public static void writeExtentReport() {
			Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getReadProperties().getReportConfigPath()));
		}
	}

