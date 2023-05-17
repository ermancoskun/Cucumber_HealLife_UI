
  Feature: US_012 As a user, I would like there to be an 'About Us' menu to access information about the hospital.


    Scenario: TC_01 There should be a redirect from the main page to About Us pages.
      Given User goes to the home page
      Then Verify that About Us is visible
      Then Verify that About Hospitals, Meet Our Doctors, FAQs, Departments, Testimonials are accessible
      And Close the web browser


    Scenario: TC_02 Some Words About Us on the About Hospital page,There should be "Our Mission" titles and "OPENIN HOURS" information
      Given User goes to the home page
      Then Navigate to the About Us is menu
      Then Click the About Hospitals button
      Then Verify that Some Words About Us is displayed
      Then Verify that Our Mission is displayed
      Then Verify that OPENIN HOURS is displayed
      And Close the web browser


     Scenario: TC_03 Doctors under the title Our Specialist on the About Hospital page (Heidi Prather,Alexander M.simotas,Jesse N.Charnoff,George Cyril) should be displayed with their names and titles.
       Given User goes to the home page
       Then Navigate to the About Us is menu
       Then Click the About Hospitals button
       Then Verify that name and title of the doctors are displayed
       And Close the web browser


     Scenario: TC_04 Units and doctors working in those units (with their names, pictures and titles) should be displayed on the Meet Our Doctor page.
       Given User goes to the home page
       Then Navigate to the About Us is menu
       Then Click the Meet Our Doctors button
       Then Verify that name, picture and title of the General Practitioner doctors are displayed
       Then Click the Ophthalmologist button
       Then Verify that name, picture and title of the Ophthalmologist doctors are displayed
       Then Click the Paediatrician button
       Then Verify that name, picture and title of the Paediatrician doctors are displayed
       Then Click the Cardiologist button
       Then Verify that name, picture and title of the Cardiologist doctors are displayed
       Then Click the Gynaecologist button
       Then Verify that name, picture and title of the Gynaecologist doctors are displayed
       Then Click the Neurologist button
       Then Verify that name, picture and title of the Neurologist doctors are displayed
       And Close the web browser


     Scenario: TC_05 On the FAQ's page, there should be two windows named "What Our Clients Say" and "What Our Doctor Say".
       Given User goes to the home page
       Then Navigate to the About Us is menu
       Then Click the FAQs button
       Then Verify that What Our Clients Say script is displayed
       Then Verify that What Our Doctor Say script is displayed
       And Close the web browser


     Scenario: TC_06 On the FAQ's page, there should be related questions in the "What Our Clients Say" and "What Our Doctor Say" windows, and when you click on them, the answers should be displayed.
       Given User goes to the home page
       Then Navigate to the About Us is menu
       Then Click the FAQs button
       Then Click the If my family is accompanying me, where can they stay? button
       Then Verify that If my family is accompanying me, where can they stay? script is displayed
       Then Click the How do I obtain my visa? button
       Then Verify that How do I obtain my visa? script is displayed
       Then Click the Do I have the option of treatment by a female doctor? button
       Then Verify that Do I have the option of treatment by a female doctor? script is displayed
       Then Click the Are there any charges for the services provided by the International Relations Office? button
       Then Verify that Are there any charges for the services provided by the International Relations Office? script is displayed
       Then Click the Which services must be paid up front? button
       Then Verify that Which services must be paid up front? script is displayed
       Then Click the How should I send my medical documents? button
       Then Verify that How should I send my medical documents? script is displayed
       Then Click the How do I schedule an appointment? button
       Then Verify that How do I schedule an appointment? script is displayed
       Then Click the I do not speak English, will I be provided with translation services? button
       Then Verify that I do not speak English, will I be provided with translation services? script is displayed
       Then Click the Will my insurance cover the cost of services button
       Then Verify that Will my insurance cover the cost of services script is displayed
       And Close the web browser


     Scenario: TC_07 On the Departments page, the departments in our hospital (with the title image and small description text) should be displayed.
       Given User goes to the home page
       Then Navigate to the About Us is menu
       Then Click the Departments button
       Then Verify that images and scipts of the body is displayed
       And Close the web browser


     Scenario: TC_08 On the Testimonials page, people who have been treated in our hospital (Norman,Jessica,nyisha,Robert,Ganesh,James) comments (with pictures) should be displayed.
       Given User goes to the home page
       Then Navigate to the About Us is menu
       Then Click the Testimonials button
       Then Verify that images and scipts of the Testimonials body is displayed
       And Close the web browser
