Feature: HTC Calculator Practice 

Background:
Given Calculator App is Open in Mobile

Scenario: Addition
Given Result text is "0"
When tap digit "1"
And tap "plus"
And tap digit "2"
And tap "equal"
Then result is "3"

Scenario: Substraction
Given Result text is "0"
When tap digit "4"
And tap "minus"
And tap digit "2"
And tap "equal"
Then result is "2"

Scenario: Multiplcation
Given Result text is "0"
When tap digit "3"
And tap "mul"
And tap digit "2"
And tap "equal"
Then result is "6"


Scenario: Division
Given Result text is "0"
When tap digit "5"
And tap "div"
And tap digit "2"
And tap "equal"
Then result is "2.5"