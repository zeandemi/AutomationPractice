package CukeSetUp;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, features = "src/test/resources/features", glue = "src/test/java/SteDef",format = "json:target/cucumber-report-composite.json" )
public class RunCukes {

}
