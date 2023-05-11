package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PatientPage extends Base {
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
    public WebElement notificationsDeletebutton;

    //PatientHome page Profile_İmage
    @FindBy(xpath = "//img[@class='topuser-image']")
    public WebElement profileImage;
    @FindBy(xpath = "//h4[normalize-space()='ayse.nuriye.alcik']")
    public WebElement profileNametext;

    @FindBy(xpath = "//h5[text()='Patient']")
    public WebElement profilePatienttext;

    @FindBy(xpath = "//a[text()=' Change Password']")
    public WebElement profileChangepassButton;
    @FindBy(xpath = "//input[@name='current_pass']")
    public WebElement profileChangecurrentPassword;

    @FindBy(xpath = "//input[@name='new_pass']")
    public WebElement profileChangeNewPassword;
    @FindBy(xpath = "//input[@id='confirm_pass']")
    public WebElement profileConfirmPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement profileChangepasswordSubmitbutton;

    @FindBy(xpath = "//a[text()=' Logout']")
    public WebElement profileLogoutbutton;

    @FindBy(xpath = "//a[@href='https://qa.heallifehospital.com/patient/dashboard/ipdprofile']//img[@alt='User Image']")
    public WebElement profileProfileImage;


    //Paitientpage_Dashborad_ON_Heallife_Textfield

    @FindBy(xpath = "//span[@class='logo-mini']")
    public WebElement DashboardOnHeallifeText;

  //patientPageDashBoardSidebar Title

    @FindBy(xpath = "//span[text()=' Dashboard']")
    public WebElement dashboardButton;

    @FindBy(xpath = "//span[text()='My Appointments']")
    public WebElement myAppiontmentsButton;
    @FindBy(xpath = "//span[text()=' OPD']")
    public WebElement opdButton;
    @FindBy(xpath = "//span[text()=' IPD']")
    public WebElement ipdButton;
    @FindBy(xpath = "//span[text()=' Pharmacy']")
    public WebElement pharmacyButton;
    @FindBy(xpath = "//span[text()=' Pathology']")
    public WebElement pathologyButton;
    @FindBy(xpath = "//span[text()=' Radiology']")
    public WebElement radiologyButton;
    @FindBy(xpath = "//span[text()=' Ambulance']")
    public WebElement ambulanceButton;
    @FindBy(xpath = "//span[text()=' Blood Bank']")
    public WebElement bloodBankButton;

    //PatintPage  My Appointments Randevu oluşturma
    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement addAppointmentsButton;
    @FindBy(xpath = "//input[@id='dates']")
    public WebElement addAppointmentDatetext;

    @FindBy(xpath = "//td[text()='27']")
    public WebElement addAppointmentDateoptionsMay27;
    @FindBy(xpath = "//td[text()='28']")
    public WebElement addAppointmentDateoptionsMay28;
    @FindBy(xpath = "//td[text()='29']")
    public WebElement addAppointmentDateoptionsMay29;
    @FindBy(xpath = "//td[text()='30']")
    public WebElement addAppointmentDateoptionsMay30;
    @FindBy(xpath = "//td[text()='31']")
    public WebElement addAppointmentDateoptionsMay31;


    @FindBy(xpath = "//select[@name='specialist']")
    public WebElement addAppointmentSpecialistButton;

    @FindBy(xpath = "//option[@value='2']")
    public WebElement addAppointmentSpecialistValue;

    @FindBy(xpath = "//select[@name='doctor']")
    public WebElement addAppointmentsDoctorbutton;
    @FindBy(xpath = "//option[@value='56']")
    public WebElement addAppointmentdoctorAysenuriye;
    @FindBy(xpath = "//select[@name='global_shift']")
    public WebElement addAppointmentsShiftButton;
    @FindBy(xpath = "(//option[@value='3'])[2]")
    public WebElement addAppointmentsshiftEvening;

    @FindBy(xpath = "//select[@name='shift']")
    public WebElement addAppointmentsslotButton;
    @FindBy(xpath = "//option[@value='470']")

    public WebElement addAppointmentsSlot04PM;
    @FindBy(xpath = "//select[@name='priority']")
    public WebElement addAppointmentsPrioritybutton;

    @FindBy(xpath = "(//option[@value='1'])[3]")
    public WebElement addAppointmentpriorityNormal;

    @FindBy(xpath = "//textarea[@name='message']")
    public WebElement addAppointmentsmessageText;

    @FindBy(xpath = "//span[@id='slot_0']")
    public WebElement addAppointmentsslot04;
    @FindBy(xpath = "//span[@id='slot_1']")
    public WebElement addAppointmentsslot0410;
    @FindBy(xpath = "//span[@id='slot_2']")
    public WebElement addAppointmentsslot0420;
    @FindBy(xpath = "//span[@id='slot_3']")
    public WebElement addAppointmentsslot0430;
    @FindBy(xpath = "//span[@id='slot_4']")
    public WebElement addAppointmentsslot0440;
    @FindBy(xpath = "//span[@id='slot_5']")
    public WebElement addAppointmentsslot0450;
    @FindBy(xpath = "//button[@id='formaddbtn']")
    public WebElement addAppointmentsSaveButton;

    //mypatientShowButton

    @FindBy(xpath = "(//a[@href='#'])[9]")
    public WebElement myAppointmentsShowButton;

    @FindBy(xpath = "//button[@data-original-title='Close']")
    public WebElement myAppointmentsShowcloseButton;
    //myAppointmentdelete
    @FindBy(xpath = "//a[@data-original-title='Delete']")
    public WebElement myAppointmentdeleteButton;

    //MyAppointmentPAY
    @FindBy(xpath = "//*[text()='  Pay']")
    public WebElement myAppiontmentsPaybutton;

    @FindBy(xpath = "//*[text()='Pay with Card']")
    public WebElement myAppointmentsPaywithCardbutton;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement myAppointmentsEmailtext;
    @FindBy(xpath = "//input[@id='card_number']")
    public WebElement myAppointmentsCardnumberText;
    @FindBy(xpath = "//input[@id='cc-exp']")
    public WebElement myAppointmentsMMYYText;
    @FindBy(xpath = "//input[@id='cc-csc']")
    public WebElement myAppointmentsCVCText;
    @FindBy(xpath = "//button[@tabindex='2']")
    public WebElement myAppoinmentsSecondPaybutton;
    //MypAppoinmetSeachtext
    @FindBy(xpath = "//input[@type='search']")
    public WebElement myAppoinmetSeachtext;
    @FindBy(xpath = "//tr[@class='odd']/td[1]")
    public WebElement myAppointmentApointmentno;
    //MyAppoinments NextPage
    @FindBy(xpath = "//*[text()='2']")
    public WebElement myAppoinmentsSecondPageButton;
    @FindBy(xpath = "//*[text()='']")
    public WebElement myAppoinmentsFirstPageButton;

    @FindBy(xpath = "//*[text()='Records: 1 to 10 of 12']")
    public WebElement myAppointmentsFirstpageDetails;

    @FindBy(xpath = "//*[text()='Records: 11 to 12 of 12']")
    public WebElement myAppointmentsSecondspageDetails;


    public static void checkHeaderExistence(WebElement element) {
        String[] headerNames = {"Patient Id", "Gender", "Marital Status", "Phone", "Email", "Address", "Age", "Guardian Name", "Username", "Password"};

        for (String headerName : headerNames) {
            List<WebElement> headerElements = element.findElements(By.xpath("//li[b='" + headerName + "']"));
            if (headerElements.size() > 0) {
                System.out.println(headerName + " exists");
            } else {
                System.out.println(headerName + " does not exist");
            }
        }
    }

    public boolean checkTableHeadersExist(WebElement table) {
        List<WebElement> headers = table.findElements(By.tagName("th"));
        String[] expectedHeaders = {"Appointment No", "Appointment Date", "Priority", "Specialist", "Doctor", "Status", "Message", "Action"};

        if (headers.size() != expectedHeaders.length) {
            return false;
        }

        for (int i = 0; i < expectedHeaders.length; i++) {
            if (!headers.get(i).getText().equals(expectedHeaders[i])) {
                return false;
            }
        }

        return true;
    }


}
