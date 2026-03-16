@sanity

Feature:Logout feature

  Background: 
    Given user opens the  Loginpage of the application
    And user enters the username as "mngr655507"
    And user enters the password as "AhEjyjy"
    When user clicks on login button
    Then validate user will be navigated to homepage

    Scenario Outline:Creation of LogOut Scenario
    And user clicks on Log out link
    