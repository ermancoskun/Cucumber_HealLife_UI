package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


import java.util.List;

public class
HomePage extends Base {


    public HomePage() {

    }

    @FindBy(xpath = "//div[@class='team-member']//img")
    public List<WebElement> ourDoctorsResim;

    @FindBy(xpath = "//div[@class='team-member']//h4")
    public List<WebElement> ourDoctorsIsim;

    @FindBy(xpath = "//div[@class='team-member']//p")
    public List<WebElement> ourDoctorsUnvan;

    public int ourDoctorsPicturesCount() {
        return ourDoctorsResim.size();
    }






    //********************Duygu*************************************//

    // homepage > footer section
    @FindBy(xpath = "//i[@class='fa fa-pencil-square']")
    public WebElement complainIcon;

    // homepage > footer section
    @FindBy(xpath = "//a[text()='Complain']")
    public WebElement complainButton;

    //////////////////////////////////////////////////////////////////


    // homepage > Mainbanner
    @FindBy (tagName = "html")
    public WebElement MainBanner;

    // homepage > Appointment Button
    @FindBy (xpath = "//*[@id=\"navbar-collapse-3\"]/ul/li[2]/a")
    public WebElement appointmentButton;


    //============================================ Nesibe [US_005] Feauture Boards =====================================================

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

    //============================================ Nesibe [US_005] Feauture Boards End ================================================

}
