package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PatientPage extends Base{
    // Userlogin >
    @FindBy(xpath = "//a[text()='Login']")
    public WebElement entryLoginbutton;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement entryEmailText;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement EntryPasswordText;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement Entry_SubmitButton;

//UserLoginHomePage
    @FindBy(xpath = "//a[@role='button']")
    public WebElement homeThreeDots;

//HomePatientpageFlag
    @FindBy(xpath = "(//button[@type='button'])")
    public WebElement homeFlag;

    @FindBy(xpath = "//a[text()=' English']")
    public WebElement homeFlagEnglish;

    @FindBy(xpath = "//a[text()=' Turkish']")
    public WebElement homeFlagTurkish;

//PatientHome page notifications

    @FindBy(xpath = "//i[@class='fa fa-bell-o']")
    public WebElement notifications;
    @FindBy(xpath = "//button[@autocomplete='off']")
    public  WebElement notificationsDeletebutton;

//PatientHome page Profile_İmage
@FindBy (xpath = "//img[@class='topuser-image']")
public WebElement profileImage;
@FindBy (xpath = "//h4[normalize-space()='ayse.nuriye.alcik']")
public WebElement profileNametext;

@FindBy(xpath = "//h5[text()='Patient']")
public WebElement profilePatienttext;

    @FindBy (xpath = "//a[text()=' Change Password']")
    public WebElement profileChangepassButton;
    @FindBy (xpath = "//input[@name='current_pass']")
    public WebElement profileChangecurrentPassword;

    @FindBy(xpath ="//input[@name='new_pass']" )
    public WebElement  profileChangeNewPassword;
    @FindBy(xpath = "//input[@id='confirm_pass']")
    public WebElement profileConfirmPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement profileChangepasswordSubmitbutton;

    @FindBy(xpath = "//a[text()=' Logout']")
    public WebElement profileLogoutbutton;

    @FindBy(xpath = "//a[@href='https://qa.heallifehospital.com/patient/dashboard/ipdprofile']//img[@alt='User Image']")
    public  WebElement profileProfileImage;


    //Paitientpage_Dashborad_ON_Heallife_Textfield

@FindBy(xpath = "//span[@class='logo-mini']")
    public WebElement DashboardOnHeallifeText;

//patientPageDashBoardSidebar Title


    @FindBy (xpath = "//span[text()=' Dashboard']")
 public WebElement dashboardButton;

    @FindBy(xpath ="//span[text()='My Appointments']" )
    public WebElement myAppiontmentsButton;

    @FindBy(xpath = "//span[text()=' OPD']")
    public WebElement opdButton;


    @FindBy(xpath ="//span[text()=' IPD']" )
    public WebElement ipdButton;
    @FindBy(xpath = "//span[text()=' Pharmacy']")
    public WebElement pharmacyButton;
    @FindBy(xpath ="//span[text()=' Pathology']" )
    public WebElement pathologyButton;
    @FindBy(xpath ="//span[text()=' Radiology']" )
    public WebElement radiologyButton;
    @FindBy(xpath ="//span[text()=' Ambulance']" )
    public WebElement ambulanceButton;
    @FindBy(xpath ="//span[text()=' Blood Bank']" )
    public WebElement bloodBankButton;



}
