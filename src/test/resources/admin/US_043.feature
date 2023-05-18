Feature: As an administrator (admin), I want to have a page where the dataof the relevant unit can be added, deleted and edited
  in order to manage the data of the Pathology service.

  Background: User login steps
    Given Goes to Admin login page
    Then Login with "said.ozkan.admin@heallifehospital.com" and "heallife123" datas
    And Click on the "Pathology" link

  Scenario: TC_01 When you click on the Pathology link on the Dashboard sidebar, it should redirect to the relevant page.
    And user should be able to on the Pathology page

  Scenario: TC_02 The Pathology Bill List on the Pathology page should be displayed with the titles (Bill No, Case ID/Patient ID,
  Reporting Date, Patient Name, Reference Doctor, Amount($), Paid Amount($), Balance Amount($)).
    Given Sees the name of Billing List and their contents

  Scenario: TC_03 Contents in the Pathology Bill List should be able to be sorted by page titles.
    Given Sees the name of Billing List and their contents

  Scenario: TC_04 You must have a searchBox to find the contents of the Pathology Bill List.
    Given test to searcbox

  Scenario: TC_05 In the Pathology Bill List, it should be possible to select how many content (100 or All) to be displayed on a page.
    Given Choose All and 100 options for patient display

  Scenario: TC_06 Under the title Balance Amount($) in the Pathology Bill List, the details of the relevant content should be displayed and the
  payment should be added by going to the payment page (by filling in the relevant places with the correct data) on the payment payment page.
    Given Click 2. iconButton under the last column for display first patient profile
    And click X Icon
    And Click the Add View Payment iconButton for additional payments for patient of 1.

  Scenario: TC_07 It should be possible to switch from the Pathology page to the Generete Bill page.
    Given Click the Generate Bill button on Pathology page.
    And switch from the Pathology page to the Generete Bill page

  Scenario: TC_08  On the Generate Bill page, an invoice should be prepared on the relevant patient by selecting the
  patient's name or adding a new patient.
    Given Click the Generate Bill button on Pathology page.
    And Create a New Patient with random datas
    And Create a bill on the relevant patient


  Scenario: TC_09 Bill No and Date information should be given by the system on the Generate Bill page.
    Given Click the Generate Bill button on Pathology page.
    And Create a bill on the relevant patient
    Given Confirm Bill No and Date information

  Scenario: TC_10 It should be possible to add more than one test data at the same time by entering more than one test data on the Generate Bill page.
    Given Click the Generate Bill button on Pathology page.
    And Create a New Patient with random datas
    And Create a bill on the relevant patient

  Scenario: TC_11 Payment Mode should be selected on the Generate Bill page.
    Given Click the Generate Bill button on Pathology page.
    And Create a New Patient with random datas
    And Create a bill on the relevant patient

  Scenario: TC_12 Total ($), Discount ($), Tax ($), Net Amount ($) information should be entered on the Generate Bill page.
    Given Click the Generate Bill button on Pathology page.
    And Create a New Patient with random datas
    And Create a bill on the relevant patient

  Scenario: TC_13 When the correct information is entered and the save button is clicked, the relevant invoice should appear on the Pathology Bill List.
    Given Click the Generate Bill button on Pathology page.
    And Create a New Patient with random datas
    And Create a bill on the relevant patient

  Scenario: TC_14 It should be possible to switch from the Pathology page to the Pathology Test page.
    Given Switch from the Pathology page to the Pathology Test page.

  Scenario: TC_15 In the Pathology Test List on the Pathology Test page, the pathology tests performed in the hospital should be listed with the
  headings (Test Name, Short Name, Test Type, Category, Sub Category, Method, Report Days, Tax($), Charge($), Amount($)) .
    Given Switch from the Pathology page to the Pathology Test page.
    And The pathology tests page should be listed with the headings

  Scenario: TC_16 Contents in the Pathology Test List should be able to be sorted by page titles.
    Given Switch from the Pathology page to the Pathology Test page.
    And The pathology tests page should be listed with the headings

  Scenario: TC_17 There must be a searchBox to find the contents of the Pathology Test List.
    Given Switch from the Pathology page to the Pathology Test page.
    And test to searcbox

  Scenario: TC_18 In the Pathology Test List, it should be possible to select how many content (100 or All) to be displayed on a page.
    Given Switch from the Pathology page to the Pathology Test page.
    And Choose All and 100 options for patient display

  Scenario: TC_19  Details of the relevant content should be displayed under the title Amount($) in the Pathology Test List.- Clicking the Add
  Pathology Test link from the Pathology Test page should open the Add Test Details window.
    Given Switch from the Pathology page to the Pathology Test page.
    Given Click 3. iconButton under the last column for display first patient profile
    And Confirm that Test Details page is visible.

  Scenario: TC_20  The required fields in the Add Test Details window must be (Test Name, Short Name, Category Name, Charge Category, Charge Name,
  Standard Charge, Amount($), Test Parameter Name, Reference Range, Unit).
    Given Switch from the Pathology page to the Pathology Test page.
    And click on add Pathology Test button
    Given Parameters added expected areas

  Scenario: TC_21 More than one test parameter can be added in the Add Test Details window.
    Given Switch from the Pathology page to the Pathology Test page.
    And click on add Pathology Test button
    Given More than one test parameter can be added

  Scenario: TC_22 When the correct information is entered and saved, the saved test should be displayed in the Pathology Test List.
    Given Switch from the Pathology page to the Pathology Test page.
    And click on add Pathology Test button
    Given Parameters added expected areas

#    ddd



