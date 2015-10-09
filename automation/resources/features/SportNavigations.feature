Feature: Navigation to different Sports

Background: Browser is openned and Navigate to Homepage
Given browser is open with Home Page

Scenario: Test 1
Then Sport Types are displayed

Scenario: Test 2
When user click on a sport "Football"
Then Sports page "Football" is displayed 


Scenario: Test 3
When user click on a sport "Football"
Then Sports page "Football" is displayed
