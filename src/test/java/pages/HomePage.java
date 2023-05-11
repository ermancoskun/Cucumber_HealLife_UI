package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;

import java.util.List;

public class HomePage extends Base {


    public HomePage() {

    }

    @FindBy(xpath = "//div[@class='team-member']//img")
    public List<WebElement> ourDoctorsResim;

    @FindBy(xpath = "//div[@class='team-member']//h4")
    public List<WebElement> ourDoctorsIsim;

    @FindBy(xpath = "//div[@class='team-member']//p")
    public List<WebElement> ourDoctorsUnvan;

    public int ourDoctorsResimCount() {
        return ourDoctorsResim.size();
    }


}
