package CukeSetUp;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = {"pretty"}, features = "src/test/resources/features",
        glue = "src/test/java/StepDef",format = "json:target/cucumber-report-composite.json" )


public class RunCukes extends AbstractTestNGCucumberTests {


}
