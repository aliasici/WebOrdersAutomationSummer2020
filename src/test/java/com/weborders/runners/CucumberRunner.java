package com.weborders.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/weborders/step_definitions",
        features = "src/test/resources/features",
        dryRun = true,
       // monochrome=true,
        plugin = {"json:target/cucumber.json",
                "html:target/cucumber-report.html"},
        tags = "@etsyWip"
        //{"pretty","html:test-output"},json

)
public class CucumberRunner {


}
