package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AdminPage;
import pages.PatientPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.HealMethods;
import utilities.ReusableMethods;

import static utilities.Driver.driver;

public class PatientStepdefinitions {
    PatientPage patientPage=new PatientPage();
    AdminPage adminPage=new AdminPage();


    @Given("Goes to user login page")
    public void goesToUserLoginPage() {
        // intentionally left blank
    }

    @Then("Login with {string} and  {string} datas")
    public void loginWithAndDatas(String username,String password) {
        HealMethods.loginAsUser(username, password);
    }


    @When("Homepage redirect verified")
    public void homepageRedirectVerified() {

    patientPage.DashboardOnHeallifeText.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("/patient/dashboard"));
    }

    @When("User clicks the flag")
    public void userClicksTheFlag() {
        patientPage.homeFlag.click();
        patientPage.homeFlagTurkish.click();
     //   ReusableMethods.waitForClickablility(patientPage.homeFlagTurkish,2);
        ReusableMethods.sleep(3);
        String expected=patientPage.myAppiontmentsButton.getText();
        System.out.println(expected);
      //  Assert.assertTrue(expected.equalsIgnoreCase("Randevularım"));

}


    @When("Click on the notifications button")
    public void clickOnTheNotificationsButton() {
        patientPage.notifications.click();

    }

    @When("User see the notifications")
    public void userSeeTheNotifications() {
        Assert.assertTrue(patientPage.notificationsboard.isDisplayed());
    }





    @When("User not see any notifications")
    public void userNotSeeAnyNotifications() {
        Assert.assertTrue(patientPage.notificationsInformation.getText().contains("No Record Found"));
    }



    @When("User  see  Heal Life Hospital & Research Center text.")
    public void userSeeHealLifeHospitalResearchCenterText() {
        Assert.assertTrue(patientPage.DashboardOnHeallifeText.getText().contains("Heal"));

    }

    @When("Click on  Delete All button")
    public void clickOnDeleteAllButton() {
        ReusableMethods.sleep(2);
        ReusableMethods.waitForClickablility(patientPage.notificationsDeletebutton,2);
        patientPage.notificationsDeletebutton.click();
    }

    @Then("User  ben on the Dashboard profile page")
    public void userBenOnTheDashboardProfilePage() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("/patient/dashboard"));
    }

    @When("Clik on the dashboard button")
    public void clikOnTheDashboardButton() {
    patientPage.dashboardButton.click();
    }

    @When("Click on the My Appointments button")
    public void clickOnTheMyAppointmentsButton() {
        patientPage.myAppiontmentsButton.click();
    }

    @Then("User  be on the My Appointment profile page")
    public void userBeOnTheMyAppointmentProfilePage() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("appointment"));

    }

    @When("Click on the OPD menu title on the Sidebar")
    public void clickOnTheOPDMenuTitleOnTheSidebar() {
        patientPage.opdButton.click();
    }

    @Then("User  be on the OPD profile page")
    public void userBeOnTheOPDProfilePage() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("profile"));
    }

    @When("Click on the IPD button")
    public void clickOnTheIPDButton() {
        patientPage.ipdButton.click();
    }

    @Then("User  be on the IPD profile page")
    public void userBeOnTheIPDProfilePage() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("patientipddetails"));
    }

    @When("Click on the Pharmacy button")
    public void clickOnThePharmacyButton() {
        patientPage.pharmacyButton.click();
    }

    @Then("User  be on the Pharmacy profile page")
    public void userBeOnThePharmacyProfilePage() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("pharmacybill"));

    }

    @When("Click on the Pathology button")
    public void clickOnThePathologyButton() {
        patientPage.pathologyButton.click();
    }

    @Then("User  be on the Pathology profile page")
    public void userBeOnThePathologyProfilePage() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("/pathology"));

    }


    @When("Click on the Radiology button")
    public void clickOnTheRadiologyButton() {
        patientPage.radiologyButton.click();
        
    }

    @Then("User  be on the Radiology profile page")
    public void userBeOnTheRadiologyProfilePage() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(" dashboard/radiology"));

    }


    @When("Click on the Ambulance button")
    public void clickOnTheAmbulanceButton() {
        
        patientPage.ambulanceButton.click();
    }

    @Then("User  be on the  Ambulance profile page")
    public void userBeOnTheAmbulanceProfilePage() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("dashboard/ambulance"));
    }


    @When("Click on the BloodBank button")
    public void clickOnTheBloodBankButton() {
        patientPage.bloodBankButton.click();

    }

    @Then("User  be on the BloodBank  profile page")
    public void userBeOnTheBloodBankProfilePage() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("dashboard/bloodbank"));

    }

    @When("Click on the three lines one below the other button")
    public void clickOnTheThreeLinesOneBelowTheOtherButton() {
        patientPage.homeThreeDots.click();
    }

    @Then("User   see Dashboard navbar close")
    public void userSeeDashboardNavbarClose() {

        patientPage.homeThreeDots.click();

    }

    @When("User  see Patient Id, Gender, Marital Status, Phone, Email, Address, Age, Guardian Name informations")
    public void userSeePatientIdGenderMaritalStatusPhoneEmailAddressAgeGuardianNameInformations() {
        PatientPage.checkHeaderExistence(patientPage.myInformations);


    }

    @When("User  be Appointment No, Appointment Date, Priority, Specialist, Doctor, Status, Message, Action title")
    public void userBeAppointmentNoAppointmentDatePrioritySpecialistDoctorStatusMessageActionTitle() {
        WebElement table = driver.findElement(By.id("DataTables_Table_0"));
        PatientPage.checkTableHeadersExist(table);
    }

    @When("Click on the Delete button  User  be Delete menu")
    public void clickOnTheDeleteButtonUserBeDeleteMenu() {
        patientPage.myAppointmentdeleteButton.click();

    }

    @When("Clik on the Show button  User sees Appointment Details")
    public void clikOnTheShowButtonUserSeesAppointmentDetails() {
        patientPage.myAppointmentsShowButton.click();
        patientPage.myAppointmentsShowcloseButton.click();
    }

    @When("User enters card information and completes payment")
    public void userEntersCardInformationAndCompletesPayment() {
        patientPage.myAppiontmentsPaybutton.click();
        patientPage.myAppointmentsPaywithCardbutton.click();
        ReusableMethods.bekle(2);
        patientPage.myAppointmentsEmailtext.sendKeys("aysenuriye27@gmail.com");
        patientPage.myAppointmentsCardnumberText.sendKeys("4242 4242 4242 4242");
        patientPage.myAppointmentsMMYYText.sendKeys("0727");
        patientPage.myAppointmentsCVCText.sendKeys("571");
        patientPage.myAppoinmentsSecondPaybutton.click();
    }
}


