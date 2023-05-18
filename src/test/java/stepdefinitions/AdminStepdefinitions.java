package stepdefinitions;


import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AdminPage;
import utilities.*;

import utilities.Driver;
import utilities.HealMethods;
import utilities.JSUtilities;
import utilities.ReusableMethods;

import java.io.IOException;

import java.util.List;

public class AdminStepdefinitions {

    AdminPage adminPage = new AdminPage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    static String numberOfNotification1;
    static String numberOfNotification2;
    static String numberOfMessage1;
    static String numberOfMessage2;
    static int numberOfUnreadNotification1;
    static int numberOfUnreadNotification2;
    Select select;
    static String firstValue;
    static String secondValue;


    @Given("Goes to Admin login page")
    public void goes_to_admin_login_page() {
        // intentionally left blank
    }

    @Then("Login with {string} and {string} datas")
    public void login_with_and_datas(String username, String password) {
        HealMethods.loginAsAdmin(username, password);
    }

    @Then("Click on the {string} link")
    public void clickOnTheLink(String link) {
        HealMethods.clickASidebarLink(link);
    }

    @Then("Verified redirected to Billing page")
    public void verified_redirected_to_billing_page() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("bill"));
    }

    @And("Sees Single Module Billing and OPD_IPD Billing Through Case Id windows")
    public void seesSingleModuleBillingAndOPD_IPDBillingThroughCaseIdWindows() {
        ReusableMethods.bekle(3);
        Assert.assertEquals("Single Module Billing", adminPage.singleModuleWindow.getText());
        Assert.assertEquals("OPD/IPD Billing Through Case Id", adminPage.opdIpdWindow.getText());
    }

    @Then("Click on the OPD button")
    public void clickOnTheOPDButton() {
        adminPage.opdButton.click();
    }

    @And("Sees the {string} and their {string}")
    public void seesTheAndTheir(String filtreAdi, int sirasi) {
        HealMethods.makeFilterTest(filtreAdi, sirasi, 7);
    }

    @Then("Sees the FilterName and their Order")
    public void seesTheFilterNameAndTheirOrder() {
        HealMethods.makeFilterTest("Name", 1, 11);
        HealMethods.makeFilterTest("Patient Id", 2, 11);
        HealMethods.makeFilterTest("Guardian Name", 3, 11);
        HealMethods.makeFilterTest("Gender", 4, 11);
        HealMethods.makeFilterTest("Phone", 5, 11);
        HealMethods.makeFilterTest("Consultant", 6, 11);
        HealMethods.makeFilterTest("Last Visit", 7, 11);
        HealMethods.makeFilterTest("Total Recheckup", 8, 11);
    }

    /*
    @Then("Sees the FilterName and their Order")
    public void seesTheFilterNameAndTheirOrder() {
        HealMethods.makeFilterTest("Name", 1, 8);
        HealMethods.makeFilterTest("Patient Id", 2, 8);
        HealMethods.makeFilterTest("Guardian Name", 3, 8);
        HealMethods.makeFilterTest("Gender", 4, 8);
        HealMethods.makeFilterTest("Phone", 5, 8);
        HealMethods.makeFilterTest("Consultant", 6, 8);
        HealMethods.makeFilterTest("Last Visit", 7, 8);


    }

     */

    @Then("Sees the name of Billing List and their contents")
    public void seesTheNameOfBillingListAndTheirContents() {
        HealMethods.makeFilterTest("Bill No", 1, 8);
        HealMethods.makeFilterTest("Case ID / Patient ID", 2, 8);
        HealMethods.makeFilterTest("Reporting Date", 3, 8);
        HealMethods.makeFilterTest("Patient Name", 4, 8);
        HealMethods.makeFilterTest("Reference Doctor", 5, 8);
        HealMethods.makeFilterTest("Amount ($)", 6, 8);
        HealMethods.makeFilterTest("Paid Amount ($)", 7, 8);
    }


    @And("Sees the name of Radiology Billing List and their contents")
    public void seesTheNameOfRadiologyBillingListAndTheirContents() {
        HealMethods.makeFilterTest("Bill No", 1, 9);
        HealMethods.makeFilterTest("Case ID / Patient ID", 2, 9);
        HealMethods.makeFilterTest("Reporting Date", 3, 9);
        HealMethods.makeFilterTest("Patient Name", 4, 9);
        HealMethods.makeFilterTest("Reference Doctor", 5, 9);
        HealMethods.makeFilterTest("Note", 6, 9);
        HealMethods.makeFilterTest("Amount ($)", 7, 9);
        HealMethods.makeFilterTest("Paid Amount ($)", 8, 9);
    }




    @Then("Sees the name of Blood Issue Billing List and their contents")
    public void seesTheNameOfBloodIssueBillingListAndTheirContents() {
        HealMethods.makeFilterTest("Bill No", 1, 11);
        HealMethods.makeFilterTest("Case ID / Patient ID", 2, 11);
        HealMethods.makeFilterTest("Issue Date", 3, 11);
        HealMethods.makeFilterTest("Received To", 4, 11);
        HealMethods.makeFilterTest("Blood Group", 5, 11);
        HealMethods.makeFilterTest("Gender", 6, 11);
        HealMethods.makeFilterTest("Donor Name", 7, 11);
        HealMethods.makeFilterTest("Bags", 8, 11);
    }

    @Then("Sees the name of Blood Component Issue Billing List and their contents")
    public void seesTheNameOfBloodComponentIssueBillingListAndTheirContents() {
        HealMethods.makeFilterTest("Bill No",1,12);
        HealMethods.makeFilterTest("Case ID / Patient ID",2,12);
        HealMethods.makeFilterTest("Issue Date",3,12);
        HealMethods.makeFilterTest("Received To",4,12);
        HealMethods.makeFilterTest("Blood Group",5,12);
        HealMethods.makeFilterTest("Component",6,12);
        HealMethods.makeFilterTest("Gender",7,12);
        HealMethods.makeFilterTest("Donor Name",8,12);
        HealMethods.makeFilterTest("Bags",9,12);
        HealMethods.makeFilterTest("Amount ($)",10,12);
        HealMethods.makeFilterTest("Paid Amount ($)",11,12);

    }

    @And("Click the Radiology button on Billing page")
    public void clickTheRadiologyButtonOnBillingPage() {
        adminPage.radiologyButton.click();

    }

    @And("test to searcbox")
    public void testToSearcbox() {
        HealMethods.makeSearchBoxTest();
    }


    @And("Click on the Add Patient button")
    public void clickOnTheAddPatientButton() {
        HealMethods.clickBlueOrAnyButton(" Add Patient");
    }

    @And("Click on the {string} button")
    public void clickOnTheButton(String isim) {
        HealMethods.clickBlueOrAnyButton(isim);

    }

    @And("Create a New Patient with random datas")
    public void createANewPatientWithRandomDatas() {
        HealMethods.createNewPatient();
    }

    @And("Choose All and {int} options for patient display")
    public void chooseAllAndOptionsForPatientDisplay(int arg0) {
        HealMethods.makeAll100Test();
    }

    @Then("Verified redirected to Patent Profile page")
    public void verifiedRedirectedToPatentProfilePage() {
        Assert.assertTrue("Not redirected the patient profile",
                Driver.getDriver().getCurrentUrl().contains("patient_profile"));
    }

    @Then("Verified redirected to Bill Details page")
    public void verifiedRedirectedToBillDetailsPage() {

        String actualWindowTitle = Driver.getDriver().findElement(By.xpath("(//h4[@class='modal-title'])[3]")).getText();
        boolean flag = false;
        if (actualWindowTitle.equals("Bill Details") ||
                Driver.getDriver().findElement(By.xpath("(//h4[@class='modal-title'])[1]")).getText().equals("Bill Details")) {
            flag = true;
        }
        Assert.assertTrue("Unsuccessful redirection", flag);

        WebElement billDetailsElement = Driver.getDriver().findElement(By.xpath("(//h4[text()='Bill Details'])[1]"));
        Assert.assertTrue(billDetailsElement.isDisplayed());
    }

    @Then("Verified redirected to Blood Issue Details page")
    public void verifiedRedirectedToBloodIssueDetailsPage() {
        String actualWindowTitle = Driver.getDriver().findElement(By.xpath("(//h4[@class='modal-title'])[2]")).getText();
        boolean flag = false;
        if (actualWindowTitle.equals("Blood Issue Details") ||
                Driver.getDriver().findElement(By.xpath("(//h4[@class='modal-title'])[1]")).getText().equals("Bill Details")) {
            flag = true;
        }

        Assert.assertTrue("Unsuccessful redirection", flag);
        WebElement billDetailsElement = Driver.getDriver().findElement(By.xpath("(//h4[text()='Blood Issue Details'])"));
        Assert.assertTrue(billDetailsElement.isDisplayed());
    }

    @Then("Click the trash icon for delete {int}. Bill")
    public void clickTheTrashIconForDeleteBill(int sira) {
        HealMethods.clickTrashIconForDelete(sira);
        Driver.getDriver().switchTo().alert().accept();
        String actualMessage = JSUtilities.getTextWithJS(Driver.getDriver(), adminPage.warningMessage);
        Assert.assertEquals("Unsuccessful delete", "Record Deleted Successfully", actualMessage);
    }

    @And("Click the Pathology button on Billing page")
    public void clickThePathologyButtonOnBillingPage() {
        adminPage.pathologyButton.click();
    }

    @And("Click the Blood Issue button on Billing page")
    public void clickTheBloodIssueButtonOnBillingPage() {
        adminPage.bloodIssueButton.click();
    }
    @And("Click the Blood Component Issue board on Billing Page")
    public void clickTheBloodComponentIssueBoardOnBillingPage() {
        adminPage.bloodIssueComponentButton.click();
    }

    @And("Click {int}. iconButton under the last column for display first patient profile")
    public void clickIconButtonUnderTheLastColumnForDisplayFirstPatientProfile(int sira) {
        HealMethods.clickIconWith3Line(sira);

    }


    @And("Click the Add View Payment iconButton for additional payments for patient of {int}.")
    public void clickTheAddViewPaymentIconButtonForAdditionalPaymentsForPatientOf(int sira) {
        HealMethods.clickAddViewPaymentIcon(sira);
    }

    @Then("Test the payment options")
    public void testThePaymentOptions() {}

    @And("Click {int}. +plus icon under the last column")
    public void clickPlusIconUnderTheLastColumn(int sira) {
        HealMethods.clickPlusIconForAddPayment(sira);
    }

    @And("Click first name for display patient profile")
    public void clickFirstNameForDisplayPatientProfile() {
        HealMethods.clickANameFromList(1);
    }

    @And("Click first name for display patient profile under the Patient Name")
    public void clickFirstNameForDisplayPatientProfileUnderThePatientName() {
        HealMethods.clickANameFromList(4);
    }

    @And("Click {int}. money icon under the last column")
    public void clickMoneyIconUnderTheLastColumn(int sira) {
        HealMethods.clickAddViewPaymentIcon(sira);
    }

    @Then("Make or delete additional payments")
    public void makeOrDeleteAdditionalPayments() {

        HealMethods.makePaymentOptionsTest();
    }

    @Then("Make or delete additional payments for Bloods")
    public void makeOrDeleteAdditionalPaymentsForBloods() {
        HealMethods.makePaymentOptionsTestForBloods();
    }

    @Then("Edit and delete a Blood records")
    public void editAndDeleteABloodRecords() {

        JSUtilities.clickWithJS(Driver.getDriver(), Driver.getDriver().findElement(By.xpath("//a[@class='edit_blood_issue']")));

        try {
            JSUtilities.clickWithJS(Driver.getDriver(),Driver.getDriver().findElement(By.xpath("//a[@class='edit_blood_issue']")));
        } catch (Exception e) {
            JSUtilities.clickWithJS(Driver.getDriver(),Driver.getDriver().findElement(By.xpath("//a[@class='edit_component_issue']")));
        }

        HealMethods.createNewPatient();
        JSUtilities.clickWithJS(Driver.getDriver(), Driver.getDriver().findElement(By.xpath("//input[@id='dates_of_issue']")));
        JSUtilities.clickWithJS(Driver.getDriver(), Driver.getDriver().findElement(By.xpath("//button[@id='formaddbtn']")));
        Assert.assertEquals("Edit not successful", "Record Saved Successfully", adminPage.warningMessage.getText());
        JSUtilities.clickWithJS(Driver.getDriver(), adminPage.xIconButton);
        ReusableMethods.bekle(7);
        JSUtilities.clickWithJS(Driver.getDriver(), Driver.getDriver().findElement(By.xpath("//a[@class='delete_blood_issue']")));
        Driver.getDriver().switchTo().alert().accept();
        ReusableMethods.bekle(2);
        Assert.assertEquals("Delete not successful", "Record Deleted Successfully", adminPage.warningMessage.getText());

    }

    @Then("Create a New Bill with random datas")
    public void createANewBillWithRandomDatas() throws IOException {
        HealMethods.generateBillInfo();
    }
    @Then("Create a New Blood Bill with random datas")
    public void createANewBloodBillWithRandomDatas() throws IOException {
        HealMethods.generateBillInfoForBloods();
    }

    @Given("Click on the Add Patient button in IPD page")
    public void clickOnTheAddPatientButtonInIPDPage() {
        adminPage.addPatientButtonIPD.click();
    }

    @Given("Click on the Discarged Patient button")
    public void clickOnTheDiscargedPatientButton() {
        adminPage.dischargedPatientButton.click();


    }


    @And("user should be able to on the Discarged Patient page")
    public void userShouldBeAbleToOnTheDiscargedPatientPage() {
        Assert.assertTrue(adminPage.ipdDischargedConfirmationText.isDisplayed());
    }

    @Given("It should be displayed in the IPD Discharged Patient List")
    public void itShouldBeDisplayedInTheIPDDischargedPatientList(List<String> ipdTableHeads) {
        for (int i = 0; i < ipdTableHeads.size(); i++) {
            Assert.assertEquals(ipdTableHeads.get(i), adminPage.ipdPatientAndDischargePatientTableHeaders.get(i).getText());

        }
    }


    @And("Click {int}. first name for display patient profile")
    public void clickFirstNameForDisplayPatientProfile(int sira) {
        HealMethods.clickANameFromList(1);
    }


    @Then("Sees the {string} that {string}")
    public void seesTheThat(String filtreAdi, int sira) {
        System.out.println("filtreAdi = " + filtreAdi);
        System.out.println("sira = " + sira);
        HealMethods.makeFilterTest(filtreAdi, sira, 7);
    }


    @And("Login to admin page as {string} {string}")
    public void loginToAdminPageAs(String username, String password) {
        adminPage.loginAsAdmin(username, password);
    }

    @And("Verify that the heallife logo is visible in the navbar of the admin panel.")
    public void verifyThatTheHeallifeLogoIsVisibleInTheNavbarOfTheAdminPanel() {
        Assert.assertTrue("Heallife logo is not visible in the navbar of the admin panel", adminPage.heallifeLogo.isDisplayed());
    }

    @And("Click on the Billing Menu")
    public void clickOnTheBillingMenu() {
        adminPage.billingMenu.click();
    }

    @And("Click on the heallife logo in the Navbar")
    public void clickOnTheHeallifeLogoInTheNavbar() {
        adminPage.heallifeLogo.click();
    }

    @And("Verify that the admin panel is refreshed when clicking on the heallife logo")
    public void verifyThatTheAdminPanelIsRefreshedWhenClickingOnTheHeallifeLogo() {
        Assert.assertTrue("Admin panel does not refresh when clicking on heallife logo",
                adminPage.welcomePartyAnnouncement.isEnabled());
        Assert.assertTrue("Admin panel does not refresh when clicking on heallife logo",
                adminPage.welcomePartyAnnouncement.isDisplayed());
    }

    @And("Verify that there is a dashboard menu icon in the navbar")
    public void verify_that_there_is_a_dashboard_menu_icon_in_the_navbar() {
        Assert.assertTrue("No dashboard menu icon in the navigation bar",
                adminPage.dashboardMenuIcon.isDisplayed());
        Assert.assertTrue("A dashboard menu icon is not clickable in the navigation bar",
                adminPage.dashboardMenuIcon.isEnabled());
    }

    @And("Click on the menu icon.")
    public void click_on_the_menu_icon() {
        adminPage.dashboardMenuIcon.click();
    }

    @And("Verify that the dashboard menu is closed when clicked")
    public void verify_that_the_dashboard_menu_is_closed_when_clicked() {
        Assert.assertFalse("Dashboard menu does not open and close when clicked", adminPage.billingMenu.isDisplayed());
    }

    @And("Verify that the dashboard menu is opened when clicked")
    public void verify_that_the_dashboard_menu_is_opened_when_clicked() {
        Assert.assertTrue("Dashboard menu does not open and close when clicked", adminPage.billingMenu.isDisplayed());
    }

    @And("Verify that the Navbar has the text *Heal Life Hospital & Research Center*")
    public void verifyThatTheNavbarHasTheTextHealLifeHospitalResearchCenter() {
        Assert.assertTrue("The text *Heal Life Hospital & Research Center* is not visible in Navbar", adminPage.healLifeHospitalResearchCenterText.isDisplayed());
    }


    @And("It should be possible to sort through the titles")
    public void itShouldBePossibleToSortThroughTheTitles() {
        HealMethods.makeFilterTest("Phone", 5, 11);
    }

    //============================================ Nesibe [US_040] OPD MENU ============================================

    @Then("Verify  the {string} page is visiable")
    public void verifyTheIsAdminDashboardVisiable(String arg0) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("admin/dashboard"));
    }
     AdminPage AdminPage =new AdminPage();
    @Then("Verify the OPD menu title on admin page is visible and enable")
    public void verifyTheOPDMenuTitleOnAdminPageIsVisibleAndEnable() {

        Assert.assertTrue(AdminPage.opdSide.isDisplayed());
        Assert.assertTrue(AdminPage.opdSide.isEnabled());
    }

    @Then("Verify the OPD Patient on admin page is redirected")
    public void verifyTheOPDMenuTitle() {
        Assert.assertTrue(AdminPage.opdSide.isDisplayed());
        AdminPage.opdSide.click();
        Assert.assertTrue(AdminPage.opdPatientTitle.isDisplayed());
    }

    @Then("Click the OPD in the menu")
    public void clickTheOPDInTheMenu() {
        AdminPage.opdSide.click();
    }

    @And("Verify the titles (Name, Patient Id, Guardian Name, Gender, Phone, Consultant, Last Visit, Total Recheckup) are displayed")
    public void verifyTheTitlesNamePatientIdGuardianNameGenderPhoneConsultantLastVisitTotalRecheckupAreDisplayed() {
        Assert.assertTrue(AdminPage.opdNameFilter.isDisplayed());
        Assert.assertTrue(AdminPage.opdPatientIdFilter.isDisplayed());
        Assert.assertTrue(AdminPage.opdGuardianFilter.isDisplayed());
        Assert.assertTrue(AdminPage.opdGender.isDisplayed());
        Assert.assertTrue(AdminPage.opdPhoneFilter.isDisplayed());
        Assert.assertTrue(AdminPage.opdConsultantFilter.isDisplayed());
        Assert.assertTrue(AdminPage.opdLastVisitFilter.isDisplayed());
        Assert.assertTrue(AdminPage.opdTotalRecheckUpFilter.isDisplayed());
    }

    @And("Verify the titles (Name, Patient Id, Guardian Name, Gender, Phone, Consultant, Last Visit, Total Recheckup) are able to sort through the titles")
    public void verifyTheTitlesNamePatientIdGuardianNameGenderPhoneConsultantLastVisitTotalRecheckupAreAbleToSortThroughTheTitles() {


        ReusableMethods.bekle(1);
        HealMethods.makeFilterTest("Name" , 3,7);
        ReusableMethods.bekle(1);
        HealMethods.makeFilterTest("Patient Id" , 2,7);
        ReusableMethods.bekle(1);
        HealMethods.makeFilterTest("Guardian Name" , 3,7);
        ReusableMethods.bekle(1);
        HealMethods.makeFilterTest("Gender" , 4,7);
        ReusableMethods.bekle(1);
        HealMethods.makeFilterTest("Consultant" , 5,7);
        ReusableMethods.bekle(1);
        HealMethods.makeFilterTest("Last Visit" , 6,7);
        ReusableMethods.bekle(1);
        HealMethods.makeFilterTest("Total Recheckup" , 7,7);



    }

    @And("Verify the seacrhTextBox  in the OPD page page is displayed and to be able to search correctly")
    public void verifyTheSeacrhTextBoxInTheOPDPagePageIsDisplayedAndToBeAbleToSearchCorrectly() {
        HealMethods.makeSearchBoxTest();
    }

    @And("Verify that to select the list item number \\(as all or {int}) to be displayed in the OPD Patient List on the OPD page")
    public void verifyThatToSelectTheListItemNumberAsAllOrToBeDisplayedInTheOPDPatientListOnTheOPDPage(int arg0) {
        HealMethods.makeAll100Test();
    }

    @And("Verify that Add Patient button is displayed and enabled")
    public void verifyThatAddPatientButtonIsDisplayedAndEnabled() {
        Assert.assertTrue(adminPage.opdAddPatientButton.isDisplayed());
        Assert.assertTrue(adminPage.opdAddPatientButton.isEnabled());
    }

    @Then("Click the Add Patient")
    public void clickTheAddPatient() {
        adminPage.opdAddPatientButton.click();
    }

    @And("Verify that new patient  from the OPD page can be added and saved on the page that opens")
    public void verifyThatNewPatientFromTheOPDPageCanBeAddedAndSavedOnThePageThatOpens() {
        adminPage.addNewPatientOPD();
    }


    //========================================= Nesibe [US_040] OPD MENU SONU ============================================


    @Given("It should be displayed in the IPD Patient List")
    public void itShouldBeDisplayedInTheIPDPatientList(List<String> ipdTableHeads) {
        HealMethods.testHeaders(ipdTableHeads);

    }

    @And("I should be able to view all the patient's information from the button under Total\\($)")
    public void iShouldBeAbleToViewAllThePatientSInformationFromTheButtonUnderTotal$(List<String> headers) {
        HealMethods.clickIconWith3Line(3);
        for (int i = 0; i < headers.size(); i++) {

            if (headers.get(i).equals("Payments")) {
                adminPage.scrollRightButton.click();
                ReusableMethods.bekle(2);
            }
            Assert.assertEquals(headers.get(i), adminPage.ipdPersonalInformationHeaders.get(i).getText().trim());
//            System.out.println(adminPage.ipdPersonalInformationHeaders.get(i).getText().trim());

        }
    }

    @And("I should be able to view all the patient's information from the button under Credit Limit\\($)")
    public void iShouldBeAbleToViewAllThePatientSInformationFromTheButtonUnderCreditLimit$(List<String> headers) {
        HealMethods.clickIconWith3Line(3);
        for (int i = 0; i < headers.size(); i++) {

            if (headers.get(i).equals("Payments")) {
                adminPage.scrollRightButton.click();
                ReusableMethods.bekle(2);
            }
            Assert.assertEquals(headers.get(i), adminPage.ipdPersonalInformationHeaders.get(i).getText().trim());
//            System.out.println(adminPage.ipdPersonalInformationHeaders.get(i).getText().trim());
        }


    }

    ////***Humeyra  42  *////////////
    @Given("Verify that browser redirect to Pharmacy page.")
    public void verifyThatBrowserRedirectToPharmacyPage() {
        String expectedUrl = "https://qa.heallifehospital.com/admin/pharmacy/bill";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @Given("Verify that The Pharmacy Bill List on the Pharmacy page have the heading Bill No")
    public void verifyThatThePharmacyBillListOnThePharmacyPageHaveTheHeadingBillNo() {
        Assert.assertTrue(adminPage.pharmacyBillNo.isDisplayed());
    }

    @Then("Verify that The Pharmacy Bill List on the Pharmacy page have the heading Case ID Patient ID")
    public void verifyThatThePharmacyBillListOnThePharmacyPageHaveTheHeadingCaseIDPatientID() {
        Assert.assertTrue(adminPage.pharmacyCaseID.isDisplayed());
    }

    @Then("Verify that The Pharmacy Bill List on the Pharmacy page have the heading Date")
    public void verifyThatThePharmacyBillListOnThePharmacyPageHaveTheHeadingDate() {
        Assert.assertTrue(adminPage.pharmacyDate.isDisplayed());
    }

    @Then("Verify that The Pharmacy Bill List on the Pharmacy page have the heading Patient Name.")
    public void verifyThatThePharmacyBillListOnThePharmacyPageHaveTheHeadingPatientName() {
        Assert.assertTrue(adminPage.pharmacyPatientName.isDisplayed());
    }

    @Then("Verify that The Pharmacy Bill List on the Pharmacy page have the heading Doctor Name.")
    public void verifyThatThePharmacyBillListOnThePharmacyPageHaveTheHeadingDoctorName() {
        Assert.assertTrue(adminPage.pharmacyDoctorName.isDisplayed());
    }

    @Then("Verify that The Pharmacy Bill List on the Pharmacy page have the heading Discount.")
    public void verifyThatThePharmacyBillListOnThePharmacyPageHaveTheHeadingDiscount() {
        Assert.assertTrue(adminPage.pharmacyDiscount.isDisplayed());
    }

    @Then("Verify that The Pharmacy Bill List on the Pharmacy page have the heading Amount.")
    public void verifyThatThePharmacyBillListOnThePharmacyPageHaveTheHeadingAmount() {
        Assert.assertTrue(adminPage.pharmacyAmount.isDisplayed());
    }

    @Then("Verify that The Pharmacy Bill List on the Pharmacy page have the heading Paid Amount.")
    public void verifyThatThePharmacyBillListOnThePharmacyPageHaveTheHeadingPaidAmount() {
        Assert.assertTrue(adminPage.pharmacyPaidAmount.isDisplayed());
    }

    @Then("Verify that The Pharmacy Bill List on the Pharmacy page have the heading Balance Amount.")
    public void verifyThatThePharmacyBillListOnThePharmacyPageHaveTheHeadingBalanceAmount() {
        Assert.assertTrue(adminPage.pharmacyBalanceAmount.isDisplayed());
    }


    @And("user should be able to on the Pathology page")
    public void userShouldBeAbleToOnThePathologyPage() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("admin/pathology/gettestreportbatch"));

    }

    @Given("Click the Generate Bill button on Pathology page.")
    public void clickTheGenerateBillButtonOnPathologyPage() {
        adminPage.generateBillButton.click();
    }

    @And("switch from the Pathology page to the Generete Bill page")
    public void switchFromThePathologyPageToTheGenereteBillPage() {
        adminPage.newPatientButton.isDisplayed();
    }

    @And("click X Icon")
    public void clickXIcon() {
        JSUtilities.clickWithJS(Driver.getDriver(), adminPage.xIconButton);


    }

    @And("Verify that the *Search By Patient Name* search box is enable in the navbar.")
    public void verify_that_the_search_by_patient_name_search_box_is_enable_in_the_navbar() {
        Assert.assertTrue(adminPage.searchByPatientNameLabel.isEnabled());
    }

    @And("Enter a patient name in the *Search By Patient Name* search box.")
    public void enter_a_patient_name_in_the_search_by_patient_name_search_box() {
        adminPage.searchByPatientNameLabel.sendKeys(ConfigReader.getProperty("patientName") + Keys.ENTER);
    }

    @And("Verify that the Searchbox returns the correct result.")
    public void verify_that_the_searchbox_returns_the_correct_result() {
        String actualName = adminPage.checkNameFromPatientList.getText().toLowerCase();
        String expectedName = ConfigReader.getProperty("patientName");

        Assert.assertTrue("Search box does not return the correct result", actualName.contains(expectedName));
    }

    @And("Verify that there is a flag icon in the navbar to change the language of the admin panel")
    public void verify_that_there_is_a_flag_icon_in_the_navbar_to_change_the_language_of_the_admin_panel() {
        Assert.assertTrue(adminPage.flagIcon.isEnabled());
    }

    @Given("Click on the Turkish flag icon")
    public void click_on_the_turkish_flag_icon() {
        adminPage.flagIcon.click();
        adminPage.flagTurkish.click();
        ReusableMethods.bekle(1);
    }

    @Given("Verify that the language of the panel has changed")
    public void verify_that_the_language_of_the_panel_has_changed() {

        String actualText = adminPage.randevuMenu.getText();
        String expectedText = ConfigReader.getProperty("controlLanguage");

        Assert.assertEquals("Language icon does not translate panel language", expectedText, actualText);
        ReusableMethods.bekle(1);
        adminPage.flagIcon.click();
        adminPage.flagEnglish.click();
    }

    @Given("Verify that there is a notification icon link in the navbar.")
    public void verify_that_there_is_a_notification_icon_link_in_the_navbar() {
        Assert.assertTrue(adminPage.notificationIcon.isDisplayed());
        Assert.assertTrue(adminPage.notificationIcon.isEnabled());
    }

    @Given("Switch from the Pathology page to the Pathology Test page.")
    public void switchFromThePathologyPageToThePathologyTestPage() {
        HealMethods.clickIconWith3Line(1);
    }

    @Given("Parameters added expected areas")
    public void parametersAddedExpectedAreas() {

        Actions actions = new Actions(Driver.getDriver());
        Faker faker1 = new Faker();
        String testName = faker1.medical().diseaseName();


        String firstLine1 = adminPage.firstAddedPatient.getText();

        ReusableMethods.bekle(2);
        actions.click(adminPage.testNamePathology)
                .sendKeys(testName)
                .sendKeys(Keys.TAB)
                .sendKeys(faker1.medical().medicineName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker1.medical().symptoms())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ENTER).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER)
                .sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ENTER)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).perform();
        ReusableMethods.bekle(5);
        actions.click(adminPage.chargeNAme).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ENTER)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ENTER)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).perform();
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.ENTER).perform();
        ReusableMethods.bekle(2);

        String firstLine2 = adminPage.firstAddedPatient.getText();

        Assert.assertNotEquals(firstLine1, firstLine2);
    }

    @And("The pathology tests page should be listed with the headings")
    public void thePathologyTestsPageShouldBeListedWithTheHeadings() {
        HealMethods.makeFilterTest("Test Name", 1, 8);
        HealMethods.makeFilterTest("Short Name", 2, 8);
        HealMethods.makeFilterTest("Test Type", 3, 8);
        HealMethods.makeFilterTest("Category", 4, 8);
        HealMethods.makeFilterTest("Sub Category", 5, 8);
        HealMethods.makeFilterTest("Method", 6, 8);
        HealMethods.makeFilterTest("Report Days", 7, 8);

    }



    @And("The saved test should be displayed in the Pathology Test List")
    public void theSavedTestShouldBeDisplayedInThePathologyTestList() {
        String aa = Driver.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]//tbody//tr[1]//td[1]")).getText();
