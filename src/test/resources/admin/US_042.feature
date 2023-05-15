@US005
Feature: As an administrator (admin), I would like to have a page in the dashboard sidebar
  so that I can control all the operations in the hospital's pharmacy.

  Background: User login steps
    Given Goes to Admin login page
    Then Login with "humeyra.uysal.admin@heallifehospital.com" and "heallife123" datas
    Then Click on the " Pharmacy" link

  Scenario: When you click on the Pharmacy link on the Dashboard sidebar, it should redirect to the relevant page.

  Given Verify that browser redirect to Pharmacy page.

  Scenario: The Pharmacy Bill List on the Pharmacy page should have the headings (Bill No, Case ID/Patient ID, Date, Patient Name, Doctor Name, Discount($), Amount($), Paid Amount($), Balance Amount($)).

    Given Verify that The Pharmacy Bill List on the Pharmacy page have the heading Bill No
 Then Verify that The Pharmacy Bill List on the Pharmacy page have the heading Case ID Patient ID
 Then Verify that The Pharmacy Bill List on the Pharmacy page have the heading Date
  Then Verify that The Pharmacy Bill List on the Pharmacy page have the heading Patient Name.
  Then Verify that The Pharmacy Bill List on the Pharmacy page have the heading Doctor Name.
  Then Verify that The Pharmacy Bill List on the Pharmacy page have the heading Discount.
  Then Verify that The Pharmacy Bill List on the Pharmacy page have the heading Amount.
  Then Verify that The Pharmacy Bill List on the Pharmacy page have the heading Paid Amount.
  Then Verify that The Pharmacy Bill List on the Pharmacy page have the heading Balance Amount.


  Scenario: It should be possible to sort through the titles in the Pharmacy Bill List on the Pharmacy page.


  Scenario: In order to search the Pharmacy Bill List on the Pharmacy page, the page must have a searchBox.

  Scenario: An invoice should be created by going to the Generate Bill page from the Pharmacy page (by entering the
  correct information in Medicine Category, Medicine Name, Batch No, Expiry Date, Quantity/Available Qty, Sale Price($),
  Tax Amount($)).