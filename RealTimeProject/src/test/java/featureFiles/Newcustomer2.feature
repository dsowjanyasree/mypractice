Feature: Implementing Cucumber Data Table for creating new customer

  Background: 
    Given user opens the  Loginpage of the application
    And user enters the username as "mngr655507"
    And user enters the password as "AhEjyjy"
    When user clicks on login button
    Then validate user will be navigated to homepage

  Scenario: Cucumber Data Table Implementation for new customer
    Given user opens the Add New Customer page
    And user enters the below details.
      | customerName | doB        | address     | city      | state     | pin    | mobileNumber | password  | Email            |
      | John         | 06-08-1998 | Marthahalli | Bangalore | Karnataka | 560037 |   6302765485 | Test@1234 | xyz1234@gmai.com |
