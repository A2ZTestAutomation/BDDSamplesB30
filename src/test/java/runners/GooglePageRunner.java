package runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src//test//resources//features//GoogleSearch.feature",
		glue= "stepdefs",
		monochrome=true,
		dryRun = false,
		plugin = {"pretty",
					"html:target/CucumberReports/HtmlReport.html",
//					"usage:target/CucumberReports/UsageReport",
//					"json:target/CucumberReports/JsonReport.json",
//					"testng:target/CucumberReports/TestNGReport.xml",
//					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
					"rerun:target/failedScenarios.txt"
		}
		
		)

public class GooglePageRunner extends AbstractTestNGCucumberTests{
 
}
