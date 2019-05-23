Feature: healthcheck

  Scenario: checking if de server responses with statuscode 200
    When I call the actuator health endpoint
    Then I receive a response with statuscode 200