Feature:US_013  As a user, I would like a gallery page with pictures of the hospital to get a closer look and get to know the hospital better.

Background: common steps

    Given  Launch browser
    Then Go to "homepageUrl"
    Then Gallery button clicks

    Scenario: TC_01 There should be a redirect from the main page to the Gallery page.

         And Goes to the gallery page
         And The browser is closed



