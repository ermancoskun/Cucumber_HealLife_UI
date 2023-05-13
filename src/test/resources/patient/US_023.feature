Feature: As a patient I want to have an OPD menu on my Dashboard so I can check my OPD information.
  Background: common steps
    * Launch browser.
    * Go to "patientUrl"

  Scenario: TC-01 Dashboard sidebar should have OPD menu title and when clicked it should redirect to "opdprofile" page
    Then Login as a patient with username password
    Then Verify  the patient dashboard page is redirected
    Then Verify the “OPD” menu title in the dashboard is visible and clickable
    Then Click the “OPD” menu
    Then Verify the "https://qa.heallifehospital.com/patient/dashboard/profile" page is redirected
    And  Close the page

  Scenario: TC-02 Access to Overview, Visits, Lab Investigation, Treatment History, Timeline pages should be available from the OPD menu

    Then Click the “OPD” menu
    Then Verify the “ Overview, Visits, Lab Investigation, Treatment History, Timeline” items visible and accesable.
    And  Close the page

  Scenario: TC-03 On the Overview page, the profile information of the patient (Gender, Age, Guardian Name, Phone) should be displayed correctly

    Then Click the “OPD” menu
    Then Verify the “ Gender, Age, Guardian Name, Phone” items displayed correctly in the Overview page
    And  Close the page

  Scenario: TC-04 Summaries of information on other pages (Visits, Lab Investigation, Treatment History, Timeline) should be displayed on

    Then Click the “OPD” menu
    Then Verify the summaries of Visits, Lab Investigation, Treatment History, Timeline displayed correctly in the Overview page
    And  Close the page

  Scenario: TC-05 Consultant doctors should be displayed under the title of consultant doctor on the Overview page

    Then Click the “OPD” menu
    Then Verify the “ Consultant doctor” item displayed correctly in the Overview page.
    And  Close the page

  Scenario: TC-06 Visits page should have headings in Visits List (OPD No, Case ID, Appointment Date, Consultant, Reference

    Then Click the “OPD” menu
    Then Click the “Visits” menu
    Then Verify the headings in Visits List, OPD No, Case ID, Appointment Date, Consultant, Reference displayed correctly
    And  Close the page

  Scenario: TC-07 To be able to search the Visits list, there must be a searhTextBox and search correctly.

    Then Click the “OPD” menu
    Then Click the “Visits” menu
    Then Verify the seacrhTextBox  in Visit page is displayed and to be able to search correctly
    And  Close the page
  Scenario: TC-08 Summaries of information on other pages (Visits, Lab Investigation, Treatment History, Timeline) should be displayed on

    Then Click the “OPD” menu
    Then Click the “Visits” menu
    Then Verify the list titles in the Visits List are to be able to sort effectively
    And  Close the page

  Scenario: TC-09 You must have access to the details of the visit and the prescription information under the Actions heading in the Visits

    Then Click the “OPD” menu
    Then Click the “Visits” menu
    Then Verify the accessiblity to the details of the visit and the prescription information under the Actions heading in the Visits
    And  Close the page

  Scenario: TC-10 Summaries of information on other pages (Visits, Lab Investigation, Treatment History, Timeline) should be displayed on

    Then Click the “OPD” menu
    Then Click the “Visits” menu
    Then Verify the visit details and prescription information must be recorded on the correct patient name.
    And  Close the page
