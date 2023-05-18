@US040
Feature: As an administrator (admin), I want a page in the dashboard sidebar to see Opd patients (with their details) and add new patients

  Scenario: TC-01 When you click on the OPD link on the Dashboard sidebar, it should redirect to the relevant page
    Given Goes to Admin login page
    Then Login with "nesibe.unal.admin@heallifehospital.com" and "heallife123" datas
    Then Verify  the "admin/dashboard" page is visiable
    Then Verify the OPD menu title on admin page is visible and enable
    Then Click the OPD in the menu
    And Verify the OPD Patient on admin page is redirected

  Scenario: TC-02 The OPD Patient List on the OPD page should have titles (Name, Patient Id, Guardian Name, Gender, Phone, Consultant, Last Visit, Total Recheckup).
    Given Login with "nesibe.unal.admin@heallifehospital.com" and "heallife123" datas
    Then Click the OPD in the menu
    And Verify the titles Name, Patient Id, Guardian Name, Gender, Phone, Consultant, Last Visit, Total Recheckup are displayed

  Scenario: TC-03 It should be possible to sort through the titles in the OPD Patient List on the OPD page.
    Given Login with "nesibe.unal.admin@heallifehospital.com" and "heallife123" datas
    Then Click the OPD in the menu
    And Verify the titles Name, Patient Id, Guardian Name, Gender, Phone, Consultant, Last Visit, Total Recheckup are able to sort through the titles

  Scenario: TC-04 In order to search the OPD Patient List on the OPD page, the page must have a searchBox
    Given Login with "nesibe.unal.admin@heallifehospital.com" and "heallife123" datas
    Then Click the OPD in the menu
    And Verify the seacrhTextBox  in the OPD page page is displayed and to be able to search correctly

  Scenario: TC-05 It should be able to select the list item number (as all or 100) to be displayed in the OPD Patient List on the OPD page
    Given Login with "nesibe.unal.admin@heallifehospital.com" and "heallife123" datas
    Then Click the OPD in the menu
    And Verify that to select the list item number (as all or 100) to be displayed in the OPD Patient List on the OPD page

  Scenario: TC-06 To add a new patient from the OPD page (and add patients using the page functions), the page must be accessed
    Given Login with "nesibe.unal.admin@heallifehospital.com" and "heallife123" datas
    Then Click the OPD in the menu
    And Verify that Add Patient button is displayed and enabled

  Scenario: TC-07 new patient data should be added to the OPD Patient List when the required fields are filled in with the correct data (for the current or new patient) and saved on the page that opens
    Given Login with "nesibe.unal.admin@heallifehospital.com" and "heallife123" datas
    Then Click the OPD in the menu
    Then Click the Add Patient
    And Verify that new patient  from the OPD page can be added and saved on the page that opens