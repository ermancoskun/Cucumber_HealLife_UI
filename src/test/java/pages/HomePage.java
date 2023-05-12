package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Base{

    // ============= Nesibe [US_005] =========
    @FindBy(xpath = "//*[text()='Featured Services']")
    public WebElement feautureServicesBoard ;

    @FindBy(xpath = "//*[text()='Nurse-to-Resident Ratio']")
    public WebElement nurseResidentBoard ;

    @FindBy(xpath = "//*[text()='Emergency Help']")
    public WebElement emergencyHelpBoard ;

    @FindBy(xpath = "//*[text()='Onsite Medical Staff']")
    public WebElement onsiteMedicalStaffBoard;

    @FindBy(xpath = "//*[text()='Communication All Parties']")
    public WebElement comunicationAllPartBoard ;
    // ============= Nesibe [US_005] SON =========
}
