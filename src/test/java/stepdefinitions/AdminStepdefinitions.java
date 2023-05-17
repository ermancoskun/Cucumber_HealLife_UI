package stepdefinitions;


import com.beust.ah.A;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.AdminPage;
import utilities.*;

import utilities.Driver;
import utilities.HealMethods;
import utilities.JSUtilities;
import utilities.ReusableMethods;
import java.io.IOException;

import java.util.List;

public class AdminStepdefinitions {
    AdminPage adminPage=new AdminPage();
    Faker faker=new Faker();

    AdminPage adminpage=new AdminPage();



    Actions actions=new Actions(Driver.getDriver());
    static String numberOfNotification1;
    static String numberOfNotification2;

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


    @Then("Sees the FilterName and their Order")
    public void seesTheFilterNameAndTheirOrder () {
        HealMethods.makeFilterTest("Name", 1, 8);
        HealMethods.makeFilterTest("Patient Id", 2, 8);
        HealMethods.makeFilterTest("Guardian Name", 3, 8);
        HealMethods.makeFilterTest("Gender", 4, 8);
        HealMethods.makeFilterTest("Phone", 5, 8);
        HealMethods.makeFilterTest("Consultant", 6, 8);
        HealMethods.makeFilterTest("Last Visit", 7, 8);

    }

    @Then("Sees the name of Billing List and their contents")
    public void seesTheNameOfBillingListAndTheirContents () {
        HealMethods.makeFilterTest("Bill No", 1, 8);
        HealMethods.makeFilterTest("Case ID / Patient ID", 2, 8);
        HealMethods.makeFilterTest("Reporting Date", 3, 8);
        HealMethods.makeFilterTest("Patient Name", 4, 8);
        HealMethods.makeFilterTest("Reference Doctor", 5, 8);
        HealMethods.makeFilterTest("Amount ($)", 6, 8);
        HealMethods.makeFilterTest("Paid Amount ($)", 7, 8);
    }
    @And("Sees the name of Radiology Billing List and their contents")
    public void seesTheNameOfRadiologyBillingListAndTheirContents () {
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
        HealMethods.makeFilterTest("Bill No",1,11);
        HealMethods.makeFilterTest("Case ID / Patient ID",2,11);
        HealMethods.makeFilterTest("Issue Date",3,11);
        HealMethods.makeFilterTest("Received To",4,11);
        HealMethods.makeFilterTest("Blood Group",5,11);
        HealMethods.makeFilterTest("Gender",6,11);
        HealMethods.makeFilterTest("Donor Name",7,11);
        HealMethods.makeFilterTest("Bags",8,11);
    }
    @And("Click the Radiology button on Billing page")
    public void clickTheRadiologyButtonOnBillingPage () {
        adminPage.radiologyButton.click();

    }
    @And("test to searcbox")
    public void testToSearcbox () {
        HealMethods.makeSearchBoxTest();
    }

    @And("Click on the {string} button")
    public void clickOnTheButton(String isim) {
        HealMethods.clickBlueOrAnyButton(isim);
    }

    @And("Create a New Patient with random datas")
    public void createANewPatientWithRandomDatas () {
        HealMethods.createNewPatient();
    }

