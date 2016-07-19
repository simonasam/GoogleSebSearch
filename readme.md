#Google Search results in browser#

##Where to find application GoogleSebSearch##
* The required files are in send GoogleSebSearch.rar file GoogleSebSearch\dist folder.
* To run the application file GoogleSebSearch.jar is required.

##How to run application GoogleSebSearch.jar##
1. Download and install Java SE Runtime (http://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html).
2. Open application GoogleSebSearch.jar with Java SE program instaled.
3. In the opened application write search keyword (default keyword is "seb") and press "Search" button.
4. Wait for the Mozilla Firefox browser to open google.se and search for entered keyword.
5. Check the interface of the program to see the result in the text area field.

NOTE: Any errors in the program should also be printed in the text area.

#Google as a service (No browser)#

##Where to find test##
* SebGoogleSearchService directory

##How to run tests##
1. Install SoapUI program (https://www.soapui.org/downloads/soapui/alternate-platforms.html)
2. Open the test file with the program.
3. Double click on test Suit name(four grey squares icon) and press run button.
4. If test suit passed the Finished bar in the interface will be green, otherwise red.

#How to run test through command lines#

##Java application command line:##
java -jar "C:\..\GoogleSebSearch\dist\GoogleSebSearch.jar"

##SoapUI command line:##
cmd.exe /C testrunner.bat -sCheckSebInput -cGoogleSearchTestCase C:\..\SebGoogleSearchService\GoogleServiceCheck.xml
