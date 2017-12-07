package CukeSetUp;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;

@CucumberOptions(plugin = {"pretty"}, features = "src/test/resources/features",
        glue = "src/test/java/StepDef",format = "json:target/cucumber-report-composite.json" )

@Test
public class RunCukes extends AbstractTestNGCucumberTests {

    public void RunTest(){

    }


}

