Feature: As an administrator (admin), I would like to have a page in
  the dashboard sidebar to see IPD patients (with their details) and add new patients.

  Scenario: When you click on the IPD link on the Dashboard sidebar, it should redirect to the relevant page.

    Given go to home page
    Then Login with "said.ozkan.admin@heallifehospital.com" and "heallife123" datas
    And Click on the " IPD" link
    And user should be able to on the IPD page
    And user should be able to on the IPD page

    Scenario: