@Test
Feature: MediaMock automation test cases for hotel booking component
  @MediaMock
  Scenario:
    Given I launch to hotel site "Frontend" env
    When I login to site
    Then Verify element text "Welcome Back"



