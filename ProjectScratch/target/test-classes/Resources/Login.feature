@Regression
Feature: Login into the Application

  Scenario Outline: To Test Login Functionality with Correct Username and Password
    Given User Login into the Application
    And User will Enter the "<username>"
    And User will provide the "<password>"
    When User will click on submit button
    Then User will be navigated to home page of the application

    Examples: 
      | username   | password |
      | mngr527770 | vEnavyt  |
