package com.sapient.trg;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.platform.engine.Cucumber;

@Cucumber
@CucumberOptions(
		features = "src/test/resources",
		glue = "com.sapient.trg",
		plugin = {"json:target/cucumber-report.json","pretty", "html:target/cucumber-htmlreport"}
		)
public class RunCucumberTest {

}
