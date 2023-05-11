@US038
Feature: US_038 As an admin I would like to have a page in the dashboard sidebar to manage billing.

  Scenario: TC_01 Clicking on the Billing link on the Dashboard sidebar should lead to the relevant page.

    Given Goes to Admin login page
    Then Login with "ahmet.yazicioglu.admin@heallifehospital.com" and "heallife123" datas
    Then Click on the " Billing" link
    Then Verified redirected to Billing page

  Scenario: