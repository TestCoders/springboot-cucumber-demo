package org.testcoders.springbootdemo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * Start de cucumbertests.
 *
 * En meer en meer ...
 */
@RunWith(Cucumber.class)
@CucumberOptions(tags = "~@wip", features = "src/test/resources/features/", format = {"pretty", "html:target/cucumber-reports/cucumber/html",
        "json:target/cucumber-reports/cucumber.json", "usage:target/cucumber-reports/usage.jsonx", "junit:target/cucumber-reports/junit.xml"})
public class RunIt {
}
