Feature: Im testing Web application

Scenarios: To test login function
Given Navigate to login page
When Enter the username 
And  Enter the password
And Click on login button
Then Homepage should be displayed 

Scenarios: To test login function for invalid case
Given Navigate to login page
When Enter the invalid username 
And  Enter the invalid password 
And Click on login button
Then Homepage should not be displayed



