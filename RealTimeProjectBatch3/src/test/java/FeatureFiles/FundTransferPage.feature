@sanity

Feature: validation of Fund Transfer feature

  Background: 
    Given user opens the  Loginpage of the application
    And user enters the username as "mngr656459"
    And user enters the password as "EgeqavY"
    When user clicks on login button
    Then validate user will be navigated to homepage

  Scenario Outline: Validating the Fund Transfer with the credentials
    And user clicks on Fund Transfer link
    And user enters the Payers account no as "<Payersaccountno>"
    And user enters the Payees account no as "<Payeesaccountno>"
    And user enters the Amount as "<Amount>"
    And user enters the Description as "<Description>"
    When user clicks on submit button1
    Then validate user will be navigated to Fund Transfer Details page
    Then user clicks on log out link

    Examples: 
      | Payersaccountno | Payeesaccountno | Amount | Description |
      |          180799 |          180631 |   10 | family      |