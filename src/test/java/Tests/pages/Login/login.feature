Feature: login

  Scenario Outline: Login with valid credentials
    Given site is opened
    When enter "<username>" and enter "<password>"
    And click on login button
    Then verify the login is successful
    Examples:
    | username| password|
    |user     |pass     |
