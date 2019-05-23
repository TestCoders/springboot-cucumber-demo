Feature: test endpoint

  Scenario: checking is the test endpoint gives back the right message
    When I call the test endpoint
    Then I receive a response with text Hello TestCoder!