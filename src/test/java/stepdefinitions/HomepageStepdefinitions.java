package stepdefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import java.util.List;

import pages.AdminPage;

import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import java.util.List;
import java.util.Random;

public class HomepageStepdefinitions {//
    HomePage homepage=new HomePage();
    Actions actions=new Actions(Driver.getDriver());


    @Given("go to home page")
    public void goToHomePage() {
        Driver.getDriver().get("https://qa.heallifehospital.com/");

    }

    @Then("the photo confirms that their name and title appear as Professor")
    public void ThePhotoConfirmsThatTheirNameAndTitleAppearAsProfessor(List<String> isim) {

        int expectedSize = 6;
        int actualSize = homepage.ourDoctorsPicturesCount();
        Assert.assertEquals(expectedSize, actualSize);

        for (int i = 0; i < isim.size(); i++) {
            Assert.assertEquals(isim.get(i), homepage.ourDoctorsIsim.get(i).getText());
            Assert.assertEquals("Professor", homepage.ourDoctorsUnvan.get(i).getText());
        }
    }


    @Given("Launch browser")
    public void launchBrowser() {
        Driver.getDriver();

    }

    @Then("Go to {string}")
    public void goTo(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @And("Go to the home page footer section.")
    public void goToTheHomePageFooterSection() {
        actions.sendKeys(Keys.END).perform();
    }

    @And("Verify that the complain button and icon are visible.")
    public void verifyThatTheComplainButtonAndIconAreVisible() {
        Assert.assertTrue("Complain icon are not visible", homepage.complainIcon.isDisplayed());
        Assert.assertTrue("Complain button are not visible", homepage.complainButton.isDisplayed());
        Assert.assertTrue("Complain icon are not clickable", homepage.complainIcon.isEnabled());
        Assert.assertTrue("Complain button are not clickable", homepage.complainButton.isEnabled());
    }

    @And("Close browser")

    public void closeBrowser() {
        Driver.closeDriver();

    }

    @And("Click on the complainIcon")
    public void clickOnTheComplainIcon() {
        homepage.complainButton.click();
    }

    @And("Verify that it redirects to the {string} page.")
    public void verifyThatItRedirectsToThePage(String url) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = ConfigReader.getProperty(url);

        Assert.assertEquals("The 'Complain' button on the homepage does not redirect to the complain page.", expectedUrl, actualUrl);

        Assert.assertEquals("Does not redirect to the relevant page",expectedUrl,actualUrl);

    }

    //////////////////////////////////////////////////////////////////////////////////////////////////


