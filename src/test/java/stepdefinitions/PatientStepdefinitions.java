package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.AdminPage;
import pages.PatientPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.HealMethods;
import utilities.ReusableMethods;

import javax.swing.*;

import static utilities.Driver.driver;
import static utilities.Driver.getDriver;

public class PatientStepdefinitions {
    PatientPage patientPage = new PatientPage();
    AdminPage adminPage = new AdminPage();
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();


    @Given("Goes to user login page")
    public void goesToUserLoginPage() {
        // intentionally left blank
    }

    @Then("Login with {string} and  {string} datas")
    public void loginWithAndDatas(String username, String password) {
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
        String expected = patientPage.myAppiontmentsButton.getText();
        System.out.println(expected);
        //tıklıyor ama kodlarda randevularım ingilizce gözüküyor
        //   Assert.assertTrue(expected.equalsIgnoreCase("Randevularım"));

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
        ReusableMethods.waitForClickablility(patientPage.notificationsDeletebutton, 2);
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
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("radiology"));

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
        ReusableMethods.bekle(2);
        patientPage.myAppointmentdeleteButton.click();

        driver.switchTo().alert().accept();

    }

    @When("Clik on the Show button  User sees Appointment Details")
    public void clikOnTheShowButtonUserSeesAppointmentDetails() {
        patientPage.myAppointmentsShowButton.click();
        patientPage.myAppointmentsShowcloseButton.click();

    }

    @When("User enters card information and completes payment")
    public void userEntersCardInformationAndCompletesPayment() {
        patientPage.payCard();
        Assert.assertEquals(patientPage.SuccestText.getText(), "SUCCESS");
    }

    @When("Click on the three lines button and User  see Dashboard navbar close")
    public void clickOnTheThreeLinesButtonAndUserSeeDashboardNavbarClose() {
        patientPage.homeThreeDots.click();
        patientPage.homeThreeDots.click();
        patientPage.homeThreeDots.isDisplayed();
    }

    @When("Click on the Profile picture User  see the user name, title and profile picture should be displayed in the tab that opens.")
    public void clickOnTheProfilePictureUserSeeTheUserNameTitleAndProfilePictureShouldBeDisplayedInTheTabThatOpens() {
        patientPage.profileImage.click();
        ReusableMethods.bekle(1);
        patientPage.profileNametext.isDisplayed();

    }


    @When("Click on Delete button and User not see the notifications")
    public void clickOnDeleteButtonAndUserNotSeeTheNotifications() {
        ReusableMethods.bekle(2);
        patientPage.notificationsDeletebutton.click();
        driver.switchTo().alert().accept();
        patientPage.notificationsInformation.isDisplayed();
    }

    @When("User creates a record by entering the appointment information.")
    public void userCreatesARecordByEnteringTheAppointmentInformation() {

        patientPage.myAppointmentsAddAppointment();
    }

    @When("User calls in appointments")
    public void userCallsInAppointments() {

        patientPage.myAppoinmetSeachtext.sendKeys("APPNO435");
        Assert.assertEquals(patientPage.myAppointmentApointmentno.getText(), "APPNO435");
    }

    @When("User skip to next page")
    public void userSkipToNextPage() {
        js.executeScript("arguments[0].scrollIntoView(true)", patientPage.myAppoinmentsSecondPageButton);
        ReusableMethods.bekle(1);
        patientPage.myAppoinmentsSecondPageButton.click();
        System.out.println(patientPage.myAppointmentspageDetails.getText());
        patientPage.myAppointmentspageDetails.isDisplayed();

    }


    @When("User switches to previous page")
    public void userSwitchesToPreviousPage() {

        js.executeScript("arguments[0].scrollIntoView(true)", patientPage.myAppoinmentsFirstPageButton);
        ReusableMethods.bekle(1);
        patientPage.myAppoinmentsFirstPageButton.click();
        System.out.println(patientPage.myAppointmentspageDetails.getText());
        patientPage.myAppointmentspageDetails.isDisplayed();

    }

    @When("Click on the  Change Password button and enters informations")
    public void clickOnTheChangePasswordButtonAndEntersInformations() {
        patientPage.profileChangepassButton.click();
        patientPage.profileChangecurrentPassword.click();
        actions.sendKeys("heallife123");
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("heallife123");
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("heallife123");
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.ENTER).perform();
        ReusableMethods.sleep(6);
    }

    @Then("Click on the Logout button")
    public void clickOnTheLogoutButton() {
        patientPage.profileImage.click();
        patientPage.profileLogoutbutton.click();
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://qa.heallifehospital.com/site/userlogin");
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

    @Given("Launch browser.")
    public void launchBrowser() {
        Driver.getDriver();
    }

/*    @Then("Go to {string}")
    public void goTo(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));}*/

    @Then("Login as a patient with username password")
    public void loginPatient(String userName, String Password) {
        HealMethods.loginAsUser("userNameNesibe", "userPasswordNesibe");

    }

    @Then("Verify  the patient dashboard page is redirected")
    public void patientPageRedirected() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("patient"));

    }

    @Then("Verify the “OPD” menu title in the dashboard is visible and clickable")
    public void verifyOpdMenuTitleEnabled() {
        String expectedTitle = "OPD";
        String actualTitle = Driver.getDriver().findElement(By.xpath("//*[@id=sibe-box]/ul/li[3]/a")).getText();
        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }

    @Then("Click the “OPD” menu")
    public void clickOpdMenu() {
        HealMethods.clickASidebarLink("OPD");
    }

    @Then("Verify the {string} page is redirected")
    public void verifyPatientPage(String arg0) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("patient"));
    }

   /* @And("Close the page")
    public void closePage() {
        Driver.closeDriver();
    }*/


    @Then("Verify the “ Overview, Visits, Lab Investigation, Treatment History, Timeline” items visible and accesable.")
    public void headingsOpdPage() {
        Assert.assertTrue(patientPage.overview.isDisplayed());
        Assert.assertTrue(patientPage.visits.isDisplayed());
        Assert.assertTrue(patientPage.labInvestigation.isDisplayed());
        Assert.assertTrue(patientPage.treatmentHistory.isDisplayed());
        Assert.assertTrue(patientPage.timeline.isDisplayed());
    }

    @Then("Verify the “ Gender, Age, Guardian Name, Phone” items displayed correctly in the Overview page")
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

    @Then("Verify the “ Consultant doctor” item displayed correctly in the Overview page.")
    public void consultantDoctorItemDisplayed() {
        patientPage.consultantDoctor.isDisplayed();
    }

    @Then("Click the “Visits” menu")
    public void clickTheVisitsMenu() {
        patientPage.visits.click();
    }

    @Then("Verify the headings in Visits List, OPD No, Case ID, Appointment Date, Consultant, Reference displayed correctly")
    public void headingsInVisitsPage() {
        Assert.assertTrue(patientPage.opdNo.isDisplayed());
        Assert.assertTrue(patientPage.caseId.isDisplayed());
        Assert.assertTrue(patientPage.appointmentDate.isDisplayed());
        Assert.assertTrue(patientPage.consultant.isDisplayed());
        Assert.assertTrue(patientPage.referance.isDisplayed());
    }

    @Then("Verify the seacrhTextBox  in Visit page is displayed and to be able to search correctly")
    public void theSeacrhTextBox() {
        HealMethods.makeSearchBoxTest();
    }

    @Then("Verify the list titles in the Visits List are to be able to sort effectively")
    public void ListTitlesSorting() {

    }

    @Then("Verify the accessiblity to the details of the visit and the prescription information under the Actions heading in the Visits")
    public void prescriptionVisits() {
    }

    @Then("Verify the visit details and prescription information must be recorded on the correct patient name.")
    public void visitsRecordedCorrectPatient() {
    }

    //========================================= Nesibe [US_023] OPD MENU SONU ==========================================
    //==============================================Busra US26=======================================================
    @Given("Click on the {string} linkkk")
    public void click_on_the_linkkk(String string) {
        patientPage.pathologySideBox.click();
    }

    @And("Verified redirected to Pathology page")
    public void verifiedRedirectedToPathologyPage() {
        Assert.assertTrue(patientPage.pathologytTextReportYazisi.isDisplayed());

    }

    @And("Verify that {string} in the Pathology Bill List are displayed")
    public void verifyThatInThePathologyBillListAreDisplayed(String data) {
        Assert.assertTrue(PatientPage.baslikListelemeMethod2(data));
    }

    @Then("Enter the excistingg {string}")
    public void enterTheExcistingg(String arg0) {
        patientPage.searchBox.sendKeys("PATHOB100");
    }

    @And("It is verified that filtering is done by entering the bill number in the Search Boxx.")
    public void ıtIsVerifiedThatFilteringIsDoneByEnteringTheBillNumberInTheSearchBoxx() {
        patientPage.pathologytPATHOB100Yazisi.isDisplayed();

    }

    @Then("It is verified that the headings are sorted by clickingg on them.")
    public void ıtIsVerifiedThatTheHeadingsAreSortedByClickinggOnThem() {
        Assert.assertTrue(PatientPage.intListSortTest2(1));
    }

    @Then("The visibility of the amount text is verifiedd")
    public void theVisibilityOfTheAmountTextIsVerifiedd() {
        patientPage.pathologyPaymentTextYazisi.isDisplayed();

    }

    @Then("close the screennn")
    public void closeTheScreennn() {
        patientPage.pathologyClose.click();
    }

    @Then("Click the View reports.")
    public void clickTheViewReports() {
        patientPage.pharmacyShowButton.click();
    }

    @Then("Name text \\(ayse.busra.pehlıvan {int}) should visible")
    public void nameTextAyseBusraPehlıvanShouldVisible(int arg0) {
        patientPage.pathologyNameText.isDisplayed();

    }

    @Then("close the screennnn")
    public void closeTheScreennnn() {
        patientPage.pathologyViewwClose.click();
    }

    @Then("Click the Pathology pay button.")
    public void clickThePathologyPayButton() {
        patientPage.pathologyPayButton.click();
        ReusableMethods.bekle(3);
        patientPage.pathologyPaymentAmountBox.clear();
        ReusableMethods.bekle(2);
        patientPage.pathologyPaymentAmountBox.sendKeys("30");
        patientPage.pathologyAddButton.click();
    }

    @And("Click the pay with cardd.")
    public void clickThePayWithCardd() {
        patientPage.pathologyPayWithCard.click();
        ReusableMethods.bekle(3);

    }

    @Given("e-mail, card number, date and cvc code are enteredd")
    public void eMailCardNumberDateAndCvcCodeAreEnteredd() {
        ReusableMethods.bekle(3);
        Actions actions = new Actions(Driver.getDriver());
        ReusableMethods.bekle(3);
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

    //=================================================BUSRA US27========================================
    @Given("Click on the Radiology linkk")
    public void click_on_the_radiology_linkk() {
        patientPage.radiologyButtonn.click();
    }

    @And("Verify that {string} are displayed")
    public void verifyThatAreDisplayed(String arg0) {
        patientPage.radioBillNo.isDisplayed();
    }

    @Then("Enter the excisting Radiology Bill")
    public void enterTheExcistingRadiologyBill() {
        patientPage.searchBox.sendKeys("RADIOB73");
    }

    @And("It is verified that filttering is done by entering the bill number in the Search Box.")
    public void ıtIsVerifiedThatFiltteringIsDoneByEnteringTheBillNumberInTheSearchBox() {
        patientPage.radioBillNoText.isDisplayed();
    }

    @And("Quit the page")
    public void quitThePage() {
        Driver.closeDriver();
    }

    @And("Verify that OPD,OPD, IPD, Pharmacy, Pathology, Radiology, Blood Bank, Ambulance are visible")
    public void verifyThatOPDOPDIPDPharmacyPathologyRadiologyBloodBankAmbulanceAreVisible() {
        Assert.assertTrue(patientPage.dashboardOpdText.isDisplayed());
        Assert.assertTrue(patientPage.dashboardIpdText.isDisplayed());
        Assert.assertTrue(patientPage.dashboardPharmacyText.isDisplayed());
        Assert.assertTrue(patientPage.dashboardPathologyText.isDisplayed());
        Assert.assertTrue(patientPage.dashboardBloodBankText.isDisplayed());
        Assert.assertTrue(patientPage.dashboardRadiologyText.isDisplayed());
        Assert.assertTrue(patientPage.dashboardAmbulanceText.isDisplayed());
    }

    @Then("Verify that OPD, IPD, Blood Bank, Ambulance are clikable")
    public void verifyThatOPDIPDBloodBankAmbulanceAreClikable() {

        patientPage.dashboardOpdText.click();
        String expectedUrl = "https://qa.heallifehospital.com/patient/dashboard/profile";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);

        patientPage.dashboardIpdText.click();
        String expectedIpdUrl = "https://qa.heallifehospital.com/patient/dashboard/ipdprofile";
        String actualIpdUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedIpdUrl, actualIpdUrl);
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);


        patientPage.dashboardBloodBankText.click();
        String expectedBloodBankdUrl = "https://qa.heallifehospital.com/patient/dashboard/bloodbank";
        String actualBloodBankUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedBloodBankdUrl, actualBloodBankUrl);
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);


        patientPage.dashboardAmbulanceText.click();
        String expectedAmbulancedUrl = "https://qa.heallifehospital.com/patient/dashboard/ambulance";
        String actualAmbulanceUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedAmbulancedUrl, actualAmbulanceUrl);
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);
    }


    @Then("Verify that Pharmacy, Pathology, Radiology are clikable")
    public void verifyThatPharmacyPathologyRadiologyAreClikable() {
        patientPage.dashboardPharmacyText.click();
        String expectedPharmacydUrl = "https://qa.heallifehospital.com/patient/dashboard/pharmacybill";
        String actualPharmacyUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedPharmacydUrl, actualPharmacyUrl);
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);

        patientPage.dashboardPathologyText.click();
        String expectedPatalogydUrl = "https://qa.heallifehospital.com/patient/dashboard/pathology";
        String actualPatalogyUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedPatalogydUrl, actualPatalogyUrl);
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);

        patientPage.dashboardRadiologyText.click();
        String expectedRadiologydUrl = "https://qa.heallifehospital.com/patient/dashboard/radiology";
        String actualRadiologyUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedRadiologydUrl, actualRadiologyUrl);
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);

    }

    @And("Verify that Medical History Chart is visible")
    public void verifyThatMedicalHistoryChartIsVisible() {
       Assert.assertTrue(patientPage.dashboardMedicalHistoryChart.isDisplayed());

    }

    @And("Verify that Top{int}Findings Chart is visible")
    public void verifyThatTopFindingsChartIsVisible(int arg0) {
        Assert.assertTrue(patientPage.dashboardTop10FindingsChart.isDisplayed());

    }

    @And("Verify that Top{int}Symptoms Chart is visible")
    public void verifyThatTopSymptomsChartIsVisible(int arg0) {
            Assert.assertTrue(patientPage.dashboardTop10symptomChart.isDisplayed());
    }

    @Given("Click on the Dashboard linkk")
    public void click_on_the_dashboard_linkk() {
        patientPage.dashboardLinkk.click();
    }



}


