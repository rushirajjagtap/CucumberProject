@Sanity
Feature: Login Functionalty check

  Scenario Outline: Validate login functionality with correct credentials
    Given user on login page
    And user enters the username as "<username>"
    And user enters the password as "<password>"
    When user clicks on login button
    Then validate user should be on homepage

    Examples: 
      | username   | password |
      | mngr658797 | tytEvUj  |
