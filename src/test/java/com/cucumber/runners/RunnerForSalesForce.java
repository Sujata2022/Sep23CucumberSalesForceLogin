package com.cucumber.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/SalesLogin.feature"}, 
					glue = {"com.cucumber.stepdefinitions"}
				)

public class RunnerForSalesForce extends AbstractTestNGCucumberTests{

}