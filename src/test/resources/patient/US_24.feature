
Feature: US_24 As a user (patient) I would like to have the IPD menu on my Dashboard so that I can check my IPD information.

  Background: common steps

    Given Launch browser.
    Then Go to "homepageUrl"
    And Login button is clicked
    And Required information is entered and login "usernameAzat" "userPasswordAzat"

  Scenario:TC_01 Dashboard sidebar should have IPD menu title and clicking it should redirect to "ipdprofile" page


    Then Click on the IPD tab
    Then IPD page displayed




  Scenario:TC_02 Overview from the IPD menu,Medication,Prescriptions,Consultant Register,Lab Investigations,operation,charge,
                                           payment,Nurse Notes,timeline,treatment history,Bed History pages should be accessible.

    Then Click on the IPD tab
    Then Click on the medication tab and the Prescription tab
    Then Click on Consulant Register tab and Lab Investigations tab.
    Then Click on Operation tab and Charge tab
    Then Click on the Timeline tab and the Treatment History tab
    And Click on Bed History tab




  Scenario:TC_03 On the Overview page, the profile information of the patient (Gender,age,Guardian Name,Phone) and
                                                                   patient detail information should be accessible..
      Then Click on the IPD tab
      And Click on the Overview


@
  Scenario:TC_04 On the Overview page, summary information of the process and procedures (bed used,etc.)what date he
    sleptdoctor and nurse information,payment info,lab results information,future transactions information) should be included

      Then Click on the IPD tab
      And  Click on the Profile button and display the requested information.



  Scenario: TC_05 On the Medication page, in the Medication List (Date,Medicine Name,Dose) should have headers.

    Then Click on the IPD tab
    And Click on the Medication tab and display the Date , Medication Name , Dose1 title



  Scenario:TC_06 On the Prescription page, in the Prescription List (Prescription No,date,finding,Action) should have titles.

      Then Click on the IPD tab
    And Click on the Prescription tab and Prescription No , Date , Finding , Action titles should be displayed




  Scenario: TC_07 In order to search the Prescription list, there must be a searhTextBox and it must search correctly.

    Then Click on the IPD tab
    Then Click on the Prescription tab
    And Click on SearchTextBox and write the necessary information.




  Scenario:TC_08 It should be possible to sort through the titles in the Prescription list

    Then Click on the IPD tab
    Then Click on the Prescription tab
    And Sorting should be done by clicking Prescription No ,Date , Finding headings




  Scenario: TC_09 The Prescription detail should be accessible under the Action title in the Prescription list

    Then Click on the IPD tab
    Then Click on the Prescription tab
    And It should be possible to click on the Prescription detail under the Action title in the Prescription list.



  Scenario:TC_10  On the Consultant Register page, in the Consultant Register List
                                                     (Applied Date,doctor,Instruction,Instruction Date) should be titles.

    Then Click on the IPD tab
    And The Consultant Registration tab should be clicked and the titles in the Consultant Registration List should be displayed on the Consultant Registration page.



  Scenario: TC_11 In order to search in the Consultant Register list, there must be a searhTextBox and it must search correctly.

    Then Click on the IPD tab
    Then Click on the Consultant Register tab
    And In order to search the Consultant Register list, there must be a searhTextBox and a correct search must be made.



  Scenario:TC_13 On the Lab Investigation page, in the Lab Investigation List (Test Name,lab,Sample Collected,Expected Date,Approved By,Action) should have titles
    Then Click on the IPD tab
    And The Lab Investigation page should be clicked and the Lab Investigation page should have a title in the Lab Investigation List.



  Scenario:TC_14 To be able to search the Lab Investigation list, there must be a searhTextBox and it must search correctly
    Then Click on the IPD tab
    Then Click on Lab Investigation page
    And To be able to search the Lab Investigation list, there must be a searhTextBox and it must search correctly.




   Scenario: TC_15It should be possible to sort the list through the titles in the Lab Investigation list
     Then Click on the IPD tab
     Then Click on Lab Investigation page
     And The list can be sorted over the titles in the Lab Investigation List.




   Scenario: TC_16The test result should be displayed under the Action title in the Lab Investigation List.
     Then Click on the IPD tab
     Then Click on Lab Investigation page
     And Results should be visible under the Titles in the Lab Investigation List.



   Scenario: TC_17 On the Operation page, the details of the operation that the patient has had should be displayed.

     Then Click on the IPD tab
     Then Click on the Operation Page
     And The operation details of the patient should be displayed on the Operation page.




   Scenario: TC_18 The patient should be able to view the expense details on the Charges page.
     Then Click on the IPD tab
     Then Click on Charges tab
     And The patient should be able to view the expense details on the Charges page.


  Scenario: TC_19 From the Payment page, the patient should be able to see the details of the payment they have made.

    Then Click on the IPD tab
    Then Click on the payment tab
    And From the Payment page, the patient should be able to see the payment details they have made.


  Scenario: TC_20 The note written by the nurse and the date and time of writing the note should be displayed on the Nurse Notes page


    Then Click on the IPD tab
    Then Click on the Nurse Notes tab
    And The note written by the nurse and the date and time of writing the note should be displayed on the Nurse Notes page.



  Scenario: TC_21 On the Timeline page, the operations planned for the patient in the future (together with their explanations) should be displayed

    Then Click on the IPD tab
    Then Click on Timeline tab
    Then The Timeline page should display the patient's planned future actions (with explanations)


  Scenario: TC_22 In the Treatment History List on the Treatment History page (IPD No.symptoms,Consultant,Bed ) should have headers.
    Then Click on the IPD tab
    Then Click on the Treatment History tab
    Then The Treatment History List on the Treatment History page should have titles (IPD No, Symptoms, Consultant, Bed).



  Scenario: TC_23 To be able to search the Treatment History list, there must be a searhTextBox and it must search correctly.

    Then Click on the IPD tab
    Then Click on the Treatment History tab
    Then To be able to search the Treatment History list, there must be a searhTextBox and it must search correctly.


  Scenario: TC_24 It should be possible to sort through the titles in the Treatment History list

    Then Click on the IPD tab
    Then Click on the Treatment History tab
    Then In the Treatment History list, the list can be sorted through the titles.



  Scenario: TC_25  On the Bed History List on the Bed History page (Bed Group,bed,From Date,To Date,Active Bed ) headers.
    Then Click on the IPD tab
    Then Click on Bed History tab
    Then Titles must be visible in the Bed History List on the Bed History page



  Scenario: TC_26 In order to search the Bed History list, there must be a searhTextBox and it must search correctly.
    Then Click on the IPD tab
    Then Click on Bed History tab
    Then In order to search the Bed History list, there must be a searhTextBox and it must search correctly.

  @azat
  Scenario: TC_27 It should be possible to sort through the titles in the Bed History list
    Then Click on the IPD tab
    Then Click on Bed History tab
    Then It is possible to sort the list over the titles in the Bed History list.



