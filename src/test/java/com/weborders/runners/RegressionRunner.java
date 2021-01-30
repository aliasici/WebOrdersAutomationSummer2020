package com.weborders.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/weborders/step_definitions",
        features = "src/test/resources/features",
        dryRun = false,
        // monochrome=true,
        plugin = {
                "rerun:target/rerun.txt",
                "json:target/cucumber.json",
                "timeline:target/timeline-report"
        },
       // tags = "@regression"
        //{"pretty","html:test-output"},json

)
public class RegressionRunner {
}
