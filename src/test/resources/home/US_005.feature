Feature: US_005 As a user, I would like to have the "Featured Services" section of the hospital on the home page of the site.

  Background: common steps
    * Launch browser.
    * Go to "homepageUrl"


  Scenario: TC_01 Verify that the text "Featured Services" is visible on the main page.

    Then  Sayfayi kaydir
    Then  Verify the Featured Services  is visible.
    And   Close browser

  Scenario: TC_02 Verify that the Medical Treatment, Emergency Help, Qualified Doctors, Medical professionals information boards are visible

    Then  Sayfayi kaydir
    Then  Verify the Medical Treatment board  is visible
    And   1 saniye bekle
    Then  Verify the Emergency Help board  is visible
    And   1 saniye bekle
    Then  Verify the Qualified Doctors  board  is visible
    And   1 saniye bekle
    Then  Verify the Medical professionals information board is visible
    And   Close browser