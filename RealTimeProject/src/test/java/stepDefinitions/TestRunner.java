package stepDefinitions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions
	(
		features="src/test/java/FeatureFiles/"	,
		glue= {"stepDefinitions"},
		tags="@sanity",
		
		dryRun=false,
		
		plugin= {"pretty","html:target/HTMLReports/index.html",
				
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
			)

	public class TestRunner{

	}


