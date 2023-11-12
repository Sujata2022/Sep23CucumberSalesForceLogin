package com.automation.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/features/SalesLogin.feature"}, 
					glue = {"com.automation.stepdefinitions"},
					monochrome = true,
					dryRun = false,
					plugin = {"pretty","html:target/cucumber-selenium-pom.html"}
				)

public class RunnerForSalesForce extends AbstractTestNGCucumberTests{

}