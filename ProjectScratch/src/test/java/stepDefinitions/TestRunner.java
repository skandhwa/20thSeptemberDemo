package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src/test/java/Resources/"
		,glue= {"stepDefinitions"},
		dryRun=true,monochrome=true,tags="@Regression",
		
		plugin= {"pretty","html:target/HtmlReports/index.html",
		"json:target/CucumberReports/Cucumber.json"	,
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		
		}
		
		
		
		
		
		
		
		)

public class TestRunner {

}
