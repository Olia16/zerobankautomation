Feature: Account Activity Features

  Background:
    Given the user is on the login page
    And User logins with username "username" and password "password"
  @wip
  Scenario: Account Dropdown options and transaction table testing
    And the user navigates to "Account Activity" tab
    Then the "Account Activity" page should be displayed
    And Account drop down should have "Savings" selected
    Then Account drop down should have the following options
      | Savings     |
      | Checking    |
      | Loan        |
      | Credit Card |
      | Brokerage   |
    And Transactions table should have column names
      | Date        |
      | Description |
      | Deposit     |
      | Withdrawal  |
