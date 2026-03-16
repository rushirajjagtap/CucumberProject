@sanity

Feature: Creation of New Customer for Guru99 Demo App

  Background: 
    Given user opens the  Loginpage of the application
    And user enters the username as "mngr656459"
    And user enters the password as "EgeqavY"
    When user clicks on login button
    Then validate user will be navigated to homepage

  Scenario Outline: New Customer Creation with all credentials
    And user clicks on the new customer link
    And user enters the customername as "<customerName>"
    And user selects the gender
    And user enters the DOB as "<doB>"
    
    And user enters the address as "<address>"
    And user enters the city as "<city>"
    And user enters the state as "<state>"
    And user enters the pin as "<pin>"
    And user enters the mobileNumber as "<mobileNumber>"
    And user enters the email
    And user enters the password as "<password>"
    When user clicks on the submit button
    Then new customer is created
    And user captures the customer id

    Examples: 
      | customerName | doB        | address     | city      | state     | pin    | mobileNumber | password  |
      | wam         | 06-08-1992 | Satara | Karad | Maharashtra | 560037 |   6302765485 | Test@1234 |