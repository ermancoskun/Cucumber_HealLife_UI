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
import utilities.ConfigReader;
import utilities.Driver;
import utilities.HealMethods;
import utilities.ReusableMethods;


import java.util.List;

public class AdminStepdefinitions {//

    AdminPage adminPage = new AdminPage();
    Faker faker = new Faker();

    AdminPage adminpage = new AdminPage();


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
        HealMethods.makeFilterTest(filtreAdi, sirasi, 7);}

    @Then("Sees the FilterName and their Order")
    public void seesTheFilterNameAndTheirOrder() {
        HealMethods.makeFilterTest("Name",1,11);
        HealMethods.makeFilterTest("Patient Id",2,11);
        HealMethods.makeFilterTest("Guardian Name",3,11);
        HealMethods.makeFilterTest("Gender",4,11);
        HealMethods.makeFilterTest("Phone",5,11);
        HealMethods.makeFilterTest("Consultant",6,11);
        HealMethods.makeFilterTest("Last Visit",7,11);
        HealMethods.makeFilterTest("Total Recheckup",8,11);

    }

    @And("test to searcbox")
    public void testToSearcbox() {
        HealMethods.makeSearchBoxTest();
    }

    @And("Click on the Add Patient button")
    public void clickOnTheAddPatientButton() {
        HealMethods.clickBlueOrAnyButton(" Add Patient");
    }





    @Given("It should be displayed in the IPD Discharged Patient List")
    public void itShouldBeDisplayedInTheIPDDischargedPatientList(List<String> ipdTableHeads) {
        for (int i = 0; i < ipdTableHeads.size(); i++) {
            Assert.assertEquals(ipdTableHeads.get(i), adminPage.ipdPatientAndDischargePatientTableHeaders.get(i).getText());
        }
    }

        @And("Create a New Patient with random datas")
        public void createANewPatientWithRandomDatas () {
            HealMethods.createNewPatient();
        }

        @And("Choose All and {int} options for patient display")
        public void chooseAllAndOptionsForPatientDisplay ( int arg0){
            HealMethods.makeAll100Test();
        }

        @Then("Verified redirected to Bill Details page")
        public void verifiedRedirectedToBillDetailsPage () {

            String actualWindowTitle = Driver.getDriver().findElement(By.xpath("(//h4[@class='modal-title'])[3]")).getText();
            Assert.assertEquals("Unsuccessful redirection", "Bill Details", actualWindowTitle);

            WebElement billDetailsElement = Driver.getDriver().findElement(By.xpath("(//h4[text()='Bill Details'])[1]"));
            Assert.assertTrue(billDetailsElement.isDisplayed());

        }

        @And("Click the Pathology button on Billing page")
        public void clickThePathologyButtonOnBillingPage () {
            adminPage.pathologyButton.click();
        }

        @And("Click {int}. iconButton under the last column for display first patient profile")
        public void clickIconButtonUnderTheLastColumnForDisplayFirstPatientProfile ( int sira){
            HealMethods.clickIconWith3Line(sira);
        }
        @And("Click the Add View Payment iconButton for additional payments for patient of {int}.")
        public void clickTheAddViewPaymentIconButtonForAdditionalPaymentsForPatientOf ( int sira){
            HealMethods.clickAddViewPaymentIcon(sira);
        }
        @Then("Test the payment options")
        public void testThePaymentOptions () {
            HealMethods.makePaymentOptionsTest();
        }


        @Given("Click on the Add Patient button in IPD page")
        public void clickOnTheAddPatientButtonInIPDPage () {
            adminPage.addPatientButtonIPD.click();
        }

        @Given("Click on the Discarged Patient button")
        public void clickOnTheDiscargedPatientButton () {
            adminPage.dischargedPatientButton.click();}



    @Then("Sees the name of {string} that their {string} number")
    public void seesTheNameOfThatTheirNumber(String filtreAdi, String sira) {
        HealMethods.makeFilterTest(filtreAdi, Integer.parseInt(sira), 8);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////DGup
    @And("Login to admin page as {string} {string}")
    public void loginToAdminPageAs(String username, String password) {
        adminpage.loginAsAdmin(username, password);
    }

    @And("Verify that the heallife logo is visible in the navbar of the admin panel.")
    public void verifyThatTheHeallifeLogoIsVisibleInTheNavbarOfTheAdminPanel() {
        Assert.assertTrue("Heallife logo is not visible in the navbar of the admin panel", adminpage.heallifeLogo.isDisplayed());
    }

    @And("Click on the Billing Menu")
    public void clickOnTheBillingMenu() {
        adminpage.billingMenu.click();
    }

    @And("Click on the heallife logo in the Navbar")
    public void clickOnTheHeallifeLogoInTheNavbar() {
        adminpage.heallifeLogo.click();
    }

    @And("Verify that the admin panel is refreshed when clicking on the heallife logo")
    public void verifyThatTheAdminPanelIsRefreshedWhenClickingOnTheHeallifeLogo() {
        Assert.assertTrue("Admin panel does not refresh when clicking on heallife logo", adminpage.welcomePartyAnnouncement.isEnabled());
        Assert.assertTrue("Admin panel does not refresh when clicking on heallife logo", adminpage.welcomePartyAnnouncement.isDisplayed());
    }

    @And("Verify that there is a dashboard menu icon in the navbar")
    public void verify_that_there_is_a_dashboard_menu_icon_in_the_navbar() {
        Assert.assertTrue("No dashboard menu icon in the navigation bar", adminpage.dashboardMenuIcon.isDisplayed());
        Assert.assertTrue("A dashboard menu icon is not clickable in the navigation bar", adminpage.dashboardMenuIcon.isEnabled());
    }

    @And("Click on the menu icon.")
    public void click_on_the_menu_icon() {
        adminpage.dashboardMenuIcon.click();
    }

    @And("Verify that the dashboard menu is closed when clicked")
    public void verify_that_the_dashboard_menu_is_closed_when_clicked() {
        Assert.assertFalse("Dashboard menu does not open and close when clicked", adminpage.billingMenu.isDisplayed());
    }

    @And("Verify that the dashboard menu is opened when clicked")
    public void verify_that_the_dashboard_menu_is_opened_when_clicked() {
        Assert.assertTrue("Dashboard menu does not open and close when clicked", adminpage.billingMenu.isDisplayed());
    }

    @And("Verify that the Navbar has the text *Heal Life Hospital & Research Center*")
    public void verifyThatTheNavbarHasTheTextHealLifeHospitalResearchCenter() {
        Assert.assertTrue("The text *Heal Life Hospital & Research Center* is not visible in Navbar", adminpage.healLifeHospitalResearchCenterText.isDisplayed());
    }




        @And("user should be able to on the Discarged Patient page")
        public void userShouldBeAbleToOnTheDiscargedPatientPage () {
            Assert.assertTrue(adminPage.ipdDischargedConfirmationText.isDisplayed());
        }



        @And("Click {int}. first name for display patient profile")
        public void clickFirstNameForDisplayPatientProfile ( int sira){
            HealMethods.clickANameFromList(1);
        }



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

            }}


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
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////DGdown



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

        @Given("Verify that the pharmacy page have a search box.")
        public void verifyThatThePharmacyPageHaveASearchBox() {
            HealMethods.makeSearchBoxTest();
        }

        @Given("Verify that Generate Bill button is disabled.")
        public void verifyThatGenerateBillButtonIsDisabled() {
            Assert.assertTrue(adminPage.pharmacyGenerateButton.isDisplayed());
        }

        @Then("Verify that Generate Bill button is clickabled.")
        public void verifyThatGenerateBillButtonIsClickabled() {
            Assert.assertTrue(adminPage.pharmacyGenerateButton.isEnabled());
        }

        @Then("Click the Generate Bill button.")
        public void clickTheGenerateBillButton() {
            adminPage.pharmacyGenerateButton.click();
        }

        @Then("Enter a new patient from the Generate Bill page.Verify that a new patient can be entered from the Generete Bill page")
        public void enterANewPatientFromTheGenerateBillPageVerifyThatANewPatientCanBeEnteredFromTheGenereteBillPage() {
            String expectedUrl = "https://qa.heallifehospital.com/admin/pharmacy/bill";
            String actualUrl = Driver.getDriver().getCurrentUrl();
            Assert.assertEquals(expectedUrl, actualUrl);
        }


        @Then("Verify that Prescription button is enabled.")
        public void verifyThatPrescriptionButtonIsEnabled() {
            Assert.assertTrue(adminPage.pharmacyPrescrtionButton.isEnabled());
        }
        @Given("Click the sort button of Bill No.Verify sorted by bill number.")
        public void clickTheSortButtonOfBillNoVerifySortedByBillNumber() {
            adminPage.pharmacyBillNo.click();
            HealMethods.makeFilterTest("Bill No",1,9);


        }
        @Then("Click the sort button of Case ID Patient ID.Verify sorted by Case ID Patient ID.")
        public void clickTheSortButtonOfCaseIDPatientIDVerifySortedByCaseIDPatientID() {
            adminPage.pharmacyCaseID.click();
            HealMethods.makeFilterTest("Case ID / Patient ID",2,9);
        }
        @Then("Click the sort button of Date.Verify sorted by Date.")
        public void clickTheSortButtonOfDateVerifySortedByDate() {
            adminPage.pharmacyDate.click();
            HealMethods.makeFilterTest("Date",3,9);
        }

        @Then("Click the sort button of Patient Name.Verify sorted by Patient Name.")
        public void clickTheSortButtonOfPatientNameVerifySortedByPatientName() {
            adminPage.pharmacyPatientName.click();
            HealMethods.makeFilterTest("Patient Name",4,9);
        }

        @Then("Click the sort button of Doctor Name.Verify sorted by  Doctor Name.")
        public void clickTheSortButtonOfDoctorNameVerifySortedByDoctorName() {
            adminPage.pharmacyDoctorName.click();
            HealMethods.makeFilterTest("Doctor Name",5,9);
        }

        @Then("Click the sort button of Discount.Verify sorted by Discount.")
        public void clickTheSortButtonOfDiscountVerifySortedByDiscount() {
            adminPage.pharmacyDiscount.click();
            HealMethods.makeFilterTest("Discount ($)",6,9);
        }

        @Then("Click the sort button of Amount.Verify sorted by Amount.")
        public void clickTheSortButtonOfAmountVerifySortedByAmount() {
            adminPage.pharmacyAmount.click();
            HealMethods.makeFilterTest("Amount ($)",7,9);
        }

        @Then("Click the sort button of Paid Amount.Verify sorted by Paid Amount.")
        public void clickTheSortButtonOfPaidAmountVerifySortedByPaidAmount() {
            adminPage.pharmacyPaidAmount.click();
            HealMethods.makeFilterTest("Paid Amount ($)",8,9);
        }


        @Then("Click the sort button of Balance Amount.Verify sorted by Balance Amount.")
        public void clickTheSortButtonOfBalanceAmountVerifySortedByBalanceAmount() {
            adminPage.pharmacyBalanceAmount.click();
            HealMethods.makeFilterTest("Balance Amount ($)",9,9);
        }

        @Then("Create an invoice by entering the correct information Medicine Category, Medicine Name, Batch No, Expiry Date, Quantity Available Qty, Sale Price ,Tax Amount.")
        public void createAnInvoiceByEnteringTheCorrectInformationMedicineCategoryMedicineNameBatchNoExpiryDateQuantityAvailableQtySalePriceTaxAmount() {

            adminPage.pharmacyGenerateEnterPatientName.sendKeys(ConfigReader.getProperty("pharmacyPatientName"));
            Select select=new Select(adminPage.pharmacyGenerateMedicineCategory);
            select.selectByVisibleText(ConfigReader.getProperty("pharmacyMedicineCategory"));
            select=new Select(adminPage.pharmacyGenerateMedicineName);
            select.selectByVisibleText(ConfigReader.getProperty("pharmacyMedicineName"));
            select=new Select(adminPage.pharmacyGenerateBatchNo);
            select.selectByVisibleText(ConfigReader.getProperty("pharmacyBatchNo"));
            select=new Select(adminPage.pharmacyGenerateHospitalDoctor);
            select.selectByVisibleText(ConfigReader.getProperty("pharmacyHospitalDoctor"));
            select=new Select(adminPage.pharmacyGeneratePaymentMethode);
            select.selectByVisibleText(ConfigReader.getProperty("pharmacyPaymentMethode"));
            adminPage.pharmacyGenerateQuantatity.sendKeys(ConfigReader.getProperty("pharmacyQuatity"));

            adminPage.pharmacyGenerateSaveButton.click();

        }

        @Then("Verify that invoice has been created")
        public void verifyThatInvoiceHasBeenCreated() {
            Assert.assertTrue(adminPage.pharmacyGenerateVerify.isDisplayed());
        }


    @Then("Sees the {string} that {string}")
    public void seesTheThat (String filtreAdi,int sira){
        System.out.println("filtreAdi = " + filtreAdi);
        System.out.println("sira = " + sira);
        HealMethods.makeFilterTest(filtreAdi, sira, 7);
    }

        }

