Feature: User should see the password in bullet signs by default

 @NV-776  @wip
  Scenario: User should see the password in bullet signs by default
    When user enters "<username>" and "<password>"
    Then user should see the password in bullet signs by default
