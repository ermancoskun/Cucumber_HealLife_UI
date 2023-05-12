package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage extends Base{

    //********************Duygu*************************************//

    // homepage > footer section
    @FindBy(xpath = "//i[@class='fa fa-pencil-square']")
    public WebElement complainIcon;

    // homepage > footer section
    @FindBy(xpath = "//a[text()='Complain']")
    public WebElement complainButton;





    //////////////////////////////////////////////////////////////////


    @FindBy (xpath = "(//a[text()='Gallery'])[1]")

    public WebElement GalleryButton;


    @FindBy (xpath = "//h2[text()='Gallery']")
    public WebElement GalleryxLabel;
}
