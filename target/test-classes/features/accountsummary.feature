Feature: Account Summary Tab Functionality

  Background: Login steps
    Given the user is on the login page
    And User logins with username "username" and password "password"

    Scenario: Checking the account summary page features
      And the "Account Summary" page should be displayed
      Then Account summary page should have to following account types:
        | Cash Accounts       |
        | Investment Accounts |
        | Credit Accounts     |
        | Loan Accounts       |
      And Credit Accounts table must have columns
        | Account     |
        | Credit Card |
        | Balance     |