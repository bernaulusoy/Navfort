Feature: User should be able to login

#Background:
#Given the user navigates to login page

  @NV-705 @wip
  Scenario Outline: Driver user should be able login
    Given the user navigates to login page
    When the user enters valid credentials "<username>" "<password>"
    Then the user should land on the "Quick Launchpad" page

    Examples:
      | username | password    |
      | user1    | UserUser123 |
      | user2    | UserUser123 |
      | user3    | UserUser123 |
      | user4    | UserUser123 |
      | user5    | UserUser123 |

  @NV-761 @wip
  Scenario Outline: Sales manager user should be able login
    Given the user navigates to login page
    When the user enters valid credentials "<username>" "<password>"
    Then the user should land on the "Dashboard" page

    Examples:
      | username        | password    |
      | salesmanager101 | UserUser123 |
      | salesmanager102 | UserUser123 |
      | salesmanager103 | UserUser123 |
      | salesmanager104 | UserUser123 |
      | salesmanager105 | UserUser123 |


  @NV-762 @wip
  Scenario Outline: Store manager user should be able login
     Given the user navigates to login page
    When the user enters valid credentials "<username>" "<password>"
    Then the user should land on the "Dashboard" page

    Examples:
      | username        | password    |
      | storemanager51  | UserUser123 |
      | storemanager52  | UserUser123 |
      | storemanager53  | UserUser123 |
      | storemanager54  | UserUser123 |
      | storemanager55  | UserUser123 |

