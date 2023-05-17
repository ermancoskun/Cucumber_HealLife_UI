package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import java.util.List;





import static utilities.Driver.driver;

public class HomePage extends Base {

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



    // homepage ->
    @FindBy (xpath = "(//a[text()='Gallery'])[1]")

    public WebElement GalleryButton;

    @FindBy(xpath = "//div[@class='col-md-4 col-sm-4']) //img")
    public List<WebElement> GalleryPhotos;


    @FindBy (xpath = "//h2[text()='Gallery']")
    public WebElement GalleryxLabel;

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



    //==============Humeyra===============
    //Home Page -> bottom bar->home link
    @FindBy(xpath = "(//*[text()='Home'])[2]")
    public WebElement bottomHomeLink;

    //Home Page -> bottom bar->About link
    @FindBy(xpath = "//*[text()='About']")
    public WebElement bottomAboutLink;

    //Home Page -> bottom bar->About link
    @FindBy(xpath = "//*[text()='Academics']")
    public WebElement bottomAcademicsLink;

    //Home Page -> bottom bar->About link
    @FindBy(xpath = "(//*[text()='Gallery'])[2]")
    public WebElement bottomGaleryLink;

    //Home Page -> bottom bar->About link
    @FindBy(xpath = "//*[text()='Contact Us']")
    public WebElement bottomContactUsLink;

}

