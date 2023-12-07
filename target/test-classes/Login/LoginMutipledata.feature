Feature: Im testing Web application

Background:
Given Navigate to login page

@positiveTest
Scenario Outline: To test login function
When Enter the username "<username>"
And  Enter the password "<password>"
And Click on login button
Then Homepage should be displayed 


Examples:
|username|password|
|standard_user|secret_sauce|
|problem_user|secret_sauce|

@negativeTest
Scenario Outline: To test login function for invalid case
When Enter the invalid username "<username>"
And  Enter the invalid password "<password>"
And Click on login button
Then Homepage should not be displayed

Examples:
|username|password|
|standard_user1|secret_sauce1|
|problem_user2|secret_sauce2|