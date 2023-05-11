
Feature: US_038 As an admin I would like to have a page in the dashboard sidebar to manage billing.

  Background: User login steps
    Given Goes to Admin login page
    Then Login with "ahmet.yazicioglu.admin@heallifehospital.com" and "heallife123" datas
    Then Click on the " Billing" link

  Scenario: TC_01 Clicking on the Billing link on the Dashboard sidebar should lead to the relevant page.
 
    And Verified redirected to Billing page

  Scenario: TC_02 The Billing page should have "Single Module Billing" and "OPD/IPD Billing Through Case Id" windows.

    And Sees Single Module Billing and OPD_IPD Billing Through Case Id windows


  Scenario Outline: TC_03 OPD Billing List should be displayed on the page that opens when the OPD board
            in the Single Module Billing window is clicked.

    And Click on the OPD button
    And Sees the "<FilterName>" and their <1>

    Examples:
      |FilterName   |1|
      |Name         |1   |
      |Patient Id   |2   |
      |Guardian Name|3   |
      |Gender       |4   |
      |Phone        |5   |
      |Consultant   |6   |
      |Last Visit   |7   |
      |Total Recheckup|8   |


    Scenario: TC_04 In order to search easily in the OPD Billing List, there must be a SearchTextBox.

      And Click on the OPD button
      And  test to searcbox


    Scenario: TC_05 A new patient should be able to be added in the OPD Billing List.

      And Click on the OPD button
      And Click on the Add Patient button
      And Create a New Patient with random datas
    @US038
    Scenario: TC_06 The number of patients to be displayed in the OPD Billing List (100 or all) can be selected

      And Click on the OPD button
      And Choose All and 100 options for patient display