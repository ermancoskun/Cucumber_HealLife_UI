package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import java.util.List;

import pages.AdminPage;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import java.util.List;
import java.util.Random;

public class HomepageStepdefinitions {//
    HomePage homepage=new HomePage();
    Actions actions=new Actions(Driver.getDriver());


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







    @Given("Launch browser")
    public void launchBrowser() {
        Driver.getDriver();




   }

    @Then("Go to {string}")
    public void goTo(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @And("Go to the home page footer section.")
    public void goToTheHomePageFooterSection() {
        actions.sendKeys(Keys.END).perform();
    }

    @And("Verify that the complain button and icon are visible.")
    public void verifyThatTheComplainButtonAndIconAreVisible() {
        Assert.assertTrue("Complain icon are not visible", homepage.complainIcon.isDisplayed());
        Assert.assertTrue("Complain button are not visible", homepage.complainButton.isDisplayed());
        Assert.assertTrue("Complain icon are not clickable", homepage.complainIcon.isEnabled());
        Assert.assertTrue("Complain button are not clickable", homepage.complainButton.isEnabled());
    }

    @And("Close browser")
    public void closeBrowser() {/* browser is closed by the hooks class */
       // Driver.closeDriver();




    }

    @And("Click on the complainIcon")
    public void clickOnTheComplainIcon() {
        homepage.complainButton.click();
    }

    @And("Verify that it redirects to the {string} page.")
    public void verifyThatItRedirectsToThePage(String url) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = ConfigReader.getProperty(url);

        Assert.assertEquals("Does not redirect to the relevant page",expectedUrl,actualUrl);
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////


    @Given("User goes to the home page")
    public void user_goes_to_the_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("homePageUrl"));
    }

    @Then("Verify that the URL of the website is correct")
    public void verify_that_the_url_of_the_website_is_correct() {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = ConfigReader.getProperty("homePageUrl");
        Assert.assertEquals("The Url of the home page is correct", expectedUrl, actualUrl);
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
        Assert.assertEquals("The Url of the Appointment page is correct", expectedUrl, actualUrl);


        ///////////////////////////////////////


    }






    @Then("The browser is closed")
    public void the_browser_is_closed () {

        Driver.closeDriver();

    }

    @Then("Gallery button clicks")
    public void gallery_button_clicks() {

        homepage.GalleryButton.click();
    }

    @Then("Goes to the gallery page")
    public void goes_to_the_gallery_page() {

        Assert.assertTrue(homepage.GalleryxLabel.isDisplayed());
    }

        @Then("Gallery page displays reserved pictures about hospital and health")
    public void gallery_page_displays_reserved_pictures_about_hospital_and_health() {

        List<WebElement>galleryList=Driver.getDriver().findElements(By.xpath("//*[@id='postList']"));
            Random random = new Random();
            int sayi = random.nextInt(galleryList.size())+1;

                    WebElement gallery=Driver.getDriver().findElement(By.xpath("(//h3)["+sayi+"]"));
                    Assert.assertTrue(gallery.isDisplayed());
                    String expGalleryText=gallery.getText();
                    gallery.click();
                    WebElement actTitle=Driver.getDriver().findElement(By.xpath("(//h1)[1]"));
                    Assert.assertTrue(expGalleryText.contains(actTitle.getText()));





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


  //********Humeyra**********
  @Given("Go to url")
  public void goToUrl() {

      Driver.getDriver().get(ConfigReader.getProperty("healLife"));
  }

    @Then("Verify that Home page title is visible in the home page bottom bar.")
    public void verifyThatHomePageTitleIsVisibleInTheHomePageBottomBar() {
        actions.sendKeys(Keys.END);
        ReusableMethods.bekle(2);
        Assert.assertTrue(homepage.bottomHomeLink.isDisplayed());


    }

    @Then("Verify that Academics page title is visible in the home page bottom bar.")
    public void verifyThatAcademicsPageTitleIsVisibleInTheHomePageBottomBar() {
        actions.scrollToElement(homepage.bottomAcademicsLink);
        ReusableMethods.bekle(2);
        Assert.assertTrue(homepage.bottomAcademicsLink.isDisplayed());
    }

    @Then("Verify that  Gallery page title is visible in the home page bottom bar.")
    public void verifyThatGalleryPageTitleIsVisibleInTheHomePageBottomBar() {
        actions.scrollToElement(homepage.bottomAcademicsLink);
        ReusableMethods.bekle(2);
        Assert.assertTrue(homepage.bottomAcademicsLink.isDisplayed());
    }

    @Then("Verify that  About page title is visible in the home page bottom bar")
    public void verifyThatAboutPageTitleIsVisibleInTheHomePageBottomBar() {
        actions.scrollToElement(homepage.bottomAboutLink);
        ReusableMethods.bekle(2);
        Assert.assertTrue(homepage.bottomAboutLink.isDisplayed());
    }


    @Then("Verify that Contact US page title is visible in the home page bottom bar")
    public void verifyThatContactUSPageTitleIsVisibleInTheHomePageBottomBar() {
        actions.scrollToElement(homepage.bottomContactUsLink);
        ReusableMethods.bekle(2);
        Assert.assertTrue(homepage.bottomContactUsLink.isDisplayed());
    }


    @Then("Click Home title. Verify that browser redirects to the Home page.")
    public void clickHomeTitleVerifyThatBrowserRedirectsToTheHomePage() {
        homepage.bottomHomeLink.click();
        String expectedUrl="https://qa.heallifehospital.com/frontend";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);
    }

    @Then("Click Academics title.Verify that browser redirects to the Academics page.")
    public void clickAcademicsTitleVerifyThatBrowserRedirectsToTheAcademicsPage() {
        actions.sendKeys(Keys.END);
        homepage.bottomAcademicsLink.click();
        String expectedUrl="https://qa.heallifehospital.com/page/meet-our-doctors";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);
    }

    @Then("Click Gallery title.Verify that browser redirects to the  Gallery page.")
    public void clickGalleryTitleVerifyThatBrowserRedirectsToTheGalleryPage() {
        actions.scrollToElement(homepage.bottomGaleryLink);
        ReusableMethods.bekle(2);
        homepage.bottomGaleryLink.click();
        String expectedUrl="https://qa.heallifehospital.com/page/gallery";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);
    }

    @Then("Click About title.Verify that browser redirects to the About page.")
    public void clickAboutTitleVerifyThatBrowserRedirectsToTheAboutPage() {
        actions.sendKeys(Keys.END);
        homepage.bottomAboutLink.click();

        String expectedUrl = "https://qa.heallifehospital.com/page/about-hospitals";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);
    }

    @Then("Click Contact US title. Verify that browser redirects to the Contact US page.")
    public void clickContactUSTitleVerifyThatBrowserRedirectsToTheContactUSPage() {
        actions.sendKeys(Keys.END);
        homepage.bottomContactUsLink.click();
        String expectedUrl="https://qa.heallifehospital.com/page/contact-us";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);
    }
}



