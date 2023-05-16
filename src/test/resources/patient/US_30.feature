@US030
Feature:US 30 OPD, IPD, Pharmacy, Pathology, Radiology, Blood Bank, Ambulance summary information boards should be visible
  in the header section of the Dashboard page and when clicked, it should lead to the relevant page.

  Background: common steps
    * Navigate to "homepageUrl"
    * Login to user page as "ayse.busra.pehlivan" "heallife123"
    * Click on the Dashboard linkk


  Scenario: TC_01 The OPD, IPD, Pharmacy, Pathology, Radiology, Blood Bank, Ambulance summary information boards should be visible in the header section of the Dashboard page and when clicked, it should lead to the relevant page.
    And Verify that OPD,OPD, IPD, Pharmacy, Pathology, Radiology, Blood Bank, Ambulance are visible
    Then Verify that OPD, IPD, Blood Bank, Ambulance are clikable
    Then  Verify that Pharmacy, Pathology, Radiology are clikable

  Scenario: TC_02 In the Dashboard body section, a chart should be created by using the OPD, IPD, Pharmacy, Pathology, Radiology, Blood Bank, Ambulance values in the Medical History chart.




  Scenario: TC_03 In the Dashboard body section, a chart should be created by using the OPD, IPD, Pharmacy, Pathology, Radiology, Blood Bank, Ambulance values in the Medical History chart.
    And Verify that Medical History Chart is visible
    And Verify that Top10Findings Chart is visible
    And Verify that Top10Symptoms Chart is visible
