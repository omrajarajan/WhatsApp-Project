Feature: Verifying adactin hotel details
Scenario Outline: verifying adacitin login with valid credentials
Given user is on adaction login page
When user should enter "<username>" and "<password>"
And user should click the login button
When user is on adacitin search hotel page 
Then user should select all the details	"<location>","<hotels>","<roomtype>","<numberofrooms>","<checkindate>","<checkoutdate>","<audltsasperroom>"and "<childperroom>"
Then user should click the search button
And select the hotel radio button
And Hit continue button
When user in Book a hotel page fill "<firstname>","<lastname>","<billingaddress>","<ccNo>"and"<ccvNo>"
And user should click the book now
And user should verify the sucess msg

Examples:
|username|password|
|Kannansiva|kannan2003|
|Kannansiva|kannan2003|
|Kannansiva|kannan2003|
|Kannansiva|kannan2003|
|Kannansiva|kannan2003|
|Kannansiva|kannan2003|
|Kannansiva|kannan2003|
|Kannansiva|kannan2003|
|Kannansiva|kannan2003|
|Kannansiva|kannan2003|
















