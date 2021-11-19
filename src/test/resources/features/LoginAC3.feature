Feature: Users should see their own user names in profile menu

  @NV-768 @wip
  Scenario Outline: Users should see their own user names in profile menu
    Given the user navigates to login page
    When the user enters valid credentials "<username>" "<password>"
    Then the user can see his own name "<firstName>" "<lastName>"

    Examples:
      | username        | password    | firstName  | lastName   |
      | user1           | UserUser123 | John       | Doe        |
      | user2           | UserUser123 | Kenneth    | Nicolas    |
      | user3           | UserUser123 | Yasmine    | McClure    |
      | user4           | UserUser123 | Aleen      | Williamson |
      | user5           | UserUser123 | Rhiannon   | Kertzmann  |
      | storemanager51  | UserUser123 | Ruthie     | Kohler     |
      | storemanager52  | UserUser123 | Lorine     | Johns      |
      | storemanager53  | UserUser123 | Frank      | Hilll      |
      | storemanager54  | UserUser123 | Cathy      | Leannon    |
      | storemanager55  | UserUser123 | Darien     | Smitham    |
      | salesmanager101 | UserUser123 | Marjolaine | Schaefer   |
      | salesmanager102 | UserUser123 | Easton     | Mante      |
      | salesmanager103 | UserUser123 | Carmella   | Bernhard   |
      | salesmanager104 | UserUser123 | Hobart     | Smith      |
      | salesmanager105 | UserUser123 | Paxton     | Boyer      |
