package stepdefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import utilities.Driver;

public class PatientStepdefinitions {//
    @And("user should be able to on the IPD page")
    public void userShouldBeAbleToOnTheIPDPage() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("admin/patient/ipdsearch"));
    }
}
