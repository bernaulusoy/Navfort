Feature: "Invalid username or password." error message should be displayed for invalid credentials

  @NV-769 @wip
  Scenario Outline: The users shouldn't login with invalid credentials
    Given the user navigates to login page
    When the user enters invalid credentials "<username>" "<password>"
    Then error message "Invalid user name or password." should be displayed

    Examples:
      | username        | password    |
      | us20            | UserUser123 |
      | useerr          | UserUser123 |
      | errrr           | UserUser123 |
      | user2           | edetadsP    |
      | storemanager51  | PASSWORD    |
      | storemanager52  | eodlw123    |
      | salesmanager104 | USERUSER123 |
      | salesmanager105 |             |
      | USER1           | aaaa123     |
      | usekemalR2      | edetadsP    |
      | STOREMANAGER51  | USERUSER123 |
      | storeManager    | eodlw123    |
      | Hobart          | USERUSER123 |
      | sroesks         | AAAa1234    |
      |                 |             |





