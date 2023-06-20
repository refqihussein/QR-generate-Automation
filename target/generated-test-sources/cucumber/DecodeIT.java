import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
features = {"/Users/refqihussein/Documents/Glintsr/test/src/test/resources/features/decode.feature:4"},
plugin = {"json:target/cucumber-reports/2.json"},
monochrome = false,
glue = { "selenium" })
public class DecodeIT {
}
