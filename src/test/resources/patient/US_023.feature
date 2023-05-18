
Feature: As a patient I want to have an OPD menu on my Dashboard so I can check my OPD information.


  Scenario: TC-01 Dashboard sidebar should have OPD menu title and when clicked it should redirect to "opdprofile" page
    Given Goes to user login page
    Then Login to user page as "nesibe.unal" "heallife123"
    Then Verify  the patient dashboard page is redirected
    Then Verify the OPD menu title in the dashboard is visible and clickable
    Then Click the OPD menu
    Then Verify the "https://qa.heallifehospital.com/patient/dashboard/profile" page is redirected


  Scenario: TC-02 Access to Overview, Visits, Lab Investigation, Treatment History, Timeline pages should be available from the OPD menu

    Given Goes to user login page
    Then Login to user page as "nesibe.unal" "heallife123"
    Then Click the OPD menu
    Then Verify the Overview, Visits, Lab Investigation, Treatment History, Timeline items are visible and accessable


  Scenario: TC-03 On the Overview page Gender, Age, Guardian Name, Phone should be displayed correctly
    Given Goes to user login page
    Then Login to user page as "nesibe.unal" "heallife123"
    Then Click the OPD menu
    Then Verify the Gender, Age, Guardian Name, Phone items displayed correctly in the Overview page


  Scenario: TC-04 Summaries of information on other pages (Visits, Lab Investigation, Treatment History, Timeline) should be displayed

    Given Goes to user login page
    Then Login to user page as "nesibe.unal" "heallife123"
    Then Click the OPD menu
    Then Verify the summaries of Visits, Lab Investigation, Treatment History, Timeline displayed correctly in the Overview page


  Scenario: TC-05 Consultant doctors should be displayed under the title of consultant doctor on the Overview page

    Given Goes to user login page
    Then Login to user page as "nesibe.unal" "heallife123"
    Then Click the OPD menu
    Then Verify the Consultant doctor item displayed correctly in the Overview page


  Scenario: TC-06 Visits page should have headings in Visits List (OPD No, Case ID, Appointment Date, Consultant, Reference
    Given Goes to user login page
    Then Login to user page as "nesibe.unal" "heallife123"
    Then Click the OPD menu
    Then Click the Visits menu
    Then Verify the headings in Visits List, OPD No, Case ID, Appointment Date, Consultant, Reference displayed correctly


  Scenario: TC-07 To be able to search the Visits list, there must be a searhTextBox and search correctly.

    Given Goes to user login page
    Then Login to user page as "nesibe.unal" "heallife123"
    Then Click the OPD menu
    Then Click the Visits menu
    Then Verify the seacrhTextBox  in Visit page is displayed and to be able to search correctly

  @023
  Scenario: TC-08 It should be possible to sort the list over the list titles in the Visits List
    Given Goes to user login page
    Then Login to user page as "nesibe.unal" "heallife123"
    Then Click the OPD menu
    Then Click the Visits menu
    Then Verify the list titles in the Visits List are to be able to sort effectively


  Scenario: TC-09 You must have access to the details of the visit and the prescription information under the Actions heading in the Visits

    Given Goes to user login page
    Then Login to user page as "nesibe.unal" "heallife123"
    Then Click the OPD menu
    Then Click the Visits menu
    Then Verify the accessiblity to the details of the visit and the prescription information under the Actions heading in the Visits

  Scenario: TC-10 Visit details and prescription information must be recorded on the correct patient name
    Given Goes to user login page
    Then Login to user page as "nesibe.unal" "heallife123"
    Then Click the OPD menu
    Then Click the Visits menu
    Then Verify the visit details and prescription information are recorded on the correct patient name

  Scenario: TC-11 The Lab Investigation list on the Lab Investigation page should have titles (Test Name, Case ID, Lab, Sample Collected
    Given Goes to user login page
    Then Login to user page as "nesibe.unal" "heallife123"
    Then Click the OPD menu
    Then Click the Lab Investigation menu
    Then Verify titles in Lab Investigation List (Test Name, Case ID, Lab, Sample Collected, Expected Date, Approved By) displayed correctly on the Lab Investigation page

  Scenario: TC-12 In order to search in the Lab Investigation list, there must be a searhTextBox and it must search correctly.
    Given Goes to user login page
    Then Login to user page as "nesibe.unal" "heallife123"
    Then Click the OPD menu
    Then Click the Lab Investigation menu
    And Verify the seacrhTextBox  in Lab Investigation page is displayed and to be able to search correctly

  Scenario: TC-13 The test result should be displayed under the Action title in the Lab Investigation List.
    Given Goes to user login page
    Then Login to user page as "nesibe.unal" "heallife123"
    Then Click the OPD menu
    Then Click the Lab Investigation menu
    And Verify the test result should be displayed under the Action title in the Lab Investigation List is displayed

  Scenario: TC-14 It should be possible to sort the list over the titles in the Lab Investigation List
    Given Goes to user login page
    Then Login to user page as "nesibe.unal" "heallife123"
    Then Click the OPD menu
    Then Click the Lab Investigation menu
    And Verify the list over the titles in the Lab Investigation List are to be able to sort effectively

  Scenario: TC-15 The Treatment History page should have headings in the Treatment History list (OPD No, Case ID, Appointment Date, Syptomps, Consultant, Action).
    Given Goes to user login page
    Then Login to user page as "nesibe.unal" "heallife123"
    Then Click the OPD menu
    Then Click the Treatment History menu
    And Verify titles in The Treatment History page (OPD No, Case ID, Appointment Date, Symptoms, Consultant, Action) displayed correctly on The Treatment History page

  Scenario: TC-16 To be able to search the Treatment History list, there must be a searhTextBox and it must search correctly.
    Given Goes to user login page
    Then Login to user page as "nesibe.unal" "heallife123"
    Then Click the OPD menu
    Then Click the Treatment History menu
    And Verify the seacrhTextBox  in the Treatment History page is displayed and to be able to search correctly.

  Scenario: TC-17 Treatment history detail should be displayed under the Actions title in the Treatment History list.
    Given Goes to user login page
    Then Login to user page as "nesibe.unal" "heallife123"
    Then Click the OPD menu
    Then Click the Treatment History menu
    And Verify the treatment history details should be displayed under the Action title in the “The Treatment History” list

  Scenario: TC-18 It should be possible to select how many treatment histories (100 or All) will be displayed in the Treatment History list.
    Given Goes to user login page
    Then Login to user page as "nesibe.unal" "heallife123"
    Then Click the OPD menu
    Then Click the Treatment History menu
    And Verify  that to select how many treatment histories (100 or All) will be displayed in the Treatment History list

  Scenario: TC-19 There should be a line on the Timeline page showing the procedures waiting for the patient in the future
    Given Goes to user login page
    Then Login to user page as "nesibe.unal" "heallife123"
    Then Click the OPD menu
    Then Click the Timeline menu
    And Verify  that a line on the Timeline page showing the procedures waiting for the patient in the future is  displayed

  Scenario: TC-20 The Line on the Timeline page should contain all the necessary information.
    Given Goes to user login page
    Then Login to user page as "nesibe.unal" "heallife123"
    Then Click the OPD menu
    Then Click the Timeline menu
    And Verify  that the Line on the Timeline page contains all the necessary informations


