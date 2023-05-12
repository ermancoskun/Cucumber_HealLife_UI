package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;



import java.util.List;


public class HomepageStepdefinitions {


    HomePage homepage = new HomePage();



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

    Actions actions = new Actions(Driver.getDriver());


    /////////////////////////////////////////////////////////////////////////////////////
    @Given("Launch browser")
    public void launchBrowser() {
        Driver.getDriver();}

    @Then("Go to {string}")
    public void goTo(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));}

    @And("Go to the home page footer section.")
    public void goToTheHomePageFooterSection() {actions.sendKeys(Keys.END).perform();}

    @And("Verify that the complain button and icon are visible.")
    public void verifyThatTheComplainButtonAndIconAreVisible() {
        Assert.assertTrue("Complain icon are not visible",homepage.complainIcon.isDisplayed());
        Assert.assertTrue("Complain button are not visible",homepage.complainButton.isDisplayed());
        Assert.assertTrue("Complain icon are not clickable",homepage.complainIcon.isEnabled());
        Assert.assertTrue("Complain button are not clickable",homepage.complainButton.isEnabled());}

    @And("Close browser")
    public void closeBrowser() {
        Driver.closeDriver();}

    @And("Click on the complainIcon")
    public void clickOnTheComplainIcon() {
        homepage.complainButton.click();}

    @And("Verify that it redirects to the {string} page.")
    public void verifyThatItRedirectsToThePage(String url) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = ConfigReader.getProperty(url);

        Assert.assertEquals("The 'Complain' button on the homepage does not redirect to the complain page.",expectedUrl,actualUrl);}

    //////////////////////////////////////////////////////////////////////////////////////////////////



    @Given("User goes to the home page")
    public void user_goes_to_the_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("homePageUrl"));}

    @Then("Verify that the URL of the website is correct")
    public void verify_that_the_url_of_the_website_is_correct() {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = ConfigReader.getProperty("homePageUrl");
        Assert.assertEquals("The Url of the home page is correct",expectedUrl,actualUrl);
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
        Assert.assertEquals("The Url of the Appointment page is correct",expectedUrl,actualUrl);
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


    @Then("Verify the Medical Treatment board  is displayed")
    public void verifyTheMedicalTreatmentBoardIsDisplayed() {
        String expectedText = "Medical Treatment";
        String actualText = homepage.nurseResidentBoard.getText();
        Assert.assertTrue(actualText.contains(expectedText));
        ReusableMethods.bekle(5);
    }

    @Then("Verify the Emergency Help board  is displayed")
    public void verifyTheEmergencyHelpBoardIsDisplayed() {
        String expectedText = "Emergency Help";
        String actualText = homepage.emergencyHelpBoard.getText();
        Assert.assertTrue(actualText.contains(expectedText));
        ReusableMethods.bekle(5);
    }

    @Then("Verify the Qualified Doctors  board  is displayed")
    public void verifyTheQualifiedDoctorsBoardIsDisplayed() {
        String expectedText = "Qualified Doctors";
        String actualText = homepage.emergencyHelpBoard.getText();
        Assert.assertTrue(actualText.contains(expectedText));
        ReusableMethods.bekle(5);
    }

    @Then("Verify the Medical professionals board  is displayed")
    public void verifyTheMedicalProfessionalsBoardIsDisplayed() {
        String expectedText = "Medical professionals";
        String actualText = homepage.onsiteMedicalStaffBoard.getText();
        Assert.assertTrue(actualText.contains(expectedText));
        ReusableMethods.bekle(5);
    }

    @And("Close the page")
    public void closeThePage() {
        Driver.closeDriver();
    }


    // ============= Nesibe [US_005] SON =========

    @Then("Sayfayi kaydir")
    public void sayfayiKaydir() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @And("1 saniye bekle")
    public void saniyeBekle() {
        ReusableMethods.bekle(1);
    }

    @Then("Verify the Medical Treatment board  is visible")
    public void verifyTheMedicalTreatmentBoardIsVisible() {
        String expectedText = "Medical Treatment";
        String actualText = homepage.nurseResidentBoard.getText();
        Assert.assertTrue("Medical Treatment board is not visible", actualText.contains(expectedText));
    }

    @Then("Verify the Emergency Help board  is visible")
    public void verifyTheEmergencyHelpBoardIsVisible() {
        Assert.assertTrue("Emergency Help board is not visible",homepage.emergencyHelpBoard.isDisplayed());
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

}


