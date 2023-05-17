package stepdefinitions;


import com.github.dockerjava.api.command.HealthState;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
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

   @And("user should be able to on the IPD page")
    public void userShouldBeAbleToOnTheIPDPage() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("admin/patient/ipdsearch"));
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



    @Given("Navigate to {string}")
    public void navigate_to(String string) {
    }

    @Given("Login to user page as {string} {string}")
    public void login_to_user_page_as(String username, String password) {
        Driver.getDriver().get("https://qa.heallifehospital.com/site/userlogin");
        WebElement usernameLocate = Driver.getDriver().findElement(By.id("email"));
        usernameLocate.sendKeys(username);

        WebElement passwordLocate = Driver.getDriver().findElement(By.id("password"));
        passwordLocate.sendKeys(password);
        WebElement loginButton = Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

    }

    @Given("Click on the {string} linkk")
    public void click_on_the_linkk(String string) {
        patientPage.pharmacySideBox.click();

    }

    @Given("Verified redirected to pharmacybill page")
    public void verified_redirected_to_pharmacybill_page() {
        patientPage.pharmacyBillText.isDisplayed();

    }

    @And("Verify that {string} in the Pharmacy Bill List are displayed")
    public void verifyThatInThePharmacyBillListAreDisplayed(String data) {
        PatientPage.baslikListelemeMethod(data);
    }

    @Then("Click the {string}")
    public void clickThe(String arg0) {
        patientPage.searchBox.click();

    }

    @Then("Enter the excisting {string}")
    public void enterTheExcisting(String arg0) {
        patientPage.searchBox.sendKeys("PHARMAB43");
    }

    @And("It is verified that filtering is done by entering the bill number in the Search Box.")
    public void ıtIsVerifiedThatFilteringIsDoneByEnteringTheBillNumberInTheSearchBox() {
        Assert.assertTrue(patientPage.pharmacyText.isDisplayed());
    }

    @Then("It is verified that the headings are sorted by clicking on them.")
    public void ıtIsVerifiedThatTheHeadingsAreSortedByClickingOnThem() {
        Assert.assertTrue(PatientPage.intListSortTest(1));
    }

    @Then("Click the View payments.")
    public void clickTheViewPayments() {
        patientPage.wievAllBox.click();

    }
    @Then("The visibility of the amount text is verified")
    public void theVisibilityOfTheAmountTextIsVerified() {
        Assert.assertTrue(patientPage.dateText.isDisplayed());
    }
    @Then("close the screen")
    public void closeTheScreen() {
        patientPage.pharmacyCloseButton.click();

    }

    @Then("Click the show button.")
    public void clickTheShowButton() {
        patientPage.pharmacyShowButton.click();

    }


    @Then("Name text \\(ayse.busra.pehlıvan) should visible")
    public void nameTextAyseBusraPehlıvanShouldVisible() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(patientPage.pharmacyNameText.isDisplayed());

    }

    @Then("Click the pay button.")
    public void clickThePayButton() {
        patientPage.pharmacyPayButton.click();
    }




    //}

    @Then("the amount paid is entered.")
    public void theAmountPaidIsEntered() {
        patientPage.pharmacyPaymenAmount.click();
        patientPage.pharmacyPaymenAmount.clear();
        patientPage.pharmacyPaymenAmount.sendKeys("30");
        patientPage.pharmacyAddButton.click();
    }
    @And("Click the add button.")
    public void clickTheAddButton() {
        patientPage.pharmacyAddButton.click();
    }


    @And("Click the pay with card.")
    public void clickThePayWithCard() {
        patientPage.pharmacyPayWithCard.click();
        ReusableMethods.bekle(6);



    }

    @Given("e-mail, card number, date and cvc code are entered")
    public void eMailCardNumberDateAndCvcCodeAreEntered() {
        // patientPage.pharmacyEmailBox.click();
        // WebElement element=Driver.getDriver().findElement(By.xpath(("//input[@class='control'])[1])")));
        //JSUtilities.clickWithJS(Driver.getDriver(),element);
        Actions actions = new Actions(Driver.getDriver());
        ReusableMethods.bekle(3);

        actions.sendKeys("asd@gmail.com").build().perform();
        //actions.sendKeys(faker.internet().emailAddress()).perform();
        actions.sendKeys(Keys.TAB).perform();
        ReusableMethods.bekle(2);
        actions.sendKeys("4242 4242").build().perform();
        ReusableMethods.bekle(2);
        actions.sendKeys("4242 4242").build().perform();
        ReusableMethods.bekle(3);
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("04").perform();
        ReusableMethods.bekle(3);
        actions.sendKeys("28").perform();
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.TAB).build().perform();
        ReusableMethods.bekle(2);
        actions.sendKeys("123").build().perform();
        actions.sendKeys(Keys.TAB).perform();
        ReusableMethods.bekle(2);
        actions.sendKeys("456").build().perform();
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.TAB).build().perform();
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.ENTER).perform();

        // patientPage.pharmacyPayBox.click();
        ReusableMethods.bekle(2);

    }

    @Then("The visibility of the success text is verified")
    public void theVisibilityOfTheSuccessTextIsVerified() {

        Assert.assertTrue(patientPage.pharmacySuccesfulText.isDisplayed());
    }

    @Then("wait {int} seconds")
    public void waitSeconds(int arg0) {
        ReusableMethods.bekle(3);
    }

    @Then("close the screenn")
    public void closeTheScreenn() {
        patientPage.pharmacyClose.click();
    }


    //=========================================== Nesibe [US_023] OPD MENU =============================================

    @Then("Verify  the patient dashboard page is redirected")
    public void patientPageRedirected() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("patient/dashboard"));

    }

    @Then("Verify the OPD menu title in the dashboard is visible and clickable")
    public void verifyOpdMenuTitleEnabled() {
        ReusableMethods.bekle(2);
        Assert.assertEquals("OPD",patientPage.opdButton.getText());

    }

    @Then("Click the OPD menu")
    public void clickOpdMenu() {
        HealMethods.clickASidebarLink("OPD");
    }

    @Then("Verify the {string} page is redirected")
    public void verifyPatientPage(String arg0) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("profile"));
    }

    @Then("Verify the Overview, Visits, Lab Investigation, Treatment History, Timeline items are visible and accessable")
    public void headingsOpdPage() {
        Assert.assertTrue(patientPage.overview.isDisplayed());
        Assert.assertTrue(patientPage.visits.isDisplayed());
        Assert.assertTrue(patientPage.labInvestigation.isDisplayed());
        Assert.assertTrue(patientPage.treatmentHistory.isDisplayed());
        Assert.assertTrue(patientPage.timeline.isDisplayed());

        Assert.assertTrue(patientPage.overview.isEnabled());
        Assert.assertTrue(patientPage.visits.isEnabled());
        Assert.assertTrue(patientPage.labInvestigation.isEnabled());
        Assert.assertTrue(patientPage.treatmentHistory.isEnabled());
        Assert.assertTrue(patientPage.timeline.isEnabled());
    }

    @Then("Verify the Gender, Age, Guardian Name, Phone items displayed correctly in the Overview page")
    public void theItemsOverview() {
        Assert.assertTrue(patientPage.gender.isDisplayed());
        Assert.assertTrue(patientPage.age.isDisplayed());
        Assert.assertTrue(patientPage.guardianName.isDisplayed());
        Assert.assertTrue(patientPage.phone.isDisplayed());
    }

    @Then("Verify the summaries of Visits, Lab Investigation, Treatment History, Timeline displayed correctly in the Overview page")
    public void summariesOfOtherPages() {
        Assert.assertTrue(patientPage.sumVisitDetails.isDisplayed());
        Assert.assertTrue(patientPage.sumlabInvestigation.isDisplayed());
        Assert.assertTrue(patientPage.sumTreatmentHistory.isDisplayed());
        Assert.assertTrue(patientPage.sumTimeline.isDisplayed());
    }

    @Then("Verify the Consultant doctor item displayed correctly in the Overview page")
    public void consultantDoctorItemDisplayed() {
        Assert.assertTrue(patientPage.consultantDoctor.isDisplayed());
    }

    @Then("Click the Visits menu")
    public void clickTheVisitsMenu() {
        patientPage.visits.click();
    }

    @Then("Verify the headings in Visits List, OPD No, Case ID, Appointment Date, Consultant, Reference displayed correctly")
    public void headingsInVisitsPage() {
        Assert.assertTrue(patientPage.opdNoFilter.isDisplayed());
        Assert.assertTrue(patientPage.caseIdFilter.isDisplayed());
        Assert.assertTrue(patientPage.appointmentDateFilter.isDisplayed());
        Assert.assertTrue(patientPage.consultantFilter.isDisplayed());
        Assert.assertTrue(patientPage.referanceFilter.isDisplayed());
    }

    @Then("Verify the seacrhTextBox  in Visit page is displayed and to be able to search correctly")
    public void theSeacrhTextBox() {
        HealMethods.makeSearchBoxTest();
    }

    @Then("Verify the list titles in the Visits List are to be able to sort effectively")
    public void ListTitlesSorting() {

        ReusableMethods.bekle(1);
        patientPage.opdNoFilter.click();
        HealMethods.makeFilterTestPatientOPD("OPD No" , 1,7);

        ReusableMethods.bekle(1);
        patientPage.caseIdFilter.click();
        HealMethods.makeFilterTestPatientOPD("Case ID / Patient ID" , 2,7);

        ReusableMethods.bekle(1);
        patientPage.appointmentDateFilter.click();
        HealMethods.makeFilterTestPatientOPD("Appointment Date" , 3,7);

        ReusableMethods.bekle(1);
        patientPage.consultantFilter.click();
        HealMethods.makeFilterTestPatientOPD("Consultant" , 4,7);

        ReusableMethods.bekle(1);
        patientPage.referanceFilter.click();
        HealMethods.makeFilterTestPatientOPD("Reference" , 5,7);

        ReusableMethods.bekle(1);
        patientPage.symptomFilter.click();
        HealMethods.makeFilterTestPatientOPD("Symptoms" , 6,7);

        ReusableMethods.bekle(1);
        patientPage.actionVisit.click();
        HealMethods.makeFilterTestPatientOPD("Action" , 7,7);

    }

    @Then("Verify the accessiblity to the details of the visit and the prescription information under the Actions heading in the Visits")
    public void prescriptionVisits () {
        patientPage.actionVisit.click();
        Assert.assertTrue(patientPage.prescriptionNot.isDisplayed());
    }

    @Then("Verify the visit details and prescription information are recorded on the correct patient name")
    public void visitsRecordedCorrectPatient() {
        patientPage.actionVisit.click();
        Assert.assertTrue(patientPage.prescriptionNot.isEnabled());
    }

    @Then("Click the Lab Investigation menu")
    public void clickTheLabInvestigationMenu() {
        patientPage.labInvestigation.click();
    }

    @Then("Verify titles in Lab Investigation List \\(Test Name, Case ID, Lab, Sample Collected, Expected Date, Approved By) displayed correctly on the Lab Investigation page")
    public void verifyTitlesInLabInvestigation() {

        Assert.assertTrue(patientPage.testName.isDisplayed());
        Assert.assertTrue(patientPage.caseId2Filter.isDisplayed());
        Assert.assertTrue(patientPage.labFilter.isDisplayed());
        Assert.assertTrue(patientPage.sampleCollectedFilter.isDisplayed());
        Assert.assertTrue(patientPage.expectedDateFilter.isDisplayed());
        Assert.assertTrue(patientPage.approvedByFilter.isDisplayed());
    }

    @And("Verify the seacrhTextBox  in Lab Investigation page is displayed and to be able to search correctly")
    public void verifyTheSeacrhTextBoxInLabInvestigation() {
        ReusableMethods.bekle(2);
        patientPage.searchLabInvestigation.click();
        Assert.assertTrue(patientPage.searchLabInvestigation.isDisplayed());
        patientPage.searchLabInvestigation.sendKeys("testing now...");
        ReusableMethods.bekle(2);
        patientPage.searchLabInvestigation.clear();
        ReusableMethods.bekle(5);

    }

    @And("Verify the test result should be displayed under the Action title in the Lab Investigation List is displayed")
    public void verifyTheTestResult() {
        patientPage.testSonuc1.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(patientPage.testSonucEkran.isDisplayed());
    }

    @And("Verify the list over the titles in the Lab Investigation List are to be able to sort effectively")
    public void verifyTheLabInvestigationListSort() {
        patientPage.testName.click();
        HealMethods.makeFilterTestPatientOPD("Test Name", 1, 7);

        patientPage.caseId2Filter.click();
        HealMethods.makeFilterTestPatientOPD("Case ID / Patient ID", 2,7);

        patientPage.labFilter.click();
        HealMethods.makeFilterTestPatientOPD("Lab",3,7);

        patientPage.sampleCollectedFilter.click();
        HealMethods.makeFilterTestPatientOPD("Sample Collected",4,7);

        patientPage.expectedDateFilter.click();
        HealMethods.makeFilterTestPatientOPD("Expected Date",5,7);

        patientPage.approvedByFilter.click();
        HealMethods.makeFilterTestPatientOPD("Approved By",6,7);
    }


    @Then("Click the Treatment History menu")
    public void clickTheTreatmentHistoryMenu() {
        patientPage.treatmentHistory.click();
    }

    @And("Verify titles in The Treatment History page \\(OPD No, Case ID, Appointment Date, Symptoms, Consultant, Action) displayed correctly on The Treatment History page")
    public void verifyTitlesInTheTreatmentHistory() {
        Assert.assertTrue(patientPage.opdNoTreatment.isDisplayed());
        Assert.assertTrue(patientPage.caseId3.isDisplayed());
        Assert.assertTrue(patientPage.appointmentDate2.isDisplayed());
        Assert.assertTrue(patientPage.symptoms2.isDisplayed());
        Assert.assertTrue(patientPage.consultantFilter2.isDisplayed());
        Assert.assertTrue(patientPage.actionTreatmentHistory.isDisplayed());
    }

    @And("Verify the seacrhTextBox  in the Treatment History page is displayed and to be able to search correctly.")
    public void verifyTheSeacrhTextBoxInTheTreatmentHistoryPageIsDisplayedAndToBeAbleToSearchCorrectly() {
        ReusableMethods.bekle(2);
        patientPage.searchTreatment.click();
        Assert.assertTrue(patientPage.searchTreatment.isDisplayed());
        patientPage.searchTreatment.sendKeys("testing now...");
        ReusableMethods.bekle(2);
        patientPage.searchTreatment.clear();
        ReusableMethods.bekle(5);
    }

    @And("Verify the treatment history details should be displayed under the Action title in the “The Treatment History” list")
    public void verifyTheTreatmentHistoryAction() {
        Assert.assertTrue(patientPage.actionTreatmentHistory.isEnabled());
    }

    @And("Verify  that to select how many treatment histories \\({int} or All) will be displayed in the Treatment History list")
    public void hundredOrAll(int arg0) {
        // patientPage.makeAll.click();
        HealMethods.makeAll100Test();

    }

    @Then("Click the Timeline menu")
    public void clickTheTimelineMenu() {
        ReusableMethods.bekle(1);
        patientPage.timeline.click();

    }

    @And("Verify  that a line on the Timeline page showing the procedures waiting for the patient in the future is  displayed")
    public void lineTimeline() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(patientPage.timeLineShow.isDisplayed());
        Assert.assertTrue(patientPage.timeLineDateFuture.isDisplayed());
    }

    @And("Verify  that the Line on the Timeline page contains all the necessary informations")
    public void theTimelinePageContainsAllInformations() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(patientPage.timeLineNameShow.isDisplayed());
        Assert.assertTrue(patientPage.timeLineDateShow.isDisplayed());
    }


    //========================================= Nesibe [US_023] OPD MENU SONU ==========================================
}



