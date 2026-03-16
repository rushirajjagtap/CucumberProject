@sanity
Feature: Creation of new account

  Background: 
    Given user opens the  Loginpage of the application
    And user enters the username as "mngr656459"
    And user enters the password as "EgeqavY"
    When user clicks on login button
    Then validate user will be navigated to homepage
    And user clicks on the new customer link
    And user enters the customername as "wam"
    And user selects the gender
    And user enters the DOB as "06-08-1992"
    And user enters the address as "Satara"
    And user enters the city as "Karad"
    And user enters the state as "Maharashtra"
    And user enters the pin as "560037"
    And user enters the mobileNumber as "6302765485"
    And user enters the email
    And user enters the password as "Test@1234"
    When user clicks on the submit button
    Then new customer is created
    And user captures the customer id

  Scenario Outline: New account creation with all the credentials
    Then user clicks on the new account link
    And user enters the customerid as "<customerid>"
    And user enters the AccountType as "<AccountType>"
    And user enters the initial deposit as "<initialdeposit>"
    And user clicks on submit button
    Then validate user will be navigated to getting created account details

    Examples: 
      | customerid | AccountType | initialdeposit |
      |     47538 | savings     |           5000 |