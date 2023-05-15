@wip

Feature: US_026 The Dashboard sidebar should have the Pathology menu title and when clicked it should redirect to the "pathology" page
  Background: common steps
    * Navigate to "homepageUrl"
    * Login to user page as "ayse.busra.pehlivan" "heallife123"
    * Click on the "Pathology" linkkk


  Scenario: TC_01 The Dashboard sidebar should have the Pathology menu title and when clicked it should redirect to the "pathology" page
    And Verified redirected to Pathology page



  Scenario: TC_02 The Pathology page should have the headings (Bill No, Case ID,  DateReporting, Reference Doctor, Note, Amount($), Paid Amount($). Balance Amount($), Action) in the Pathology Test Reports List.
    And Verify that "Bill No, Case ID / Patient ID, Reporting Date, Reference Doctor, Note, Amount ($), Paid Amount ($), Balance Amount ($), Action" in the Pathology Bill List are displayed



  Scenario: TC_03:In order to search the Pathology Test Reports List, it must have a searchTextBox and it should search correctly.
    Then Click the "search box"
    Then Enter the excistingg "Pathology Bill"
    And It is verified that filtering is done by entering the bill number in the Search Boxx.



  Scenario: TC_04 It should be possible to sort the list according to the titles in the Pathology Test Reports List
    Then It is verified that the headings are sorted by clickingg on them.



  Scenario: TC_05 It should be possible to perform operations (View Payments, View Reports and Pay) under the Action title in the Pathology Test Reports List.

    Then Click the View payments.
    Then The visibility of the amount text is verifiedd
    Then close the screennn
    Then Click the View reports.
    Then Name text (ayse.busra.pehlıvan 338) should visible
    Then wait 5 seconds
    Then close the screennnn
    Then wait 3 seconds
    Then Click the Pathology pay button.
    Then wait 3 seconds
    And Click the pay with cardd.
    Given e-mail, card number, date and cvc code are enteredd
    Then The visibility of the success text is verified




