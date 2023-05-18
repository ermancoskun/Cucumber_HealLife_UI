
  Feature: US_019 As a user (patient), I want to have a dashboard that belongs to me so that I can view my own information.


    Scenario: TC_01 The Login button should be visible at the top of the home page and when the Login button is clicked, it should redirect to the "userlogin" page.
      Given User goes to the home page
      Then Verify that Login Button is visible
      Then Click the Login button
      Then Verify that Login page is accessible
      And Close the web browser


    Scenario: TC_02 On the user login page, there should be Latest New information on the right, the login window on the left.
      Given User goes to the home page
      Then Click the Login button
      Then Verify that Login window is visible
      Then Verify that information window is visible
      And Close the web browser


    Scenario: TC_03 It should be possible to login to the dashboard by entering the information on the User Login page (previously registered to the system).
      Given User goes to the home page
      Then Click the Login button
      Then Enter the excisting Username and Password and submit
      Then Verify that user loginned correctly
      And Close the web browser


    Scenario: TC_04 It should not be possible to login to the dashboard by entering information (incorrectly missing or not registered in the system before) on the User Login page.
      Given User goes to the home page
      Then Click the Login button
      Then Enter the unregistered Username and Password and submit
      Then Verify that Invalid Username or Password script is displayed
      And Close the web browser


    Scenario: TC_05 There should be a forget password link on the User Login page and when this link is clicked, it should redirect to the "ufpassword" page.
      Given User goes to the home page
      Then Click the Login button
      Then Click the Forget Password button
      Then Verify that User Forget Password page is accessible
      And Close the web browser


    Scenario: TC_06 On the Forgot password page, an e-mail address must be entered in the relevant textBox for password reset.
      Given User goes to the home page
      Then Click the Login button
      Then Click the Forget Password button
      Then Verify that email text box is available
      And Close the web browser


    Scenario: TC_07 The password must be sent to the e-mail address entered in the textBox on the Forgot password page.
      Given User goes to the home page
      Then Click the Login button
      Then Click the Forget Password button
      Then Enter the email adress and submit
      Then Verify that password sent to the e-mail address entered in the textBox
      And Close the web browser


    Scenario: TC_08 In the Forgot password page, there should be a user login link to return to the login page, and when this link is clicked, it should redirect to the "userlogin" page.
      Given User goes to the home page
      Then Click the Login button
      Then Click the Forget Password button
      Then Click the User Login button
      Then Verify that Login page is accessible
      And Close the web browser
