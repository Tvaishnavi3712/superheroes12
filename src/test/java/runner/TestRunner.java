package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (publish = true, features = {"src/test/java/feature"}, glue = "step_definitions",
plugin = {"json:target/sprint.json","pretty","html:target/sprint.json"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
