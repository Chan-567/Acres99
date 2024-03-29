package runner;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="Features",
		glue="step_definitions")

public class Acresrunner extends AbstractTestNGCucumberTests{
}
