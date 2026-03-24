package StepDefinition10;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(

features="src\\test\\java\\FeatureFiles"	,
glue= {"StepDefinition10"},
tags="@sanity",
//tags="@regression or @smoke or sanity",
dryRun=false,
monochrome=true,


plugin= {
		"pretty",
		"html:target/HTMLReports/index.html", 
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
	    "html:target/cucumber-report.html",
	    "json:target/cucumber.json"
	
		}

)





public class TestRunner
	{

}
