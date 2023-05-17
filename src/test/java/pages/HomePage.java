package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import java.util.List;
import javax.swing.plaf.PanelUI;
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
    @FindBy (xpath = "//*[@id='navbar-collapse-3']/ul/li[2]")
    public WebElement appointmentButton;

    // homepage > Appointment > Specialist
    @FindBy (xpath = "//*[@id=\"appointment_form\"]/div/div[1]/div/div[1]/div/span")
    public WebElement  specialistDropdown;

    @FindBy (xpath = "/html/body/span/span/span[2]/ul/li[5]")
    public WebElement gastroenterologistsDropdown;

    @FindBy (xpath = "//*[@id=\"select2-doctor-container\"]")
    public WebElement doctorDropdown;

    @FindBy (xpath = "//*[@id=\"doctor\"]/option[15]")
    public WebElement doctorErman;

    @FindBy (xpath = "//*[@id=\"select2-global_shift-container\"]")
    public WebElement selectDropdown;

    @FindBy (xpath = "/html/body/span/span/span[2]/ul/li[3]")
    public WebElement selectDropdownEvening;

    @FindBy (xpath = "//*[@id=\"datetimepicker1\"]")
    public WebElement dateAppointment;

    @FindBy (xpath = "/html/body/div[2]/div/div/form/div/div[2]/div/div/strong")
    public WebElement slots;

    @FindBy (xpath = "/html/body/div[2]/div/div/div/div/div/div[2]/div/div[1]/div/div[3]/span[1]")
    public WebElement slotsTime;

    @FindBy (xpath = "/html/body/div[2]/div/div/div/div/div/div[3]/button[1]")
    public WebElement slotsSubmit;

    @FindBy (xpath = "//*[@class='toast-message']")
    public WebElement messageScript;

    @FindBy (xpath = "/html/body/div[2]/div/div/div/div/div/div[2]/div/div[2]/div/div[3]/div[1]/div/input")
    public WebElement userPatientName;

    @FindBy (xpath = "/html/body/div[2]/div/div/div/div/div/div[2]/div/div[2]/div/div[3]/div[2]/div/input")
    public WebElement userPatientMail;

    @FindBy (xpath = "/html/body/div[2]/div/div/div/div/div/div[2]/div/div[2]/div/div[3]/div[4]/div/input")
    public WebElement userPatientPhone;

    @FindBy (xpath = "/html/body/div[2]/div/div/form/div/div[1]/div/div[5]/div/textarea")
    public WebElement userMessageBox;

    @FindBy (xpath = "/html/body/div[2]/div/div/div/div/div/div[2]/div/div[2]/div/div[1]/div/label[3]/input")
    public WebElement userOldPatientButton;

    @FindBy (xpath = "/html/body/div[2]/div/div/div/div/div/div[2]/div/div[2]/div/div[2]/div[1]/div/input")
    public WebElement usernameBox;

    @FindBy (xpath = "/html/body/div[2]/div/div/div/div/div/div[2]/div/div[2]/div/div[2]/div[2]/div/input")
    public WebElement usernamePasswordBox;

    @FindBy (xpath = "/html/body/div[2]/div/div/div/div/div/div[3]/button[1]")
    public WebElement usernameSubmitButton;

    // homepage > About us
    @FindBy (xpath = "//li[@class=' dropdown']")
    public WebElement aboutUsButton;

    // homepage > About us > About Hospitals
    @FindBy (xpath = "//*[@id=\"navbar-collapse-3\"]/ul/li[3]/ul/li[1]/a")
    public WebElement aboutHospitals;

    // homepage > About us > Meet Our Doctors
    @FindBy (xpath = "//*[@id=\"navbar-collapse-3\"]/ul/li[3]/ul/li[2]/a")
    public WebElement meetOurDoctors;

    // homepage > About us > FAQs
    @FindBy (xpath = "//*[@id=\"navbar-collapse-3\"]/ul/li[3]/ul/li[3]/a")
    public WebElement faqs;

    // homepage < about us > departments
    @FindBy (xpath = "//*[@id=\"navbar-collapse-3\"]/ul/li[3]/ul/li[4]/a")
    public WebElement departments;

    // homepage > about us > testimonials
    @FindBy (xpath = "//*[@id=\"navbar-collapse-3\"]/ul/li[3]/ul/li[5]/a")
    public WebElement testimonials;

    // homepage > about us > about hospitals
    @FindBy (xpath = "(//*[@class='col-md-6 col-sm-6'])[2]")
    public WebElement someWordsAboutUs;

    // homepage > about us > about hospitals
    @FindBy (xpath = "//*[@class='col-md-8 col-sm-8']")
    public WebElement ourMission;

    // homepage > about us > about hospitals
    @FindBy (xpath = "//*[@class='opening-hours']")
    public WebElement openingOurs;

    // homepage > about us > about hospitals
    @FindBy (xpath = "/html/body/div[2]/div/div/div[1]/div[5]/div[1]/div/img")
    public WebElement doctorHeidiImage;

    // homepage > about us > about hospitals
    @FindBy (xpath = "//*[*='Heidi Prather']")
    public WebElement doctorHeidiName;

    // homepage > about us > about hospitals
    @FindBy (xpath = "(//*[*='Professor'])[1]")
    public WebElement doctorHeidiTitle;

    // homepage > about us > about hospitals
    @FindBy (xpath = "/html/body/div[2]/div/div/div[1]/div[5]/div[2]/div/img")
    public WebElement doctorAlexanderImage;

    @FindBy (xpath = "//*[*='Alexander C. Simotas']")
    public WebElement doctorAlexanderName;

    @FindBy (xpath = "(//*[*='Professor'])[2]")
    public WebElement doctorAlexanderTitle;

    // homepage > about us > meet our doctors
    @FindBy (xpath = "//*[@id=\"practitioner\"]/div/div[1]/div/img")
    public WebElement doctorRachelImage;

    @FindBy (xpath = "//*[@id=\"practitioner\"]/div/div[1]/div/h4")
    public WebElement doctorRachelName;

    @FindBy (xpath = "//*[@id=\"practitioner\"]/div/div[1]/div/p")
    public WebElement doctorRachelTitle;

    @FindBy (xpath = "//*[@id=\"practitioner\"]/div/div[2]/div/img")
    public WebElement doctorSarahImage;

    @FindBy (xpath = "//*[@id=\"practitioner\"]/div/div[2]/div/h4")
    public WebElement doctorSarahName;

    @FindBy (xpath = "//*[@id=\"practitioner\"]/div/div[2]/div/p")
    public WebElement doctorSarahTitle;

    @FindBy (xpath = "/html/body/div[2]/div/div/div[1]/div/div[1]/ul/li[2]/a")
    public WebElement ophthalmologist;

    @FindBy (xpath = "//*[@id=\"ophthalmologist\"]/div/div[1]/div/img")
    public WebElement doctorLeeImage;

    @FindBy (xpath = "//*[@id=\"ophthalmologist\"]/div/div[1]/div/h4")
    public WebElement doctorLeeName;

    @FindBy (xpath = "//*[@id=\"ophthalmologist\"]/div/div[1]/div/p")
    public WebElement doctorLeeTitle;

    @FindBy (xpath = "/html/body/div[2]/div/div/div[1]/div/div[1]/ul/li[3]/a")
    public WebElement paediatrician;

    @FindBy (xpath = "//*[@id=\"paediatrician\"]/div/div[1]/div/img")
    public WebElement doctorAnneImage;

    @FindBy (xpath = "//*[@id=\"paediatrician\"]/div/div[1]/div/h4")
    public WebElement doctorAnnaName;

    @FindBy (xpath = "//*[@id=\"paediatrician\"]/div/div[1]/div/p")
    public WebElement doctorAnnaTitle;

    @FindBy (xpath = "/html/body/div[2]/div/div/div[1]/div/div[1]/ul/li[4]/a")
    public WebElement cardiologist;

    @FindBy (xpath = "/html/body/div[2]/div/div/div[1]/div/div[1]/ul/li[4]/a")
    public WebElement doctorMariaImage;

    @FindBy (xpath = "//*[@id=\"cardiologist\"]/div/div[1]/div/h4")
    public WebElement doctorMariaName;

    @FindBy (xpath = "//*[@id=\"cardiologist\"]/div/div[1]/div/p")
    public WebElement doctorMariaTitle;

    @FindBy (xpath = "/html/body/div[2]/div/div/div[1]/div/div[1]/ul/li[5]/a")
    public WebElement gynaecologist;

    @FindBy (xpath = "//*[@id=\"gynaecologist\"]/div/div[1]/div/img")
    public WebElement doctorLauraImage;

    @FindBy (xpath = "//*[@id=\"gynaecologist\"]/div/div[1]/div/h4")
    public WebElement doctorLauraName;

    @FindBy (xpath = "//*[@id=\"gynaecologist\"]/div/div[1]/div/p")
    public WebElement doctorLauraTitle;

    @FindBy (xpath = "/html/body/div[2]/div/div/div[1]/div/div[1]/ul/li[6]/a")
    public WebElement neurologist;

    @FindBy (xpath = "//*[@id=\"neurologist\"]/div/div[1]/div/img")
    public WebElement doctorJackImage;

    @FindBy (xpath = "//*[@id=\"neurologist\"]/div/div[1]/div/h4")
    public WebElement doctorJackName;

    @FindBy (xpath = "//*[@id=\"neurologist\"]/div/div[1]/div/p")
    public WebElement doctorJackTitle;

    // homepage > FAQS
    @FindBy (xpath = "/html/body/div[2]/div/div/div[1]/div/div[1]/div/div/h3")
    public WebElement leftScriptFaqs;

    @FindBy (xpath = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/h3")
    public WebElement rightScriptFaqs;

    @FindBy (xpath = "//*[@id=\"headingOne\"]/h4/a")
    public WebElement firstScriptTitle;

    @FindBy (xpath = "//*[@id=\"collapseOne\"]/div/p")
    public WebElement firstScriptBody;

    @FindBy (xpath = "//*[@id=\"headingTwo\"]/h4/a")
    public WebElement secondScriptTitle;

    @FindBy (xpath = "//*[@id=\"collapseTwo\"]/div/p")
    public WebElement secondScriptBody;

    @FindBy (xpath = "//*[@id=\"headingThree\"]/h4/a")
    public WebElement thirdScriptTitle;

    @FindBy (xpath = "//*[@id=\"collapseThree\"]/div/p")
    public WebElement thirdScriptBody;

    @FindBy (xpath = "//*[@id=\"headingSeven\"]/h4/a")
    public WebElement fourthScriptTitle;

    @FindBy (xpath = "//*[@id=\"collapseSeven\"]/div/p")
    public WebElement fourthScriptBody;

    @FindBy (xpath = "//*[@id=\"headingEight\"]/h4/a")
    public WebElement fifthScriptTitle;

    @FindBy (xpath = "//*[@id=\"collapseEight\"]/div/p")
    public WebElement fifthScriptBody;

    @FindBy (xpath = "//*[@id=\"headingFour\"]/h4/a")
    public WebElement sixthScriptTitle;

    @FindBy (xpath = "//*[@id=\"collapseFour\"]/div/p")
    public WebElement sixthScriptBody;

    @FindBy (xpath = "//*[@id=\"headingFive\"]/h4/a")
    public WebElement seventhScriptTitle;

    @FindBy (xpath = "//*[@id=\"collapseFive\"]/div/p")
    public WebElement seventhScriptBody;

    @FindBy (xpath = "//*[@id=\"headingSix\"]/h4/a")
    public WebElement eighthScriptTitle;

    @FindBy (xpath = "//*[@id=\"collapseSix\"]/div/p")
    public WebElement eighthScriptBody;

    @FindBy (xpath = "//*[@id=\"headingNine\"]/h4/a")
    public WebElement ninethScriptTitle;

    @FindBy (xpath = "//*[@id=\"collapseNine\"]/div/p")
    public WebElement ninethScriptBody;

    // homepage > departments
    @FindBy (xpath = "/html/body/div[2]/div/div/div[1]/div[2]/div[1]/div/img")
    public WebElement departmentsFirstImg;

    @FindBy (xpath = "/html/body/div[2]/div/div/div[1]/div[2]/div[1]/div/p")
    public WebElement departmentsFirstScript;

    @FindBy (xpath = "/html/body/div[2]/div/div/div[1]/div[2]/div[2]/div/img")
    public WebElement departmentsSecondImg;

    @FindBy (xpath = "/html/body/div[2]/div/div/div[1]/div[2]/div[2]/div/p")
    public WebElement departmentsSecondBody;

    @FindBy (xpath = "/html/body/div[2]/div/div/div[1]/div[2]/div[3]/div/img")
    public WebElement departmentsThirdImg;

    @FindBy (xpath = "/html/body/div[2]/div/div/div[1]/div[2]/div[3]/div/p")
    public WebElement departmentsThirdBody;

    // homepage > about us > testimonials
    @FindBy (xpath = "/html/body/div[2]/div/div/div[1]/div/div[1]/div/img")
    public WebElement testimonialsRobertImg;

    @FindBy (xpath = "/html/body/div[2]/div/div/div[1]/div/div[1]/div/div[1]/p")
    public WebElement testimonialsRobertScript;

    // homepage > login
    @FindBy (xpath = "//*[@id=\"alert\"]/div/div/div/div[2]/ul/li/a")
    public WebElement homepageLoginButton;

    @FindBy (xpath = "/html/body/div[1]/div/div/div/div[1]/div/div[2]")
    public WebElement loginWindow;

    @FindBy (xpath = "/html/body/div[1]/div/div/div/div[3]")
    public WebElement infoWindow;

    @FindBy (xpath = "//*[@id='email']")
    public WebElement userIdBox;

    @FindBy (xpath = "//*[@id='password']")
    public WebElement userPasswordBox;

    @FindBy (xpath = "//*[@type='submit']")
    public WebElement userLoginSubmitButton;

    @FindBy (xpath = "//*[@class='sidebar-session']")
    public WebElement dashboardSideBar;

    @FindBy (xpath = "/html/body/div[1]/div/div/div/div[1]/div/div[2]/div")
    public WebElement invalidUserScript;

    @FindBy (xpath = "//*[@class='forgot']")
    public WebElement forgotPasswordButton;

    @FindBy (xpath = "//*[@id=\"form-username\"]")
    public WebElement forgotPasswordEmailBox;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement forgotPasswordSubmitButton;

    @FindBy (xpath = "//*[@class='forgot']")
    public WebElement forgotPasswordUserLoginButton;


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