    @And("Choose All and {int} options for patient display")
    public void chooseAllAndOptionsForPatientDisplay ( int arg0){
        HealMethods.makeAll100Test();
    }
    @Then("Verified redirected to Patent Profile page")
    public void verifiedRedirectedToPatentProfilePage() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("patient_profile"));
    }

    @Then("Verified redirected to Bill Details page")
    public void verifiedRedirectedToBillDetailsPage () {

        String actualWindowTitle = Driver.getDriver().findElement(By.xpath("(//h4[@class='modal-title'])[3]")).getText();
        boolean flag=false;
        if (actualWindowTitle.equals("Bill Details")||
                Driver.getDriver().findElement(By.xpath("(//h4[@class='modal-title'])[1]")).getText().equals("Bill Details")){
                flag=true;
        }
          Assert.assertTrue("Unsuccessful redirection",flag);

        WebElement billDetailsElement = Driver.getDriver().findElement(By.xpath("(//h4[text()='Bill Details'])[1]"));
        Assert.assertTrue(billDetailsElement.isDisplayed());
    }
    @Then("Verified redirected to Blood Issue Details page")
    public void verifiedRedirectedToBloodIssueDetailsPage() {
        String actualWindowTitle = Driver.getDriver().findElement(By.xpath("(//h4[@class='modal-title'])[2]")).getText();
        boolean flag=false;
        if (actualWindowTitle.equals("Blood Issue Details")||
                Driver.getDriver().findElement(By.xpath("(//h4[@class='modal-title'])[1]")).getText().equals("Bill Details")){
            flag=true;
        }

        Assert.assertTrue("Unsuccessful redirection",flag);
        WebElement billDetailsElement = Driver.getDriver().findElement(By.xpath("(//h4[text()='Blood Issue Details'])"));
        Assert.assertTrue(billDetailsElement.isDisplayed());
    }
    @Then("Click the trash icon for delete {int}. Bill")
    public void clickTheTrashIconForDeleteBill(int sira) {
        HealMethods.clickTrashIconForDelete(sira);
        Driver.getDriver().switchTo().alert().accept();
        String actualMessage=JSUtilities.getTextWithJS(Driver.getDriver(),adminPage.warningMessage);
        Assert.assertEquals("Unsuccessful delete","Record Deleted Successfully",actualMessage);
    }
    @And("Click the Pathology button on Billing page")
    public void clickThePathologyButtonOnBillingPage () {
        adminPage.pathologyButton.click();
    }
    @And("Click the Blood Issue button on Billing page")
    public void clickTheBloodIssueButtonOnBillingPage() {
        adminPage.bloodIssueButton.click();
    }

    @And("Click {int}. iconButton under the last column for display first patient profile")
    public void clickIconButtonUnderTheLastColumnForDisplayFirstPatientProfile ( int sira){
        HealMethods.clickIconWith3Line(sira);

    }

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
    JSUtilities.clickWithJS(Driver.getDriver(),Driver.getDriver().findElement(By.xpath("//a[@class='edit_blood_issue']")));
    HealMethods.createNewPatient();
    JSUtilities.clickWithJS(Driver.getDriver(),Driver.getDriver().findElement(By.xpath("//input[@id='dates_of_issue']")));
    JSUtilities.clickWithJS(Driver.getDriver(),Driver.getDriver().findElement(By.xpath("//button[@id='formaddbtn']")));
    Assert.assertEquals("Edit not successful","Record Saved Successfully",adminPage.warningMessage.getText());
    JSUtilities.clickWithJS(Driver.getDriver(),adminPage.xIconButton);
    ReusableMethods.bekle(7);
    JSUtilities.clickWithJS(Driver.getDriver(),Driver.getDriver().findElement(By.xpath("//a[@class='delete_blood_issue']")));
    Driver.getDriver().switchTo().alert().accept();
    ReusableMethods.bekle(2);
    Assert.assertEquals("Delete not successful","Record Deleted Successfully",adminPage.warningMessage.getText());

    }
    @Then("Create a New Bill with random datas")
    public void createANewBillWithRandomDatas() throws IOException {
        HealMethods.generateBillInfo();
    }

    @Given("Click on the Add Patient button in IPD page")
    public void clickOnTheAddPatientButtonInIPDPage () {
        adminPage.addPatientButtonIPD.click();
    }

    @Given("Click on the Discarged Patient button")
    public void clickOnTheDiscargedPatientButton () {
        adminPage.dischargedPatientButton.click();


    }


    @And("user should be able to on the Discarged Patient page")
    public void userShouldBeAbleToOnTheDiscargedPatientPage () {
        Assert.assertTrue(adminPage.ipdDischargedConfirmationText.isDisplayed());
    }

    @Given("It should be displayed in the IPD Discharged Patient List")
    public void itShouldBeDisplayedInTheIPDDischargedPatientList (List < String > ipdTableHeads) {
        for (int i = 0; i < ipdTableHeads.size(); i++) {
            Assert.assertEquals(ipdTableHeads.get(i), adminPage.ipdPatientAndDischargePatientTableHeaders.get(i).getText());

        }
    }







    @And("Login to admin page as {string} {string}")
    public void loginToAdminPageAs (String username, String password){
        adminPage.loginAsAdmin(username, password);
    }

    @And("Verify that the heallife logo is visible in the navbar of the admin panel.")
    public void verifyThatTheHeallifeLogoIsVisibleInTheNavbarOfTheAdminPanel () {
        Assert.assertTrue("Heallife logo is not visible in the navbar of the admin panel", adminPage.heallifeLogo.isDisplayed());
    }

    @And("Click on the Billing Menu")
    public void clickOnTheBillingMenu () {
        adminPage.billingMenu.click();
    }

    @And("Click on the heallife logo in the Navbar")
    public void clickOnTheHeallifeLogoInTheNavbar () {
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
    public void verify_that_the_dashboard_menu_is_closed_when_clicked () {
        Assert.assertFalse("Dashboard menu does not open and close when clicked", adminPage.billingMenu.isDisplayed());
    }

    @And("Verify that the dashboard menu is opened when clicked")
    public void verify_that_the_dashboard_menu_is_opened_when_clicked () {
        Assert.assertTrue("Dashboard menu does not open and close when clicked", adminPage.billingMenu.isDisplayed());
    }

    @And("Verify that the Navbar has the text *Heal Life Hospital & Research Center*")
    public void verifyThatTheNavbarHasTheTextHealLifeHospitalResearchCenter() {
        Assert.assertTrue("The text *Heal Life Hospital & Research Center* is not visible in Navbar",adminPage.healLifeHospitalResearchCenterText.isDisplayed());
    }


    @And("It should be possible to sort through the titles")
    public void itShouldBePossibleToSortThroughTheTitles () {
        HealMethods.makeFilterTest("Phone", 5, 11);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////DGdown


    //============================================ Nesibe [US_040] OPD MENU ============================================

    @Then("Verify  the {string} page is visiable")
    public void verifyTheIsAdminDashboardVisiable(String arg0) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("admin/dashboard"));
    }

    @Then("Verify the OPD menu title on admin page is visible and enable")
    public void verifyTheOPDMenuTitleOnAdminPageIsVisibleAndEnable() {
        Assert.assertTrue(adminpage.opdSide.isDisplayed());
        Assert.assertTrue(adminpage.opdSide.isEnabled());
    }

    @Then("Verify the OPD Patient on admin page is redirected")
    public void verifyTheOPDMenuTitle() {
        Assert.assertTrue(adminpage.opdSide.isDisplayed());
        adminpage.opdSide.click();
        Assert.assertTrue(adminpage.opdPatientTitle.isDisplayed());
    }

    @Then("Click the OPD in the menu")
    public void clickTheOPDInTheMenu() {
        adminpage.opdSide.click();
    }

    @And("Verify the titles (Name, Patient Id, Guardian Name, Gender, Phone, Consultant, Last Visit, Total Recheckup) are displayed")
    public void verifyTheTitlesNamePatientIdGuardianNameGenderPhoneConsultantLastVisitTotalRecheckupAreDisplayed() {
        Assert.assertTrue(adminpage.opdNameFilter.isDisplayed());
        Assert.assertTrue(adminpage.opdPatientIdFilter.isDisplayed());
        Assert.assertTrue(adminpage.opdGuardianFilter.isDisplayed());
        Assert.assertTrue(adminpage.opdGender.isDisplayed());
        Assert.assertTrue(adminpage.opdPhoneFilter.isDisplayed());
        Assert.assertTrue(adminpage.opdConsultantFilter.isDisplayed());
        Assert.assertTrue(adminpage.opdLastVisitFilter.isDisplayed());
        Assert.assertTrue(adminpage.opdTotalRecheckUpFilter.isDisplayed());
    }

    @And("Verify the titles (Name, Patient Id, Guardian Name, Gender, Phone, Consultant, Last Visit, Total Recheckup) are able to sort through the titles")
    public void verifyTheTitlesNamePatientIdGuardianNameGenderPhoneConsultantLastVisitTotalRecheckupAreAbleToSortThroughTheTitles() {


        ReusableMethods.bekle(1);
        HealMethods.makeFilterTestAdminOPD("Name" , 3,7);
        ReusableMethods.bekle(1);
        HealMethods.makeFilterTestAdminOPD("Patient Id" , 2,7);
        ReusableMethods.bekle(1);
        HealMethods.makeFilterTestAdminOPD("Guardian Name" , 3,7);
        ReusableMethods.bekle(1);
        HealMethods.makeFilterTestAdminOPD("Gender" , 4,7);
        ReusableMethods.bekle(1);
        HealMethods.makeFilterTestAdminOPD("Consultant" , 5,7);
        ReusableMethods.bekle(1);
        HealMethods.makeFilterTestAdminOPD("Last Visit" , 6,7);
        ReusableMethods.bekle(1);
        HealMethods.makeFilterTestAdminOPD("Total Recheckup" , 7,7);

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
        Assert.assertTrue(adminpage.opdAddPatientButton.isDisplayed());
        Assert.assertTrue(adminpage.opdAddPatientButton.isEnabled());
    }

    @Then("Click the Add Patient")
    public void clickTheAddPatient() {
        adminpage.opdAddPatientButton.click();
    }

    @And("Verify that new patient  from the OPD page can be added and saved on the page that opens")
    public void verifyThatNewPatientFromTheOPDPageCanBeAddedAndSavedOnThePageThatOpens() {
        adminpage.addNewPatientOPD();
    }


    //========================================= Nesibe [US_040] OPD MENU SONU ============================================


    @Given("It should be displayed in the IPD Patient List")
    public void itShouldBeDisplayedInTheIPDPatientList (List < String > ipdTableHeads) {
        HealMethods.testHeaders(ipdTableHeads);

    }

    @And("I should be able to view all the patient's information from the button under Total\\($)")
    public void iShouldBeAbleToViewAllThePatientSInformationFromTheButtonUnderTotal$ (List < String > headers) {
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
    public void iShouldBeAbleToViewAllThePatientSInformationFromTheButtonUnderCreditLimit$ (List < String > headers) {
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
    public void verifyThatBrowserRedirectToPharmacyPage () {
        String expectedUrl = "https://qa.heallifehospital.com/admin/pharmacy/bill";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedUrl, actualUrl);
    }
    @Given("Verify that The Pharmacy Bill List on the Pharmacy page have the heading Bill No")
    public void verifyThatThePharmacyBillListOnThePharmacyPageHaveTheHeadingBillNo () {
        Assert.assertTrue(adminPage.pharmacyBillNo.isDisplayed());
    }

    @Then("Verify that The Pharmacy Bill List on the Pharmacy page have the heading Case ID Patient ID")
    public void verifyThatThePharmacyBillListOnThePharmacyPageHaveTheHeadingCaseIDPatientID () {
        Assert.assertTrue(adminPage.pharmacyCaseID.isDisplayed());
    }

    @Then("Verify that The Pharmacy Bill List on the Pharmacy page have the heading Date")
    public void verifyThatThePharmacyBillListOnThePharmacyPageHaveTheHeadingDate () {
        Assert.assertTrue(adminPage.pharmacyDate.isDisplayed());
    }

    @Then("Verify that The Pharmacy Bill List on the Pharmacy page have the heading Patient Name.")
    public void verifyThatThePharmacyBillListOnThePharmacyPageHaveTheHeadingPatientName () {
        Assert.assertTrue(adminPage.pharmacyPatientName.isDisplayed());
    }

    @Then("Verify that The Pharmacy Bill List on the Pharmacy page have the heading Doctor Name.")
    public void verifyThatThePharmacyBillListOnThePharmacyPageHaveTheHeadingDoctorName () {
        Assert.assertTrue(adminPage.pharmacyDoctorName.isDisplayed());
    }

    @Then("Verify that The Pharmacy Bill List on the Pharmacy page have the heading Discount.")
    public void verifyThatThePharmacyBillListOnThePharmacyPageHaveTheHeadingDiscount () {
        Assert.assertTrue(adminPage.pharmacyDiscount.isDisplayed());
    }

    @Then("Verify that The Pharmacy Bill List on the Pharmacy page have the heading Amount.")
    public void verifyThatThePharmacyBillListOnThePharmacyPageHaveTheHeadingAmount () {
        Assert.assertTrue(adminPage.pharmacyAmount.isDisplayed());
    }

    @Then("Verify that The Pharmacy Bill List on the Pharmacy page have the heading Paid Amount.")
    public void verifyThatThePharmacyBillListOnThePharmacyPageHaveTheHeadingPaidAmount () {
        Assert.assertTrue(adminPage.pharmacyPaidAmount.isDisplayed());
    }

    @Then("Verify that The Pharmacy Bill List on the Pharmacy page have the heading Balance Amount.")
    public void verifyThatThePharmacyBillListOnThePharmacyPageHaveTheHeadingBalanceAmount () {
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
        JSUtilities.clickWithJS(Driver.getDriver(),adminPage.xIconButton);


    }

    @And("Verify that the *Search By Patient Name* search box is enable in the navbar.")
    public void verify_that_the_search_by_patient_name_search_box_is_enable_in_the_navbar() {
        Assert.assertTrue(adminPage.searchByPatientNameLabel.isEnabled());
    }

    @And("Enter a patient name in the *Search By Patient Name* search box.")
    public void enter_a_patient_name_in_the_search_by_patient_name_search_box() {
        adminPage.searchByPatientNameLabel.sendKeys(ConfigReader.getProperty("patientName")+Keys.ENTER);
    }

    @And("Verify that the Searchbox returns the correct result.")
    public void verify_that_the_searchbox_returns_the_correct_result() {
        String actualName=adminPage.checkNameFromPatientList.getText().toLowerCase();
        String expectedName=ConfigReader.getProperty("patientName");

        Assert.assertTrue("Search box does not return the correct result",actualName.contains(expectedName));
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

        String actualText= adminPage.randevuMenu.getText();
        String expectedText= ConfigReader.getProperty("controlLanguage");

        Assert.assertEquals("Language icon does not translate panel language",expectedText,actualText);
        ReusableMethods.bekle(1);
        adminPage.flagIcon.click();
        adminPage.flagEnglish.click();
    }

    @Given("Verify that there is a notification icon link in the navbar.")
    public void verify_that_there_is_a_notification_icon_link_in_the_navbar() {
        Assert.assertTrue(adminPage.notificationIcon.isDisplayed());
        Assert.assertTrue(adminPage.notificationIcon.isEnabled());
    }

    @Given("Click on the notification icon.")
    public void click_on_the_notification_icon() {
        adminPage.notificationIcon.click();
    }

    @Given("Verify that unread notifications are indicated by a number on the icon.")
    public void verify_that_unread_notifications_are_indicated_by_a_number_on_the_icon() {
        numberOfNotification1 = adminPage.numberOfNotification.getText();
        Assert.assertTrue("Unread notifications are not shown with a number on the icon.",numberOfNotification1.matches("\\d+"));
    }

    @Given("Click on the unread notification message on the notification page")
    public void click_on_the_unread_notification_message_on_the_notification_page() {
        List<WebElement> unreadNotification= Driver.getDriver().findElements(By.xpath("//div[@class='accordianheader  unreadbg ui-accordion-header ui-state-default ui-corner-all ui-accordion-icons']"));
        for (int i = 0; i <unreadNotification.size() ; i++) {
            JSUtilities.clickWithJS(Driver.getDriver(),unreadNotification.get(i));
            break;
        }//>>dinamik olması icin tıklamak yerine bu methodu olusturdum
        //adminPage.aNotificationOnNotificationPage.click();
    }

    @Given("The page refreshes.")
    public void the_page_refreshes() {
        Driver.getDriver().navigate().refresh();
        ReusableMethods.bekle(5);
    }

    @Given("Verify that the number displayed on the notification icon decreases by one.")
    public void verify_that_the_number_displayed_on_the_notification_icon_decreases_by_one() {
        numberOfNotification2 = adminPage.numberOfNotification.getText();
        int numberOfUnread= Integer.parseInt(numberOfNotification1);
        int numberOfRead= Integer.parseInt(numberOfNotification2);
        Assert.assertTrue("Number does not decrease when unread notifications are opened",numberOfUnread-numberOfRead==1);
    }

    @Given("Verify that the notification page has Type, Subject, Date headers.")
    public void verify_that_the_notification_page_has_type_subject_date_headers() {
        Assert.assertTrue("There is no Type header on the notification page",adminPage.TypeHeader.isDisplayed());
        Assert.assertTrue("There is no Subject header on the notification page",adminPage.SubjectHeader.isDisplayed());
        Assert.assertTrue("There is no Data header on the notification page",adminPage.DateHeader.isDisplayed());
    }

    @Given("Click on notification message {int} on the notification page.")
    public void click_on_notification_message_on_the_notification_page(Integer index) {
        adminPage.getNotificationOnNotificationPage(index).click();
    }

    @Given("Verify that the detail is displayed when click on the notification message {int}")
    public void verify_that_the_detail_is_displayed_when_click_on_the_notification_message(Integer index) {
        ReusableMethods.bekle(5);
        Assert.assertTrue("Notification detail not visible",adminPage.getNotificationDetailOnNotificationPage(index).isDisplayed());
    }


    @Given("Verify that the clicked notification has been read.")
    public void verify_that_the_clicked_notification_has_been_read() {

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
        WebElement textElement = Driver.getDriver().findElement(By.xpath("//*[text()='"+text+"']"));
        String actualText = JSUtilities.getTextWithJS(Driver.getDriver(),textElement);
        String expectedText= text;
        Assert.assertEquals("*"+text+"* text is not visible",expectedText,actualText);
    }

    @Given("Verify that there are no notifications on the page.")
    public void verify_that_there_are_no_notifications_on_the_page() {
        Driver.getDriver().navigate().refresh();
        int notificationOfNumber = Driver.getDriver().findElements(By.xpath("//div[@class='note-content']")).size();
        Assert.assertTrue(notificationOfNumber==0);
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
        Assert.assertTrue("There are no previous contacts",numberOfContactedPerson>0);
        Assert.assertTrue("Previous contacts are not visible",adminPage.contactedFirstPersonOnChatPage.isDisplayed());
        Assert.assertTrue("Previous contacts are not enable",adminPage.contactedFirstPersonOnChatPage.isEnabled());
    }

    @Given("Click on the + icon on the Chat System")
    public void click_on_the_icon_on_the_chat_system() {
        adminPage.addContactButtonOnChatPage.click();
    }
    @Given("Enter the contact name in the search text box.")
    public void enter_the_contact_name_in_the_search_text_box() {
        adminPage.addContactSearchLabel.sendKeys(ConfigReader.getProperty("Record Saved Succesfully"));
        ReusableMethods.bekle(1);
        adminPage.addContactFirstPerson.click();
    }
    @Given("Click on the +Add button.")
    public void click_on_the_add_button() {
        adminPage.addContactSubmitButton.click();
    }
    @Given("Verify that the contact added under the chat system is visible.")
    public void verify_that_the_contact_added_under_the_chat_system_is_visible() {
        String actualContact= adminPage.contactedFirstPersonOnChatPage.getText();
        String expectedContact= ConfigReader.getProperty("contactName");
        Assert.assertTrue("Added person is not visible",actualContact.contains(expectedContact));
    }

}

