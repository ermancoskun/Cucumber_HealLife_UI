Feature: US_038 As an admin I would like to have a page in the dashboard sidebar to manage billing.

  Background: User login steps
    Given Goes to Admin login page
    And Login with "ahmet.yazicioglu.admin@heallifehospital.com" and "heallife123" datas
    Then Click on the " Billing" link


  @US038
  Scenario: TC_01 Clicking on the Billing link on the Dashboard sidebar should lead to the relevant page.
        Then Verified redirected to Billing page

  Scenario: TC_02 The Billing page should have "Single Module Billing" and "OPD/IPD Billing Through Case Id" windows.
        Then Sees Single Module Billing and OPD_IPD Billing Through Case Id windows

  Scenario: TC_03 OPD Billing List should be displayed on the page that opens when the OPD board
                  in the Single Module Billing window is clicked.
        And Click on the OPD button
        Then Sees the FilterName and their Order

  Scenario: TC_04 In order to search easily in the OPD Billing List, there must be a SearchTextBox.
        And Click on the OPD button
        Then  test to searcbox

  Scenario: TC_05 A new patient should be able to be added in the OPD Billing List.
        And Click on the OPD button
        And Click on the Add Patient button
        Then Create a New Patient with random datas

  Scenario: TC_06 The number of patients to be displayed in the OPD Billing List (100 or all) can be selected
        And Click on the OPD button
        Then Choose All and 100 options for patient display

  Scenario: TC_07   The relevant patient (detail profile) information should be displayed under the
            Total Recheckup heading in the OPD Billing List.
        And Click on the OPD button
        Then Click 1. iconButton under the last column for display first patient profile
        Then Verified redirected to Patent Profile page


    And Click on the OPD button
    And Click 1. iconButton under the Total Recheckup for display first patient profile


  Scenario: TC_08 When the names under Name in the OPD Billing List are clicked,
                  the information of the relevant patient (detail profile) should be displayed.
        And Click on the OPD button
        And Click first name for display patient profile
        Then Verified redirected to Patent Profile page


  Scenario: TC_09 When Pathology board in the Single Module Billing window is clicked,(all)Amounts)
                  should be displayed.
        And Click the Pathology button on Billing page
        Then Sees the name of Billing List and their contents

    Scenario: TC_10 In order to search easily in the Pathology Billing List, there must be a SearchTextBox.
          And Click the Pathology button on Billing page
          Then test to searcbox

    Scenario: TC_11 A new patient should be able to be added to the Pathology Billing List.
          And Click the Pathology button on Billing page
          And Click on the Add Patient button
          Then Create a New Patient with random datas

    Scenario: TC_12 The number of patients to be displayed in the Pathology Billing List (100 or all) can be selected.
          And Click the Pathology button on Billing page
          Then Choose All and 100 options for patient display

    Scenario: TC_13   Under the title Balance Amount ($) in the Pathology Billing List,
                      the relevant patient's (detail invoice) information should be displayed.
          And Click the Pathology button on Billing page
          And Click 1. iconButton under the last column for display first patient profile
          Then Verified redirected to Bill Details page

    Scenario: TC_14
    Scenario: TC_15 When you click on the names under Name in the Pathology Billing List, the information of
                    the relevant patient (detail profile) should be displayed.
          And Click the Pathology button on Billing page
          And Click first name for display patient profile under the Patient Name
          Then Verified redirected to Patent Profile page

    Scenario: TC_16 Radiology Billing Lists headings on the page that opens when you click on the Radiology board
          And Click the Radiology button on Billing page
          Then Sees the name of Radiology Billing List and their contents

    Scenario: TC_17 In order to search easily in the Radiology Billing List, there must be a SearchTextBox.
          And Click the Radiology button on Billing page
          Then test to searcbox

    Scenario: TC_18  A new patient should be able to be added to the Radiology Billing List.
          And Click the Radiology button on Billing page
          Then Click on the Add Patient button
          Then Create a New Patient with random datas

    Scenario: TC_19 The number of patients (100 or all) to be displayed in the Radiology Billing List
                    should be able to be selected.
          And Click the Radiology button on Billing page
          Then Choose All and 100 options for patient display

    Scenario: TC_20 Under the title Balance Amount ($) in the Radiology Billing List,
                    the relevant patient's (detail invoice) information should be displayed.
          And Click the Radiology button on Billing page
          Then Click 1. iconButton under the last column for display first patient profile
          Then Verified redirected to Bill Details page

    Scenario: TC_21 Additional payment can be added to the invoice of the relevant patient under
                    the heading Balance Amount ($) in the Radiology Billing List
          And Click the Radiology button on Billing page
          And Click the Add View Payment iconButton for additional payments for patient of 1.
          Then Test the payment options

    Scenario:
