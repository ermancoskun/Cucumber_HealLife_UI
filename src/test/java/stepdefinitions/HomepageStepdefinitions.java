package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class HomepageStepdefinitions {//
    HomePage home=new HomePage();
    Actions actions=new Actions(Driver.getDriver());
    @Given("Go to url")
    public void goToUrl() {

        Driver.getDriver().get(ConfigReader.getProperty("healLife"));
    }

    @Then("Verify that Home page title is visible in the home page bottom bar.")
    public void verifyThatHomePageTitleIsVisibleInTheHomePageBottomBar() {
        actions.sendKeys(Keys.END);
        ReusableMethods.bekle(2);
        Assert.assertTrue(home.bottomHomeLink.isDisplayed());


    }

    @Then("Verify that Academics page title is visible in the home page bottom bar.")
    public void verifyThatAcademicsPageTitleIsVisibleInTheHomePageBottomBar() {
        actions.scrollToElement(home.bottomAcademicsLink);
        ReusableMethods.bekle(2);
        Assert.assertTrue(home.bottomAcademicsLink.isDisplayed());
    }

    @Then("Verify that  Gallery page title is visible in the home page bottom bar.")
    public void verifyThatGalleryPageTitleIsVisibleInTheHomePageBottomBar() {
        actions.scrollToElement(home.bottomAcademicsLink);
        ReusableMethods.bekle(2);
        Assert.assertTrue(home.bottomAcademicsLink.isDisplayed());
    }

    @Then("Verify that  About page title is visible in the home page bottom bar")
    public void verifyThatAboutPageTitleIsVisibleInTheHomePageBottomBar() {
        actions.scrollToElement(home.bottomAboutLink);
        ReusableMethods.bekle(2);
        Assert.assertTrue(home.bottomAboutLink.isDisplayed());
    }


    @Then("Verify that Contact US page title is visible in the home page bottom bar")
    public void verifyThatContactUSPageTitleIsVisibleInTheHomePageBottomBar() {
        actions.scrollToElement(home.bottomContactUsLink);
        ReusableMethods.bekle(2);
        Assert.assertTrue(home.bottomContactUsLink.isDisplayed());
    }


    @Then("Click Home title. Verify that browser redirects to the Home page.")
    public void clickHomeTitleVerifyThatBrowserRedirectsToTheHomePage() {
        home.bottomHomeLink.click();
        String expectedUrl="https://qa.heallifehospital.com/frontend";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);
    }

    @Then("Click Academics title.Verify that browser redirects to the Academics page.")
    public void clickAcademicsTitleVerifyThatBrowserRedirectsToTheAcademicsPage() {
        actions.sendKeys(Keys.END);
        home.bottomAcademicsLink.click();
        String expectedUrl="https://qa.heallifehospital.com/page/meet-our-doctors";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);
    }

    @Then("Click Gallery title.Verify that browser redirects to the  Gallery page.")
    public void clickGalleryTitleVerifyThatBrowserRedirectsToTheGalleryPage() {
        actions.scrollToElement(home.bottomGaleryLink);
        ReusableMethods.bekle(2);
        home.bottomGaleryLink.click();
        String expectedUrl="https://qa.heallifehospital.com/page/gallery";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);
    }

    @Then("Click About title.Verify that browser redirects to the About page.")
    public void clickAboutTitleVerifyThatBrowserRedirectsToTheAboutPage() {
        actions.sendKeys(Keys.END);
        home.bottomAboutLink.click();

        String expectedUrl="https://qa.heallifehospital.com/page/about-hospitals";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);
    }

    @Then("Click Contact US title. Verify that browser redirects to the Contact US page.")
    public void clickContactUSTitleVerifyThatBrowserRedirectsToTheContactUSPage() {
        actions.sendKeys(Keys.END);
        home.bottomContactUsLink.click();
        String expectedUrl="https://qa.heallifehospital.com/page/contact-us";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);
    }
}
