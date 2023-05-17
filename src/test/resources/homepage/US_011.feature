
  Feature: US_011 As a user, I would like to have a page on the homepage where I can schedule appointments for hospital services.


    Scenario: TC_01 There should be a redirect from the main page to the Appointment page.
      Given User goes to the home page
      Then Click the Appointment Button
      Then Verify that the URL of the Appointment page is correct
      And Close the web browser


    Scenario: TC_02 Specialist on the Appointment page,doctor,Shift and Date must be selectable
      Given User goes to the home page
      Then Click the Appointment Button
      Then Verify that Specialist, Doctor, Shift and Date are selectable
      And Close the web browser


    Scenario: TC_03 Slots suitable for the selected information should be seen
      Given User goes to the home page
      Then Click the Appointment Button
      Then Select the Specialist, Doctor, Shift and Date
      Then Verify that Slots are suitable
      And Close the web browser


    Scenario: TC_04 Message Box must be a required field
      Given User goes to the home page
      Then Click the Appointment Button
      Then Select the Specialist, Doctor, Shift and Date
      Then Select the time slot
      Then Select the time and submit
      Then Verify that The Message field is required script is visible
      And Close the web browser


    Scenario: TC_05 When the desired slot is clicked, the desired time interval can be selected in the window that opens and patient information can be entered
      Given User goes to the home page
      Then Click the Appointment Button
      Then Select the Specialist, Doctor, Shift and Date
      Then Select the time slot
      Then Verify that Patient Name, Email and Phone can be entered
      And Close the web browser

    @US011
    Scenario: TC_06 If he is a registered patient, he should be able to make an appointment without having to enter his information
      Given User goes to the home page
      Then Click the Appointment Button
      Then Select the Specialist, Doctor, Shift and Date
      Then Fill in the Message Box
      Then Select the time slot
      Then Select the time in the Slots Available frame
      Then Click the Old Patient button
      Then Enter the Username and Password and submit
      Then Click the Pay button in the Dashboard page
      Then Click the Pay with Card button
      Then Enter the payment details and click the Pay button
      Then Verify that Your Online Appointment Fees Is Successfully Submitted script is visible
      Then Click the Go To Home Button
      Then Verify that Dashboard is visible
      And Close the web browser

    Scenario: TC_07 If it is a new patient, they should be able to enter their personal information and make an appointment
      Given User goes to the home page
      Then Click the Appointment Button
      Then Select the Specialist, Doctor, Shift and Date
      Then Fill in the Message Box
      Then Select the time slot
      Then Select the time in the Slots Available frame
      Then Enter the Patient Name, Email and Phone select the Gender and submit
      Then Click the Pay button in the Dashboard page
      Then Click the Pay with Card button
      Then Enter the payment details and click the Pay button
      Then Verify that Your Online Appointment Fees Is Successfully Submitted script is visible
      Then Click the Go To Home Button
      Then Verify that Dashboard is visible
      And Close the web browser
