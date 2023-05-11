package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AdminPage;
import utilities.Driver;
import utilities.HealMethods;






public class AdminStepdefinitions {
    AdminPage adminPage=new AdminPage();
    Faker faker=new Faker();
    AdminPage adminpage=new AdminPage();

    @Given("Goes to Admin login page")
    public void goes_to_admin_login_page() {
        // intentionally left blank
    }
    @Then("Login with {string} and {string} datas")
    public void login_with_and_datas(String username, String password) {
        HealMethods.loginAsAdmin(username,password);
    }
    @Then("Click on the {string} link")
    public void clickOnTheLink(String link) {
        HealMethods.clickASidebarLink(link);
    }
    @Then("Verified redirected to Billing page")
    public void verified_redirected_to_billing_page() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("bill"));
    }







































    ///////////////////////////////////////////////////////////////////////////////////////////////////DGup
    @And("Login to admin page as {string} {string}")
    public void loginToAdminPageAs(String username, String password) {
        adminpage.loginAsAdmin(username,password);
    }

    @And("Verify that the heallife logo is visible in the navbar of the admin panel.")
    public void verifyThatTheHeallifeLogoIsVisibleInTheNavbarOfTheAdminPanel() {
        Assert.assertTrue("Heallife logo is not visible in the navbar of the admin panel",adminpage.heallifeLogo.isDisplayed());
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
        Assert.assertTrue("Admin panel does not refresh when clicking on heallife logo",adminpage.welcomePartyAnnouncement.isEnabled());
        Assert.assertTrue("Admin panel does not refresh when clicking on heallife logo",adminpage.welcomePartyAnnouncement.isDisplayed());
    }

    @And("Verify that there is a dashboard menu icon in the navbar")
    public void verify_that_there_is_a_dashboard_menu_icon_in_the_navbar() {
        Assert.assertTrue("No dashboard menu icon in the navigation bar",adminpage.dashboardMenuIcon.isDisplayed());
        Assert.assertTrue("A dashboard menu icon is not clickable in the navigation bar",adminpage.dashboardMenuIcon.isEnabled());
    }

    @And("Click on the menu icon.")
    public void click_on_the_menu_icon() {
        adminpage.dashboardMenuIcon.click();
    }

    @And("Verify that the dashboard menu is closed when clicked")
    public void verify_that_the_dashboard_menu_is_closed_when_clicked() {
        Assert.assertFalse("Dashboard menu does not open and close when clicked",adminpage.billingMenu.isDisplayed());
    }

    @And("Verify that the dashboard menu is opened when clicked")
    public void verify_that_the_dashboard_menu_is_opened_when_clicked() {
        Assert.assertTrue("Dashboard menu does not open and close when clicked",adminpage.billingMenu.isDisplayed());
    }

    @And("Verify that the Navbar has the text *Heal Life Hospital & Research Center*")
    public void verifyThatTheNavbarHasTheTextHealLifeHospitalResearchCenter() {
        Assert.assertTrue("The text *Heal Life Hospital & Research Center* is not visible in Navbar",adminpage.healLifeHospitalResearchCenterText.isDisplayed());
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////DGdown





}
