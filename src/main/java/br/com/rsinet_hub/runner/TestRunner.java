package br.com.rsinet_hub.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(features = "Feature"
	, glue = {"br.com.rsinet.hub_bdd.stepDefinitions"}
	, tags = {"@RegisterTest"},
//	, plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" },
	monochrome = true
	)
	public class TestRunner {
		
	}

