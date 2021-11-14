package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "featureFiles", glue = {
"stepDefinition" }, dryRun = false, format= {"pretty","html:target"}, tags = { "@login" })

public class Runner 
{

}
