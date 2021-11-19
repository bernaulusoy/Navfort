Feature: User land on the ‘Forgot Password’ page after clicking on the "Forgot your password?" link

  @NV-777 @wip
  Scenario: The user should land on the Forgot Password page after clicking on the Forgot your password link
    Given the user navigates to login page
    When the user clicks password link
    Then the user should land on the "Forgot Password" page