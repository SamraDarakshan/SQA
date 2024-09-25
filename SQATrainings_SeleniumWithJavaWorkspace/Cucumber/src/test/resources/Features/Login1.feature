Feature: Login to HRM Application

Scenario: Check user login successfully with valid credentials

Given User is on orange HRM login page
When User enter valid username & password
And User click on login button
Then User should redirect to the dashboard page


Scenario Outline: Title of your scenario outline
Given I want to write a step with <name>
When I check for the <value> in step
Then I verify the <status> in step

Examples: 
      #| USERNAMEname  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
