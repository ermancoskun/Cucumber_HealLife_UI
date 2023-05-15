
Feature: As an administrator (admin), I would like to have a page in the dashboard sidebar
  so that I can control all the operations in the hospital's pharmacy.

  Background: User login steps
    Given Goes to Admin login page
    Then Login with "humeyra.uysal.admin@heallifehospital.com" and "heallife123" datas
    Then Click on the " Pharmacy" link


  Scenario: TC 01 When you click on the Pharmacy link on the Dashboard sidebar, it should redirect to the relevant page.

  Given Verify that browser redirect to Pharmacy page.

  Scenario: TC 02 The Pharmacy Bill List on the Pharmacy page should have the headings (Bill No, Case ID/Patient ID, Date, Patient Name, Doctor Name, Discount($), Amount($), Paid Amount($), Balance Amount($)).

    Given Verify that The Pharmacy Bill List on the Pharmacy page have the heading Bill No
 Then Verify that The Pharmacy Bill List on the Pharmacy page have the heading Case ID Patient ID
 Then Verify that The Pharmacy Bill List on the Pharmacy page have the heading Date
  Then Verify that The Pharmacy Bill List on the Pharmacy page have the heading Patient Name.
  Then Verify that The Pharmacy Bill List on the Pharmacy page have the heading Doctor Name.
  Then Verify that The Pharmacy Bill List on the Pharmacy page have the heading Discount.
  Then Verify that The Pharmacy Bill List on the Pharmacy page have the heading Amount.
  Then Verify that The Pharmacy Bill List on the Pharmacy page have the heading Paid Amount.
  Then Verify that The Pharmacy Bill List on the Pharmacy page have the heading Balance Amount.


  Scenario: TC 03 It should be possible to sort through the titles in the Pharmacy Bill List on the Pharmacy page.
  Given Click the sort button of Bill No.Verify sorted by bill number.
  Then Click the sort button of Case ID Patient ID.Verify sorted by Case ID Patient ID.
  Then Click the sort button of Date.Verify sorted by Date.
  Then Click the sort button of Patient Name.Verify sorted by Patient Name.
  Then Click the sort button of Doctor Name.Verify sorted by  Doctor Name.
  Then Click the sort button of Discount.Verify sorted by Discount.
  Then Click the sort button of Amount.Verify sorted by Amount.
  Then Click the sort button of Paid Amount.Verify sorted by Paid Amount.
  Then Click the sort button of Balance Amount.Verify sorted by Balance Amount.

  Scenario: TC 04 In order to search the Pharmacy Bill List on the Pharmacy page, the page must have a searchBox.

  Given Verify that the pharmacy page have a search box.

  Scenario: TC 05 It should be able to select the list elements to be displayed in the Pharmacy Bill List on the Pharmacy page (as all or 100)
  Given Choose All and 100 options for patient display


  Scenario: TC 06 An invoice should be created by going to the Generate Bill page from the Pharmacy page (by entering the correct information in
  Medicine Category, Medicine Name, Batch No, Expiry Date, Quantity/Available Qty, Sale Price($), Tax Amount($)).
  Given Click the Generate Bill button.
  Then Create an invoice by entering the correct information Medicine Category, Medicine Name, Batch No, Expiry Date, Quantity Available Qty, Sale Price ,Tax Amount.
  Then Verify that invoice has been created

  Scenario: TC 07 A new patient entry should be possible from the Generete Bill page.

  Given Verify that Generate Bill button is disabled.
  Then Verify that Generate Bill button is clickabled.
  Then Click the Generate Bill button.
  Then Enter a new patient from the Generate Bill page.Verify that a new patient can be entered from the Generete Bill page

  Scenario:Tc 08 It should be possible to make a call with the recipe number from the Generate Bill page.
  Given Click the Generate Bill button.
  Then Verify that Prescription button is enabled.
  Then Search by prescription number from the Generate Bill page.
  Then Verify that it is possible to search with the recipe number from the Generate Bill page.