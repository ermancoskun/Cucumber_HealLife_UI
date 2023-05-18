package pages;







import org.bouncycastle.jcajce.provider.asymmetric.X509;


import org.junit.Assert;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

import utilities.ReusableMethods;


import javax.swing.*;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


import java.util.ArrayList;
import java.util.Collections;


import java.util.List;

import java.util.concurrent.TimeUnit;


import static utilities.Driver.driver;



public class PatientPage extends Base {

    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());

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

    public static boolean checkTableHeadersExist(WebElement table) {
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

    public void userLogin() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        entryLoginbutton.click();
        entryEmailText.sendKeys(ConfigReader.getProperty("usernameAysenuriye"));
        EntryPasswordText.sendKeys(ConfigReader.getProperty("userPassword"));
        Entry_SubmitButton.click();


    }


    public void myAppointmentsAddAppointment() {
        PatientPage patientPage = new PatientPage();
        myAppiontmentsButton.click();
        addAppointmentsButton.click();
        ReusableMethods.bekle(1);
        addAppointmentDatetext.click();
        ReusableMethods.bekle(1);
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
        calendar.add(Calendar.MONTH, 11); // 3 ay ileriye ilerleyin

        Date randomDate = faker.date().between(calendar.getTime(), new Date(calendar.getTimeInMillis() + TimeUnit.DAYS.toMillis(90))); // 90 gün sonrasına kadar rastgele bir tarih seçin
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate = dateFormat.format(randomDate);
        actions.sendKeys(addAppointmentDatetext, formattedDate).build().perform();
        addAppointmentDateoptionsMay27.click();
        ReusableMethods.bekle(1);

        addAppointmentSpecialistButton.click();
        ReusableMethods.bekle(1);
        addAppointmentSpecialistValue.click();
        ReusableMethods.bekle(1);
        addAppointmentsDoctorbutton.click();
        ReusableMethods.bekle(1);
        addAppointmentdoctorAysenuriye.click();
        ReusableMethods.bekle(1);

        Select select = new Select(addAppointmentsShiftButton);
        select.selectByIndex(1);
        ReusableMethods.bekle(2);
        select = new Select(addAppointmentsslotButton);
        select.selectByVisibleText("04:00 PM - 05:00 PM");


        addAppointmentsmessageText.click();
        addAppointmentsmessageText.sendKeys(faker.medical().diseaseName());
        ReusableMethods.bekle(1);
        addAppointmentsslot04.click();

        try {
            // Alerti kontrol etmek için switchTo() ve alert() metodlarını kullanın
            Alert alert = driver.switchTo().alert();

            // Alert mevcutsa kabul et (OK düğmesine tıkla)
            alert.accept();

            // Web Element A'ya tıkla
            addAppointmentsslot0450.click();
            addAppointmentsSaveButton.click();
        } catch (NoAlertPresentException e) {
            // Alert mevcut değilse Web Element B'ye tıkla
            addAppointmentsSaveButton.click();
        }


    }

    public void payCard() {
        PatientPage patientPage = new PatientPage();
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
    //Pharmacy page=============================================//=======================

    @FindBy(xpath = "//h3[@class='box-title titlefix']")
    public WebElement pharmacyBillText;


    @FindBy(xpath = "//span[text()=' Pharmacy']")
    public WebElement pharmacySideBox;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy(xpath = "//td[text()='PHARMAB43']")
    public WebElement pharmacyText;

    @FindBy(xpath = "(//i[@class='fa fa-money'])[1]")
    public WebElement wievAllBox;

    @FindBy(xpath = "(//th[text()='Date'])[1]")
    public WebElement dateText;

    @FindBy(xpath = "(//button[@class='close'])[3]")
    public WebElement pharmacyCloseButton;

    @FindBy(xpath = "(//i[@class='fa fa-reorder'])[1]")
    public WebElement pharmacyShowButton;

    @FindBy(xpath = "//td[text()='ayse.busra.pehlivan (338)']")
    public WebElement pharmacyNameText;

    @FindBy(xpath = "(//button[@class='btn btn-primary btn-xs'])[6]")
    public WebElement pharmacyPayButton;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement pharmacyPaymenAmount;

    @FindBy(xpath = "//button[@id='pay_button']")
    public WebElement pharmacyAddButton;

    @FindBy(xpath = "//span[text()='Pay with Card']")
    public WebElement pharmacyPayWithCard;

    @FindBy(xpath = "(//input[@class='control'])[1]")
    public WebElement pharmacyEmailBox;

    @FindBy(xpath = "//input[@id='card_number']")
    public WebElement pharmacyCardNumberBox;


    @FindBy(xpath = "//i[@class='fa fa-check']")
    public WebElement pharmacySuccesfulText;


    @FindBy(xpath = "(//button[@class='close'])[2]")
    public WebElement pharmacyClose;

    @FindBy(xpath = "//td[text()='Payment']")
    public WebElement pathologyPaymentTextYazisi;


    @FindBy(xpath = "(//button[@class='close'])[6]")
    public WebElement pathologyClose;


    @FindBy(xpath = "//td[text()='ayse.busra.pehlivan (338)']")
    public WebElement pathologyNameText;


    @FindBy(xpath = "(//button[@type='button'])[9]")
    public WebElement pathologyViewwClose;

    @FindBy(xpath = "(//button[@type='button'])[2]")
    public WebElement pathologyPayButton;


    @FindBy(xpath = "//input[@id='amount_total_paid']")
    public WebElement pathologyPaymentAmountBox;

    @FindBy(xpath = "//button[@id='pay_button']")
    public WebElement pathologyAddButton;

    @FindBy(xpath = "//span[text()='Pay with Card']")
    public WebElement pathologyPayWithCard;
    //=======================================================================================================

    @FindBy(xpath = "//span[text()=' Radiology']")
    public WebElement radiologyButtonn;

    @FindBy(xpath = "//td[text()='RADIOB73']")
    public WebElement radioBillNo;

    @FindBy(xpath = "//td[text()='RADIOB73']")
    public WebElement radioBillNoText;

    public static boolean baslikListelemeMethod(String data) {
        List<WebElement> actualList = Driver.getDriver().findElements(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr[1]//th"));
        List<String> baslikListesiActual = new ArrayList<>();
        for (WebElement each : actualList
        ) {
            baslikListesiActual.add(each.getText());
        }
        System.out.println(baslikListesiActual);
        String[] liste = data.split(", ");


        System.out.println(Arrays.toString(liste));
        int count = 0;


        for (int i = 0; i < liste.length; i++) {
            for (int j = 0; j < baslikListesiActual.size(); j++) {
                if (baslikListesiActual.get(j).equals(liste[i])) {
                    count++;
                }
            }
        }
        if (count == liste.length) {
            return true;
        }


        return false;
    }

    public static boolean intListSortTest(int sutunNo) {


        WebElement baslik = Driver.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[" + sutunNo + "]"));

        baslik.click();
        ReusableMethods.bekle(3);
        List<WebElement> ActualList = Driver.getDriver().findElements(By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr/td[" + sutunNo + "]"));

        List<String> ActualStringList = new ArrayList<>();
        for (WebElement each : ActualList
        ) {
            ActualStringList.add(each.getText().replaceAll("[^\\d]", ""));
        }
        System.out.println(ActualStringList);


        List<String> ExpectedList = new ArrayList<>(ActualStringList);
        Collections.sort(ExpectedList);
        if (ActualStringList.equals(ExpectedList)) {
            return true;
        }
        return false;

    }

    @FindBy(xpath = "//span[text()=' Pathology']")
    public WebElement pathologySideBox;

    @FindBy(xpath = "//h3[text()='Pathology Test Reports']")
    public WebElement pathologytTextReportYazisi;

    @FindBy(xpath = "//td[text()='PATHOB100']")
    public WebElement pathologytPATHOB100Yazisi;

    //=========================================US30===============================
    @FindBy(xpath = "//span[text()='OPD']")
    public WebElement dashboardOpdText;

    @FindBy(xpath = "//span[text()='IPD']")
    public WebElement dashboardIpdText;


    @FindBy(xpath = "//span[text()='Pharmacy']")
    public WebElement dashboardPharmacyText;

    @FindBy(xpath = "//span[text()='Pathology']")
    public WebElement dashboardPathologyText;

    @FindBy(xpath = "//span[text()='Radiology']")
    public WebElement dashboardRadiologyText;

    @FindBy(xpath = "//span[text()='Blood Bank']")
    public WebElement dashboardBloodBankText;

    @FindBy(xpath = "//span[text()='Ambulance']")
    public WebElement dashboardAmbulanceText;


    @FindBy(xpath = "//canvas[@id='finding-bar-chart']")
    public WebElement dashboardTop10FindingsChart;


    @FindBy(xpath = "//canvas[@id='symptom-bar-chart']")
    public WebElement dashboardTop10symptomChart;

    @FindBy(xpath = "//canvas[@id='medical-history-chart']")
    public WebElement dashboardMedicalHistoryChart;

    @FindBy(xpath = "//span[text()=' Dashboard']")
    public WebElement dashboardLinkk;

    // =========================US_27===============================================
    @FindBy(xpath = "(//button[@class='close'])[6]")
    public WebElement radiologyClose;


    @FindBy(xpath = "(//button[@type='button'])[9]")
    public WebElement radiologyShowClose;


    @FindBy(xpath = "(//button[@type='button'])[2]")
    public WebElement radiologyPayButton;

    @FindBy(xpath = "(//input[@type='text'])[8]")
    public WebElement radiologyPaymentAmount;

    @FindBy(xpath = "//*[@id=\"testreport\"]/thead/tr/th[3]")
    public WebElement patalogyReportingDate;



    public static boolean baslikListelemeMethod2(String data) {
        List<WebElement> actualList = Driver.getDriver().findElements(By.xpath("//*[@id=\"testreport\"]/thead/tr/th"));
        List<String> baslikListesiActual = new ArrayList<>();
        for (WebElement each : actualList
        ) {
            baslikListesiActual.add(each.getText());
        }
        System.out.println(baslikListesiActual);
        String[] liste = data.split(", ");

        System.out.println(Arrays.toString(liste));
        int count = 0;
        for (int i = 0; i < liste.length; i++) {
            for (int j = 0; j < baslikListesiActual.size(); j++) {
                if (baslikListesiActual.get(j).equals(liste[i])) {
                    count++;
                }
            }
        }
        if (count == liste.length) {
            return true;
        }
        return false;
    }

    public static boolean TarihListSiralamaTesti(int sutunNo) {

        WebElement baslik = Driver.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[3]"));
        baslik.click();
        ReusableMethods.bekle(3);
        List<WebElement> ActualList = Driver.getDriver().findElements(By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[3]"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm a", Locale.ENGLISH);

        List<LocalDateTime> tarihler = new ArrayList<>();
        for (WebElement each : ActualList
        ) {
            String data = each.getText();
            LocalDateTime dateTime = LocalDateTime.parse(data, formatter);
            tarihler.add(dateTime);
        }
        int sayi = 0;
        for (int i = 0; i < tarihler.size() - 1; i++) {
            sayi = tarihler.get(i).compareTo(tarihler.get(i + 1));
            if (sayi > 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean intListSortTest2 ( int sutunNo){
        WebElement baslik = Driver.getDriver().findElement(By.xpath("(//th[@class='sorting'])[" + sutunNo + "]"));
        baslik.click();
        ReusableMethods.bekle(3);
        List<WebElement> ActualList = Driver.getDriver().findElements(By.xpath("(//th[@class='sorting'])[\" + sutunNo + \"]"));

        List<String> ActualStringList = new ArrayList<>();
        for (WebElement each : ActualList
        ) {
            ActualStringList.add(each.getText().replaceAll("[^\\d]", ""));
        }
        System.out.println(ActualStringList);



        List<String> ExpectedList = new ArrayList<>(ActualStringList);
        Collections.sort(ExpectedList);
        if (ActualStringList.equals(ExpectedList)) {
            return true;
        }
        return false;

    }

    public static boolean intListSortTest3 ( int sutunNo){
        WebElement baslik = Driver.getDriver().findElement(By.xpath("(//th[@class='sorting'])[" + sutunNo + "]"));
        baslik.click();
        ReusableMethods.bekle(3);
        List<WebElement> ActualList = Driver.getDriver().findElements(By.xpath("//*[@id=\"testreport\"]/tbody/tr[1]/td[1]"));

        List<String> ActualStringList = new ArrayList<>();
        for (WebElement each : ActualList
        ) {
            ActualStringList.add(each.getText().replaceAll("[^\\d]", ""));
        }
        System.out.println(ActualStringList);



        List<String> ExpectedList = new ArrayList<>(ActualStringList);
        Collections.sort(ExpectedList);
        if (ActualStringList.equals(ExpectedList)) {
            return true;
        }
        return false;

    }
    public static boolean intListSortTest4 ( int sutunNo){
        WebElement baslik = Driver.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[6]"));
        baslik.click();
        ReusableMethods.bekle(3);
        List<WebElement> ActualList = Driver.getDriver().findElements(By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[6]"));

        List<String> ActualStringList = new ArrayList<>();
        for (WebElement each : ActualList
        ) {
            ActualStringList.add(each.getText().replaceAll("[^\\d]", ""));
        }
        System.out.println(ActualStringList);



        List<String> ExpectedList = new ArrayList<>(ActualStringList);
        Collections.sort(ExpectedList);
        if (ActualStringList.equals(ExpectedList)) {
            return true;
        }
        return false;

    }

    //============================================ Nesibe [US_023] OPD MENU ============================================

    @FindBy(xpath = "//*[@id=sibe-box]/ul/li[3]/a")
    public WebElement opdMenu;

    @FindBy(xpath = "//*[text()=' Overview']")
    public WebElement overview;

    @FindBy(xpath = "//*[text()=' Visits']")
    public WebElement visits;

    @FindBy(xpath = "//*[text()=' Lab Investigation']")
    public WebElement labInvestigation;

    @FindBy(xpath = "//*[text()=' Treatment History']")
    public WebElement treatmentHistory;

    @FindBy(xpath = "//*[text()=' Timeline']")
    public WebElement timeline;

    @FindBy(xpath = "//*[text()='Gender']")
    public WebElement gender;

    @FindBy(xpath = "//*[text()='Age']")
    public WebElement age;

    @FindBy(xpath = "//*[text()='Guardian Name']")
    public WebElement guardianName;

    @FindBy(xpath = "//*[text()='Phone']")
    public WebElement phone;

    @FindBy(xpath = "//*[text()='Visit Details']")
    public WebElement sumVisitDetails;

    @FindBy(xpath = "(//*[text()='Lab Investigation'])[1]")
    public WebElement sumlabInvestigation;

    @FindBy(xpath = "(//input[@type='search'])[2]")
    public WebElement searchLabInvestigation;

    @FindBy(xpath = "(//*[text()='Treatment History'])[1]")
    public WebElement sumTreatmentHistory;

    @FindBy(xpath = "(//*[text()='Timeline'])[1]")
    public WebElement sumTimeline;

    @FindBy(xpath = "(//*[text()='Consultant Doctor'])[1]")
    public WebElement consultantDoctor;


    @FindBy(xpath = "(//*[text()='OPD No'])[2]")
    public WebElement opdNoFilter ;

    @FindBy(xpath = "(//*[text()='Case ID / Patient ID'])[3]")
    public WebElement caseIdFilter ;

    @FindBy(xpath = "(//*[text()='Appointment Date'])[2]")
    public WebElement appointmentDateFilter ;

    @FindBy(xpath = "(//*[text()='Consultant'])[2]")
    public WebElement consultantFilter ;

    @FindBy(xpath = "(//*[text()='Reference'])[2]")
    public WebElement referanceFilter ;

    @FindBy(xpath = "(//*[text()='Symptoms'])[2]")
    public WebElement symptomFilter;

    @FindBy(xpath = "(//*[@class='sorting'])[1]")
    public WebElement opdNo;

    @FindBy(xpath = "(//*[@class='sorting'])[2]")
    public WebElement caseId;

    @FindBy(xpath = "(//*[@class='sorting'])[3]")
    public WebElement appointmentDate;

    @FindBy(xpath = "(//*[@class='sorting'])[4]")
    public WebElement consultant;

    @FindBy(xpath = "(//*[@class='sorting'])[5]")
    public WebElement referance;


    @FindBy(xpath = "(//input[@type='search'])[1]")
    public WebElement searchVisit;


    @FindBy(xpath = "(//*[text()='Test Name'])[2]")
    public WebElement testName ;

    @FindBy(xpath = "(//*[text()='OPD No'])[3]")
    public WebElement opdNoFilter2;

    @FindBy(xpath = "(//*[text()='Case ID / Patient ID'])[4]")
    public WebElement caseId2Filter ;

    @FindBy(xpath = "(//*[text()='Lab'])[2]")
    public WebElement labFilter ;

    @FindBy(xpath = "(//*[text()='Sample Collected'])[2]")
    public WebElement sampleCollectedFilter ;

    @FindBy(xpath = "(//*[text()='Expected Date'])[2]")
    public WebElement expectedDateFilter ;

    @FindBy(xpath = "(//*[text()='Approved By'])[2]")
    public WebElement approvedByFilter ;

    @FindBy(xpath = "//*[text()='Test Name']")
    public WebElement testName2;

    @FindBy(xpath = "(//*[text()='Case ID / Patient ID'])[3]")
    public WebElement caseId2;

    @FindBy(xpath = "//*[text()='Lab']")
    public WebElement lab;

    @FindBy(xpath = "//*[text()='Sample Collected']")
    public WebElement sampleCollected;

    @FindBy(xpath = "//*[text()='Expected Date']")
    public WebElement expectedData;

    @FindBy(xpath = "(//*[text()='Approved By'])")
    public WebElement approvedBy;


    @FindBy(xpath = "(//*[text()='Appointment Date'])[3]")
    public WebElement appointmentDate2;


    @FindBy(xpath = "(//*[text()='Symptoms'])[3]")
    public WebElement symptoms2 ;

    @FindBy(xpath = "(//*[text()='Symptoms'])")
    public WebElement symptoms;


    @FindBy(xpath = "(//input[@type='search'])[3]")
    public WebElement searchTreatment;

    @FindBy(xpath = "(//*[text()='Action'])[1]")
    public WebElement actionVisit;

    @FindBy(xpath = "((//*[text()='Action'])[2]")
    public WebElement actionLabInvestigation;

    @FindBy(xpath = "(//*[text()='Action'])[3]")
    public WebElement actionTreatmentHistory;

    @FindBy(xpath = "(//a[@href='javascript:void(0)'])[1]")
    public WebElement testSonuc1 ;

    @FindBy(xpath = "(//a[@href='javascript:void(0)'])[1]")
    public WebElement testSonucEkran ;

    @FindBy(xpath = "(//*[text()='OPD No'])[3]")
    public WebElement opdNoTreatment ;

    @FindBy(xpath = "(//*[text()='OPD No'])[3]")
    public WebElement caseId3 ;

    @FindBy(xpath = "(//*[text()='Consultant'])[3]")
    public WebElement consultantFilter2 ;

    @FindBy(xpath = "(//select[@name])[1]")
    public WebElement makeAll ;

    @FindBy(xpath = "(//*[text()='Timeline'])[2]")
    public WebElement timeLineShow ;

    @FindBy(xpath = "(//*[text()=' 15.05.2023'])[2]")
    public WebElement timeLineDateShow ;

    @FindBy(xpath = "(//*[text()=' kontrol '])[2]")
    public WebElement timeLineNameShow ;

    @FindBy(xpath = "(//*[text()=' 31.05.2023'])[2]")
    public WebElement timeLineDateFuture ;

    @FindBy(xpath = "(//select[@name='x'])[2]")
    public WebElement prescriptionNot ;



    //============================================ Nesibe [US_023] OPD MENU SONU =======================================

    @FindBy(xpath = "//input[@id='password']")
    public WebElement PasswordBox;
    @FindBy (xpath = "//button[@type='submit']")
    public WebElement SigninButton;

    @FindBy (xpath = "(//h3[@class='text-uppercase bolds mt0 ptt10 pull-left font14'])[1]")
    public WebElement IPDName;


    public void loginAspatient(String username, String password) {
        entryEmailText.sendKeys(ConfigReader.getProperty(username));
        PasswordBox.sendKeys(ConfigReader.getProperty(password));
        SigninButton.click();






    }

   // IPD
    @FindBy(xpath = "//i[@class='fa fa-th']")
    public WebElement OverviewTab;

    // IPD -> Overview
    @FindBy(xpath = "(//i[@class='fa fa-reorder'])[1]")
    public WebElement ProfileButton;

    //IPD ->Overview->ProfileButton
    @FindBy (xpath = "(//h4[@class='modal-title'])[2]")
    public WebElement PatientDetailsTitle;


    // IPD
    @FindBy(xpath ="(//i[@class='far fa-calendar-check'])[1]")
    public WebElement MeditacionTab;

    // IPD
    @FindBy (xpath = "(//i[@class='far fa-calendar-check'])[2]")
    public WebElement PrescriptionTab;

    //IPD
    @FindBy (xpath = "//i[@class='fas fa-cut']")
    public WebElement OperationTab;

    //IPD
    @FindBy(xpath = "//i[@class='fas fa-donate']")
    public WebElement ChargesTab;

    //IPD
    @FindBy(xpath = "(//i[@class='fas fa-hand-holding-usd'])[1]")
    public WebElement PaymentTab;

    //IPD
    @FindBy (xpath = "(//i[@class='fa fa-video-camera'])[2]")
    public WebElement LiveConsulationTab;

    //IPD
    @FindBy (xpath = "//i[@class='fas fa-sticky-note']")
    public WebElement NurseNotesTab;

    //IPD
    @FindBy (xpath ="//span[@class='fa fa-chevron-right']" )
    public WebElement RightArrowKey;

    //IPD
    @FindBy (xpath = "(//i[@class='far fa-calendar-check'])[3]")
    public WebElement Timeline;


    //IPD
    @FindBy(xpath = "(//i[@class='fas fa-hand-holding-usd'])[2]")
    public WebElement TreatmentHistory;


    //IPD
    @FindBy (xpath = "(//i[@class='fas fa-procedures'])[2]")
    public WebElement BedHistory;


    //IPD
    @FindBy(xpath = "(//i[@class='fas fa-file-prescription'])[1]")
    public WebElement ConsultantRegister;

    //IPD->Overivew
    @FindBy (xpath = "(//td[@class='bolds'])[1]")
    public WebElement GenderText;

    //IPD->Overivew
    @FindBy (xpath = "(//td[@class='bolds'])[2]")
    public WebElement AgeText;

    //IPD->Overivew
    @FindBy (xpath = "//td[@class='bolds'])[3]")
    public WebElement GuardianNameText;

    //IPD->Overivew
    @FindBy (xpath = "//td[@class='bolds'])[3]")
    public WebElement PhoneText;

    //IPD->Overivew
    @FindBy(xpath = "//div[@class='col-lg-9 col-md-8 col-sm-12']")
    public WebElement summarypartText;

    //IPD->Meditacion
    @FindBy (xpath = "//th[@class='hard_left']")
    public WebElement MeditacionDateText;

    //IPD->Meditacion
    @FindBy (xpath = "//th[@class='next_left']")
    public WebElement 	MedicineNameText;

    //IPD->Meditacion
    @FindBy (xpath = "//th[@class='sticky-col']")
    public WebElement Dose1Text;

    //IPD->Meditacion
    @FindBy (xpath = "//div[@class='table_inner']")
    public WebElement TitleText;

  // IPD->Prescription
    @FindBy (xpath = "(//th[@class='sorting'])[9]")
    public WebElement PrescriptionNo;

// IPD -> Prescription
    @FindBy (xpath = "(//th[@class='sorting'])[10]")
    public WebElement PrescriptionDate;

    @FindBy (xpath = "//th[@class='sorting_desc']")
    public WebElement PrescriptionFinding;

    @FindBy (xpath = "//*[@class='tab-content']")
    public WebElement IPDTitle;

    public void TitleAssertion(String elementText){

        WebElement webElement =Driver.getDriver().findElement(By.xpath("//a[text()=' "+elementText+"']"));
        webElement.click();
        ReusableMethods.bekle(3);
        Assert.assertTrue(IPDTitle.isDisplayed());


    }

    //IPD->Prescription
    @FindBy (xpath = "(//input[@type='search'])[3]")
    public WebElement PrescriptionSearchBox;

    @FindBy(xpath = "(//div[@class='dataTables_info'])[3]")
    public WebElement searchresulttext;

    @FindBy(xpath = "(//i[@class='fas fa-file-prescription'])[2]")
    public WebElement PrescriptionActionsButton;

    @FindBy (xpath = "(//table[@class='printablea4'])[1]")
    public WebElement ActionsPrescriptionNo;



    //IPD->ConsultantRegister
    @FindBy (xpath = "(//input[@type='search'])[1]")
    public WebElement  ConsultantRegisterSearchBox;

    @FindBy  (xpath = "(//div[@class='dataTables_info'])[1]")
    public WebElement ConsultantRegisterSearcResult;



    @FindBy(xpath = "(//td[@class='dataTables_empty'])[1]")
    public WebElement LabInvestigationResultText;



    //IPD->Operation
    @FindBy(xpath = "(//th[text()='Reference No'])[2]")
    public WebElement OperationReferenceNo;

    @FindBy (xpath = "(//i[@class='fa fa-reorder'])[2]")
    public WebElement OperationShow;

    @FindBy(xpath = "(//h4[@class='modal-title'])[8]")
    public WebElement OperationDetails;


    //IPD->Payment

    @FindBy(xpath = "(//div[@class='dataTables_wrapper no-footer'])[7]")
    public WebElement PaymentDetails;

    //IPD->Nurse Notes

    @FindBy(xpath = "(//ul[@class='timeline timeline-inverse'])[3]")
    public WebElement NurseNotesDetails;



    @FindBy(xpath = "(//ul[@class='timeline timeline-inverse'])[4]")
    public WebElement TimelineSummary;


    @FindBy(xpath = "//a[text()='azat.ozay']")
    public WebElement IPDUserClick;

    @FindBy(xpath = "(//input[@type='search'])[8]")
    public WebElement TreatmentHistorySearchBox;

    @FindBy(xpath = "//div[@id='DataTables_Table_0_info']")
    public WebElement TreatmentHistorySearchResult;


    @FindBy (xpath = "(//th[text()='IPD No'])[2]")
    public WebElement TreatmentHistoryIpdNo;


    @FindBy (xpath = "(//input[@type='search'])[6]")
    public WebElement BedHistorySearchBox;

    @FindBy(xpath = "(//div[@class='dataTables_info'])[6]")
    public WebElement BedHistorySearchResult;


    @FindBy (xpath = "(//th[text()='Bed Group'])[2]")
    public WebElement BedGroup;

    @FindBy (xpath = "//div[@id='DataTables_Table_6_wrapper']")
    public WebElement BedHistorySummary;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement homepage_login_username;
    //Homepage --> Login --> password
    @FindBy(xpath = "//input[@name='password']")
    public WebElement homepage_login_password;
    //Homepage --> Login --> signInButton
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement homepage_login_signinButton;
    //DASHBOARD da aranan başlığın var olup olmadığını verir.
    public boolean dashboard_header_list_bu_basligi_iceriyormu(String baslikismi) {
        boolean sonuc = false;
        List<WebElement> headers = Driver
                .getDriver()
                .findElements(By.xpath("//li[@class='treeview ']"));
        List<String> dashboard_headerlist = new ArrayList<>();
        for (WebElement each:headers
        ) {
            dashboard_headerlist.add(each.getText());
        }
        System.out.println(dashboard_headerlist);
        for (WebElement each : headers
        ) {
            if (each.getText().equals(baslikismi))
                sonuc = true;
        }
        return sonuc;
    }
    //Patientpage --> Dashboard --> BloodBank
    @FindBy(xpath = "//li[@class='treeview '][8]")
    public WebElement patient_bloodbank_header;
    //Patientpage --> Dashboard --> BloodBank --> Blood Issue Header
    @FindBy(xpath = "//a[@href='#bloodissue']")
    public WebElement patient_blood_issue_header;
    //Patientpage --> Dashboard --> BloodBank --> Blood Issue Part
    @FindBy(xpath = "//div[@id='bloodissue']")
    public WebElement patient_blood_issue_part;
    //Patientpage --> Dashboard --> BloodBank --> Component Issue Header
    @FindBy(xpath = "//a[@href='#activity']")
    public WebElement patient_component_issue_header;
    //Patientpage --> Dashboard --> BloodBank --> Component Issue Part
    @FindBy(xpath = "//div[@id='activity']")
    public WebElement patient_component_issue_part;
    public static boolean profilInfoList(String data){
        List<WebElement> actualList = Driver.getDriver().findElements(By.xpath("//li[@class='list-group-item listnoback']"));
        List<String> baslikListesiActual = new ArrayList<>();
        for (WebElement each : actualList
        ) {
            baslikListesiActual.add(each.getText());
        }
        String[] liste = data.split(", ");
        int count = 0;
        for (int i = 0; i < liste.length; i++) {
            for (int j = 0; j < baslikListesiActual.size(); j++) {
                if (baslikListesiActual.get(j).contains(liste[i])) {
                    count++;
                }
            }
        }
        /*System.out.println(count);
        System.out.println(liste.length);
        System.out.println(baslikListesiActual);
        System.out.println(Arrays.toString(liste));
         */
        if (count == liste.length) {
            return true;
        }
        return false;
    }
    //sayfalarda istenen başlıkların varlığını doğrulayan method.Birçok sayfa için bu xpath çalışıyor,
    // çalışmazsa method ismini değiştirip xpathi de değştirerek istenilen sayfada kullanılabilir
    public static boolean verifiesHeadersAreVisibleMethod(String data) {
        List<WebElement> actualList = Driver.getDriver().findElements(By.xpath("//th[@rowspan='1']"));
        //th[@rowspan='1']
        //*[@id=\"DataTables_Table_0\"]/thead/tr[1]//th"
        List<String> baslikListesiActual = new ArrayList<>();
        for (WebElement each : actualList
        ) {
            baslikListesiActual.add(each.getText());
        }
        String[] liste = data.split(", ");
        int count = 0;
        for (int i = 0; i < liste.length; i++) {
            for (int j = 0; j < baslikListesiActual.size(); j++) {
                if (baslikListesiActual.get(j).equals(liste[i])) {
                    count++;
                }
            }
        }
        System.out.println(count);
        System.out.println(liste.length);
        System.out.println(baslikListesiActual);
        System.out.println(Arrays.toString(liste));
        if (count == liste.length) {
            return true;
        }
        return false;
    }
    public static boolean StringListSortTest(int sutunNo) {
        Select select = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='DataTables_Table_0_length']")));
        ReusableMethods.bekle(3);
        select.selectByVisibleText("All");
        ReusableMethods.bekle(3);
        WebElement baslik = Driver.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr[1]//th[" + sutunNo + "]"));
        baslik.click();
        ReusableMethods.bekle(3);
        List<WebElement> ActualList = Driver.getDriver().findElements(By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr/td[" + sutunNo + "]"));
        List<String> ActualStringList = new ArrayList<>();
        for (WebElement each : ActualList
        ) {
            ActualStringList.add(each.getText().toLowerCase().replaceAll("\\d", "").replace(".", " "));
        }
        List<String> ExpectedList = new ArrayList<>(ActualStringList);
        Collections.sort(ExpectedList);
        System.out.println(ActualStringList);
        System.out.println(ExpectedList);
        if (ActualStringList.equals(ExpectedList)) {
            return true;
        }
        return false;
    }


    //==============13 Mayıs ==============================
    //Patientpage --> Dashboard --> BloodBank --> Blood Issue Part --> Searchbox
    @FindBy(xpath="(//input[@type='search'])[1]")
    public WebElement bloodIssueSearchBox;
    //Patientpage --> Dashboard --> BloodBank --> Component Issue Part --> Searchbox
    @FindBy(xpath="(//input[@type='search'])[2]")
    public WebElement componentIssueSearchBox;
    //Patientpage --> Dashboard --> BloodBank --> Blood Issue Part --> Actions/View Payment
    @FindBy(xpath = "(//a[@data-record-id='54'])[1]")
    public WebElement bloodIssueViewPayment;
    //Patientpage --> Dashboard --> BloodBank --> Blood Issue Part --> Actions/Show
    @FindBy(xpath = "(//a[@data-record-id='54'])[2]")
    public WebElement bloodIssueShow;
    //Patientpage --> Dashboard --> BloodBank --> Blood Issue Part --> View Payment -->Payment Header
    @FindBy(xpath = "(//h4[@class='modal-title'])[2]")
    public WebElement paymentHeader;
    //Patientpage --> Dashboard --> BloodBank --> Blood Issue Part --> View Payment -->close button
    @FindBy(xpath = "(//button[@class='close'])[2]")
    public WebElement closeViewPaymentPage;
    //Patientpage --> Dashboard --> BloodBank --> Blood Issue Part --> Actions/pay
    @FindBy(xpath = "(//a[@class='btn btn-primary btn-xs'])[2]")
    public WebElement bloodIsuuePayButton;
    //Patientpage --> Dashboard --> BloodBank --> Blood Issue Part --> pay -->amount box
    @FindBy(xpath = "//div[@class='col-sm-7']")
    public WebElement amountBox;
    //Patientpage --> Dashboard --> BloodBank --> Blood Issue Part --> pay -->add button
    @FindBy(xpath = "//button[@id='pay_button']")
    public WebElement addButton;
    //Patientpage --> Dashboard --> BloodBank --> Blood Issue Part --> pay -->add--> pay with card button
    @FindBy(xpath = "//button[@class='stripe-button-el']")
    public WebElement payWithCardButton;
    //Patientpage --> Dashboard --> BloodBank --> Blood Issue Part --> pay -->add--> pay with card -->emailBox
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailBoxPayment;
    @FindBy(xpath = "//i[@class='fa fa-check']")
    public WebElement successPaymentLogo;


}





