    @Given("User goes to the home page")
    public void user_goes_to_the_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("homePageUrl"));
    }

    @Then("Verify that the URL of the website is correct")
    public void verify_that_the_url_of_the_website_is_correct() {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = ConfigReader.getProperty("homePageUrl");
        Assert.assertEquals("The Url of the home page is correct", expectedUrl, actualUrl);
    }

    @Then("Close the web browser")
    public void close_the_web_browser() {
        Driver.closeDriver();
    }

    @Then("Verify that home page is visible")
    public void verify_that_home_page_is_visible() {
        ReusableMethods.bekle(1);
        Assert.assertTrue("Home page is visible", homepage.MainBanner.isDisplayed());
    }

    @Then("Click the Appointment Button")
    public void click_the_appointment_button() {
        ReusableMethods.bekle(1);
        homepage.appointmentButton.click();

    }

    @Then("Verify that the URL of the Appointment page is correct")
    public void verify_that_the_url_of_the_appointment_page_is_correct() {
        ReusableMethods.bekle(1);
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = ConfigReader.getProperty("appointmentPageUrl");
        Assert.assertEquals("The Url of the Appointment page is correct", expectedUrl, actualUrl);

    }

    @Then("Verify that Specialist, Doctor, Shift and Date are selectable")
    public void verifyThatSpecialistDoctorShiftAndDateAreSelectable() {
        ReusableMethods.bekle(2);
        homepage.specialistDropdown.click();
        homepage.gastroenterologistsDropdown.click();

        homepage.doctorDropdown.click();
        homepage.doctorErman.click();

        ReusableMethods.bekle(2);
        homepage.selectDropdown.click();
        homepage.selectDropdownEvening.click();

        //homepage.dateAppointment.clear();
        //homepage.dateAppointment.sendKeys("22.05.2023");
        Assert.assertTrue(homepage.specialistDropdown.isDisplayed());
        Assert.assertTrue(homepage.doctorDropdown.isDisplayed());
        Assert.assertTrue(homepage.selectDropdown.isDisplayed());
        Assert.assertTrue(homepage.dateAppointment.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @Then("Select the Specialist, Doctor, Shift and Date")
    public void selectTheSpecialistDoctorShiftAndDate() {
        ReusableMethods.bekle(2);
        homepage.specialistDropdown.click();
        homepage.gastroenterologistsDropdown.click();

        homepage.doctorDropdown.click();
        homepage.doctorErman.click();

        ReusableMethods.bekle(2);
        homepage.selectDropdown.click();
        homepage.selectDropdownEvening.click();
        ReusableMethods.bekle(3);
        homepage.dateAppointment.clear();
        homepage.dateAppointment.sendKeys("19.05.2023"+Keys.ENTER);
        ReusableMethods.bekle(1);
    }

    @Then("Verify that Slots are suitable")
    public void verifyThatSlotsAreSuitable() {
        Assert.assertTrue(homepage.slots.isDisplayed());
    }

    @Then("Select the time slot")
    public void selectTheTimeSlot() {
        homepage.slots.click();
        ReusableMethods.bekle(1);
    }

    @Then("Select the time and submit")
    public void selectTheTimeAndSubmit() {
        homepage.slotsTime.click();
        ReusableMethods.bekle(1);
        homepage.slotsSubmit.click();
        ReusableMethods.bekle(2);
    }

    @Then("Verify that The Message field is required script is visible")
    public void verifyThatTheMessageFieldIsRequiredScriptIsVisible() {
        Assert.assertTrue(homepage.messageScript.isDisplayed());
        ReusableMethods.bekle(2);
    }


    @Then("Fill in the Message Box")
    public void fillInTheMessageBox() {
        homepage.userMessageBox.sendKeys(ConfigReader.getProperty("userName"));
        ReusableMethods.bekle(2);

    }

    @Then("Verify that Patient Name, Email and Phone can be entered")
    public void verifyThatPatientNameEmailAndPhoneCanBeEntered() {
        ReusableMethods.bekle(2);
        homepage.userPatientName.sendKeys(ConfigReader.getProperty("userName"));
        homepage.userPatientMail.sendKeys(ConfigReader.getProperty("userTempMail"));
        homepage.userPatientPhone.sendKeys(ConfigReader.getProperty("userPhone"));
        ReusableMethods.bekle(2);
        Assert.assertTrue(homepage.userPatientName.isDisplayed());
        Assert.assertTrue(homepage.userPatientMail.isDisplayed());
        Assert.assertTrue(homepage.userPatientPhone.isDisplayed());
    }

    @Then("Select the time in the Slots Available frame")
    public void selectTheTimeInTheSlotsAvailableFrame() {
        homepage.slotsTime.click();
        ReusableMethods.bekle(1);
    }

    @Then("Click the Old Patient button")
    public void clickTheOldPatientButton() {
        homepage.userOldPatientButton.click();
        ReusableMethods.bekle(1);
    }

    @Then("Enter the Username and Password and submit")
    public void enterTheUsernameAndPasswordAndSubmit() {
        homepage.usernameBox.sendKeys(ConfigReader.getProperty("userLoginId"));
        homepage.usernamePasswordBox.sendKeys(ConfigReader.getProperty("userLoginPassword"));
        homepage.usernameSubmitButton.click();
        ReusableMethods.bekle(15);
    }

    @Then("Click the Pay button in the Dashboard page")
    public void clickThePayButtonInTheDashboardPage() {

    }

    @Then("Click the Pay with Card button")
    public void clickThePayWithCardButton() {

    }

    @Then("Enter the payment details and click the Pay button")
    public void enterThePaymentDetailsAndClickThePayButton() {

    }

    @Then("Verify that Your Online Appointment Fees Is Successfully Submitted script is visible")
    public void verifyThatYourOnlineAppointmentFeesIsSuccessfullySubmittedScriptIsVisible() {

    }

    @Then("Click the Go To Home Button")
    public void clickTheGoToHomeButton() {
    }


    @Then("Verify that Dashboard is visible")
    public void verifyThatDashboardIsVisible() {
        
    }

    @Then("Enter the Patient Name, Email and Phone select the Gender and submit")
    public void enterThePatientNameEmailAndPhoneSelectTheGenderAndSubmit() {
        
    }

    @Then("Verify that About Us is visible")
    public void verifyThatAboutUsIsVisible() {
        Assert.assertTrue(homepage.aboutUsButton.isDisplayed());

        
    }

    @Then("Verify that About Hospitals, Meet Our Doctors, FAQs, Departments, Testimonials are accessible")
    public void verifyThatAboutHospitalsMeetOurDoctorsFAQsDepartmentsTestimonialsAreAccessible() {
        homepage.aboutUsButton.click();
        homepage.aboutHospitals.click();
        ReusableMethods.bekle(1);
        String actualAboutHospitalsUrl = Driver.getDriver().getCurrentUrl();
        String expectedAboutHospitalsUrl = ConfigReader.getProperty("aboutHospitalsUrl");
        Assert.assertEquals("The Url of the About Hospitals page is correct", expectedAboutHospitalsUrl, actualAboutHospitalsUrl);

        homepage.aboutUsButton.click();
        homepage.meetOurDoctors.click();
        ReusableMethods.bekle(1);
        String actualMeetOurDoctorsUrl = Driver.getDriver().getCurrentUrl();
        String expectedMeetOurDoctorsUrl = ConfigReader.getProperty("meetOurDoctorsUrl");
        Assert.assertEquals("The Url of the Meet Our Doctors page is correct", expectedMeetOurDoctorsUrl,actualMeetOurDoctorsUrl);

        homepage.aboutUsButton.click();
        homepage.faqs.click();
        ReusableMethods.bekle(1);
        String actualFaqsUrl = Driver.getDriver().getCurrentUrl();
        String expectedFaqsUrl = ConfigReader.getProperty("faqsUrl");
        Assert.assertEquals("The Url of the FAQs page is correct", expectedFaqsUrl,actualFaqsUrl);

        homepage.aboutUsButton.click();
        homepage.departments.click();
        ReusableMethods.bekle(1);
        String actualDepartmentsUrl = Driver.getDriver().getCurrentUrl();
        String expectedDepartmentsUrl = ConfigReader.getProperty("departmentsUrl");
        Assert.assertEquals("The Url of the Departments page is correct", expectedDepartmentsUrl,actualDepartmentsUrl);

        homepage.aboutUsButton.click();
        homepage.testimonials.click();
        ReusableMethods.bekle(1);
        String actualTestimonialsUrl = Driver.getDriver().getCurrentUrl();
        String expectedTestimonialsUrl = ConfigReader.getProperty("testimonialsUrl");
        Assert.assertEquals("The Url of the Testimonials page is correct", expectedTestimonialsUrl,actualTestimonialsUrl);

    }

    @Then("Navigate to the About Us is menu")
    public void navigateToTheAboutUsIsMenu() {
        homepage.aboutUsButton.click();
    }

    @Then("Click the About Hospitals button")
    public void clickTheAboutHospitalsButton() {
        homepage.aboutHospitals.click();
        ReusableMethods.bekle(1);
    }

    @Then("Verify that Some Words About Us is displayed")
    public void verifyThatSomeWordsAboutUsIsDisplayed() {
        Assert.assertTrue(homepage.someWordsAboutUs.isDisplayed());

    }

    @Then("Verify that Our Mission is displayed")
    public void verifyThatOurMissionIsDisplayed() {
        Assert.assertTrue(homepage.ourMission.isDisplayed());
    }

    @Then("Verify that OPENIN HOURS is displayed")
    public void verifyThatOPENINHOURSIsDisplayed() {
        Assert.assertTrue(homepage.openingOurs.isDisplayed());
    }

    @Then("Verify that name and title of the doctors are displayed")
    public void verifyThatNameAndTitleOfTheDoctorsAreDisplayed() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(homepage.doctorHeidiImage.isDisplayed());
        Assert.assertTrue(homepage.doctorHeidiName.isDisplayed());
        Assert.assertTrue(homepage.doctorHeidiTitle.isDisplayed());
        Assert.assertTrue(homepage.doctorAlexanderImage.isDisplayed());
        Assert.assertTrue(homepage.doctorAlexanderName.isDisplayed());
        Assert.assertTrue(homepage.doctorAlexanderTitle.isDisplayed());
    }

    @Then("Click the Meet Our Doctors button")
    public void clickTheMeetOurDoctorsButton() {
        ReusableMethods.bekle(1);
        homepage.meetOurDoctors.click();
        ReusableMethods.bekle(1);
    }

    @Then("Verify that name, picture and title of the General Practitioner doctors are displayed")
    public void verifyThatNamePictureAndTitleOfTheGeneralPractitionerDoctorsAreDisplayed() {
        Assert.assertTrue(homepage.doctorRachelImage.isDisplayed());
        Assert.assertTrue(homepage.doctorRachelName.isDisplayed());
        Assert.assertTrue(homepage.doctorRachelTitle.isDisplayed());

        Assert.assertTrue(homepage.doctorSarahImage.isDisplayed());
        Assert.assertTrue(homepage.doctorSarahName.isDisplayed());
        Assert.assertTrue(homepage.doctorSarahTitle.isDisplayed());

    }

    @Then("Click the Ophthalmologist button")
    public void clickTheOphthalmologistButton() {
        homepage.ophthalmologist.click();
        ReusableMethods.bekle(1);
    }

    @Then("Verify that name, picture and title of the Ophthalmologist doctors are displayed")
    public void verifyThatNamePictureAndTitleOfTheOphthalmologistDoctorsAreDisplayed() {
        Assert.assertTrue(homepage.doctorLeeImage.isDisplayed());
        Assert.assertTrue(homepage.doctorLeeName.isDisplayed());
        Assert.assertTrue(homepage.doctorLeeTitle.isDisplayed());
    }

    @Then("Click the Paediatrician button")
    public void clickThePaediatricianButton() {
        homepage.paediatrician.click();
        ReusableMethods.bekle(1);
    }

    @Then("Verify that name, picture and title of the Paediatrician doctors are displayed")
    public void verifyThatNamePictureAndTitleOfThePaediatricianDoctorsAreDisplayed() {
        Assert.assertTrue(homepage.doctorAnneImage.isDisplayed());
        Assert.assertTrue(homepage.doctorAnnaName.isDisplayed());
        Assert.assertTrue(homepage.doctorAnnaTitle.isDisplayed());



        ///////////////////////////////////////


    }






    @Then("The browser is closed")
    public void the_browser_is_closed () {

        Driver.closeDriver();

    }

    @Then("Gallery button clicks")
    public void gallery_button_clicks() {

        homepage.GalleryButton.click();
    }

    @Then("Goes to the gallery page")
    public void goes_to_the_gallery_page() {

        Assert.assertTrue(homepage.GalleryxLabel.isDisplayed());
    }

        @Then("Gallery page displays reserved pictures about hospital and health")
    public void gallery_page_displays_reserved_pictures_about_hospital_and_health() {

        List<WebElement>galleryList=Driver.getDriver().findElements(By.xpath("//*[@id='postList']"));
            Random random = new Random();
            int sayi = random.nextInt(galleryList.size())+1;

                    WebElement gallery=Driver.getDriver().findElement(By.xpath("(//h3)["+sayi+"]"));
                    Assert.assertTrue(gallery.isDisplayed());
                    String expGalleryText=gallery.getText();
                    gallery.click();
                    WebElement actTitle=Driver.getDriver().findElement(By.xpath("(//h1)[1]"));
                    Assert.assertTrue(expGalleryText.contains(actTitle.getText()));





                }



    //============================================ Nesibe [US_005] Feauture Boards =====================================

    @Given("User goes to home page")
    public void user_goes_to_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("heallifeUrl"));
        ReusableMethods.bekle(5);
    }

    @Then("Verify {string}  is displayed.")
    public void verify_is_displayed(String expectedBoard) {
        expectedBoard = "Featured Services";
    }

    @Then("Verify the Featured Services  is visible.")
    public void verifyIsTheFeaturedServicesVisible() {
        String expectedBoard = "Featured Services";

        String actualBoard = homepage.feautureServicesBoard.getText();
        Assert.assertTrue(actualBoard.contains(expectedBoard));
        ReusableMethods.bekle(5);
    }

    @And("Close the page")
    public void closeThePage() {
        Driver.closeDriver();
    }


    @Then("Sayfayi kaydir")
    public void sayfayiKaydir() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @And("1 saniye bekle")
    public void saniyeBekle() {
        ReusableMethods.bekle(1);
    }

    @Then("Verify the Emergency Help board  is visible")
    public void verifyTheEmergencyHelpBoardIsVisible() {
        String expectedText = "Emergency Help";
        String actualText = homepage.emergencyHelpBoard.getText();
        Assert.assertTrue(actualText.contains(expectedText));
        Assert.assertTrue("Emergency Help board is not visible",homepage.emergencyHelpBoard.isDisplayed());
    }

    @Then("Verify the Medical Treatment board  is visible")
    public void verifyTheMedicalTreatmentBoardIsVisible() {
        String expectedText = "Medical Treatment";
        String actualText = homepage.nurseResidentBoard.getText();
        Assert.assertTrue("Medical Treatment board is not visible", actualText.contains(expectedText));
    }



    @Then("Verify the Qualified Doctors  board  is visible")
    public void verifyTheQualifiedDoctorsBoardIsVisible() {
        String expectedText = "Qualified Doctors";
        String actualText = homepage.onsiteMedicalStaffBoard.getText();
        Assert.assertTrue("Qualified Doctors board is not visible", actualText.contains(expectedText));
    }

    @Then("Verify the Medical professionals information board is visible")
    public void verifyTheMedicalProfessionalsInformationBoardIsVisible() {
        String expectedText = "Medical professionals";
        String actualText = homepage.comunicationAllPartBoard.getText();
        Assert.assertTrue("Medical professionals board is not visible", actualText.contains(expectedText));
    }

    //============================================ Nesibe [US_005] Feauture Boards End ================================================


  //********Humeyra**********
  @Given("Go to url")
  public void goToUrl() {

      Driver.getDriver().get(ConfigReader.getProperty("healLife"));
  }

    @Then("Verify that Home page title is visible in the home page bottom bar.")
    public void verifyThatHomePageTitleIsVisibleInTheHomePageBottomBar() {
        actions.sendKeys(Keys.END);
        ReusableMethods.bekle(2);
        Assert.assertTrue(homepage.bottomHomeLink.isDisplayed());


    }

    @Then("Verify that Academics page title is visible in the home page bottom bar.")
    public void verifyThatAcademicsPageTitleIsVisibleInTheHomePageBottomBar() {
        actions.scrollToElement(homepage.bottomAcademicsLink);
        ReusableMethods.bekle(2);
        Assert.assertTrue(homepage.bottomAcademicsLink.isDisplayed());
    }

    @Then("Verify that  Gallery page title is visible in the home page bottom bar.")
    public void verifyThatGalleryPageTitleIsVisibleInTheHomePageBottomBar() {
        actions.scrollToElement(homepage.bottomAcademicsLink);
        ReusableMethods.bekle(2);
        Assert.assertTrue(homepage.bottomAcademicsLink.isDisplayed());
    }

    @Then("Verify that  About page title is visible in the home page bottom bar")
    public void verifyThatAboutPageTitleIsVisibleInTheHomePageBottomBar() {
        actions.scrollToElement(homepage.bottomAboutLink);
        ReusableMethods.bekle(2);
        Assert.assertTrue(homepage.bottomAboutLink.isDisplayed());
    }


    @Then("Verify that Contact US page title is visible in the home page bottom bar")
    public void verifyThatContactUSPageTitleIsVisibleInTheHomePageBottomBar() {
        actions.scrollToElement(homepage.bottomContactUsLink);
        ReusableMethods.bekle(2);
        Assert.assertTrue(homepage.bottomContactUsLink.isDisplayed());
    }


    @Then("Click Home title. Verify that browser redirects to the Home page.")
    public void clickHomeTitleVerifyThatBrowserRedirectsToTheHomePage() {
        homepage.bottomHomeLink.click();
        String expectedUrl="https://qa.heallifehospital.com/frontend";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);
    }

    @Then("Click Academics title.Verify that browser redirects to the Academics page.")
    public void clickAcademicsTitleVerifyThatBrowserRedirectsToTheAcademicsPage() {
        actions.sendKeys(Keys.END);
        homepage.bottomAcademicsLink.click();
        String expectedUrl="https://qa.heallifehospital.com/page/meet-our-doctors";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);
    }

    @Then("Click Gallery title.Verify that browser redirects to the  Gallery page.")
    public void clickGalleryTitleVerifyThatBrowserRedirectsToTheGalleryPage() {
        actions.scrollToElement(homepage.bottomGaleryLink);
        ReusableMethods.bekle(2);
        homepage.bottomGaleryLink.click();
        String expectedUrl="https://qa.heallifehospital.com/page/gallery";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);
    }

    @Then("Click About title.Verify that browser redirects to the About page.")
    public void clickAboutTitleVerifyThatBrowserRedirectsToTheAboutPage() {
        actions.sendKeys(Keys.END);
        homepage.bottomAboutLink.click();

        String expectedUrl = "https://qa.heallifehospital.com/page/about-hospitals";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);
    }

    @Then("Click Contact US title. Verify that browser redirects to the Contact US page.")
    public void clickContactUSTitleVerifyThatBrowserRedirectsToTheContactUSPage() {
        actions.sendKeys(Keys.END);
        homepage.bottomContactUsLink.click();
        String expectedUrl="https://qa.heallifehospital.com/page/contact-us";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);

    }


    @Given("User goes to {string}")
    public void userGoesTo(String url) {
        Driver.getDriver().get(url);
    }

    @Then("Testing that the Contact Us button is visible")
    public void testingThatTheContactUsButtonIsVisible() {
        Assert.assertTrue(homepage.navbarContactUs.isDisplayed());
    }


    @Then("Browser is closed")
    public void browser_is_closed() {
        //Driver.quitDriver();

    }

    @Then("User clicks contact us button")
    public void userClicksContactUsButton() {
        homepage.navbarContactUs.click();
    }

    @Given("User enters the text {string} in the Name text box")
    public void userEntersTheTextInTheNameTextBox(String data) {
        homepage.contactUsName.sendKeys(data);
    }

    @And("User enters the text {string} in the Email text box")
    public void userEntersTheTextInTheEmailTextBox(String data) {
        homepage.contactUsEmail.sendKeys(data);
    }

    @And("User enters the text {string} in the Subject text box")
    public void userEntersTheTextInTheSubjectTextBox(String data) {
        homepage.contactUsSubject.sendKeys(data);
    }

    @And("User enters the text {string} in the Description text box")
    public void userEntersTheTextInTheDescriptionTextBox(String data) {
        homepage.contactUsDescription.sendKeys(data);
    }

    @And("User is click on the submit button")
    public void userIsClickOnTheSubmitButton() {
        homepage.contactUsSubmitButton.click();
    }

    @And("Test that the form has been submitted successfully")
    public void testThatTheFormHasBeenSubmittedSuccessfully() {
        Assert.assertTrue(homepage.successfullyText.isDisplayed());
    }

    @Given("User is scroll to map")
    public void userIsScrollToMap() {
        ReusableMethods.scrollToElement(homepage.contactusMap);
    }

    @And("Harita kaydırılır")
    public void haritaKaydırılır() {
        Driver.getDriver().switchTo().frame(homepage.contactusMap);

        Actions actions = new Actions(Driver.getDriver());
        ReusableMethods.bekle(3);
        actions.keyDown(Keys.ARROW_DOWN).build().perform();
        ReusableMethods.bekle(4);

    }


    @Then("Test that the Name text box is visible")
    public void testThatTheNameTextBoxIsVisible() {
        Assert.assertTrue(homepage.contactUsName.isDisplayed());
    }

    @Given("Test that the Email text box is visible")
    public void testThatTheEmailTextBoxIsVisible() {
        Assert.assertTrue(homepage.contactUsEmail.isDisplayed());
    }

    @And("Test that the Subject text box is visible")
    public void testThatTheSubjectTextBoxIsVisible() {
        Assert.assertTrue(homepage.contactUsSubject.isDisplayed());
    }

    @And("Test that the Description text box is visible")
    public void testThatTheDescriptionTextBoxIsVisible() {
        Assert.assertTrue(homepage.contactUsDescription.isDisplayed());
    }

    @Then("Click the Cardiologist button")
    public void clickTheCardiologistButton() {
        homepage.cardiologist.click();
        ReusableMethods.bekle(1);
    }

    @Then("Verify that name, picture and title of the Cardiologist doctors are displayed")
    public void verifyThatNamePictureAndTitleOfTheCardiologistDoctorsAreDisplayed() {
        Assert.assertTrue(homepage.doctorMariaImage.isDisplayed());
        Assert.assertTrue(homepage.doctorMariaName.isDisplayed());
        Assert.assertTrue(homepage.doctorMariaTitle.isDisplayed());
    }

    @Then("Click the Gynaecologist button")
    public void clickTheGynaecologistButton() {
        homepage.gynaecologist.click();
        ReusableMethods.bekle(1);
    }

    @Then("Verify that name, picture and title of the Gynaecologist doctors are displayed")
    public void verifyThatNamePictureAndTitleOfTheGynaecologistDoctorsAreDisplayed() {
        Assert.assertTrue(homepage.doctorLauraImage.isDisplayed());
        Assert.assertTrue(homepage.doctorLauraName.isDisplayed());
        Assert.assertTrue(homepage.doctorLauraTitle.isDisplayed());
    }

    @Then("Click the Neurologist button")
    public void clickTheNeurologistButton() {
        homepage.neurologist.click();
        ReusableMethods.bekle(1);
    }

    @Then("Verify that name, picture and title of the Neurologist doctors are displayed")
    public void verifyThatNamePictureAndTitleOfTheNeurologistDoctorsAreDisplayed() {
        Assert.assertTrue(homepage.doctorJackImage.isDisplayed());
        Assert.assertTrue(homepage.doctorJackName.isDisplayed());
        Assert.assertTrue(homepage.doctorJackTitle.isDisplayed());
    }

    @Then("Click the FAQs button")
    public void clickTheFAQsButton() {
        homepage.faqs.click();
        ReusableMethods.bekle(2);
    }

    @Then("Verify that What Our Clients Say script is displayed")
    public void verifyThatWhatOurClientsSayScriptIsDisplayed() {
       Assert.assertTrue(homepage.leftScriptFaqs.isDisplayed());
    }

    @Then("Verify that What Our Doctor Say script is displayed")
    public void verifyThatWhatOurDoctorSayScriptIsDisplayed() {
        Assert.assertTrue(homepage.rightScriptFaqs.isDisplayed());
    }

    @Then("Click the If my family is accompanying me, where can they stay? button")
    public void clickTheIfMyFamilyIsAccompanyingMeWhereCanTheyStayButton() {
        homepage.firstScriptTitle.click();
        ReusableMethods.bekle(1);
    }

    @Then("Verify that If my family is accompanying me, where can they stay? script is displayed")
    public void verifyThatIfMyFamilyIsAccompanyingMeWhereCanTheyStayScriptIsDisplayed() {
        Assert.assertTrue(homepage.firstScriptBody.isDisplayed());
    }

    @Then("Click the How do I obtain my visa? button")
    public void clickTheHowDoIObtainMyVisaButton() {
        homepage.secondScriptTitle.click();
        ReusableMethods.bekle(1);
    }

    @Then("Verify that How do I obtain my visa? script is displayed")
    public void verifyThatHowDoIObtainMyVisaScriptIsDisplayed() {
        Assert.assertTrue(homepage.secondScriptBody.isDisplayed());
    }

    @Then("Click the Do I have the option of treatment by a female doctor? button")
    public void clickTheDoIHaveTheOptionOfTreatmentByAFemaleDoctorButton() {
        homepage.thirdScriptTitle.click();
        ReusableMethods.bekle(1);
    }

    @Then("Verify that Do I have the option of treatment by a female doctor? script is displayed")
    public void verifyThatDoIHaveTheOptionOfTreatmentByAFemaleDoctorScriptIsDisplayed() {
        Assert.assertTrue(homepage.thirdScriptBody.isDisplayed());
    }

    @Then("Click the Are there any charges for the services provided by the International Relations Office? button")
    public void clickTheAreThereAnyChargesForTheServicesProvidedByTheInternationalRelationsOfficeButton() {
        homepage.fourthScriptTitle.click();
        ReusableMethods.bekle(1);
    }

    @Then("Verify that Are there any charges for the services provided by the International Relations Office? script is displayed")
    public void verifyThatAreThereAnyChargesForTheServicesProvidedByTheInternationalRelationsOfficeScriptIsDisplayed() {
        Assert.assertTrue(homepage.fourthScriptBody.isDisplayed());
    }

    @Then("Click the Which services must be paid up front? button")
    public void clickTheWhichServicesMustBePaidUpFrontButton() {
        homepage.fifthScriptTitle.click();
        ReusableMethods.bekle(1);
    }

    @Then("Verify that Which services must be paid up front? script is displayed")
    public void verifyThatWhichServicesMustBePaidUpFrontScriptIsDisplayed() {
        Assert.assertTrue(homepage.fifthScriptBody.isDisplayed());
    }

    @Then("Click the How should I send my medical documents? button")
    public void clickTheHowShouldISendMyMedicalDocumentsButton() {
        homepage.sixthScriptTitle.click();
        ReusableMethods.bekle(1);
    }

    @Then("Verify that How should I send my medical documents? script is displayed")
    public void verifyThatHowShouldISendMyMedicalDocumentsScriptIsDisplayed() {
        Assert.assertTrue(homepage.sixthScriptBody.isDisplayed());
    }

    @Then("Click the How do I schedule an appointment? button")
    public void clickTheHowDoIScheduleAnAppointmentButton() {
        homepage.seventhScriptTitle.click();
        ReusableMethods.bekle(1);
    }

    @Then("Verify that How do I schedule an appointment? script is displayed")
    public void verifyThatHowDoIScheduleAnAppointmentScriptIsDisplayed() {
        Assert.assertTrue(homepage.seventhScriptBody.isDisplayed());
    }

    @Then("Click the I do not speak English, will I be provided with translation services? button")
    public void clickTheIDoNotSpeakEnglishWillIBeProvidedWithTranslationServicesButton() {
        homepage.eighthScriptTitle.click();
        ReusableMethods.bekle(1);
    }

    @Then("Verify that I do not speak English, will I be provided with translation services? script is displayed")
    public void verifyThatIDoNotSpeakEnglishWillIBeProvidedWithTranslationServicesScriptIsDisplayed() {
        Assert.assertTrue(homepage.eighthScriptBody.isDisplayed());
    }

    @Then("Click the Will my insurance cover the cost of services button")
    public void clickTheWillMyInsuranceCoverTheCostOfServicesButton() {
        homepage.ninethScriptTitle.click();
        ReusableMethods.bekle(1);
    }

    @Then("Verify that Will my insurance cover the cost of services script is displayed")
    public void verifyThatWillMyInsuranceCoverTheCostOfServicesScriptIsDisplayed() {
        Assert.assertTrue(homepage.ninethScriptBody.isDisplayed());
    }

    @Then("Click the Departments button")
    public void clickTheDepartmentsButton() {
        homepage.departments.click();
    }
    @Then("Verify that images and scipts of the body is displayed")
    public void verifyThatImagesAndSciptsOfTheBodyIsDisplayed() {
        Assert.assertTrue(homepage.departmentsFirstImg.isDisplayed());
        Assert.assertTrue(homepage.departmentsFirstScript.isDisplayed());
        Assert.assertTrue(homepage.departmentsSecondImg.isDisplayed());
        Assert.assertTrue(homepage.departmentsSecondBody.isDisplayed());
        Assert.assertTrue(homepage.departmentsThirdImg.isDisplayed());
        Assert.assertTrue(homepage.departmentsThirdBody.isDisplayed());

    }

    @Then("Click the Testimonials button")
    public void clickTheTestimonialsButton() {
        homepage.testimonials.click();
    }

    @Then("Verify that images and scipts of the Testimonials body is displayed")
    public void verifyThatImagesAndSciptsOfTheTestimonialsBodyIsDisplayed() {
        Assert.assertTrue(homepage.testimonialsRobertImg.isDisplayed());
        Assert.assertTrue(homepage.testimonialsRobertScript.isDisplayed());
    }

    @Then("Verify that Login Button is visible")
    public void verifyThatLoginButtonIsVisible() {
        Assert.assertTrue(homepage.homepageLoginButton.isDisplayed());
    }

    @Then("Click the Login button")
    public void clickTheLoginButton() {
        homepage.homepageLoginButton.click();
    }

    @Then("Verify that Login page is accessible")
    public void verifyThatLoginPageIsAccessible() {
        ReusableMethods.bekle(1);
        String actualLoginUrl = Driver.getDriver().getCurrentUrl();
        String expectedLoginUrl = ConfigReader.getProperty("userLoginUrl");
        Assert.assertEquals("The Url of the Login page is correct", expectedLoginUrl,actualLoginUrl);
    }

    @Then("Verify that Login window is visible")
    public void verifyThatLoginWindowIsVisible() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(homepage.loginWindow.isDisplayed());
    }

    @Then("Verify that information window is visible")
    public void verifyThatInformationWindowIsVisible() {
        Assert.assertTrue(homepage.infoWindow.isDisplayed());
    }

    @Then("Enter the excisting Username and Password and submit")
    public void enterTheExcistingUsernameAndPasswordAndSubmit() {
        ReusableMethods.waitForPageToLoad(10);
        homepage.userIdBox.sendKeys(ConfigReader.getProperty("userLoginId"));
        homepage.userPasswordBox.sendKeys(ConfigReader.getProperty("userLoginPassword"));
        homepage.userLoginSubmitButton.click();
    }

    @Then("Verify that user loginned correctly")
    public void verifyThatUserLoginnedCorrectly() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(homepage.dashboardSideBar.isDisplayed());
    }

    @Then("Enter the unregistered Username and Password and submit")
    public void enterTheUnregisteredUsernameAndPasswordAndSubmit() {
        ReusableMethods.waitForPageToLoad(10);
        homepage.userIdBox.sendKeys(ConfigReader.getProperty("unregisteredUserLoginId"));
        homepage.userPasswordBox.sendKeys(ConfigReader.getProperty("userLoginPassword"));
        homepage.userLoginSubmitButton.click();
    }

    @Then("Verify that Invalid Username or Password script is displayed")
    public void verifyThatInvalidUsernameOrPasswordScriptIsDisplayed() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(homepage.invalidUserScript.isDisplayed());
    }

    @Then("Click the Forget Password button")
    public void clickTheForgetPasswordButton() {
        homepage.forgotPasswordButton.click();
    }

    @Then("Verify that User Forget Password page is accessible")
    public void verifyThatUserForgetPasswordPageIsAccessible() {
        ReusableMethods.bekle(1);
        String actualUFPUrl = Driver.getDriver().getCurrentUrl();
        String expectedUFPUrl = ConfigReader.getProperty("userForgotPasswordPageUrl");
        Assert.assertEquals("The Url of the Forgot Password page is correct", expectedUFPUrl,actualUFPUrl);
    }

    @Then("Verify that email text box is available")
    public void verifyThatEmailTextBoxIsAvailable() {
        Assert.assertTrue(homepage.forgotPasswordEmailBox.isDisplayed());
    }

    @Then("Enter the email adress and submit")
    public void enterTheEmailAdressAndSubmit() {
        homepage.forgotPasswordEmailBox.sendKeys(ConfigReader.getProperty("userTempMail"));
        homepage.forgotPasswordSubmitButton.click();
    }

    @Then("Verify that password sent to the e-mail address entered in the textBox")
    public void verifyThatPasswordSentToTheEMailAddressEnteredInTheTextBox() {
        ReusableMethods.bekle(1);
        String actualUFPUrl = Driver.getDriver().getCurrentUrl();
        String expectedUFPUrl = ConfigReader.getProperty("userForgotPasswordPageUrl");
        Assert.assertNotEquals("The Url of the Forgot Password page is NOT correct", expectedUFPUrl,actualUFPUrl);
    }

    @Then("Click the User Login button")
    public void clickTheUserLoginButton() {
        homepage.forgotPasswordUserLoginButton.click();

    }

}


