package com.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "json:target/cucumber.json",
                "html:target/default-cucumber-reports",
                "rerun:target/rerun.txt"
        },
        tags = {"@testRun"},
        features = {
                "src/test/resources/features"
        },
        glue = {"com/express_scripts_corporate/step_definitions"},
        dryRun = false
)
public class CukesRunner {
}