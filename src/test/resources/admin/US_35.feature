
Feature: US_035 As an administrator (admin), I want to be able to log in to a panel where I can do operations related to hospital
         operation and patient management.

  Scenario: TC_01 Clicking on the relevant URL should open the "login" page
       Given User goes to the admin page.
       Then Verify that the URL of the website is correctt.


  Scenario: TC_02 On the login page, on the right, the Admin Login window should have the Latest New information on the left.
       Given User goes to the admin page.
       Then Verify that the Latest New information is visible.



  Scenario Outline: TC_03 It should not be possible to login to the admin panel by entering the information (incorrect, missing or not registered in the system before) on the login page.
       Given User goes to the admin page.
       And enters "<username>" from examples as username
       And enters "<password>" from examples as password
       Then wait 3 seconds
       And Verify that the panel cannot be accessed with an invalid password or password


    Examples:
      |username|password|
      |123team   |heallife123   |
      |ayse.busra.pehlivan.admin@heallifehospital.com |645363  |
      |Eyup@gmail.com   |jskdbvk |

  Scenario: TC_04 It should be possible to login to the admin panel by entering the information (previously registered information in the system) on the login page
    Given User goes to the admin page.
    Then  Login to adminn page  "ayse.busra.pehlivan.admin@heallifehospital.com" "heallife123"
    Then It is verified that the admin page has been entered.


  Scenario: TC_05 There should be a forget password link on the login page and when this link is clicked, it should redirect to the "forgotpassword" page.
    Given User goes to the admin page.
    Then There should be a forget password link on the login page
    And Verify that It should redirect to the "forgotpassword" page.



  Scenario: TC_06-TC_07 On the Forgot password page, an e-mail address must be entered in the relevant textBox for password reset.
    Given User goes to the admin page.
    Then There should be a forget password link on the login page
    Then wait 3 seconds
    And The user have enter an email in the email box.
    Then wait 3 seconds
    Then Verify that the password has been sent to the e-mail


  Scenario: TC_08 o return to the login page on the Forgot password page, there must be an admin login link and when this link is clicked, it should redirect to the "login" page.
    Given User goes to the admin page.
    Then There should be a admin login link on the login page
    Then wait 3 seconds
    Then Verify that it is returned to the login page


