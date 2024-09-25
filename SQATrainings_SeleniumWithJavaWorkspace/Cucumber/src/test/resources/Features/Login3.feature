Feature: Login to HRM Application

Scenario Outline: Verify user login with valid and invalid credentials
  Given the user navigates to the Orange HRM login page
  When the user inputs "<username>" and "<password>"
  And the user selects the login button
  Then the user should be directed to the dashboard
  But the user should receive a welcome message on the dashboard

Examples:
  | username | password  |
  | Admin    | admin123  |
  | user1    | pass123   |
