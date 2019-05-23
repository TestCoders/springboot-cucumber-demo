package org.testcoders.springbootdemo.stepdefs;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.testcoders.springbootdemo.CucumberRoot;

public class HealthStepDefs extends CucumberRoot {

    private ResponseEntity<String> response; // output

    @When("^I call the actuator health endpoint$")
    public void iCallTheActuatorHealthEndpoint() {
        response = template.getForEntity("/actuator/health", String.class);
    }

    @Then("^I receive a response with statuscode (.*?)$")
    public void iReceiveAResponseWithStatuscode(int statusCode) {
        HttpStatus currentStatusCode = response.getStatusCode();
        assertThat("status code is incorrect : " +
                response.getBody(), currentStatusCode.value(), is(statusCode));
    }
}
