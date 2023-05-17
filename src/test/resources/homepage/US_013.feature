

Feature:US_013  As a user, I would like a gallery page with pictures of the hospital to get a closer look and get to know the hospital better.

Background: common steps

    Given Launch browser.
    Then Go to "homepageUrl"
    Then Gallery button clicks

    Scenario: TC_01 There should be a redirect from the main page to the Gallery page.

         And Goes to the gallery page




    Scenario: TC_02 Gallery page (Health & Wellness,Hospitals and Directions,Specialties,Recreation Centre,Your Health,There should be pictures divided into surgery sections.

         And Gallery page displays reserved pictures about hospital and health
         And The browser is closed
