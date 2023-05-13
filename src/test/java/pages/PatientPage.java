package pages;


import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;


import static utilities.Driver.driver;


public class PatientPage extends Base {
    Faker faker=new Faker();
    Actions actions=new Actions(Driver.getDriver());
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

    @FindBy(xpath = "//body[@class='skin-blue fixed sidebar-mini vsc-initialized']")
    public WebElement thredotstrue;

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
    @FindBy(xpath = "//h3[@class=\"box-title titlefix\"]")
    public WebElement notificationsboard;
    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm checkbox-toggle delete_all']")
    public WebElement notificationsDeletebutton;
    @FindBy(xpath = "//*[text()='No Record Found']")
    public WebElement notificationsInformation;

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

    @FindBy(xpath = "//span[@class='sidebar-session']")
    public WebElement DashboardOnHeallifeText;


    @FindBy(xpath = "//span[text()=' Dashboard']")
    public WebElement dashboardButton;


    @FindBy(xpath = "//i[@class='fas fa-hospital-alt']")

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

    @FindBy(xpath = "//textarea[@id='message']")
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

    @FindBy(xpath = "//*[@id='DataTables_Table_0_info']")
    public WebElement myAppointmentspageDetails;

    @FindBy(xpath = "//*[text()='Records: 11 to 12 of 12']")
    public WebElement myAppointmentsSecondspageDetails;
    @FindBy(xpath = "//ul[@class='list-group list-group-unbordered']\n")
    public WebElement myInformations;
    @FindBy(xpath = "//*[text()='Amount']")
    public WebElement showDetailtext;
    @FindBy(xpath = "//*[text()='Success']")
    public WebElement SuccestText;



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

        public  static  boolean checkTableHeadersExist(WebElement table) {
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

    public  void userLogin(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        entryLoginbutton.click();
        entryEmailText.sendKeys(ConfigReader.getProperty("usernameAysenuriye"));
        EntryPasswordText.sendKeys(ConfigReader.getProperty("userPassword"));
        Entry_SubmitButton.click();



    }









    public  void myAppointmentsAddAppointment(){
        PatientPage patientPage=new PatientPage();
        myAppiontmentsButton.click();
        addAppointmentsButton.click();      ReusableMethods.bekle(1);
        addAppointmentDatetext.click();     ReusableMethods.bekle(1);
/*
        Date currentDate = new Date();
        Date randomDate = faker.date().future(25, TimeUnit.DAYS, currentDate);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate = dateFormat.format(randomDate);
        actions.sendKeys(addAppointmentDatetext, formattedDate).build().perform();

 */
       /* Date currentDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.DATE, 1); // bir sonraki güne ilerleyin

        Date randomDate = faker.date().between(calendar.getTime(), new Date(calendar.getTimeInMillis() + TimeUnit.DAYS.toMillis(24))); // 25 gün sonrasına kadar rastgele bir tarih seçin
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate = dateFormat.format(randomDate);
        actions.sendKeys(addAppointmentDatetext, formattedDate).build().perform();

        */
        Date currentDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.MONTH, 5); // 3 ay ileriye ilerleyin

        Date randomDate = faker.date().between(calendar.getTime(), new Date(calendar.getTimeInMillis() + TimeUnit.DAYS.toMillis(90))); // 90 gün sonrasına kadar rastgele bir tarih seçin
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate = dateFormat.format(randomDate);
        actions.sendKeys(addAppointmentDatetext, formattedDate).build().perform();
        addAppointmentDateoptionsMay27.click();   ReusableMethods.bekle(1);

        addAppointmentSpecialistButton.click();     ReusableMethods.bekle(1);
        addAppointmentSpecialistValue.click();        ReusableMethods.bekle(1);
        addAppointmentsDoctorbutton.click();   ReusableMethods.bekle(1);
        addAppointmentdoctorAysenuriye.click();   ReusableMethods.bekle(1);

        Select select=new Select(addAppointmentsShiftButton);
        select.selectByIndex(1);
         ReusableMethods.bekle(2);
         select=new Select(addAppointmentsslotButton);
         select.selectByVisibleText("04:00 PM - 05:00 PM");


        addAppointmentsmessageText.click();
        addAppointmentsmessageText.sendKeys(faker.medical().diseaseName());
        ReusableMethods.bekle(1);
        addAppointmentsslot04.click();
        ReusableMethods.bekle(1);
        addAppointmentsSaveButton.click();


    }
    public void payCard(){
        PatientPage patientPage=new PatientPage();
         myAppiontmentsPaybutton.click();
        myAppointmentsPaywithCardbutton.click();
        ReusableMethods.bekle(2);

      actions.sendKeys(faker.internet().emailAddress()).perform();
      actions.sendKeys(Keys.TAB).perform();
      actions.sendKeys("4242 4242 4242 4242").perform();
        actions.sendKeys(Keys.TAB).perform();

        //myAppointmentsCardnumberText.sendKeys(");
     actions.sendKeys("0727").perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("571").perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("27200").perform();
        actions.sendKeys(Keys.TAB).perform();
       actions.sendKeys(Keys.ENTER).perform();



       /* WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(myAppoinmentsSecondPaybutton)).click();
*/

     /*   JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", myAppoinmentsSecondPaybutton);


      */


    }




        public void testStatusChangeMessage() {
            // Assume that the language has been changed successfully
            String message = "Status Change Successfully";


            // Get the message element from the page
            String pageSource = driver.getPageSource();
            Assert.assertTrue(pageSource.contains(message));
        }

    }















