Feature: US037 I want to have a dashboard sidebar with menus in the Admin panel


  Background: Admin login

    Given  Gerekli url 'yi girer
    And  Admin Login sayfasında gecerli username  ve password girer

  Scenario: TC001 The title of the sidebar in the admin panel should be dashboard and when clicked it should refresh the admin panel

    Given Enter "Mustafa Culha" into Search Box
    And Click on Dashboard
    Then it is verify that "mustafa culha" is not written in the searchbox
    Then Click on User Image
    And Click on Logout

  Scenario: TC002 There should be page links in the Dashboard sidebar

    Given It is verified that there are page links in the Dashboard sidebar
      | Billing              |
      | Appointment          |
      | OPD                  |
      | IPD                  |
      | Pharmacy             |
      | Pathology            |
      | Radiology            |
      | Blood Bank           |
      | Ambulance            |
      | Front Office         |
      | Birth & Death Record |
      | Human Resource       |
      | TPA Management       |
      | Finance              |
    Then Click on User Image
    And Click on Logout


