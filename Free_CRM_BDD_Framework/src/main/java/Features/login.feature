Feature: Free CRM Login Feature

#Without Examples Keyword
#Scenario: Free CRM Login Test Scenario

#Given User is already on Login Page
#When Title of Login Page is Free CRM
#Then User enters "gopikamma" and "gopikamma"
#Then User Clicks on Login Button
#And user is on home page


#With Examples Keyword
Scenario Outline: Free CRM Login Test Scenario

Given User is already on Login Page
When Title of Login Page is Free CRM
Then User enters "<username>" and "<password>"
Then User Clicks on Login Button
And user is on home page

Examples:
		|	username	|	password	|
		|	gopikamma	|	gopikamma	|
		|	naveenk		|	test@123	|