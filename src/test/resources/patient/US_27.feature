Feature: US_27 As a user (patient) I would like to have the Radiology page on my Dashboard so that I can access my Radiology test results and complete the process.
  Background: common steps
    * Navigate to "homepageUrl"
    * Login to user page as "ayse.busra.pehlivan" "heallife123"
    * Click on the Radiology linkk


  Scenario: TC_01 The Dashboard sidebar should have the Radiology menu title and when clicked it should redirect to the "radiology" page
    And Verify that "Radiology Test Reports" are displayed




  Scenario: TC_02 On the Radiology page, the Radiology Test Reports List should have the headings (Bill No, Case ID, Reporting Date, Reference Doctor, Note, Amount($), Paid Amount($), Balance Amount($), Action).
    And  Verify that "Bill No, Case ID, Date, Doctor Name, Note, Amount($), Paid Amount($), Balance Amount($), Action)" in the Pharmacy Bill List are displayed
    And  Quit the page


  Scenario: TC_03 In order to search the Radiology Test Reports List, it must have a searchTextBox and it should search correctly.

    Then Click the "search box"
    Then Enter the excisting Radiology Bill
    And It is verified that filttering is done by entering the bill number in the Search Box.
    And  Quit the page


  Scenario: TC_04 It should be possible to sort the list according to the titles in the Radiology Test Reports List
    Then It is verified that the headings are sorted by clicking on them.
    And  Quit the page


  Scenario: TC_05 Under the Action title in the Radiology Test Reports List (View Payments, View Reports and Pay), operations should be possible

    Then Click the View payments.
    Then The visibility of the amount text is verified
    Then close the screen
    Then Click the show button.
    Then Name text (ayse.busra.pehlıvan) should visible
    Then wait 5 seconds
    Then close the screenn
    Then wait 3 seconds
    Then Click the pay button.
    Then the amount paid is entered.
    And Click the add button.
    Then wait 3 seconds
    And Click the pay with card.
    Given e-mail, card number, date and cvc code are entered
    Then The visibility of the success text is verified
    And  Close the page

