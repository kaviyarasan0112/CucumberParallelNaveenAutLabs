package parallel;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features/Login.feature"},
		glue = {"stepDefinitions", "appHooks"},
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"				
		},
		dryRun = false,
		monochrome=true
		)

public class MyTestRunner  {
	
//	 @DataProvider(parallel=true) 
//	 public Object[][] scenarios(){
//		 return super.scenarios(); 
//		 }

}
