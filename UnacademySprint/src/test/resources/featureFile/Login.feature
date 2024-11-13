Feature: Login

Background: Validate user is able to login

Given Browser is open and url is navigated
And user is able to click on login button
When user enters phone number
And user clicks on login button
And user should enter otp
Then user should be successfully logged in

Scenario: Validate that the user is able select IIT-JAM and click on Live Class 

Given Home page is displayed
And user is able to click on drop down button 
Then user is able to select IIT-JAM
And user is able to click on Live classes

Scenario: Validate that the user is able to take Practice test 

Given Home page is displayed
And user is able to click on drop down button 
Then user is able to select IIT-JAM
And user is able to click on Live classes
And Live class page is displayed
And user clicks on practice
And practice page is displyed
And scroll down 
And user click on Sequence & Series Number   

Scenario: validate that the user is able to check the ongoing batches

Given Home page is displayed
And user is able to click on drop down button 
Then user is able to select IIT-JAM
When user is able to click on Try learning free button
Then browse page is displayed 
When user clicks on see all 
Then IIT-JAM Batches is displayed
And user clicks on All dropdown button
When user select Ongoing 
Then Ongoing Batches page is displayed

Scenario: Validate that the user is able to pay

Given Home page is displayed
And user is able to click on drop down button 
Then user is able to select IIT-JAM
When user click on view subscription offers
And navigated to offer page
Then user clicks on Three month subscription
And user clicks on claim now 
Then user is able to see payment page

Scenario: Validate that the user is able to see Capsule course on all biology for IIT-JAM

Given Home page is displayed
And user is able to click on drop down button 
Then user is able to select IIT-JAM
When user is able to click on playlist
And user is able to click on Biological science
And user is able to click on Preparation & Strategy
When user clicks on Capsule Course on Cell Biology for IIT-JAM 
And user is able to see Capsule Course on Cell Biology for IIT-JAM 

Scenario Outline: validate that the user is able to check the batches

Given Home page is displayed
And user is able to click on drop down button 
Then user is able to select IIT-JAM
When user is able to click on Try learning free button
Then browse page is displayed 
When user clicks on see all 
Then IIT-JAM Batches is displayed
And user clicks on All dropdown button
Then user select <options> 

Examples: 
           |options|
           |   1   |
           |   2   |
           |   3   |





