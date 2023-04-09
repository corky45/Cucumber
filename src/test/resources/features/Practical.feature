@ColorFeature
Feature: Background color button validation

  @Scenario1
  Scenario: Change the background color to SkyBlue
    Given "Set SkyBlue Background"  button exists
    When I click on the "SkyBlue" button
    Then The background color will change to sky blue


  @Scenario2
  Scenario Outline: Change the background color to White
    Given "Set SkyWhite Background" button exists
    When I click on the "White" button
    Then The background color will change to white

  
