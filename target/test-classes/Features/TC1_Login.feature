@Login
Feature: Verifying Adactin Login Details

  Scenario Outline: verifying Adactin Hotel valid login
    Given user is on Adactin Login page
    When user should Login "<username>", "<password>" click login
    Then user should verify after login succes message "Hello prakash147!"

    Examples: 
      | username   | password |
      | prakash147 | 12345678 |

  Scenario Outline: verifying Adactin Hotel valid login using ENTER
    Given user is on Adactin Login page
    When user should Login "<username>", "<password>" using ENTER
    Then user should verify after login succes message "Hello prakash147!"

    Examples: 
      | username   | password |
      | prakash147 | 12345678 |

  Scenario Outline: verifying Adactin Hotel invalid login
    Given user is on Adactin Login page
    When user should Login "<username>", "<password>" click login
    Then user should verify after login with invalid credentials error message contains "Invalid Login"

    Examples: 
      | username   | password |
      | prakash147 | 123456789 |
