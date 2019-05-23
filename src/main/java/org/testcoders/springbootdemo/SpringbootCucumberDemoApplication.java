package org.testcoders.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootCucumberDemoApplication {

	private String testValue = "Hello TestCoder!";

	@GetMapping(value = "/api/test")
	public String getTestValue() {
		return testValue;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCucumberDemoApplication.class, args);
	}

}