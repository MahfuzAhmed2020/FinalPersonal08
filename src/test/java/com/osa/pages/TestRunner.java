package com.osa.pages;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)

@CucumberOptions(

//	features= {".\\src\\test\\java\\com\\bddfinal\\features"},
//  features= {"src/test/java/com/bddfinal/features"},	
//	features= {"src//test//java//com//bddfinal//features"},
// features= {".//src//test//java//com//bddfinal//features"},
// features= {"./src/test/java/com/bddfinal/features"},
		features = { "src/test/java/com/bddfinal/features" },
		// features= {"src//test//java//com//bddfinal//features"},
//>>>>>>> fc660d8451adb541fe8a140176b7aa80d39dcf58
		glue = { "com.bddfinal.steps" }, 
		tags = { "@osa"/*,"@cuny"*/ }
       ,plugin= {"pretty", "json:target/cucumber.json"}
       ,dryRun=false

)

public class TestRunner extends AbstractTestNGCucumberTests {

	@BeforeSuite
	public void beforeSuite() {
		// database connection, browser, Properties,user credential (settings reequired
		// before the suite)
		System.out.println("**********  Starting before suite  **********");
	}

	@AfterSuite
	public void afterSuite() {
		// Email,Result sending to a specific person
		System.out.println("###########  Ending After suite  ###########");
	}

}
