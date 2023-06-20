package selenium.test.acceptancetests;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"selenium/test/steps"},
        features = "src/test/resources",
        format = {"pretty", "json:target/cucumber-reports/cucumber.json"},
        tags = {"@decode"}
)
public class AllTests {
	
}