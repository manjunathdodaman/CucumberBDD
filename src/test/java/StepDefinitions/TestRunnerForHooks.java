package StepDefinitions;





import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/HooksDemo/HooksDemo.feature",glue= {"StepsForHooks"},
monochrome = true,


plugin =  {"pretty","junit:target/JUnitReports/report.xml",
		"json:target/JSONReport/reports.json",
		"html:target/HtmlReport"}
)

public class TestRunnerForHooks {

	
	
}
