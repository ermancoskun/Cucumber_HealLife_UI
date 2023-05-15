package pages;


import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethodsIf;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
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

    //Admin > Billing > OPD > Add Patient > New Patient
    @FindBy(xpath = "//select[@name='marital_status']")
    public WebElement maritalStatusDropDown;

    //Admin > Billing
    @FindBy (xpath = "//p[.='Pathology']")
    public WebElement pathologyButton;

    //Admin > Billing
    @FindBy (xpath = "//p[.='Radiology']")
    public WebElement radiologyButton;


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


    //********************Duygu*************************************//

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

    // adminpage > Navbar Heal Life Hospital & Research Center yazisi
    @FindBy(xpath = "//span[@class='sidebar-session']")
    public WebElement healLifeHospitalResearchCenterText;

    @FindBy(xpath = "//ul[@class=\"nav nav-tabs navlistscroll\"]//li")
    public List<WebElement>ipdPersonalInformationHeaders;

    @FindBy(xpath = "//div[@class=\"scrtabs-tab-scroll-arrow scrtabs-js-tab-scroll-arrow-right\"]")
    public WebElement scrollRightButton;
    //********************Duygu*************************************//
    //////////////////////////////////////////////////////////////////


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

    //admin>pharmacy>Generate Bill button
    @FindBy(xpath = "//*[text()=' Generate Bill']")
    public WebElement pharmacyGenerateButton;

    //admin>pharmacy>Generate Bill>admin>prescription No
    @FindBy(id = "prescription_no")
    public WebElement pharmacyPrescrtionButton;

    //admin>pharmacy>Generate Bill>PatientNameEnter
    @FindBy(id = "select2-addpatient_id-container")
    public WebElement pharmacyGenerateEnterPatientName;

    //admin>pharmacy>Generate Bill>PatientMedicineCategory
    @FindBy(id = "select2-medicine_category_id_1-iu-container")
    public WebElement pharmacyGenerateMedicineCategory;

    //admin>pharmacy>Generate Bill>PatientMedicineName
    @FindBy(id = "select2-medicine_name0-container")
    public WebElement pharmacyGenerateMedicineName;

    //admin>pharmacy>Generate Bill>BatchNo
    @FindBy(xpath = "(//*[@role='combobox'])[4]")
    public WebElement pharmacyGenerateBatchNo;

    //admin>pharmacy>Generate Bill>HospitalDoctor
    @FindBy(xpath = "(//*[@role='combobox'])[5]")
    public WebElement pharmacyGenerateHospitalDoctor;

    //admin>pharmacy>Generate Bill>Payment Methode
    @FindBy(className = "form-control payment_mode")
    public WebElement pharmacyGeneratePaymentMethode;

    //admin>pharmacy>Generate Bill>Save button
    @FindBy(xpath = "(//*[text()=' Save'])[1]")
    public  WebElement pharmacyGenerateSaveButton;

    @FindBy(xpath = "(//*[text()='humeyra.uysal (107)'])[1]")
    public WebElement pharmacyGenerateVerify;
    //admin>pharmacy>Generate Bill>ExpiryDate
    @FindBy(id="expire_date0")
    public WebElement pharmacyGenerateExpiryDate;

    //admin>pharmacy>Generate Bill>quatity
    @FindBy(id="quantity0")
    public WebElement pharmacyGenerateQuantatity;

    //admin>pharmacy>Generate Bill>SalePrice
    @FindBy(id="sale_price0")
    public WebElement pharmacyGenerateSalePrices;



    ///////LOGIN METHODU///////
    public void loginAsAdmin (String username,String password){
        emailBox.sendKeys(ConfigReader.getProperty(username));
        passwordBox.sendKeys(ConfigReader.getProperty(password));
        signInButton.click();
    }
    ///////////////////////////
}
