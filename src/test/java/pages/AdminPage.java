package pages;



import com.github.javafaker.Faker;
import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethodsIf;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import io.cucumber.java.zh_cn.假如;
import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethodsIf;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;




import org.openqa.selenium.support.ui.Select;
import utilities.ConfigReader;
import utilities.Driver;

import utilities.JSUtilities;
import utilities.ReusableMethods;


import utilities.ConfigReader;
import utilities.Driver;

import utilities.HealMethods;
import utilities.ReusableMethods;


import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class AdminPage extends Base{


    //Admin > Billing
    @FindBy (xpath = "(//h3[@class='box-title titlefix'])[1]")
    public WebElement singleModuleWindow;

    //Admin > Billing
    @FindBy (xpath = "(//h3[@class='box-title titlefix'])[2]")
    public WebElement opdIpdWindow;

    //Admin > Billing
    @FindBy (xpath = "//p[.='OPD']")
    public WebElement opdButton;

    //Admin > Billing > OPD
    @FindBy(id = "add")
    public WebElement addPatientButton;

    //Admin > Billing > OPD > Add Patient
    @FindBy(xpath = "//span[text()='New Patient']")
    public WebElement newPatientButton;

    //Admin > Billing > OPD > Add Patient > New Patient
    @FindBy(id = "name")
    public WebElement nameBox;

    //Admin > Billing > OPD > Add Patient > New Patient
    @FindBy(xpath = "(//input[@name='guardian_name'])[2]")
    public WebElement guardianNameBox;

    //Admin > Billing > OPD > Add Patient > New Patient
    @FindBy(xpath = "//select[@name='gender']")
    public WebElement genderDropDown;

    //Admin > Billing > OPD > Add Patient > New Patient
    @FindBy(id = "birth_date")
    public WebElement birthDateBox;

    //Admin > Billing > OPD > Add Patient > New Patient
    @FindBy(xpath = "//select[@name='blood_group']")
    public WebElement bloodGroupDropDown;

    @FindBy(xpath = "(//select[@name='blood_group'])")
    public WebElement bloodGroupDropDown2;

    @FindBy(xpath = "(//div[@class='toast-message'])[1]")
    public WebElement warningMessage;



    //Admin > Billing > OPD > Add Patient > New Patient
    @FindBy(xpath = "//select[@name='marital_status']")
    public WebElement maritalStatusDropDown;

    //Admin > Billing
    @FindBy (xpath = "//p[.='Pathology']")
    public WebElement pathologyButton;

    //Admin > Billing
    @FindBy (xpath = "//p[.='Radiology']")
    public WebElement radiologyButton;

    //Admin > Billing
    @FindBy (xpath = "//p[.='Blood Issue']")
    public WebElement bloodIssueButton;

    //Admin > Billing
    @FindBy (xpath = "//p[.='Blood Component Issue']")
    public WebElement bloodIssueComponentButton;

    //Admin > Bill >Issueblood / Issuecomponent
    @FindBy (xpath = "//span[@id='select2-consultant_doctor-container']")
    public WebElement hospitalDoctorDDM;

    //Admin > Bill >Issueblood / Issuecomponent
    @FindBy (xpath = "//span[@id='select2-component_blood_group-container']")
    public WebElement bloodGroupDDM;

    //Admin > Bill >Issueblood / Issuecomponent
    @FindBy (xpath = "//span[@id='select2-blood_component-container']")
    public WebElement componentDDM;

    //Admin > Bill >Issueblood / Issuecomponent
    @FindBy (xpath = "//span[@id='select2-bag_no-xj-container']")
    public WebElement bagDDM;

    //Admin > Bill >Issueblood / Issuecomponent
    @FindBy (xpath = "//span[@id='select2-charge_category-container']")
    public WebElement chargeCathegoryDDM;

    //Admin > Bill >Issueblood / Issuecomponent
    @FindBy (xpath = "//span[@id='select2-charge_category-container']")
    public WebElement chargeNameDDM;


    //Admin > IPD >
    @FindBy(id = "addp")
    public WebElement addPatientButtonIPD;

    //Admin > IPD > Discharged Patient Button
    @FindBy(xpath = "//a[@class=\"btn btn-primary btn-sm\"]")
    public WebElement dischargedPatientButton;

    //Admin > IPD > Discharged Patient Button > Discharged Confirmation Text
    @FindBy (xpath = "//h3[@class=\"box-title titlefix\"]")
    public WebElement ipdDischargedConfirmationText;

    //Admin > IPD &  Discharge Patient  > Table headers
    @FindBy (xpath = "//*[@id=\"DataTables_Table_0\"]//th")
    public List<WebElement> ipdPatientAndDischargePatientTableHeaders;

    //Admin > Pathology > Generate Bill Button
    @FindBy(xpath = "//button[@id=\"load1\"]")
    public WebElement generateBillButton;

    //X icon
    @FindBy(xpath = "(//button[@type=\"button\"])[10]")
    public WebElement xIconButton;

    @FindBy(xpath = "(//*[@role=\"row\"]//td)[1]")
    public WebElement getBillNoConfirmation;

    @FindBy(xpath = "//*[@class=\"btn btn-info addplus-xs btn-sm  add-record mb10\"]")
    public  WebElement addButtonPathology;

    @FindBy(xpath = "//table[@id=\"tableID\"]//tbody//tr")
    public List<WebElement> testParamNameList;

    @FindBy(xpath = "//*[@class=\"btn btn-primary btn-sm pathology addtest\"]")
    public WebElement addPathologyTestButton;

    @FindBy(xpath = "//*[@name=\"test_name\"]")
    public WebElement testNamePathology;

    @FindBy(xpath = "//input[@id='billno']")
    public WebElement getBillNo;


    // adminLoginPage
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailBox;
    // adminLoginPage
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;
    // adminLoginPage
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;



    // adminpage > Navbardaki Heallife Logosu
    @FindBy(xpath = "//span[@class='logo-lg']")
    public WebElement heallifeLogo;

    // adminpage > Dashboard'daki Billing Menusu
    @FindBy(xpath = "//span[text()=' Billing']") // bu tamamını gosteriyor << (//li[@class='treeview '])[1]
    public WebElement billingMenu;

    // admin homepage > Welcome Party! duyurusu
    @FindBy(xpath = "//a[text()='Welcome Party!']") // bu tamamını gosteriyor << (//li[@class='treeview '])[1]
    public WebElement welcomePartyAnnouncement;

    // adminpage > Dashboard'daki uc cizgi seklinde olan menu ıconu
    @FindBy(xpath = "//a[@role='button']")
    public WebElement dashboardMenuIcon;

    // adminpage > Navbardaki Heal Life Hospital & Research Center yazisi
    @FindBy(xpath = "//span[@class='sidebar-session']")
    public WebElement healLifeHospitalResearchCenterText;

    @FindBy(xpath = "//ul[@class=\"nav nav-tabs navlistscroll\"]//li")
    public List<WebElement>ipdPersonalInformationHeaders;

    @FindBy(xpath = "//div[@class=\"scrtabs-tab-scroll-arrow scrtabs-js-tab-scroll-arrow-right\"]")
    public WebElement scrollRightButton;

    //Admin > Pathology > Add Patient
    @FindBy (xpath = "//select[@name='test_name_1']")
    public WebElement testName;

    //Admin > Pathology > Add Patient
    @FindBy (xpath = "//*[@id=\"reportdate_1\"]")
    public WebElement reportDate;

    //Admin > Pathology > Add Patient
    @FindBy (xpath = "//select[@name='test_name_2']")
    public WebElement testName2;

    //Admin > Pathology > Add Patient
    @FindBy (xpath = "//select[@name='consultant_doctor']")
    public WebElement ddmDoctor;
    //********************Duygu*************************************//
    //////////////////////////////////////////////////////////////////

    @FindBy(xpath = "//*[text()=' OPD']")
    public WebElement opdSide;

    @FindBy(xpath = "//*[text()='OPD Patient']")
    public WebElement opdPatientTitle;

    @FindBy(xpath = "(//*[text()='Name'])[1]")
    public WebElement opdNameFilter;

    @FindBy(xpath = "//*[text()='Patient Id']")
    public WebElement opdPatientIdFilter;

    @FindBy(xpath = "(//*[text()='Guardian Name'])[1]")
    public WebElement opdGuardianFilter;

    @FindBy(xpath = "(//*[text()='Gender'])[1]")
    public WebElement opdGender;

    @FindBy(xpath = "(//*[text()='Phone'])[1]")
    public WebElement opdPhoneFilter;

    @FindBy(xpath = "(//*[text()='Consultant'])[1]")
    public WebElement opdConsultantFilter;

    @FindBy(xpath = "(//*[text()='Last Visit'])[1]")
    public WebElement opdLastVisitFilter;

    @FindBy(xpath = "(//*[text()='Total Recheckup'])[1]")
    public WebElement opdTotalRecheckUpFilter;

    @FindBy(xpath = "(//*[text()='  Add Patient'])")
    public WebElement opdAddPatientButton;

    @FindBy(xpath = "(//*[text()='New Patient'])[1]")
    public WebElement opdNewPatientText;

    @FindBy(xpath = "(//select[@name='gender'])[2]")
    public WebElement genderDropDownOpd;

    @FindBy(xpath = "(//select[@name='blood_group'])[2]")
    public WebElement bloodGroupDropOpd;

    @FindBy(xpath = "(//select[@name='marital_status'])[2]")
    public WebElement maritalStatusDropOpd;

    @FindBy(xpath = "(//select[@name='blood_group'])[2]")
    public WebElement bloodGroupDopOpd;

    public void addNewPatientOPD() {

        AdminPage adminPage=new AdminPage();
        Actions actions=new Actions(Driver.getDriver());
        Faker faker=new Faker();

        Driver.getDriver().findElement(By.xpath("//span[text()='New Patient']")).click();
        ReusableMethods.bekle(1);
        adminPage.nameBox.sendKeys(faker.name().fullName());
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(faker.name().fullName()).perform();
        actions.sendKeys(Keys.TAB).perform();
        ReusableMethods.bekle(1);

        Select select=new Select(adminPage.genderDropDownOpd);

        ReusableMethods.bekle(1);
        select.selectByIndex(faker.random().nextInt(1,2));
        actions.sendKeys(Keys.TAB).perform();
        adminPage.birthDateBox.sendKeys(ConfigReader.getProperty("dogumTarihi"));
        actions.sendKeys(Keys.TAB).perform();
        ReusableMethods.bekle(1);
        actions.sendKeys(Keys.TAB).perform();
        ReusableMethods.bekle(1);
        actions.sendKeys(Keys.TAB).perform();
        ReusableMethods.bekle(1);
        actions.sendKeys(Keys.TAB).perform();
        select=new Select(adminPage.bloodGroupDropOpd);
        select.selectByIndex(faker.number().numberBetween(1,7));
        ReusableMethods.bekle(2);
        select=new Select(adminPage.maritalStatusDropOpd);
        select.selectByIndex(faker.number().numberBetween(1,5));
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
        actions.sendKeys(faker.phoneNumber().phoneNumber().replaceAll("\\D","")).perform();
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(faker.internet().emailAddress()).perform();
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(faker.address().fullAddress()).perform();
        ReusableMethods.bekle(2);

        Driver.getDriver().findElement(By.id("formaddpabtn")).click();
        WebElement basariliGirisYaziElement=Driver.getDriver().findElement(By.xpath("//*[@class='toast-message']"));
        String actualYazi= JSUtilities.getTextWithJS(Driver.getDriver(),basariliGirisYaziElement);
        Assert.assertEquals("Record Saved Successfully",actualYazi);

        ReusableMethods.bekle(4);

    }







    ////////////////***********Humeyra******//////////

    //admin>Pharmacy>Bill No
    @FindBy(xpath = "//*[text()='Bill No']")
    public WebElement pharmacyBillNo;

    //admin>Pharmacy>Case ID / Patient ID
    @FindBy(xpath = "(//*[text()='Case ID / Patient ID'])[1]")
    public WebElement pharmacyCaseID;

    //admin>Pharmacy>Date
    @FindBy(xpath = "//*[text()='Date']")
    public WebElement pharmacyDate;

    //admin>Pharmacy>PatientName
    @FindBy(xpath = "//*[text()='Patient Name']")
    public WebElement pharmacyPatientName;

    //admin>Pharmacy>DoktorName
    @FindBy(xpath = "//*[text()='Doctor Name']")
    public WebElement pharmacyDoctorName;

    //admin>Pharmacy>Discount
    @FindBy(xpath = "//*[text()='Discount ($)']")
    public WebElement pharmacyDiscount;


    //admin>Pharmacy>Amount
    @FindBy(xpath = "//*[text()='Amount ($)']")
    public WebElement pharmacyAmount;

    //admin>Pharmacy>Paid Amount
    @FindBy(xpath = "//*[text()='Paid Amount ($)']")
    public WebElement pharmacyPaidAmount;

    //admin>Pharmacy>Balance Amount
    @FindBy(xpath = "//*[text()='Balance Amount ($)']")
    public WebElement pharmacyBalanceAmount;


    ///////LOGIN METHODU///////
    public void loginAsAdmin (String username,String password){
        emailBox.sendKeys(ConfigReader.getProperty(username));
        passwordBox.sendKeys(ConfigReader.getProperty(password));
        signInButton.click();
    }
    ///////////////////////////

    // adminpage > Navbardaki "Search By Patient Name" search box'i
    @FindBy(xpath = "(//input[@name='search_text'])[1]")
    public WebElement searchByPatientNameLabel;

    // admin/admin/search >> search sayfasinda 2. siradaki hasta ismi
    @FindBy(xpath = "(//td/a[@class='btn btn-default btn-xs'])[3]")
    public WebElement checkNameFromPatientList;

    // adminpage > Navbardaki bayrak simgesi
    @FindBy(xpath = "//button[@data-id='languageSwitcher']")
    public WebElement flagIcon;

    // adminpage > Navbardaki Turkce dili secenegi
    @FindBy(xpath = "//*[text()=' Turkish']")
    public WebElement flagTurkish;

    // adminpage > Navbardaki Ingilizce dili scenegi
    @FindBy(xpath = "//*[text()=' English']")
    public WebElement flagEnglish;

    // adminpage > Navbardaki Turk bayragi scenegi
    @FindBy(xpath = "//*[text()='Randevu']")
    public WebElement randevuMenu;

    // adminpage > Navbardaki Yatak simgesi
    @FindBy(xpath = "//a[@id='beddata']")
    public WebElement bedIcon;

    // adminpage > Navbardaki bildirim simgesi
    @FindBy(xpath = "//i[@class='fa fa-bell-o']")
    public WebElement notificationIcon;

    // adminpage > Navbardaki bildirim simgesi uzerindeki sayi
    @FindBy(xpath = "//span[@class='label label-warning']")
    public WebElement numberOfNotification;

    // admin/systemnotification > Bildirim sayfasindaki Type basligi
    @FindBy(xpath = "//div[text()='Type']")
    public WebElement TypeHeader;

    // admin/systemnotification > Bildirim sayfasindaki Subject basligi
    @FindBy(xpath = "//div[text()='Subject']")
    public WebElement SubjectHeader;

    // admin/systemnotification > Bildirim sayfasindaki Date basligi
    @FindBy(xpath = "//div[text()='Date']")
    public WebElement DateHeader;

    // admin/systemnotification > Bildirim sayfasindaki Okunmamis birinci siradaki bildirim
    @FindBy(xpath = "(//div[@class='notifymiddle noteDM10'])[1]")
    public WebElement aNotificationOnNotificationPage;
    public WebElement getNotificationOnNotificationPage(int notificationIndex){
        WebElement notification = Driver.getDriver().findElement(By.xpath("(//div[@class='notifymiddle noteDM10'])["+notificationIndex+"]"));
        return notification;
    }

    // admin/systemnotification > Bildirim sayfasindaki bildirim detayi
    @FindBy(xpath = "(//div[@class='note-content'])[1]")
    public WebElement notificationDetailOnNotificationPage;
    public WebElement getNotificationDetailOnNotificationPage(int notificationDetailIndex){
        WebElement notificationDetail = Driver.getDriver().findElement(By.xpath("(//div[@class='note-content'])["+notificationDetailIndex+"]"));
        return notificationDetail;
    }

    // admin/systemnotification > Bildirim sayfasindaki Delete All butonu
    @FindBy(xpath = "//button[text()=' Delete All']")
    public WebElement deleteAllButtonOnNotificationPage;

    // admin/systemnotification > DeleteAll butonuna bastıktan sonra tum bildirimler silinince cıkan yazı.
    @FindBy(xpath = "//*[text()='No Record Found']")
    public WebElement noRecordFoundTexi;

    // adminpage > Navbardaki mesaj simgesi
    @FindBy(xpath = "//a[@data-original-title='Chat']")
    public WebElement chatIconu;

    // admin/chat >> Chat sayfası chat sistem penceresi
    @FindBy(xpath = "//div[@id='frame']")
    public WebElement chatSystemWindow;

    // admin/chat >> Chat sayfasındaki iletişim kurulan kisiler listesi
    @FindBy(xpath = "(//p[@class='name'])[1]")
    public WebElement contactedFirstPersonOnChatPage;

    // admin/chat >> Chat sayfasındaki kisi ekleme butonu (+)
    @FindBy(xpath = "//button[@id='addcontact']")
    public WebElement addContactButtonOnChatPage;

    // admin/chat >> Chat sayfasındaki Add Contact frame icerisindeki search box'ı
    @FindBy(xpath = "(//input[@type='text'])[4]")
    public WebElement addContactSearchLabel;

    // admin/chat >> Chat sayfasındaki Add Contact frame icerisindeki isim yazınca cıkan ilk kisi
    @FindBy(xpath = "(//span[@class='name'])[1]")
    public WebElement addContactFirstPerson;

    // admin/chat >> Chat sayfasındaki Add Contact frame icerisindeki +Add butonu
    @FindBy(xpath = "(//button[@type='submit'])[3]")
    public WebElement addContactSubmitButton;

    //===========================================================================================

    @FindBy(xpath = "//h3[text()='What\"s new in Heal Life Hospital & Research Center']")
    public WebElement adminloginNews;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement adminSignInButton;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement adminUsernameBox;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement adminPasswordBox;

    @FindBy(xpath = "//a[@class='forgot']")
    public WebElement adminForgetPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement adminSubmitButton;


    @FindBy(xpath = "//div[text()='Your password has been sent to your e-mail address.']")
    public WebElement passwordSentYourEmail;

    @FindBy(xpath = "(//i[@class='fa fa-key'])[2]")
    public WebElement adminLogoBox;



    public  static  void adminLogin(String username,String password){
        WebElement usernameLocate= Driver.getDriver().findElement(By.xpath("//input[@type='text']"));
        usernameLocate.sendKeys(username);
        WebElement passwordLocate=Driver.getDriver().findElement(By.xpath("//input[@class='form-password form-control']"));
        passwordLocate.sendKeys(password);
        WebElement loginButton=Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
    }


    //Admin > Dashboard > Appointment Sekme
    @FindBy (xpath = "(//li[@class='treeview '])[2]")
    public WebElement dashboardAppointmentButton;
    //Admin > Profil Button
    @FindBy (xpath = "//a[@class='dropdown-toggle']")
    public WebElement adminProfilButton;
    //Admin > Profil > Logout Button
    @FindBy (xpath = "//a[@class='pull-right']")
    public WebElement adminLogoutButton;
    public boolean baslikListelemeMethod(int no, String data) {
        List<WebElement> actualList = Driver.getDriver().findElements(By.xpath("(//tr[@role='row'])["+no+"]"));
        List<String> baslikListesiActual = new ArrayList<>();
        for (WebElement each : actualList
        ) {
            baslikListesiActual.add(each.getText());
        }
        System.out.println(baslikListesiActual);
        String[] liste = data.split(", ");
        int count = 0;
        System.out.println(Arrays.toString(liste));
        for (int i = 0; i < liste.length; i++) {
            for (int j = 0; j < baslikListesiActual.size(); j++) {
                if (baslikListesiActual.get(j).contains(liste[i])) {
                    count++;
                }
            }
        }
        if (count == liste.length) {
            return true;
        }
        return false;
    }
    public boolean intListSortTest(int sutunNo) {
        Select select=new Select(Driver.getDriver().findElement(By.xpath("//select[@name='DataTables_Table_0_length']")));
        ReusableMethods.sleep(3);
        select.selectByVisibleText("All");
        ReusableMethods.sleep(3);
        WebElement baslik = Driver.getDriver().findElement(By.xpath("//tr//th["+ sutunNo +"]"));
        baslik.click();
        ReusableMethods.sleep(3);
        List<WebElement> ActualList = Driver.getDriver().findElements(By.xpath("//tr//td[2]"));
        List<Integer> ActualStringList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            if (!ActualList.get(i).getText().isEmpty()) {
                String data = ActualList.get(i).getText().replaceAll("[^0-9]", "");
                ActualStringList.add(Integer.valueOf(data));
            }
        }


        int sayi=0;
        for (int i = 1; i <ActualStringList.size() ; i++) {
            int ilkVeri= ActualStringList.get(sayi);
            if (ilkVeri>ActualStringList.get(i)){
                return false;
            }
            sayi++;
        }

        return true;

    }

    //Admin > Appointment > Search Box Button
    @FindBy(xpath = "//input[@type='search']")
    public WebElement appointmentSearchBoxButton;
    //Admin > Appointment search Result Patient Name
    @FindBy (xpath = "(//tbody//tr//td[1])[1]")
    public WebElement appointmentSearchResultNameColumn;
    //Admin > appointment > Doctor Wise Button;
    @FindBy (xpath = "(//a[@class='btn btn-primary btn-sm'])[1]")
    public WebElement doctorWiseButton;
    //Admin > Appointment > DoctorWIse> Doctor Select
    @FindBy (xpath = "//select[@name='doctor']")
    public WebElement doctorWiseSelectDropDown;
    //Admin > Appointment >DoctorWise > Date Select
    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement doctorWiseDateSelectLabel;
    //Admin > Appointment > DoctorWise > Search Button
    @FindBy (xpath = "(//button[@type='submit'])[3]")
    public WebElement  doctorWiseSearchButton;
    //Admin > Appointment > DoctorWise > Result Row
    @FindBy (xpath = "//tbody")
    public WebElement doctorWiseResultRow;
    //Admin > Appointment > DoctorWise > Queue Button
    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[2]")
    public WebElement doctorWiseQueueButton;
    //Admin > Appointment > Queue> Shift Select
    @FindBy (xpath = "//select[@name='global_shift']")
    public WebElement queueShiftSelectLabel;
    //Admin > Appointment > Queue > Slot Select
    @FindBy (xpath = "//select[@name='slot']")
    public WebElement queueSlotLabel;


    //Admin-->Login
    @FindBy(xpath = "//button[normalize-space()='Sign In']")
    public WebElement signinButton;

    //Admin-->Dashboard
    @FindBy(xpath = "//input[@class='form-control search-form search-form3']")
    public WebElement searchBox;

    //Admin-->Dashboard
    @FindBy(xpath = "//span[normalize-space()='Dashboard']")
    public WebElement dashboardButton;

    //Admin-->Admin
    @FindBy(xpath = "//img[@class='topuser-image']")
    public WebElement profilImageButton;

    //Admin-->Profil Image-->Logout
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    public WebElement logoutButton;











}
