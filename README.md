# CurrencyConverter
Acceptance criteria is to test multiple conversion rates

#Tools Used: 
java 1.8, 
cucumber-java 1.2.5, 
cucumber-junit 1.2.5, 
selenium 3.14.0
junit 4.12

#Browser: 
Chrome v74.0.3729, 
Firefox v67.0

#Task:
Test multiple conversion rates. Test should iterate over 5 sets of sample data. (As provided)

#Eg:
Test should input from Euro to pounds. Verify the result on the proceeding page. (As provided)

#pom.xml
Contains all the dependencies which include cucumber-java, cucumber-junit, junit, selenium.

#scr/test/RunCukes
Cucumber uses Junit framework to run. As Cucumber uses Junit we need to have a Test Runner class. This class will use the Junit annotation @RunWith(), which tells JUnit what is the test runner class.

#src/test/resources/feature
Cucumber is all about testing feature. We are testing Currency conversion feature. The web application provided for testing
i.e. "https://www.xe.com/currencyconverter/" is not very tester friendly which means the webelemets displayed on the page have
not been provided a good/unique identifier (eg. From and To dropdowns) as a result of which it became really difficult to parameterize the 
feature file with multiple data set.

However to test the acceptance criteria, i have created separate scenarios which could have been clubbed as a single Scenario Outline, provided 
unique identifier was provided by developers to webelements. 

Have created Scenarios for all currency combinations to test acceptance criteria.

#src/test/java/StepDefinition:
Step Definition is attached to the scenarios provided in feature file. So, at one end step definitions are connected to
the features and on the other end they are connected to the selenium methods.

#src/main/java/Pages/CurrencyConverterPage
This is the page object model for CurrencyConverterPage and contains all the objects required to test the 
acceptance criteria.

Have tried to locate webelements using id/relative xpath/cssSelector as much as possible. However, for From and To
currency dropdown boxes, identifier was not proper.

#src/main/java/Pages/Page
This is the superclass for all the pages and contain all the methods related to configuration. All other pages
should extend this class.

#Report:
Please find cucumber html report in target folder which looks good.

target->cucumber-html-report->index.html (Right click and select Open in Browser as Chrome)

#Screenshot:
Added this feature where test screenshot of the webpage would be captured after the rates are displayed
on the page. Screenshots could be found

target->output

#src/resources/chromedriver:
This driver is needed to execute tests on chrome browser. Path for this file is passed in Page.java class.
However, i dont think the path needs to be changed to execute the test locally


#src/resources/geckodriver:
I had this file on my local which was downloaded long ago and hence tests are not running on Firefox. 
However, a latest geckodriver would run the tests on firefox browser without any changes. If you have one, please
give it a go. As i am about to finish my 48 hrs, cannot do more on this.

#How To Run Tests:
Open https://github.com/mshaibal/CurrencyConverter
Do git clone https://github.com/mshaibal/CurrencyConverter.git
Build the project in intellij
Set maven path to download the dependencies. File->Other Setting->Default Settings->Maven-> User Setting File
Set sdk as well to 1.8 File->Project Structure->Project->ProjectSDK
Go to Run->Edit Configuration->Click '+'->Junit->Set Name to your choice->VM options as -ea -DBrowser=chrome->JRE should be Default 1.8 SDK
Apply the changes and Run the test.

#Issues:
A few webelements are not assigned with proper identifier and hence i could not parameterize the feature file.
Unavailabilty of geckodriver. I could not validate if tests are passing in firefox
As i am using MacBook, could not try on internet explorer. However, it can be easily done on windows by adding the property in Page.java class

#Conclusion:
Test for currency conversion with multiple currencies are running fine on Chrome v74.0.
Generating Cucumber reports and screenshots
With a good framewrok in place which could evolve over time to add many more features to it.