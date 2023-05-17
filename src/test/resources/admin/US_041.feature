Feature: As an administrator (admin), I would like to have a page in
  the dashboard sidebar to see IPD patients (with their details) and add new patients.

  Background: User login steps
    Given Goes to Admin login page
    Then Login with "said.ozkan.admin@heallifehospital.com" and "heallife123" datas
    And Click on the " IPD" link

  Scenario: TC_01 When you click on the IPD link on the Dashboard sidebar, it should redirect to the relevant page.

    And user should be able to on the IPD page


  Scenario: TC_02 In order to add a new patient from the IPD page (and add patients using the page functions),the
  relevant page must be accessed.
    Given Click on the Add Patient button in IPD page
    And Create a New Patient with random datas
#
#    Scenario: TC_03 A new patient data should be added to the IPD Patient List when the required fields are filled in
#               with the correct data (for the current or new patient) and saved on the page that opens.
#      Given

  Scenario: TC_04 There should be a transition from the IPD page to the IPD Discharged Patient page.
    Given Click on the Discarged Patient button
    And user should be able to on the Discarged Patient page


  Scenario:  TC_05 It should be displayed in the IPD Discharged Patient List (titles Name, Patient Id, Case ID/Patient ID,
  Gender, Phone, Consultant, Admission Date, Discharged Date, Tay($), Net Amount($), Total($)).
    Given Click on the Discarged Patient button
    And user should be able to on the Discarged Patient page
    Given It should be displayed in the IPD Discharged Patient List
      | Name                 |
      | Patient Id           |
      | Case ID / Patient ID |
      | Gender               |
      | Phone                |
      | Consultant           |
      | Admission Date       |
      | Discharged Date      |
      | Tax ($)              |
      | Net Amount ($)       |
      | Total ($)            |

  Scenario: TC_06  It should be possible to sort through the titles in the IPD Discharged Patient List.
    Given Click on the Discarged Patient button
    And It should be possible to sort through the titles


  Scenario: TC_07 In order to search the IPD Discharged Patient List, the page must have a searchBox.
    Given Click on the Discarged Patient button
    And test to searcbox

  Scenario:  TC_08  I should be able to select the list items to be displayed in the IPD Discharged Patient List (as all or 100)
    Given Click on the Discarged Patient button
    And Choose All and 100 options for patient display

  Scenario: TC_09  I should be able to view all the patient's information (Overview, Nurse Notes, Medication, Prescription,
  Consultant Register, Lab Investigation, Operations, Charges, Payments, Bed History, Timeline,Treatment History) from the button
  under Total($) in the IPD Discharged Patient List.
    Given Click on the Discarged Patient button
    And I should be able to view all the patient's information from the button under Total($)
      | Overview            |
      | Nurse Notes         |
      | Medication          |
      | Prescription        |
      | Consultant Register |
      | Lab Investigation   |
      | Operations          |
      | Charges             |
      | Payments            |
      | Live Consultation   |
      | Bed History         |
      | Timeline            |
      | Treatment History   |

  Scenario: TC_10 The IPD Patient List on the IPD page should have headings (Name, Case ID/Patient ID, Name, Gender, Phone, Consultant, Bed, Credit Limit($)).
    Given  It should be displayed in the IPD Patient List
      | IPD No               |
      | Case ID / Patient ID |
      | Name                 |
      | Gender               |
      | Phone                |
      | Consultant           |
      | Bed                  |
      | Credit Limit ($)     |

  Scenario: TC_11 It should be possible to sort through the titles in the IPD Patient List on the IPD page.
    And It should be possible to sort through the titles

  Scenario: TC_12 In order to search the IPD Patient List on the IPD page, the page must have a searchBox.
    And test to searcbox

  Scenario: TC_13 should be able to select the list items to be displayed in the IPD Patient List on the IPD page (as all or 100)
    And Choose All and 100 options for patient display

  Scenario: TC_14 Access to all information (Overview, Nurse Notes, Medication, Prescription, Consultant Register, Lab Investigation,
  Operations, Charges, Payments, Bed History, Timeline, Treatment History) of the relevant patient from the button under Credit Limit($)
  in the IPD Patient List on the IPD page. should be.
    And I should be able to view all the patient's information from the button under Credit Limit($)
      | Overview            |
      | Nurse Notes         |
      | Medication          |
      | Prescription        |
      | Consultant Register |
      | Lab Investigation   |
      | Operations          |
      | Charges             |
      | Payments            |
      | Live Consultation   |
      | Bed History         |
      | Timeline            |
      | Treatment History   |


