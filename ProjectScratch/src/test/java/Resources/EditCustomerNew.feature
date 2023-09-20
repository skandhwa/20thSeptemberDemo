@smoke
Feature: Edit a New Customer

  Background: 
    Given User Login into the Application

  Scenario Outline: Creating Customer for DemoGuru Application
    And User will Enter the "<username>"
    And User will provide the "<password>"
    When User will click on submit button
    Then User will be navigated to home page of the application
    Then User will Click on Edit Customer Link
    And User will Enter the corresponding "<customer_id>"
    And User will click on Submit
    Then User will update the field of City
    And User Will again Click on Submit

    Examples: 
      | username   | password | customer_id |
      | mngr527770 | vEnavyt  |       42904 |
