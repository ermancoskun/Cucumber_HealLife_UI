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
import pages.AdminPage;
import utilities.*;
import utilities.Driver;
import utilities.HealMethods;
import utilities.JSUtilities;
import utilities.ReusableMethods;


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

    @And("Create a New Patient with random datas")
    public void createANewPatientWithRandomDatas() {
        HealMethods.createNewPatient();
    }

    @And("Choose All and {int} options for patient display")
    public void chooseAllAndOptionsForPatientDisplay(int arg0) {
        HealMethods.makeAll100Test();
    }

    @Then("Verified redirected to Bill Details page")
    public void verifiedRedirectedToBillDetailsPage() {

        String actualWindowTitle = Driver.getDriver().findElement(By.xpath("(//h4[@class='modal-title'])[3]")).getText();
        Assert.assertEquals("Unsuccessful redirection", "Bill Details", actualWindowTitle);

        WebElement billDetailsElement = Driver.getDriver().findElement(By.xpath("(//h4[text()='Bill Details'])[1]"));
        Assert.assertTrue(billDetailsElement.isDisplayed());

    }

    @And("Click the Pathology button on Billing page")
    public void clickThePathologyButtonOnBillingPage() {
        adminPage.pathologyButton.click();
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
    public void testThePaymentOptions() {
        HealMethods.makePaymentOptionsTest();
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

        Assert.assertTrue("Logout button not displayed",adminPage.logoutButton.isDisplayed());
        Assert.assertTrue("Logout button not enable",adminPage.logoutButton.isEnabled());
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
        adminPage.logoutButton.click();
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
        adminPage.logoutButton.click();
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

}