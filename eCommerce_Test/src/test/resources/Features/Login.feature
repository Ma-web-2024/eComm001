Feature: Login to demo eCommerce

  Scenario Outline: Successful login
    Given browser is lunched
    And user is on login page
    When user enters <usern> and <pswd>
    And clicks on login button
    Then user is navigated to homme page

    Examples: 
      | usern               | pswd  |
      | admin@yourstore.com | admin |
