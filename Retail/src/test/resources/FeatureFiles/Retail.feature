Feature: Validating CTS search in Google
Scenario: Validating search details
Given User is on Google page
When User should enter CTS in search box
Then Hit search
And Check the visible details