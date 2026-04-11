@sanity
Feature: Creation of new account

  Background: 
    Given user opens the  Loginpage of the application
    And user enters the username as "mngr658797"
    And user enters the password as "EgeqavY"
    When user clicks on login button
    Then validate user will be navigated to homepage
    
  Scenario Outline: New account creation with all the credentials
    Then user clicks on the new account link
    And user enters the customerid as "<customerid>"
    And user enters the AccountType as "<AccountType>"
    And user enters the initial deposit as "<initialdeposit>"
    And user clicks on submit button
    Then validate user will be navigated to getting created account details

    Examples: 
      | customerid | AccountType | initialdeposit |
      |     	34790 | savings     |           95000 |
