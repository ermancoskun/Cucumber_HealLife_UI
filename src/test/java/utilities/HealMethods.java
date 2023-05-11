package utilities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HealMethods {


    public static void loginAsAdmin(String username, String password){
        Driver.getDriver().get("https://qa.heallifehospital.com/site/login");
        WebElement usernameLocate = Driver.getDriver().findElement(By.id("email"));
        usernameLocate.sendKeys(username);

        WebElement passwordLocate = Driver.getDriver().findElement(By.id("password"));
        passwordLocate.sendKeys(password);

        WebElement loginButton = Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
    }
    public static  void loginAsUser(String username, String password) {
        Driver.getDriver().get("https://qa.heallifehospital.com/site/userlogin");
        WebElement usernameLocate = Driver.getDriver().findElement(By.id("email"));
        usernameLocate.sendKeys(username);

        WebElement passwordLocate = Driver.getDriver().findElement(By.id("password"));
        passwordLocate.sendKeys(password);

        WebElement loginButton = Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
    }

    public static void clickASidebarLink(String linkName){
        WebElement linkname=Driver.getDriver().findElement(By.xpath("//*[text()='"+linkName+"']"));
        linkname.click();
    }

    public static void makeSearchBoxTest(){
        WebElement searchBox=Driver.getDriver().findElement(By.xpath("//input[@type='search']"));
        Assert.assertTrue(searchBox.isDisplayed());
        searchBox.sendKeys("testing now...");
        ReusableMethods.bekle(2);
        searchBox.clear();
        ReusableMethods.bekle(5);
    }

    public static void makeAll100Test(){

        WebElement all100=Driver.getDriver().findElement(By.xpath("//select[@name='DataTables_Table_0_length']"));
        WebElement alttakiMetin=Driver.getDriver().findElement(By.id("DataTables_Table_0_info"));
        Select select=new Select(all100);

        //=====All seciyoruz========
        select.selectByVisibleText("All");
        ReusableMethods.bekle(2);
        String text=alttakiMetin.getText();
        // System.out.println("text = " + text);
        int start = text.indexOf(" to ") + 4; // " to " ifadesinin sonrasındaki değerin başlangıç indeksini buluyoruz
        int end = text.indexOf(" ", start); // Başlangıçtan sonraki ilk boşluğa kadar olan kısmı alıyoruz

        String numberString1 = text.substring(start, end); // Başlangıçtan sonraki kısmı alıyoruz
        String numberString2 = text.substring(end + 4); // İkinci "157" değerini alıyoruz

        int number1 = Integer.parseInt(numberString1);
        int number2 = Integer.parseInt(numberString2);
        Assert.assertEquals(number1,number2); //All testinin assertion islemi

        //=====100 seciyoruz========
        //actions.moveToElement(all100);
        select.selectByVisibleText("100");
        ReusableMethods.bekle(3);
        String text2=alttakiMetin.getText();
        //System.out.println("text2 = " + text2);
        String[] words = text2.split(" "); //bosluktan bolup array e attım
        int number = Integer.parseInt(words[3]);
        //System.out.println("number = " + number);
        Assert.assertTrue(number<=100);//100 testinin assertion islemi


    }

    public static void makeIconTest(){
        String bolumBasligi=Driver.getDriver().findElement(By.xpath("//h3[@class='box-title titlefix']")).getText();
        bolumBasligi=bolumBasligi.split(" ")[0]; //bolum baslıginin ilk kelimesini aldım

        WebElement copyIcon=Driver.getDriver().findElement(By.xpath("//i[@class='fa fa-files-o']"));
        Assert.assertTrue(copyIcon.isDisplayed());
        copyIcon.click();

        WebElement excelIcon=Driver.getDriver().findElement(By.xpath("//i[@class='fa fa-file-excel-o']"));
        Assert.assertTrue(excelIcon.isDisplayed());
        excelIcon.click();
        indirmeyiTestEt(bolumBasligi,".xlsx");

        WebElement csvIcon=Driver.getDriver().findElement(By.xpath("//i[@class='fa fa-file-text-o']"));
        Assert.assertTrue(csvIcon.isDisplayed());
        csvIcon.click();
        indirmeyiTestEt(bolumBasligi,".csv");

        WebElement pdfIcon=Driver.getDriver().findElement(By.xpath("//i[@class='fa fa-file-pdf-o']"));
        Assert.assertTrue(pdfIcon.isDisplayed());
        pdfIcon.click();
        indirmeyiTestEt(bolumBasligi,".pdf");

        WebElement printIcon=Driver.getDriver().findElement(By.xpath("//i[@class='fa fa-print']"));
        Assert.assertTrue(printIcon.isDisplayed());


    }

    public static void makeFilterTest(String filterName,int filtreKacinciSirada, int toplamFiltreSayisi){
        WebElement filter=Driver.getDriver().findElement(By.xpath("(//th[text()='"+filterName+"'])[1]"));
        Assert.assertTrue(filter.isDisplayed());
        filter.click();
        List<String> filtreList=new ArrayList<>();
        for (int i = filtreKacinciSirada; i <=toplamFiltreSayisi*100 ; i=i+toplamFiltreSayisi) {
            filtreList.add(Driver.getDriver().findElement(By.xpath("(//td)["+i+"]")).getText());
        }
        List<String> expectedList = new ArrayList<>(filtreList);
        Collections.sort(expectedList);
        Assert.assertEquals(filterName+" filter not functional",expectedList,filtreList);
    }
    public static void indirmeyiTestEt(String aranacakKelime,String format){
        //bu metot downloads klasöründeki dosyaları sıralar ve dosya ismi "aranacakKelime.format" içeriyor mu diye test eder
        String downloadsPath = System.getProperty("user.home") + "/Downloads";
        File downloadsFolder = new File(downloadsPath);
        File[] files = downloadsFolder.listFiles();
        boolean fileFound = false;
        for (File file : files) {
            if (file.getName().contains(aranacakKelime)||file.getName().contains(format)) {
                fileFound = true;
                break;
            }
        }
        ReusableMethods.bekle(3);
        Assert.assertTrue("Download of "+aranacakKelime+format+" not successful",fileFound);
    }
}
