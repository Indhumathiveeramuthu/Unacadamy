package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
glue = {"stepDefinition","hook"},
features= {"./src/test/resources/featureFile"},
plugin={"rerun:target/rerun.txt",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"junit:Reports/Cucumber.xml"}
)
public class CucumberRunner extends AbstractTestNGCucumberTests{

}