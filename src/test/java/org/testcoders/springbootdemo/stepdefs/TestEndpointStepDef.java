package org.testcoders.springbootdemo.stepdefs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.web.util.UriComponentsBuilder;
import org.testcoders.springbootdemo.CucumberRoot;

import java.net.URI;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Hier staat de testcode voor het testen van de /api/test endpoint
 *
 * Voor het kunnen gebruiken van de RestTemplate die gedefinieerd is in 'RunIT.java' extend je een
 * stepdef class op CucumberRoot, zoals hier beneden weergeven.
 */

public class TestEndpointStepDef extends CucumberRoot {

    private String response;

    private String url = "http://localhost:7888/api/test";

    @When("^I call the test endpoint$")
    public String getBodyFromTestEndpoint() {
        return response = template.getForEntity(getUri(), String.class).getBody();
    }

    @Then("^I receive a response with text (.*?)$")
    public void iReceiveAResponseWithText(String expectedResponse) {
        assertThat("body is incorrect : " +
                response, response, is(expectedResponse));
    }

    // Returned een object van het type java.net.URI
    private URI getUri() {
        return UriComponentsBuilder.fromUriString(url).build().toUri();
    }

    // Returned een object van het type java.net.URI met parameters erbij. Dit zijn parameters die na het ? komen in de URI.
    private URI getUriWithQueryParam(String parameter, String value) {
        return UriComponentsBuilder.fromUriString(url).queryParam(parameter, value).build().toUri();
    }

}
