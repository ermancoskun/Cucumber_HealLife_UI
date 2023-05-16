Feature: US_038 As an admin I would like to have a page in the dashboard sidebar to manage billing.

  Background: User login steps
    Given Goes to Admin login page
    And Login with "ahmet.yazicioglu.admin@heallifehospital.com" and "heallife123" datas
    Then Click on the " Billing" link



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
        And Click on the "  Add Patient" button
        Then Create a New Patient with random datas


  Scenario: TC_06 The number of patients to be displayed in the OPD Billing List (100 or all) can be selected
        And Click on the OPD button
        Then Choose All and 100 options for patient display

  Scenario: TC_07   The relevant patient (detail profile) information should be displayed under the
            Total Recheckup heading in the OPD Billing List.
        And Click on the OPD button
        Then Click 1. iconButton under the last column for display first patient profile
        Then Verified redirected to Patent Profile page

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
          And Click on the " Add Patient" button
          Then Create a New Patient with random datas
          Then Create a New Bill with random datas

    Scenario: TC_12 The number of patients to be displayed in the Pathology Billing List (100 or all) can be selected.
          And Click the Pathology button on Billing page
          Then Choose All and 100 options for patient display

    Scenario: TC_13   Under the title Balance Amount ($) in the Pathology Billing List,
                      the relevant patient's (detail invoice) information should be displayed.
          And Click the Pathology button on Billing page
          And Click 1. iconButton under the last column for display first patient profile
          Then Verified redirected to Bill Details page

    Scenario: TC_14 Under the heading Balance Amount ($) in the Pathology Billing List,
                    additional payments can be added to the invoice of the relevant patient
          And Click the Pathology button on Billing page
          And Click 1. money icon under the last column
          Then Make or delete additional payments

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
          Then Click on the " Add Patient" button
          Then Create a New Patient with random datas
          Then Create a New Bill with random datas

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
          And Click 1. money icon under the last column
          Then Make or delete additional payments

    Scenario: TC_22 When you click on the names under Name in the Radiology Billing List,
                    the relevant patient's (detail profile) information should be displayed.
          And Click the Radiology button on Billing page
          And Click first name for display patient profile under the Patient Name
          Then Verified redirected to Patent Profile page

    Scenario: TC_23 Blood Issue Billing List (under the headings) should be displayed.
          And Click the Blood Issue button on Billing page
          Then Sees the name of Blood Issue Billing List and their contents
  @US038
    Scenario: TC_24 In order to search easily in the Blood Issue Billing List, there must be a SearchTextBox.
                    In the Blood Issue Billing List, there should be a transition to the page where a new
                    Issue Blood can be added and a new Blood Issue Bill.
          And Click the Blood Issue button on Billing page
          And test to searcbox
          Then Click on the " Issue Blood" button
          Then Create a New Patient with random datas

    Scenario: TC_25 The number of patients to be displayed in the Blood Issue Billing List
                    (100 or all) should be selected.
          And Click the Blood Issue button on Billing page
          And Choose All and 100 options for patient display

    Scenario: TC_26  Under the title Balance Amount ($) in the Blood Issue Billing List,
                     the relevant billing information (Blood Issue Details) should be displayed.
          And Click the Blood Issue button on Billing page
          And Click 1. iconButton under the last column for display first patient profile
          Then Verified redirected to Blood Issue Details page
          Then Edit and delete a Blood records

    Scenario: TC_27 Under the heading Balance Amount($) in the Blood Issue Billing List,
                    an additional payment should be made to the relevant invoice
          And Click the Blood Issue button on Billing page
          And Click 1. +plus icon under the last column
          Then Make or delete additional payments for Bloods

    Scenario: TC_28 Relevant Bill data can be deleted under the title Balance Amount($) in the
                    Blood Issue Billing List.
          And Click the Blood Issue button on Billing page
          Then Click the trash icon for delete 1. Bill
          When Click 1. iconButton under the last column for display first patient profile
          Then Verified redirected to Blood Issue Details page