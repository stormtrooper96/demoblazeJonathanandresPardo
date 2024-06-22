Feature: User Registration

  Scenario: Successful user registration
    Given User is on principal page
    Then he is on the registration page
   When he enters a valid username and password
    And he clicks on the register button
   Then he should see a registration 'Sign up successful.'

  Scenario: User registration with missing information
    Given User is on principal page
    Then User is on the registration page
    When he leaves the username field empty
    And he enters a valid password
    And he clicks on the register button
    Then he should see a registration 'Please fill out Username and Password.'