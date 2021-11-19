Feature: Verify that user can use "Enter" key from their keyboard on the login page

  @NV-779 @wip
  Scenario: User can use "Enter" key from their keyboard on the login page
    When user logins with valid username and hits "Enter" button
    Then user logins with valid password and hits "Enter" button
    And user should see "Quick Launchpad" page
