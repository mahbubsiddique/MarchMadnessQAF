Feature: google search

Scenario Outline: simple search

Given I am on google homepage
When I enter the search "<term>"
And I click on google search button
Then I receive related search result

Examples:
|term								|
|Quality Assurance	|
#|Software Testing		|
#|Remote Work				|