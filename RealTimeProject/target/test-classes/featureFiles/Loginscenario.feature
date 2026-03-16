@sanity

Feature: Login Feature

  Scenario Outline: Validate login functionality with correct credentials
    Given user opens the  Loginpage of the application
    And user enters the username as "<username>"
    And user enters the password as "<password>"
    When user clicks on login button
    Then validate user will be navigated to homepage
  

    Examples: 
      | username   | password |
      | mngr655507 | AhEjyjy  |
