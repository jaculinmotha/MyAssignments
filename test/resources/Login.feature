Feature: Create and verify the account name in salesforce application
Scenario: Create account with valid details
Given Launch the browser
And Load the URL
And Enter the username
And Enter the password
And Click on the login button
And Click on toggle menu button
And Click on view all button
And Click on sales button
And Click on accounts tab
And Click on new button
And Enter the account name as Jaculin
And Select the ownership as public
When Click on save button
Then User should verify the account name as Jaculin