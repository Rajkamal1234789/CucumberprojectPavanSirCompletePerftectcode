package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="F:\\MavenVenkat\\Pavanbdd\\Features\\Customers.feature",
		glue= "stepDefinitions",
		monochrome=true,
		
		plugin= {"pretty","html:target/usingpom.xml"}
		//tags= {"@rajkamal,@mamidala"}
	)
public class TestRunner {

}
