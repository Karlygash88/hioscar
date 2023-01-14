Feature: Find Care feature
  Agile Story: User can search for care


  Background: User can click Find Doctor button
    Given User is on the home page
    When User clicks Find Doctor button
    Then User clicks on Search Network button
    Then User selects coverage year
    Then User selects coverage access
    And User selects coverage area
    Then User clicks on continue button
    Then User should land on find care page

  Scenario: User can search for primary care
    Given User searches for primary care
    Then Primary care providers should be listed

  Scenario: User can search for hospital
    Given User searches for hospital
    Then Hospitals should be listed

  Scenario: User can search for specific condition
    Given User searches for specific condition
    Then All information related to the condition should be listed

  Scenario: User should get error message while entering invalid keyword
    Given User searches for invalid keyword
    Then Error message should appear


