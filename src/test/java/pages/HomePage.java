package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Base{
    //Home Page -> bottom bar->home link
    @FindBy(xpath = "(//*[text()='Home'])[2]")
    public WebElement bottomHomeLink;

    //Home Page -> bottom bar->About link
    @FindBy(xpath = "//*[text()='About']")
    public WebElement bottomAboutLink;

    //Home Page -> bottom bar->About link
    @FindBy(xpath = "//*[text()='Academics']")
    public WebElement bottomAcademicsLink;

    //Home Page -> bottom bar->About link
    @FindBy(xpath = "(//*[text()='Gallery'])[2]")
    public WebElement bottomGaleryLink;

    //Home Page -> bottom bar->About link
    @FindBy(xpath = "//*[text()='Contact Us']")
    public WebElement bottomContactUsLink;

}
