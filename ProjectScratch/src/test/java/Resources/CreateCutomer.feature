@sanity

Feature: Creating a New Customer

  Scenario Outline: Create a Customer Entering all the mandatory fields
    Given User Login into the Application
    And User will Enter the "<username>"
    And User will provide the "<password>"
    When User will click on submit button
    Then User will be navigated to home page of the application
    And User will click on New Customer link
    And User will enter the details on "<customername>"
    Then User will also select the gender
    And User will add the "<DateOfBirth>"

    Examples: 
      | username   | password | DateOfBirth | customername |
      | mngr527770 | vEnavyt  | 04-11-1991  | Saurabh      |
      #| mngr527770 | vEnavyt  | 06-10-1992  | Manish       |
      #| mngr527770 | vEnavyt  | 06-10-1992  | ratul        |
      #| mngr527770 | vEnavyt  | 06-10-1992  | Soumya       |
