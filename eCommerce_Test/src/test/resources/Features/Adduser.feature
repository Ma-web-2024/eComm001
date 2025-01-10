Feature: Sign in as new user

  Scenario: user sign in successufuly
    Given browser is opened
    And user is  on Add user page
    When user enters the user info
    And clicks on submit
    Then user is logged
