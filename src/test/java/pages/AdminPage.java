package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigReader;
import utilities.Driver;
import java.util.List;

public class AdminPage extends Base {


    //Admin > Billing
    @FindBy(xpath = "(//h3[@class='box-title titlefix'])[1]")
    public WebElement singleModuleWindow;

    //Admin > Billing
    @FindBy(xpath = "(//h3[@class='box-title titlefix'])[2]")
    public WebElement opdIpdWindow;

    //Admin > Billing
    @FindBy(xpath = "//p[.='OPD']")
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

    //Admin > Billing > OPD > Add Patient > New Patient
    @FindBy(xpath = "//select[@name='marital_status']")
    public WebElement maritalStatusDropDown;

    //Admin > Billing
    @FindBy(xpath = "//p[.='Pathology']")
    public WebElement pathologyButton;

    //Admin > Billing
    @FindBy(xpath = "//p[.='Radiology']")
    public WebElement radiologyButton;


    //Admin > IPD >
    @FindBy(id = "addp")
    public WebElement addPatientButtonIPD;

    //Admin > IPD > Discharged Patient Button
    @FindBy(xpath = "//a[@class=\"btn btn-primary btn-sm\"]")
    public WebElement dischargedPatientButton;

    //Admin > IPD > Discharged Patient Button > Discharged Confirmation Text
    @FindBy(xpath = "//h3[@class=\"box-title titlefix\"]")
    public WebElement ipdDischargedConfirmationText;

