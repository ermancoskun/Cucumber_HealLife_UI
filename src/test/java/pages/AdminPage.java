package pages;


import com.github.javafaker.Faker;
import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethodsIf;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.Select;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

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


    //Admin > IPD >
    @FindBy(id = "addp")
    public WebElement addPatientButtonIPD;

    //Admin > IPD > Discharged Patient Button
    @FindBy(xpath = "//a[@class=\"btn btn-primary btn-sm\"]")
    public WebElement dischargedPatientButton;

    //Admin > IPD > Discharged Patient Button > Discharged Confirmation Text
    @FindBy (xpath = "//h3[@class=\"box-title titlefix\"]")
    public WebElement ipdDischargedConfirmationText;

    @FindBy (xpath = "//*[@id=\"DataTables_Table_0\"]//th")
    public List<WebElement> ipdDischargeTableHeaders;


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

    ///////LOGIN METHODU///////
    public void loginAsAdmin (String username,String password){
        emailBox.sendKeys(ConfigReader.getProperty(username));
        passwordBox.sendKeys(ConfigReader.getProperty(password));
        signInButton.click();
    }
    ///////////////////////////

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






}
