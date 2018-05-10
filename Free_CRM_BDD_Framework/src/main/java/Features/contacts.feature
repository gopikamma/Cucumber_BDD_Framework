Feature: Free CRM Create Contacts

Scenario Outline: Free CRM Create a New Contact Scenario

Given User is already on Login Page
When Title of Login Page is Free CRM
Then User enters "<username>" and "<password>"
Then User Clicks on Login Button
And user is on home page
Then user moves to new contact page
Then user enters "<firstname>" and "<lastname>" and "<position>"
Then Close the browser

Examples:
		|	username	|	password	|	firstname	|	lastname	|	position	|
		|	gopikamma	|	gopikamma	|	Tom			|	peter		|	Manager		|
		|	naveenk		|	test@123	|	David		|	Dsuaza		|	Director	|