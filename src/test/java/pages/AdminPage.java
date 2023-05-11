package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
    @FindBy(id = "addformgender")
    public WebElement genderDropDown;

    //Admin > Billing > OPD > Add Patient > New Patient
    @FindBy(id = "birth_date")
    public WebElement birthDateBox;

    //Admin > Billing > OPD > Add Patient > New Patient
    @FindBy(xpath = "(//select[@name='blood_group'])[2]")
    public WebElement bloodGroupDropDown;

    //Admin > Billing > OPD > Add Patient > New Patient
    @FindBy(xpath = "(//select[@name='marital_status'])[2]")
    public WebElement maritalStatusDropDown;

}