//        Assert.assertEquals(aa,testName);
    }

    @And("Create a bill on the relevant patient")
    public void createABillOnTheRelevantPatient() throws IOException {
        HealMethods.generateBillInfo();
        ReusableMethods.bekle(2);


    }

    @Given("Confirm Bill No and Date information")
    public void confirmBillNoAndDateInformation() {
        Assert.assertTrue(adminPage.getBillNo.isDisplayed());
        Assert.assertTrue(adminPage.dateInfo.isDisplayed());


    }

    @Given("More than one test parameter can be added")
    public void moreThanOneTestParameterCanBeAdded() {
        Assert.assertTrue(adminPage.addButtonPathology.isEnabled());
        Assert.assertEquals(adminPage.testParamNameList.size(), 1);
        adminPage.addButtonPathology.click();
        Assert.assertEquals(adminPage.testParamNameList.size(), 2);
    }

    @And("click on add Pathology Test button")
    public void clickOnAddPathologyTestButton() {
        adminPage.addPathologyTestButton.click();
    }


    @Given("Click on the notification icon.")
    public void click_on_the_notification_icon() {
        adminPage.notificationIcon.click();
    }

    @Given("Verify that unread notifications are indicated by a number on the icon.")
    public void verify_that_unread_notifications_are_indicated_by_a_number_on_the_icon() {
        numberOfNotification1 = adminPage.numberOfNotification.getText();
        Assert.assertTrue("Unread notifications are not shown with a number on the icon.", numberOfNotification1.matches("\\d+"));
    }

    @Given("Click on the unread notification message on the notification page")
    public void click_on_the_unread_notification_message_on_the_notification_page() {
        List<WebElement> unreadNotification = Driver.getDriver().findElements(By.xpath("//div[@class='accordianheader  unreadbg ui-accordion-header ui-state-default ui-corner-all ui-accordion-icons']"));
        for (int i = 0; i < unreadNotification.size(); i++) {
            JSUtilities.clickWithJS(Driver.getDriver(), unreadNotification.get(i));
            break;
        }//>>dinamik olması icin tıklamak yerine bu methodu olusturdum
        //adminPage.aNotificationOnNotificationPage.click();
    }

    @Given("The page refreshes.")
    public void the_page_refreshes() {
        Driver.getDriver().navigate().refresh();
        ReusableMethods.bekle(1);
    }

    @Given("Verify that the number displayed on the notification icon decreases by one.")
    public void verify_that_the_number_displayed_on_the_notification_icon_decreases_by_one() {
        numberOfNotification2 = adminPage.numberOfNotification.getText();
        int numberOfUnread = Integer.parseInt(numberOfNotification1);
        int numberOfRead = Integer.parseInt(numberOfNotification2);
        Assert.assertTrue("Number does not decrease when unread notifications are opened", numberOfUnread - numberOfRead == 1);
    }

    @Given("Verify that the notification page has Type, Subject, Date headers.")
    public void verify_that_the_notification_page_has_type_subject_date_headers() {
        Assert.assertTrue("There is no Type header on the notification page", adminPage.TypeHeader.isDisplayed());
        Assert.assertTrue("There is no Subject header on the notification page", adminPage.SubjectHeader.isDisplayed());
        Assert.assertTrue("There is no Data header on the notification page", adminPage.DateHeader.isDisplayed());
    }

    @Given("Click on notification message {int} on the notification page.")
    public void click_on_notification_message_on_the_notification_page(Integer index) {
        adminPage.getNotificationOnNotificationPage(index).click();
    }

    @Given("Verify that the detail is displayed when click on the notification message {int}")
    public void verify_that_the_detail_is_displayed_when_click_on_the_notification_message(Integer index) {
        ReusableMethods.bekle(5);
        Assert.assertTrue("Notification detail not visible", adminPage.getNotificationDetailOnNotificationPage(index).isDisplayed());
    }

    @Given("The number of unread notifications is saved")
    public void the_number_of_unread_notifications_is_saved() {
        numberOfUnreadNotification1 = Driver.getDriver().findElements(By.xpath("//div[@class='accordianheader  unreadbg ui-accordion-header ui-state-default ui-corner-all ui-accordion-icons']")).size();

    }

    @Given("Verify that the number of unread notifications has decreased")
    public void verify_that_the_number_of_unread_notifications_has_decreased() {
        numberOfUnreadNotification2 = Driver.getDriver().findElements(By.xpath("//div[@class='accordianheader  unreadbg ui-accordion-header ui-state-default ui-corner-all ui-accordion-icons']")).size();
        Assert.assertTrue("Unable to recognise that a clicked notification has been read",numberOfUnreadNotification1>numberOfUnreadNotification2);
    }

    @Given("Click the Delete All button on the notification page.")
    public void click_the_delete_all_button_on_the_notification_page() {
        adminPage.deleteAllButtonOnNotificationPage.click();
    }

    @Given("The *Are you sure want to delete?* allert is accepted.")
    public void the_are_you_sure_want_to_delete_allert_is_accepted() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @Given("Verify that text {string} is displayed.")
    public void verify_that_text_is_displayed(String text) {
        WebElement textElement = Driver.getDriver().findElement(By.xpath("//*[text()='" + text + "']"));
        String actualText = JSUtilities.getTextWithJS(Driver.getDriver(), textElement);
        String expectedText = text;
        Assert.assertEquals("*" + text + "* text is not visible", expectedText, actualText);
    }

    @Given("Verify that there are no notifications on the page.")
    public void verify_that_there_are_no_notifications_on_the_page() {
        Driver.getDriver().navigate().refresh();
        int notificationOfNumber = Driver.getDriver().findElements(By.xpath("//div[@class='note-content']")).size();
        Assert.assertTrue(notificationOfNumber == 0);
        Assert.assertTrue(adminPage.noRecordFoundTexi.isDisplayed());
    }

    @Given("Verify that there is a chat icon link in the navbar.")
    public void verify_that_there_is_a_chat_icon_link_in_the_navbar() {
        Assert.assertTrue(adminPage.chatIconu.isDisplayed());
        Assert.assertTrue(adminPage.chatIconu.isEnabled());
    }

    @Given("Click on the chat icon.")
    public void click_on_the_chat_icon() {
        adminPage.chatIconu.click();
    }

    @And("Verify that there is a Chat System window on the Chat page.")
    public void verify_that_there_is_a_chat_system_window_on_the_chat_page() {
        Assert.assertTrue(adminPage.chatSystemWindow.isDisplayed());
        Assert.assertTrue(adminPage.chatSystemWindow.isEnabled());
    }

    @Given("Verify that there are people who have been previously contacted under the chat system.")
    public void verify_that_there_are_people_who_have_been_previously_contacted_under_the_chat_system() {
        int numberOfContactedPerson = Driver.getDriver().findElements(By.xpath("//li[@class='contact']")).size();
        Assert.assertTrue("There are no previous contacts", numberOfContactedPerson > 0);
        Assert.assertTrue("Previous contacts are not visible", adminPage.contactDuyguGunaydin.isDisplayed());
        Assert.assertTrue("Previous contacts are not enable", adminPage.contactDuyguGunaydin.isEnabled());

    }

    @Given("Click on the + icon on the Chat System")
    public void click_on_the_icon_on_the_chat_system() {
        adminPage.addContactButtonOnChatPage.click();
    }

    @Given("Enter the contact name in the search text box.")
    public void enter_the_contact_name_in_the_search_text_box() {
        adminPage.addContactSearchLabel.sendKeys(ConfigReader.getProperty("contactName"));
        ReusableMethods.bekle(1);
        adminPage.addContactFirstPerson.click();
    }

    @Given("Click on the +Add button.")
    public void click_on_the_add_button() {
        adminPage.addContactSubmitButton.click();
    }

    @Given("Verify that the contact added under the chat system is visible.")
    public void verify_that_the_contact_added_under_the_chat_system_is_visible() {
        String actualContact = adminPage.contactedFirstPersonOnChatPage.getText();
        String expectedContact = ConfigReader.getProperty("contactName");
        Assert.assertTrue("Added person is not visible", actualContact.contains(expectedContact));

    }

    @Given("Verify that there is a chat section where messages can be written and sent and where the incoming message can be read.")
    public void verify_that_there_is_a_chat_section_where_messages_can_be_written_and_sent_and_where_the_incoming_message_can_be_read() {
        Assert.assertTrue(adminPage.messagesFrame.isDisplayed());
        Assert.assertTrue(adminPage.messagesFrame.isEnabled());
    }

    @Given("Type a message in the *Write Your Message* textbox and send it.")
    public void type_a_message_in_the_write_your_message_textbox_and_send_it() {
        adminPage.contactedFirstPersonOnChatPage.click();
        adminPage.writeYourMessageLabel.sendKeys(ConfigReader.getProperty("randomMessage"));
        adminPage.messageSubmitButton.click();
    }

    @Given("Verify that the typed message is visible.")
    public void verify_that_the_typed_message_is_visible() {
        WebElement lastSentMessage = Driver.getDriver().findElement
                (By.xpath("(//*[text()='" + ConfigReader.getProperty("randomMessage") + "'])[2]"));
        String actualMessage = lastSentMessage.getText();
        String expectedMessage = ConfigReader.getProperty("randomMessage");
        Assert.assertEquals("Message sent is not displayed on the page", expectedMessage, actualMessage);
    }

    @Given("Verify that there is a calendar icon link in the navbar.")
    public void verify_that_there_is_a_calendar_icon_link_in_the_navbar() {
        Assert.assertTrue(adminPage.calendarIcon.isDisplayed());
        Assert.assertTrue(adminPage.calendarIcon.isEnabled());
    }

    @Given("Click on the calendar icon.")
    public void click_on_the_calendar_icon() {
        adminPage.calendarIcon.click();
    }

    @Given("Verify that there is a calendar and to do list on the page.")
    public void verify_that_there_is_a_calendar_and_to_do_list_on_the_page() {
        Assert.assertTrue(adminPage.calendarFrame.isDisplayed());
        Assert.assertTrue(adminPage.toDoListFrame.isDisplayed());
    }

    @Given("Click on day {string} in the calendar")
    public void click_on_day_in_the_calendar(String day) {
        HealMethods.clickBlueOrAnyButton(day);
    }

    @Given("Enter the information in the opened window and save.")
    public void enter_the_information_in_the_opened_window_and_save() {
        adminPage.eventTitleLabel.
                sendKeys(ConfigReader.getProperty("eventName")
                        + Keys.TAB
                        + actions.sendKeys(ConfigReader.getProperty("eventDescription"))
                        + Keys.TAB + Keys.TAB + Keys.TAB
                        + Keys.ENTER);
        ReusableMethods.bekle(1);
    }

    @Given("Verify that the event is visible on the selected day.")
    public void verify_that_the_event_is_visible_on_the_selected_day() {

        HealMethods.lookFromListForPositiveSenarioAssert("//span[@class='fc-title']", "eventName", "Added event not displayed");

    }

    @Given("Verify that the Month, Week, Day buttons are enabled for filtering.")
    public void verify_that_the_month_week_day_buttons_are_enabled_for_filtering() {
        adminPage.monthButton.click();
        adminPage.weekButton.click();
        adminPage.dayButton.click();

        Assert.assertTrue("Month button is not enabled", adminPage.monthButton.isEnabled());
        Assert.assertTrue("Week button is not enabled", adminPage.weekButton.isEnabled());
        Assert.assertTrue("Day button is not enabled", adminPage.dayButton.isEnabled());
    }

    @Given("Verify that the date change arrows are enabled.")
    public void verify_that_the_date_change_arrows_are_enabled() {

        adminPage.leftArrowButton.click();
        adminPage.todayButton.click();
        adminPage.rightArrowButton.click();

        Assert.assertTrue("Left button is not enabled", adminPage.leftArrowButton.isEnabled());
        Assert.assertTrue("Right button is not enabled", adminPage.rightArrowButton.isEnabled());
        Assert.assertTrue("Today button is not enabled", adminPage.todayButton.isEnabled());
    }

    @Given("Add a new task")
    public void add_a_new_task() {
        adminPage.addTaskButton.click();
        adminPage.titleLabelOnAddTaskWindow.sendKeys(ConfigReader.getProperty("taskName")
                + Keys.TAB
                + actions.sendKeys(ConfigReader.getProperty("taskDate"))
                + Keys.TAB
                + Keys.ENTER);
        ReusableMethods.bekle(1);
    }

    @Given("Verify that a new task has been added.")
    public void verify_that_a_new_task_has_been_added() {
        //verify_that_text_is_displayed("Record Saved Successfully");
        HealMethods.lookFromListForPositiveSenarioAssert("//p[@class='tododesc']", "taskName", "Added task not displayed");

    }

    @Given("Task information is updated")
    public void task_information_is_updated() {

        adminPage.taskEditButton.click();
        adminPage.titleLabelOnAddTaskWindow.clear();
        adminPage.titleLabelOnAddTaskWindow.sendKeys(ConfigReader.getProperty("editTaskName")
                + Keys.TAB
                + actions.sendKeys(ConfigReader.getProperty("taskDate"))
                + Keys.TAB
                + Keys.ENTER);
        ReusableMethods.bekle(1);
    }

    @Given("Verify that the task has been updated.")
    public void verify_that_the_task_has_been_updated() {

        //verify_that_text_is_displayed("Record Updated Successfully");
        HealMethods.lookFromListForPositiveSenarioAssert("//p[@class='tododesc']", "editTaskName", "Edited task not displayed");

    }

    @Given("Task is deleted")
    public void task_is_deleted() {

        adminPage.taskRemoveButton.click();
        Driver.getDriver().switchTo().alert().accept();
    }

    @Given("Verify that the task has been deleted")
    public void verify_that_the_task_has_been_deleted() {

        //verify_that_text_is_displayed("Record Deleted Successfully");
        HealMethods.lookFromListForNegativeSenarioAssert("//p[@class='tododesc']", "editTaskName", "Deleted task is displayed");
        ReusableMethods.bekle(1);
    }

    @Given("Verify that there is a task icon link in the navbar")
    public void verify_that_there_is_a_task_icon_link_in_the_navbar() {

        Assert.assertTrue("Task icon not displayed in navbar", adminPage.taskIcon.isDisplayed());
        Assert.assertTrue("Task icon not enabled in navbar", adminPage.taskIcon.isEnabled());
    }

    @Given("Click on the Task icon.")
    public void click_on_the_task_icon() {

        adminPage.taskIcon.click();
    }

    @Given("Verify that the tasks are visible in the opened window.")
    public void verify_that_the_tasks_are_visible_in_the_opened_window() {

        List<WebElement> taskListOnTaskWindow = Driver.getDriver().findElements(By.xpath("//div[@class='checkbox']"));

        // task yoksa once task eklıyorum
        if (!(taskListOnTaskWindow.size() > 0)) {
            adminPage.calendarIcon.click();
            add_a_new_task();
            adminPage.heallifeLogo.click();
        }

        for (int i = 0; i < taskListOnTaskWindow.size(); i++) {
            Assert.assertTrue(taskListOnTaskWindow.get(i).getText() +" task is not visible", taskListOnTaskWindow.get(i).isDisplayed());
        }
    }

    @Given("Verify that there is a Bed Status link in the navbar.")
    public void verify_that_there_is_a_bed_status_link_in_the_navbar() {
        Assert.assertTrue("Bed Status link icon not displayed in navbar", adminPage.bedStatusIcon.isDisplayed());
        Assert.assertTrue("Bed Status link icon not enabled in navbar", adminPage.bedStatusIcon.isEnabled());
    }
    @Given("Click on the Bed Status link.")
    public void click_on_the_bed_status_link() {
        adminPage.bedStatusIcon.click();
    }
    @Given("Verify that Bed Status information is displayed.")
    public void verify_that_bed_status_information_is_displayed() {
        adminPage.bedStatusInformationWindow.isDisplayed();
    }

    @Given("Verify that inpatient information is displayed.")
    public void verify_that_inpatient_information_is_displayed() {
        adminPage.bedStatusInformationWindow.isDisplayed();
    }

    @Given("Verify that there is a profile icon link in the navbar.")
    public void verify_that_there_is_a_profile_icon_link_in_the_navbar() {
        Assert.assertTrue("Profile icon link not displayed in navbar", adminPage.profileIcon.isDisplayed());
        Assert.assertTrue("Profile icon link not enabled in navbar", adminPage.profileIcon.isEnabled());
    }
    @Given("Click on the profile icon link in the navbar.")
    public void click_on_the_profile_icon_link_in_the_navbar() {
        adminPage.profileIcon.click();
    }
    @Given("Verify that there are profile, password and logout buttons in the opened window.")
    public void verify_that_there_are_profile_password_and_logout_buttons_in_the_opened_window() {

        Assert.assertTrue("Profile button not displayed",adminPage.profileButton.isDisplayed());
        Assert.assertTrue("Profile button not enable",adminPage.profileButton.isEnabled());

        Assert.assertTrue("Password button not displayed",adminPage.passwordButton.isDisplayed());
        Assert.assertTrue("Password button not enable",adminPage.passwordButton.isEnabled());

        Assert.assertTrue("Logout button not displayed",adminPage.logoutButon.isDisplayed());
        Assert.assertTrue("Logout button not enable",adminPage.logoutButon.isEnabled());
    }

    @Given("Click on the profile picture.")
    public void click_on_the_profile_picture() {
        adminPage.profileImageIcon.click();
    }

    @Given("Verify that the administrator's information is displayed with details.")
    public void verify_that_the_administrator_s_information_is_displayed_with_details() {
        Assert.assertTrue("Admin profile information is not visible",adminPage.adminInformationWindowRight.isDisplayed());
        Assert.assertTrue("Admin profile information is not visible",adminPage.adminInformationWindowLeft.isDisplayed());
    }

    @Given("Click on the profile button")
    public void click_on_the_profile_button() {
        adminPage.profileButton.click();
    }
    @Given("Click on the edit button")
    public void click_on_the_edit_button() {
        adminPage.editButton.click();
    }
    @Given("Profile information is updated")
    public void profile_information_is_updated() {
       adminPage.fatherNameLabel.clear();
       adminPage.motherNameLabel.clear();

        adminPage.fatherNameLabel.sendKeys(ConfigReader.getProperty("fatherName")
                + Keys.TAB
                + actions.sendKeys(ConfigReader.getProperty("motherName"))
                +Keys.END);
        HealMethods.clickBlueOrAnyButton(" Save");
    }

    @Given("Click on the Password button")
    public void click_on_the_password_button() {
        adminPage.passwordButton.click();
    }
    @Given("Enter new password information and save")
    public void enter_new_password_information_and_save() {
        adminPage.currentPasswordLabel.sendKeys(ConfigReader.getProperty("duyguAdminPassword")
                +Keys.TAB
                +actions.sendKeys("newPassword")
                +Keys.TAB
                +actions.sendKeys("newPassword")
                +Keys.TAB
                +Keys.ENTER);
    }

    @Given("Verify that unread messages are indicated by a number on the icon.")
    public void verify_that_unread_messages_are_indicated_by_a_number_on_the_icon() {
        numberOfMessage1 = adminPage.numberOfMessage.getText();
        Assert.assertTrue("Unread messages are not shown with a number on the icon.", numberOfMessage1.matches("\\d+"));
    }
    @Given("Click on the unread message on the message page")
    public void click_on_the_unread_message_on_the_message_page() {
        ReusableMethods.bekle(1);
        adminPage.contactDuyguGunaydin.click();
    }
    @Given("Verify that the number displayed on the message icon decreases by one.")
    public void verify_that_the_number_displayed_on_the_message_icon_decreases_by_one() {
        numberOfMessage2 = adminPage.numberOfMessage.getText();
        int numberOfUnread = Integer.parseInt(numberOfMessage1);
        int numberOfRead = Integer.parseInt(numberOfMessage2);
        System.out.println(numberOfMessage1);
        System.out.println(numberOfMessage2);
        Assert.assertTrue("Number does not decrease when unread message are opened", numberOfUnread>numberOfRead);
    }

    @Given("A message is sent to the admin.")
    public void a_message_is_sent_to_the_admin() {
        adminPage.profileIcon.click();
        adminPage.logoutButon.click();
        adminPage.loginAsAdmin("duyguDoctorUsername","duyguDoctorPassword");
        adminPage.chatIconu.click();
        adminPage.contactDuyguGunaydin.click();
        adminPage.writeYourMessageLabel.sendKeys("Hi");
        adminPage.messageSubmitButton.click();
        ReusableMethods.bekle(1);
        adminPage.writeYourMessageLabel.sendKeys("I am Duygu Gunaydın");
        adminPage.messageSubmitButton.click();
        ReusableMethods.bekle(1);
        adminPage.profileIcon.click();
        adminPage.logoutButon.click();
        adminPage.loginAsAdmin("duyguAdminUsername","duyguAdminPassword");
    }

    @Given("Verify that text Record Updated Succesfully is displayed.")
    public void verify_that_text_record_updated_succesfully_is_displayed() {
        Assert.assertTrue(adminPage.recordUpdatedSuccessfullyText.isDisplayed());
    }

    @Given("Verify that the password can be changed")
    public void verify_that_the_password_can_be_changed() {
        Assert.assertFalse("Password could not be successfully changed. Error Code : "+adminPage.errorCode.getText(),adminPage.errorCode.isDisplayed());

    }

    @And("Confirm that Test Details page is visible.")
    public void confirmThatTestDetailsPageIsVisible() {
        Assert.assertTrue(adminPage.testDetails.isDisplayed());
    }

    @Given("New patient data should be added to List")
    public void newPatientDataShouldBeAddedToList() {
        String firstLine1 = adminPage.firstAddedPatient.getText();
        HealMethods.createNewPatient();

        Actions actions = new Actions(Driver.getDriver());
        Faker faker1 = new Faker();

        ReusableMethods.bekle(2);
        actions.click(adminPage.admissionDate)
                .sendKeys(faker1.date().toString())
                .sendKeys(Keys.TAB)
                .sendKeys(faker1.medical().symptoms())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker1.number().digits(100))
                .sendKeys(Keys.TAB)
                .sendKeys(faker1.name().name())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ENTER).perform();

        ReusableMethods.bekle(2);
        Select ddm = new Select(adminPage.bedGroup);
        ddm.selectByIndex(3);
        ReusableMethods.bekle(4);

        Select ddm2 = new Select(adminPage.bedNumber);
        ddm2.selectByIndex(1);
        ReusableMethods.bekle(2);

             actions.sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).perform();

        ReusableMethods.bekle(2);

        String firstLine2 = adminPage.firstAddedPatient.getText();
        Assert.assertNotEquals(firstLine1, firstLine2);

    }



    //===========================================================US35==========================================
    @Given("User goes to the admin page.")
    public void userGoesToTheAdminPage() {
        Driver.getDriver().get(ConfigReader.getProperty("adminPageUrl"));
    }

    @Then("Verify that the URL of the website is correctt.")
    public void verifyThatTheURLOfTheWebsiteIsCorrectt() {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = ConfigReader.getProperty("adminPageUrl");
        Assert.assertEquals("The Url of the home page is correct", expectedUrl, actualUrl);
    }

    @Then("Verify that the Latest New information is visible.")
    public void verifyThatTheLatestNewInformationIsVisible() {
        Driver.getDriver().get(ConfigReader.getProperty("adminPageUrl"));
       Assert.assertTrue(adminPage.adminloginNews.isDisplayed());
    }


    @Then("Click on the Sign in button")
    public void clickOnTheSignInButton() {
        adminPage.adminSignInButton.click();
    }

    @Then("Login to adminn page  {string} {string}")
    public void loginToAdminPage(String username, String password) {
            HealMethods.loginAsAdmin(username,password);

        }

    @Then("It is verified that the admin page has been entered.")
    public void ıtIsVerifiedThatTheAdminPageHasBeenEntered() {
        String expectedAdmindUrl = "https://qa.heallifehospital.com/admin/admin/dashboard";
        String actualAdminUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedAdmindUrl, actualAdminUrl);
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);

    }

    @And("Verify that the panel cannot be accessed with an invalid password or password")
    public void verifyThatThePanelCannotBeAccessedWithAnInvalidPasswordOrPassword() {
        Assert.assertTrue(adminPage.signInButton.isEnabled());
        Driver.getDriver().navigate().back();
    }

    @And("enters {string} from examples as username")
    public void entersFromExamplesAsUsername(String username) {
        adminPage.adminUsernameBox.sendKeys(username);
    }

    @And("enters {string} from examples as password")
    public void entersFromExamplesAsPassword(String password) {
        adminPage.adminPasswordBox.sendKeys(password);
    }

    @Then("There should be a forget password link on the login page")
    public void thereShouldBeAForgetPasswordLinkOnTheLoginPage() {
       Assert.assertTrue( adminPage.adminForgetPassword.isDisplayed());


    }

    @And("Verify that It should redirect to the {string} page.")
    public void verifyThatItShouldRedirectToThePage(String arg0) {
        adminPage.adminForgetPassword.click();
        String expectedForgetPasswordUrl = "https://qa.heallifehospital.com/site/forgotpassword";
        String actualAdminUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedForgetPasswordUrl, actualAdminUrl);

    }

    @And("The user have enter an email in the email box.")
    public void theUserHaveEnterAnEmailInTheEmailBox() {
        adminPage.adminForgetPassword.click();
        adminPage.adminUsernameBox.sendKeys("asd@gmail.com");
        adminPage.adminSubmitButton.click();

    }

    @Then("Verify that the password has been sent to the e-mail")
    public void verifyThatThePasswordHasBeenSentToTheEMail() {
        adminPage.passwordSentYourEmail.isDisplayed();

    }

    @Then("There should be a admin login link on the login page")
    public void thereShouldBeAAdminLoginLinkOnTheLoginPage() {
        adminPage.adminForgetPassword.click();

    }

    @Then("Verify that it is returned to the login page")
    public void verifyThatItIsReturnedToTheLoginPage() {
        adminPage.adminLogoBox.click();
        String Url = "https://qa.heallifehospital.com/site/login";
        String actualAdminUrl = Driver.getDriver().getCurrentUrl();
        ReusableMethods.bekle(2);
        Assert.assertEquals(Url, actualAdminUrl);


    }
    @And("click on sign in button")
    public void clickOnSignInButton() {
        adminPage.adminSignInButton.click();
    }


    @And("Admin Login sayfasında gecerli username  ve password girer")
    public void adminLoginSayfasındaGecerliUsernameVePasswordGirer() {
        AdminPage.adminLogin("yusuf.kombe.admin@heallifehospital.com","heallife123");
    }

    @Given("Dashboardda Appointment sekmesine tiklanir")
    public void dashboarddaAppointmentSekmesineTiklanir() {
        adminPage.dashboardAppointmentButton.click();
    }


    @And("URl'in appointment icerdigi  dogrulanir.")
    public void urlInAppointmentIcerdigiDogrulanir() {
        String actualTitle= Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualTitle.contains("appointment"));
    }

    @And("Logout admin ile sayfa kapatilir")
    public void logoutAdminIleSayfaKapatilir() {
        adminPage.adminProfilButton.click();
        adminPage.adminLogoutButton.click();
        ReusableMethods.sleep(2);
        //Driver.quitDriver();

    }

    @Then("Detailsde {string} oldugu dogrulanir")
    public void detailsdeOlduguDogrulanir(String data) {
        Assert.assertTrue(adminPage.baslikListelemeMethod(1,data));
    }

    @Then("Appointment No ya gore listelendigini kontrol eder")
    public void appointmentNoYaGoreListelendiginiKontrolEder() {
        Assert.assertTrue(adminPage.intListSortTest(2));
    }


    @And("arama sonuclarin dogru goruntulendigi test edilir.")
    public void aramaSonuclarinDogruGoruntulendigiTestEdilir() {
        Assert.assertTrue(adminPage.appointmentSearchResultNameColumn.getText().contains("yusuf"));
    }

    @Then("Appointment Details sayfasinda search box tiklanir ve {string} datasi gonderilir")
    public void appointmentDetailsSayfasindaSearchBoxTiklanirVeDatasiGonderilir(String data) {
        adminPage.appointmentSearchBoxButton.sendKeys(data);
    }

    @Then("Status sekmesi altinda show butonuna tiklanir")
    public void statusSekmesiAltindaShowButonunaTiklanir() {

        WebElement element = Driver.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr[3]/td[1]/div/a[1]/i"));

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();

        element.click();


    }

    @Then("Doctor Wise butonuna tiklanir")
    public void doctorWiseButonunaTiklanir() {
        adminPage.doctorWiseButton.click();

    }


    @Then("Doctor Wise butonuna tiklanir ve Doctor hanesinden {string} secillir")
    public void doctorWiseButonunaTiklanirVeDoctorHanesindenSecillir(String data) {
        adminPage.doctorWiseButton.click();
        ReusableMethods.sleep(3);
        select= new Select(adminPage.doctorWiseSelectDropDown);
        select.selectByValue("39");

    }

    @And("Date hanesine {string} tarihi girilir")
    public void dateHanesineTarihiGirilir(String data) {
        adminPage.doctorWiseDateSelectLabel.sendKeys(data+Keys.TAB);
    }

    @And("Doctor Wise da Search butonuna tiklanir")
    public void doctorWiseDaSearchButonunaTiklanir() {
        adminPage.doctorWiseSearchButton.click();
    }

    @And("Sonuclarin goruntulendigi dogrulanir")
    public void sonuclarinGoruntulendigiDogrulanir() {
        Assert.assertTrue(adminPage.doctorWiseResultRow.isDisplayed());
    }

    @And("Acilan sayfanin urlinde {string} bulundugu dogrulanir")
    public void acilanSayfaninUrlindeBulunduguDogrulanir(String data) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(data));
    }

    @Then("Appointment sayfasinda Queue sekmesine tiklanir")
    public void appointmentSayfasindaQueueSekmesineTiklanir() {
        adminPage.doctorWiseQueueButton.click();
    }

    @And("Sayfa URLinin {string} icerdigi dogrulanir")
    public void sayfaURLininIcerdigiDogrulanir(String arg0) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(arg0));
    }

    @And("Patient Queue sayfasinda doktor hanesine {string} girilir")
    public void patientQueueSayfasindaDoktorHanesineGirilir(String data) {
        select= new Select(adminPage.doctorWiseSelectDropDown);
        select.selectByValue("39");
    }

    @And("Patient Queue sayfasinda shift hanesine {string} girilir")
    public void patientQueueSayfasindaShiftHanesineGirilir(String data) {
        select=new Select(adminPage.queueShiftSelectLabel);
        select.selectByVisibleText(data);
        actions.sendKeys(Keys.TAB).perform();
    }

    @And("Patient Queue sayfasinda date hanesine {string} tarihi girilir")
    public void patientQueueSayfasindaDateHanesineTarihiGirilir(String data) {
        adminPage.doctorWiseDateSelectLabel.sendKeys(data+Keys.TAB);

    }



    @Then("Patient Queue sayfasinda search butonuna basilir")
    public void patientQueueSayfasindaSearchButonunaBasilir() {
        adminPage.doctorWiseSearchButton.click();
    }


    @And("Patient Queue sayfasinda slota giris yapilir")
    public void patientQueueSayfasindaSlotaGirisYapilir() {
        select=new Select(adminPage.queueSlotLabel);
        select.selectByIndex(1);


    }

    @Then("Gerekli url 'yi girer")
    public void gerekli_url_yi_girer() {
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        ReusableMethods.sleep(2);

    }

    @And("{int} saniye beklenir")
    public void saniyeBeklenir(int saniye) {

        ReusableMethods.sleep(saniye);
    }

    @And("Acilan sayfanin appointment detaylarini icerdigi dogrulanir")
    public void acilanSayfaninAppointmentDetaylariniIcerdigiDogrulanir() {

        WebElement element = Driver.getDriver().findElement(By.xpath("//*[@id=\"viewModal\"]/div/div/div[2]/div/div"));

        Assert.assertTrue(element.isDisplayed());

        Driver.getDriver().findElement(By.xpath("//*[@id=\"viewModal\"]/div/div/div[1]/button")).click();
    }

    @Given("Open browser and go to {string}")
    public void openBrowserAndGoTo(String url) {

        Driver.getDriver().get(ConfigReader.getProperty(url));
    }


    @Then("Click on Sign In")
    public void click_on_sign_in() {
        adminPage.signinButton.click();

    }
    @Then("Enter {string} into Search Box")
    public void enter_into_search_box(String data) {

        adminPage.searchBox.sendKeys(data);
    }
    @Then("Click on Dashboard")
    public void click_on_dashboard() {
        firstValue= adminPage.searchBox.getAttribute("autocomplete");
        adminPage.dashboardButton.click();
        secondValue=adminPage.searchBox.getAttribute("autocomplete");

    }
    @Then("Click on User Image")
    public void click_on_user_image() {
        ReusableMethods.bekle(1);
        adminPage.profilImageButton.click();

    }
    @Then("Click on Logout")
    public void click_on_logout() {
        ReusableMethods.bekle(1);
        adminPage.logoutButon.click();


    }


    @Given("It is verified that there are page links in the Dashboard sidebar {string}")
    public void ıtIsVerifiedThatThereArePageLinksInTheDashboardSidebar(String data) {


    }

    @Then("it is verify that {string} is not written in the searchbox")
    public void itIsVerifyThatIsNotWrittenInTheSearchbox(String data) {

        Assert.assertFalse(firstValue.equals(secondValue));
    }

    @Given("It is verified that there are page links in the Dashboard sidebar")
    public void ıtIsVerifiedThatThereArePageLinksInTheDashboardSidebar(List<String> list) {
        System.out.println(list);
        Assert.assertTrue(ReusableMethods.dashboardTitleListingMethod(list));
    }
}


