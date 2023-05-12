Feature: US_005 As a user, I would like to have the "Featured Services" section of the hospital on the home page of the site.
  @US005
  Scenario: TC_01 Verify that the text "Featured Services" is visible on the main page.

    Given User goes to home page
    Then  Verify "the Featured Services"  is displayed.
    And   Close the page

  Scenario: TC-02 Verify that the Medical Treatment, Emergency Help, Qualified Doctors, Medical professionals information boards are displayed

    Given User goes to home page
    Then  Verify the Medical Treatment board  is displayed

  Scenario: TC-02 Verify that the Medical Treatment, Emergency Help, Qualified Doctors, Medical professionals information boards are displayed
    Then  Verify the Emergency Help board  is displayed
  Scenario: TC-02 Verify that the Medical Treatment, Emergency Help, Qualified Doctors, Medical professionals information boards are displayed
    Then  Verify the Qualified Doctors  board  is displayed
  Scenario: TC-02 Verify that the Medical Treatment, Emergency Help, Qualified Doctors, Medical professionals information boards are displayed
    Then  Verify the Medical professionals board  is displayed
    And   Close the page