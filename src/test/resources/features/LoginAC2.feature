Feature: User shouldn't be able to login with invalid credentials


  @NV-767 @wip
  Scenario Outline: The system shouldn't allow users to login without valid credentials
    Given the user navigates to login page
    When the user enters invalid credentials "<username>" "<password>"
    Then the user should see the Login page "Login"

    Examples:
      | username | password    |
      | usEr1    | UsERUser123 |
      | user2    | UserUSer123 |
      | USER3    | UserUser123 |
      | User4    | USERUSER123 |





