package com.bdd.automation;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features={"resources/features/"},
dryRun = false,
glue = { "com.bdd.automation.stepdefinitions" },
monochrome = true,
plugin = { "pretty","html:target/cucumber-html-report", "json:target/cucumber-json-report.json" })
public class TestRunner {

}
