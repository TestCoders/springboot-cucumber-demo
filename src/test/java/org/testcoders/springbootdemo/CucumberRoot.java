package org.testcoders.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

/**
 * Root voor alle cucumber tests.
 *
 * Door de annotatie "@ActiveProfiles" kun je gebruik maken van de properties met een bepaalde tag.
 * In onderstaand voorbeeld wordt gebruik gemaakt van het profiel 'test'. Het bestand dat gebruikt wordt is
 * 'application-test.properties'. Spring Boot leest dit automatisch in aan de hand van de tag.
 * Verander je de tag? Verander dan de naam van het properties bestand ook, of voeg een nieuwe toe met dat profiel.
 * Deze functionaliteit is vooral handig, omdat je dit zelfde kan toevoegen aan de main class. Door daar gebruik te maken
 * van bijvoorbeeld een 'prod' en 'test' profiel kun je bij de één wel authenticatie aan zetten en op de ander niet. 
 *
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = SpringbootCucumberDemoApplication.class)
@ActiveProfiles({"test"})
@ContextConfiguration
public class CucumberRoot {

    @Autowired
    protected TestRestTemplate template;
}
