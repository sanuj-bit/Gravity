1.LAUNCH THE BROWSER 
2.MAXIMIZE THE WINDOW 
3.GIVE IMPLICIT WAIT 
4.NAVIGATE TO AN APPLICATION 
5.IDENTIFY USERNAME TEXTFIELD AND ENETR THE USER NAME 
6.IDENTIFY PASSWORD TEXT FILED AND ENTER THE PASSWORD 
7.IDENTIFY LOGIN BUTTON AND CLICK ON IT 
8.AFTER GETTING HOME PAGE CLCIK ON A PRODUCT AND CLICK ON ADD TO CART 
9.AFTER ADD TO CART IDENTIFY HAM BURGER MENU AND IT WILL GIVE LIST OF OPTIONS AND IDENTIFY LOG OUT BUTTON AND CLICK ON IT 
10.AFTER CLICKING LOG OUT THE PAGE WILL BE LOGGED OUT AND QUIT THE BROWSER...... 


-:ASSUMPTIONS:--
Assumptions--

1.Application Under Test :-
The script is developed and tested on a sample e-commerce web application (https://www.saucedemo.com
).

2.Browser Used:-
The automation script is executed using Google Chrome browser.
ChromeDriver is installed and its version matches the installed Chrome browser.

3.Test Data:-

4.Valid credentials (username and password) are available for login.

Product names and locators are known or stored in the script/test data file.

5.Environment Setup:-

Selenium WebDriver is properly configured.

Java and Maven (or the required build tool) are installed and added to the system path.

The project dependencies (like Selenium, TestNG, WebDriverManager) are included in the pom.xml file.

6.Locator Stability:-
The web elements (username, password, login button, product, add-to-cart button, menu, logout button) have static and unique locators that do not change frequently.

7.Internet Connectivity:-
A stable internet connection is available for accessing the web application.

8.Execution Flow:-

The user is successfully navigated to the home page after login.

The product page loads properly before clicking “Add to Cart”.

Logout functionality returns the user to the login screen.

9.Browser State:-
Before execution, no previous sessions or cookies are retained from past runs.

10.Wait Conditions:-
Implicit wait is used to handle dynamic loading of elements; explicit waits can be added if needed for better stability.

11.End Condition:-
After logging out, the browser is closed and the WebDriver session is properly terminated.
