Feature: CurrencyConverter

Scenario: Convert USD to GBP
Given user has launched XE Currency Converter website
When user selects the From currency as USD
And user selects the To currency as GBP
And user submits the selected currencies for conversion
Then user is displayed with the currency conversion rate on the proceeding page


Scenario: Convert GBP to USD
Given user has launched XE Currency Converter website
When user selects the From currency as GBP
And user selects the To currency as USD
And user submits the selected currencies for conversion
Then user is displayed with the currency conversion rate on the proceeding page


Scenario: Convert AUD to CAD
Given user has launched XE Currency Converter website
When user selects the From currency as AUD
And user selects the To currency as CAD
And user submits the selected currencies for conversion
Then user is displayed with the currency conversion rate on the proceeding page


Scenario: Convert GBP to INR
Given user has launched XE Currency Converter website
When user selects the From currency as GBP
And user selects the To currency as INR
And user submits the selected currencies for conversion
Then user is displayed with the currency conversion rate on the proceeding page


Scenario: Convert EUR to INR
Given user has launched XE Currency Converter website
When user selects the From currency as EUR
And user selects the To currency as INR
And user submits the selected currencies for conversion
Then user is displayed with the currency conversion rate on the proceeding page