
Feature: US_24 As a user (patient) I would like to have the IPD menu on my Dashboard so that I can check my IPD information.

  Background: common steps

    Given Launch browser.
    Then Go to "homepageUrl"
    And Login button is clicked
    And Required information is entered and login "usernameAzat" "userPasswordAzat"

  Scenario:TC_01 Dashboard sidebar should have IPD menu title and clicking it should redirect to "ipdprofile" page


    Then Click on the IPD tab
    Then IPD page displayed
    And The browser is closed



  Scenario:TC_02 Overview from the IPD menu,Medication,Prescriptions,Consultant Register,Lab Investigations,operation,charge,
                                           payment,Nurse Notes,timeline,treatment history,Bed History pages should be accessible.

    Then Click on the IPD tab
    And Click on the medication tab and the Prescription tab
    And Click on Consulant Register tab and Lab Investigations tab.
    And Click on Operation tab and Charge tab
    And Click on the Timeline tab and the Treatment History tab
    And Click on Bed History tab
    And The browser is closed



  Scenario:TC_03 On the Overview page, the profile information of the patient (Gender,age,Guardian Name,Phone) and
                                                                   patient detail information should be accessible..
      Then Click on the IPD tab
      And Click on the Overview
      And The browser is closed


  Scenario:TC_04 On the Overview page, summary information of the process and procedures (bed used,etc.)what date he
    sleptdoctor and nurse information,payment info,lab results information,future transactions information) should be included

      Then Click on the IPD tab
      And  Click on the Profile button and display the requested information.
      And The browser is closed


  Scenario: TC_05 On the Medication page, in the Medication List (Date,Medicine Name,Dose) should have headers.

    Then Click on the IPD tab
    And Click on the Medication tab and display the Date , Medication Name , Dose1 title
    And The browser is closed


  Scenario:TC_06 On the Prescription page, in the Prescription List (Prescription No,date,finding,Action) should have titles.

      Then Click on the IPD tab
      And Click on the Prescription tab and Prescription No , Date , Finding , Action titles should be displayed
      And The browser is closed



  Scenario: TC_07 In order to search the Prescription list, there must be a searhTextBox and it must search correctly.

    Then Click on the IPD tab
    And Click on the Prescription tab
    And Click on SearchTextBox and write the necessary information.
    And The browser is closed



  Scenario:TC_08 It should be possible to sort through the titles in the Prescription list

    Then Click on the IPD tab
    And Click on the Prescription tab
    And Sorting should be done by clicking Prescription No ,Date , Finding headings
    And The browser is closed



  Scenario: TC_09 The Prescription detail should be accessible under the Action title in the Prescription list

    Then Click on the IPD tab
    And Click on the Prescription tab
    And It should be possible to click on the Prescription detail under the Action title in the Prescription list.
    And The browser is closed


  Scenario:TC_10  On the Consultant Register page, in the Consultant Register List
                                                     (Applied Date,doctor,Instruction,Instruction Date) should be titles.

    Then Click on the IPD tab
    And The Consultant Registration tab should be clicked and the titles in the Consultant Registration List should be displayed on the Consultant Registration page.
    And The browser is closed


  Scenario: TC_11 In order to search in the Consultant Register list, there must be a searhTextBox and it must search correctly.

    Then Click on the IPD tab
    And Click on the Consultant Register tab
    And In order to search the Consultant Register list, there must be a searhTextBox and a correct search must be made.
    And The browser is closed


  Scenario:TC_13 On the Lab Investigation page, in the Lab Investigation List (Test Name,lab,Sample Collected,Expected Date,Approved By,Action) should have titles
    Then Click on the IPD tab
    And The Lab Investigation page should be clicked and the Lab Investigation page should have a title in the Lab Investigation List.
    And The browser is closed

  @azat
  Scenario:TC_14 To be able to search the Lab Investigation list, there must be a searhTextBox and it must search correctly
    Then Click on the IPD tab
    And Click on Lab Investigation page
    And To be able to search the Lab Investigation list, there must be a searhTextBox and it must search correctly.
    And The browser is closed