    //Admin > IPD &  Discharge Patient  > Table headers
    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]//th")
    public List<WebElement> ipdPatientAndDischargePatientTableHeaders;

    //Admin > Pathology > Generate Bill Button
    @FindBy(xpath = "//button[@id=\"load1\"]")
    public WebElement generateBillButton;

    //X icon
    @FindBy(xpath = "(//button[@type=\"button\"])[10]")
    public WebElement xIconButton;


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
    public List<WebElement> ipdPersonalInformationHeaders;

    @FindBy(xpath = "//div[@class=\"scrtabs-tab-scroll-arrow scrtabs-js-tab-scroll-arrow-right\"]")
    public WebElement scrollRightButton;


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
    public void loginAsAdmin(String username, String password) {
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

    // adminpage > Navbardaki mesaj simgesi uzerindeki sayi
    @FindBy(xpath = "//a[@data-placement='bottom']/span[@class='label label-warning']")
    public WebElement numberOfMessage;

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

    public WebElement getNotificationOnNotificationPage(int notificationIndex) {
        WebElement notification = Driver.getDriver().findElement(By.xpath("(//div[@class='notifymiddle noteDM10'])[" + notificationIndex + "]"));
        return notification;
    }

    // admin/systemnotification > Bildirim sayfasindaki bildirim detayi
    @FindBy(xpath = "(//div[@class='note-content'])[1]")
    public WebElement notificationDetailOnNotificationPage;

    public WebElement getNotificationDetailOnNotificationPage(int notificationDetailIndex) {
        WebElement notificationDetail = Driver.getDriver().findElement(By.xpath("(//div[@class='note-content'])[" + notificationDetailIndex + "]"));
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

    // admin/chat >> Chat sayfasındaki iletişim kurulan kisilerden ilki
    @FindBy(xpath = "(//p[@class='name'])[1]")
    public WebElement contactedFirstPersonOnChatPage;

    // admin/chat >> Chat sayfasındaki iletişim kurulan Doctor Duygu Gunaydın
    @FindBy(xpath = "//li[@data-chat-connection-id='104']")
    public WebElement contactDuyguGunaydin;

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











































































































































































































































































































































































































    // admin/chat >> Chat sayfasındaki mesaj goruntuleme cercevesi
    @FindBy(xpath = "//div[@class='messages']")
    public WebElement messagesFrame;

    // admin/chat >> Chat sayfasındaki mesaj yazma kutusu "Write Your Message"
    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement writeYourMessageLabel;

    // admin/chat >> Chat sayfasındaki mesaj gonderme simgesi
    @FindBy(xpath = "//button[@class='submit input_submit']")
    public WebElement messageSubmitButton;

    // adminpage > Navbardaki takvim simgesi
    @FindBy(xpath = "(//li[@class='cal15'])[3]")
    public WebElement calendarIcon;

    // admin/calendar/events >>> Calendar sayfasındaki takvim cercevesi(tamami)
    @FindBy(xpath = "//div[@id='calendar']")
    public WebElement calendarFrame;

    // admin/calendar/events >>> Calendar sayfasındaki To Do List cercevesi
    @FindBy(xpath = "(//div[@class='box box-primary'])[2]")
    public WebElement toDoListFrame;

    // admin/calendar/events >>> Calendar sayfasındaki Add New Event penceresindeki Event Title boxi
    @FindBy(xpath = "//input[@id='input-field']")
    public WebElement eventTitleLabel;

    //admin/calendar/events >>> Calendar sayfasındaki month butonu
    @FindBy(xpath = "(//button[@type='button'])[5]")
    public WebElement monthButton;

    //admin/calendar/events >>> Calendar sayfasındaki week butonu
    @FindBy(xpath = "(//button[@type='button'])[6]")
    public WebElement weekButton;

    //admin/calendar/events >>> Calendar sayfasındaki day butonu
    @FindBy(xpath = "(//button[@type='button'])[7]")
    public WebElement dayButton;

    //admin/calendar/events >>> Calendar sayfasındaki sol ok butonu
    @FindBy(xpath = "(//button[@type='button'])[2]")
    public WebElement leftArrowButton;

    //admin/calendar/events >>> Calendar sayfasındaki sag ok butonu
    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement rightArrowButton;

    //admin/calendar/events >>> Calendar sayfasındaki today butonu
    @FindBy(xpath = "(//button[@type='button'])[4]")
    public WebElement todayButton;

    // admin/calendar/events >>> Calendar sayfasındaki task ekleme (+) butonu
    @FindBy(xpath = "//button[@onclick='add_task()']")
    public WebElement addTaskButton;

    // admin/calendar/events >>> Calendar sayfasındaki task ekle penceresindeki title box'i
    @FindBy(xpath = "//input[@id='task-title']")
    public WebElement titleLabelOnAddTaskWindow;

    // admin/calendar/events >>> Calendar sayfasındaki task ekle penceresindeki save butonu
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement saveButtonOnAddTaskWindow;

    // admin/calendar/events >>> Calendar sayfasındaki task duzenleme butonu
    @FindBy(xpath = "(//i[@class='fa fa-pencil'])[1]")
    public WebElement taskEditButton;

    // admin/calendar/events >>> Calendar sayfasındaki task silme butonu
    @FindBy(xpath = "(//i[@class='fa fa-remove'])[1]")
    public WebElement taskRemoveButton;

    // admin/calendar/events >>> Calendar sayfasındaki task listesindeki ilk task
    @FindBy(xpath = "(//p[@class='tododesc'])[1]")
    public WebElement firstTaskFromList;

    // adminpage > Navbardaki gorev simgesi
    @FindBy(xpath = "//a[@title='Task']")
    public WebElement taskIcon;

    // adminpage > Navbardaki bed status simgesi
    @FindBy(xpath = "//a[@id='beddata']")
    public WebElement bedStatusIcon;

    // adminpage# > Navbardaki bed status simgesine tıklayınca gelen bılgı penceresi
    @FindBy(xpath = "//div[@id='ajaxbedstatus']")
    public WebElement bedStatusInformationWindow;

    // adminpage > Navbardaki profil simgesi
    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    public WebElement profileIcon;

    // adminpage > Navbardaki profil simgesine tıklayınca acılan penceredeki profil butonu
    @FindBy(xpath = "(//*[text()='Profile'])[1]")
    public WebElement profileButton;

    // adminpage > Navbardaki profil simgesine tıklayınca acılan penceredeki password butonu
    @FindBy(xpath = "(//*[text()='Password'])[1]")
    public WebElement passwordButton;

    // adminpage > Navbardaki profil simgesine tıklayınca acılan penceredeki logout butonu
    @FindBy(xpath = "//*[text()='Logout']")
    public WebElement logoutButton;

    // adminpage > Navbardaki profil simgesine tıklayınca acılan penceredeki profil resmi simgesi
    @FindBy(xpath = "(//img[@alt='User Image'])[2]")
    public WebElement profileImageIcon;

    // admin/staff/profile/675 >> sagdaki admin bilgileri gosteren pencere
    @FindBy(xpath = "//div[@class='box-body box-profile']")
    public WebElement adminInformationWindowRight;

    // admin/staff/profile/675 >> soldaki admin bilgileri gosteren pencere
    @FindBy(xpath = "//div[@class='tab-content']")
    public WebElement adminInformationWindowLeft;

    // admin/staff/profile/675 >> edit butonu
    @FindBy(xpath = "//i[@class='fa fa-pencil']")
    public WebElement editButton;

    // admin/changepass >> current password kutusu
    @FindBy(xpath = "//input[@name='current_pass']")
    public WebElement currentPasswordLabel;

    // admin/staff/edit/675 >> father name kutusu
    @FindBy(xpath = "//input[@id='father_name']")
    public WebElement fatherNameLabel;

    // admin/staff/edit/675 >> father name kutusu
    @FindBy(xpath = "//input[@id='mother_name']")
    public WebElement motherNameLabel;

    // admin/staff/edit/675 >> kayıt basarılı elementi
    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement recordUpdatedSuccessfullyText;

    // admin/changepass >> sifre degıstırme sayfasından sonra cıkan 500 hata kodu
    @FindBy(xpath = "//div[@class='error-code']")
    public WebElement errorCode;




}
