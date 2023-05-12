package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class HomepageStepdefinitions {

    //============= Nesibe [US_005] =========

    HomePage homepage = new HomePage();

    @Given("User goes to home page")
    public void user_goes_to_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("heallifeUrl"));
        ReusableMethods.bekle(5);
    }

    @Then("Verify {string}  is displayed.")
    public void verify_is_displayed(String expectedBoard) {
        expectedBoard = "Featured Services";
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
}
