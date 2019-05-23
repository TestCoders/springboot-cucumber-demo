package org.testcoders.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

/**
 * Root voor alle cucumber tests.
 *
 * Door de annotatie "@ActiveProfiles" kun je gebruik maken van de properties zoals je die
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = SpringbootCucumberDemoApplication.class)
@ActiveProfiles({"test"})
@ContextConfiguration
public class CucumberRoot {

    @Autowired
    protected TestRestTemplate template;
}
