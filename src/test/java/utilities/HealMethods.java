package utilities;

import com.github.javafaker.Faker;
import io.cucumber.java.ht.E;
import org.checkerframework.framework.qual.DefaultQualifier;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AdminPage;
import pages.HomePage;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HealMethods {
    static AdminPage adminPage=new AdminPage();
    static Faker faker=new Faker();
    static Actions actions=new Actions(Driver.getDriver());


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

    public static void clickASidebarLink(String linkName){ //Sidebar (sol taraf) daki linklere isimlerini girdiginizde tiklar,
                                                        // developer'in kimisine bosluk koyup kimisine koymadigi goz onune alarak
                                                        //parametre olarak link in ismini girmelisiniz
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

        WebElement all100=Driver.getDriver().findElement(By.xpath("(//select[@name])[1]"));
        WebElement alttakiMetin=Driver.getDriver().findElement(By.xpath("//div[@class='dataTables_info']"));
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
        bolumBasligi=bolumBasligi.split(" ")[0]; //bolum baslıginin ilk kelimesini aldım,her sayfada degisbiliyor

        WebElement copyIcon=Driver.getDriver().findElement(By.xpath("//i[@class='fa fa-files-o']"));
        Assert.assertTrue(copyIcon.isDisplayed());
        copyIcon.click();
        WebElement copyText=Driver.getDriver().findElement(By.xpath("//h2[text()='Copy to clipboard']"));
        String copyTextStr=JSUtilities.getTextWithJS(Driver.getDriver(),copyText);
        Assert.assertEquals("Copy to clipboard",copyTextStr); //ekrana cikan yaziyi JS ile yakalayip assert icine atip test ediyoz


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
        printIcon.click();
        int acilanPencereSayisi=JSUtilities.getNumberOfOpenWindows(Driver.getDriver()); //JS ile acilan pencere sayisini yakalıyoruz
        //System.out.println("acilanPencereSayisi = " + acilanPencereSayisi);
        Assert.assertTrue(acilanPencereSayisi>1); //print icin baska sayfaya gidecegi icin 1 den buyukse test pass olmalı

    }

    public static void makeFilterTest(String filterName,int filtreKacinciSirada, int toplamSutunSayisi){
        WebElement filter=Driver.getDriver().findElement(By.xpath("(//th[text()='"+filterName+"'])[1]"));
        ReusableMethods.bekle(2);
        Assert.assertTrue(filter.isDisplayed());
        filter.click();
        ReusableMethods.bekle(3);
        List<String> filtreList=new ArrayList<>();
        for (int i = filtreKacinciSirada; i <toplamSutunSayisi*10 ; i=(i+toplamSutunSayisi)) {

            WebElement hucreElement=Driver.getDriver().findElement(By.xpath("(//td)["+i+"]"));
            filtreList.add(hucreElement.getText());
        }
        List<String> expectedList = new ArrayList<>(filtreList);
        Collections.sort(expectedList);
        Assert.assertEquals("Filter non functional",expectedList,filtreList);
    }
    public static void indirmeyiTestEt(String aranacakKelime,String format){//icon testinin yardımcı metodu,dogrudan kullanılmaz
        //bu metot downloads klasöründeki dosyaları sıralar ve dosya ismi "aranacakKelime.format" içeriyor mu diye test eder
        //metoda iki parametre gonderilir ilki isim ikinci format olarak arar: or. patient.pdf
        String downloadsPath = System.getProperty("user.home") + "/Downloads";
        File downloadsFolder = new File(downloadsPath);
        File[] files = downloadsFolder.listFiles();
        boolean fileFound = false;
        for (File file : files) {
            if (file.getName().contains(aranacakKelime) || file.getName().contains(format)) {
                fileFound = true;
                break;
            }
        }
        ReusableMethods.bekle(3);
        Assert.assertTrue("Download of "+aranacakKelime+format+" not successful",fileFound);
    }

    public static void clickBlueOrAnyButton(String butonIsmi){ // parametre yollarken buton isminin
                                            //onunde bosluk olup olmadigina dikkat edip, featurea oyle yazalım
        Driver.getDriver().findElement(By.xpath("//*[text()='"+butonIsmi+"']")).click();
    }

    public static void createNewPatient(){ // +New Patient butonuna basar, bilgileri random girer save yapar, kayıt yaptığını doğrular
        Driver.getDriver().findElement(By.xpath("//span[text()='New Patient']")).click();
        adminPage.nameBox.sendKeys(faker.name().fullName());
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(faker.name().fullName()).perform();
        Select select= null;
        try {
            select = new Select(adminPage.genderDropDown);
            select.selectByIndex(1);
        } catch (Exception e) {
            select=new Select(Driver.getDriver().findElement(By.xpath("(//select[@name='gender'])[2]")));
            select.selectByIndex(1);
        }
        adminPage.birthDateBox.sendKeys(faker.date().birthday().toString().replaceAll("0",""));
        actions.sendKeys(Keys.TAB).perform();
        int ageYear=faker.random().nextInt(1,100);//rastgele yas (yıl olarak) int tipinde
        actions.sendKeys(String.valueOf(ageYear)).perform(); //rastgele yası toString olarak gonder
        int ageMonth=faker.random().nextInt(1,12);//rastgele yas (ay olarak) int tipinde
        actions.sendKeys(String.valueOf(ageMonth)).perform(); //rastgele yası toString olarak gonder
        int ageDay=faker.random().nextInt(1,30);//rastgele yas (gun olarak) int tipinde
        actions.sendKeys(String.valueOf(ageDay)).perform(); //rastgele yası toString olarak gonder
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(faker.number().digits(5)).perform();

        try {
            select=new Select(adminPage.bloodGroupDropDown);
            select.selectByIndex(faker.number().numberBetween(1,7));
        } catch (Exception e) {
            select=new Select(Driver.getDriver().findElement(By.xpath("(//select[@name='blood_group'])[2]")));
            select.selectByIndex(faker.number().numberBetween(1,7));
        }

        try {
            select=new Select(adminPage.maritalStatusDropDown);
            select.selectByIndex(faker.number().numberBetween(1,4));
        } catch (Exception e) {
            select=new Select(Driver.getDriver().findElement(By.xpath("(//select[@name='marital_status'])[2]")));
            select.selectByIndex(faker.number().numberBetween(1,4));
        }

        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
        actions.sendKeys(faker.phoneNumber().phoneNumber().replaceAll("\\D","")).perform();

        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(faker.internet().emailAddress()).perform();

        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(faker.address().fullAddress()).perform();

        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(faker.medical().diseaseName()).perform();

        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(faker.medical().symptoms()).perform();

        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(faker.idNumber().valid()).perform();

        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("11.05.23").perform();

        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(faker.idNumber().validSvSeSsn()).perform();

        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(faker.phoneNumber().cellPhone()).perform();

        Driver.getDriver().findElement(By.id("formaddpabtn")).click();
        WebElement basariliGrisYaziElement=Driver.getDriver().findElement(By.xpath("//div[@class='toast-message']"));
        String actualYazi=JSUtilities.getTextWithJS(Driver.getDriver(),basariliGrisYaziElement);
        Assert.assertEquals("Record Saved Successfully",actualYazi);

        ReusableMethods.bekle(4);

    }
    public static void clickIconWith3Line(int sira){ //listenin en saginda yer alan ve uzerine gelindiginde ancak
                                                    //gorunen icona tiklar. Sira sayisi parametre olarak girilmeli
        //bir sayfada mavi buton uzerinde bile 3cizgi elementi var ise ilk ona tiklayacaktir.Dikkat etmeliyiz
    WebElement iconButton=Driver.getDriver().findElement(By.xpath("(//i[@class='fa fa-reorder'])["+sira+"]"));
    JSUtilities.clickWithJS(Driver.getDriver(),iconButton);
    ReusableMethods.bekle(3);
    }

    public static void clickANameFromList(int sira) {//listedeki isme tiklar
        WebElement nameElement = Driver.getDriver().findElement(By.xpath("(//td)[" + sira + "]"));
        nameElement.click();
    }
    public static void clickTrashIconForDelete(int sira){ //cop kutusu ikonuna tiklar
        JSUtilities.clickWithJS(Driver.getDriver(),Driver.getDriver().findElement(By.xpath("(//a[@class='btn btn-default btn-xs delete_blood_issue'])["+sira+"]")));
    }
    public static void clickPlusIconForAddPayment(int sira){
        JSUtilities.clickWithJS(Driver.getDriver(),Driver.getDriver().findElement(By.xpath("(//a[@class='btn btn-default btn-xs add_payment'])["+sira+"]")));
    }


    public static void testHeaders(List<String> headersList) {
        for (int i = 0; i < headersList.size(); i++) {
            Assert.assertEquals(headersList.get(i), adminPage.ipdPatientAndDischargePatientTableHeaders.get(i).getText());

        }}

        public static void clickAddViewPaymentIcon ( int sira){
            WebElement moneyIcon = Driver.getDriver().findElement(By.xpath("(//i[@class='fa fa-money'])[" + sira + "]"));
            JSUtilities.clickWithJS(Driver.getDriver(), moneyIcon);
        }
        public static void makePaymentOptionsTest () {
            // payments sayfasina gelindiginde odeme testi yapar
            //Payments baslik yazısını dogrular
            //Eski odemeyi siler
            //Yerine bugunun tarihiyle aynı miktarda odeme yapar, dogrular(test)
           // WebElement paymentsElement=Driver.getDriver().findElement(By.xpath("(//h4[text()='Payments'])"));
           // Assert.assertEquals("Unsuccessful redirection","Payments",paymentsElement.getText());
            WebElement dateElement = Driver.getDriver().findElement(By.xpath("(//input[@name='payment_date'])[1]"));
            String netAmount = Driver.getDriver().findElement(By.xpath("(//td[@class='text-right'])[8]")).getText();
            String  paidAmount = Driver.getDriver().findElement(By.xpath("(//td[@class='text-right'])[10]")).getText();


            if (netAmount.equals(paidAmount)) {//odeme yapılmissa odemeyi sil, baska meblag ode
                WebElement deleteIcon = Driver.getDriver().findElement(By.xpath("//a[@class='btn btn-default btn-xs delete_trans']"));
                //deleteIcon.click(); //odemeyi siliyoruz
                JSUtilities.clickWithJS(Driver.getDriver(),deleteIcon);
                Driver.getDriver().switchTo().alert().accept();
                String uyariText = Driver.getDriver().findElement(By.xpath("(//div[@class='toast-message'])[1]")).getText();
                Assert.assertEquals("Record Deleted Successfully", uyariText); //silindigini test ediyoruz
                WebElement xButtonOnMessage=Driver.getDriver().findElement(By.xpath("(//button[@class='toast-close-button'])"));
                JSUtilities.clickWithJS(Driver.getDriver(),xButtonOnMessage);
                ReusableMethods.bekle(3);
                dateElement.click();
                actions.sendKeys(Keys.TAB).perform();//yan sekme
                actions.sendKeys("10").perform();// 10 dolar ode
                actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
                actions.sendKeys(faker.finance().iban()).perform(); //note kısmına IBAN uyduruyoruz
                ReusableMethods.bekle(10);
                Driver.getDriver().findElement(By.xpath("(//*[.='Save'])[1]")).click();
                String uyariText2 = Driver.getDriver().findElement(By.xpath("(//div[@class='toast-message'])[1]")).getText();
                Assert.assertEquals("Record Saved Successfully", uyariText2);//basarili odemeyi test ediyoruz

            } else {//odeme yapılmamıssa odeme yap
                dateElement.click(); //tarih gir
                actions.sendKeys(Keys.TAB).perform();//yan sekme
                actions.sendKeys("10").perform();
                actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
                actions.sendKeys(faker.finance().iban()).perform(); //note kısmına IBAN uyduruyoruz
                ReusableMethods.bekle(2);
                Driver.getDriver().findElement(By.xpath("(//button[@data-loading-text='Processing...'])[5]")).click();
                String basariliOdeme = Driver.getDriver().findElement(By.xpath("(//div[@class='toast-message'])[1]")).getText();
                Assert.assertEquals("Record Saved Successfully", basariliOdeme);//basarili odemeyi test ediyoruz
                WebElement xicon=Driver.getDriver().findElement(By.xpath("//button[@class='toast-close-button']"));
                JSUtilities.clickWithJS(Driver.getDriver(),xicon);
            }

    }
        public static void makePaymentOptionsTestForBloods () {
        // payments sayfasina gelindiginde odeme testi yapar
        //Payments baslik yazısını dogrular
        //Eski odemeyi siler
        //Yerine bugunun tarihiyle aynı miktarda odeme yapar, dogrular(test)
        // WebElement paymentsElement=Driver.getDriver().findElement(By.xpath("(//h4[text()='Payments'])"));
        // Assert.assertEquals("Unsuccessful redirection","Payments",paymentsElement.getText());
        WebElement dateElement = Driver.getDriver().findElement(By.xpath("(//input[@name='payment_date'])[1]"));
        String netAmount = Driver.getDriver().findElement(By.xpath("(//td[@class='text text-right'])[4]")).getText();
        String paidAmount = Driver.getDriver().findElement(By.xpath("(//td[@class='text text-right'])[5]")).getText();

        if (netAmount.equals(paidAmount)) {//odeme yapılmissa odemeyi sil, baska meblag ode
            WebElement deleteIcon = Driver.getDriver().findElement(By.xpath("//a[@class='btn btn-default btn-xs delete_trans']"));
            //deleteIcon.click(); //odemeyi siliyoruz
            JSUtilities.clickWithJS(Driver.getDriver(),deleteIcon);
            Driver.getDriver().switchTo().alert().accept();
            String uyariText = Driver.getDriver().findElement(By.xpath("(//div[@class='toast-message'])[1]")).getText();
            Assert.assertEquals("Record Deleted Successfully", uyariText); //silindigini test ediyoruz
            WebElement xButtonOnMessage=Driver.getDriver().findElement(By.xpath("(//button[@class='toast-close-button'])"));
            JSUtilities.clickWithJS(Driver.getDriver(),xButtonOnMessage);
            ReusableMethods.bekle(3);
            dateElement.click();
            actions.sendKeys(Keys.TAB).perform();//yan sekme
            actions.sendKeys("10").perform();// 10 dolar ode
            actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
            actions.sendKeys(faker.finance().iban()).perform(); //note kısmına IBAN uyduruyoruz
            ReusableMethods.bekle(10);
            Driver.getDriver().findElement(By.xpath("(//*[.='Save'])[1]")).click();
            String uyariText2 = Driver.getDriver().findElement(By.xpath("(//div[@class='toast-message'])[1]")).getText();
            Assert.assertEquals("Record Saved Successfully", uyariText2);//basarili odemeyi test ediyoruz

        } else {//odeme yapılmamıssa odeme yap
            dateElement.click(); //tarih gir
            actions.sendKeys(Keys.TAB).perform();//yan sekme
            actions.sendKeys("10").perform();
            actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
            actions.sendKeys(faker.finance().iban()).perform(); //note kısmına IBAN uyduruyoruz
            ReusableMethods.bekle(2);
            Driver.getDriver().findElement(By.xpath("(//button[@data-loading-text='Processing...'])[1]")).click();
            String basariliOdeme = Driver.getDriver().findElement(By.xpath("(//div[@class='toast-message'])[1]")).getText();
            Assert.assertEquals("Record Saved Successfully", basariliOdeme);//basarili odemeyi test ediyoruz
            WebElement xicon=Driver.getDriver().findElement(By.xpath("//button[@class='toast-close-button']"));
            JSUtilities.clickWithJS(Driver.getDriver(),xicon);
        }

    }
        public static void generateBillInfo() throws IOException {
        WebElement taskBillNo=Driver.getDriver().findElement(By.xpath("//input[@id='billno']"));
        String labelText = taskBillNo.getAttribute("name");

        Select ddm = new Select(adminPage.testName);
        ddm.selectByIndex(faker.random().nextInt(1, 9));
        WebElement addButon = Driver.getDriver().findElement(By.xpath("//a[@class='btn btn-info addplus-xs add-record mb10']"));
        JSUtilities.clickWithJS(Driver.getDriver(), addButon);
        ddm = new Select(adminPage.testName2);
        ddm.selectByIndex(faker.random().nextInt(1, 9));

        ddm = new Select(adminPage.ddmDoctor);
        ddm.selectByIndex(faker.random().nextInt(1, 15));

        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(faker.medical().diseaseName()).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys("10").
                sendKeys(Keys.TAB).perform();
        JSUtilities.clickWithJS(Driver.getDriver(),Driver.getDriver().findElement(By.xpath("//button[@name='save']")));
        WebElement message=Driver.getDriver().findElement(By.xpath("//div[@class='toast-message']"));
        String actual=JSUtilities.getTextWithJS(Driver.getDriver(),message);
        Assert.assertEquals("Record unsuccessful","Record Saved Successfully",actual);
        String actulaBillNo=Driver.getDriver().findElement(By.xpath("(//td)[1]")).getText();
        System.out.println("labelText = " + labelText);
        Assert.assertEquals("Record unsuccessful",labelText,actulaBillNo);
    }


    public static void makeFilterTestAdminOPD(String filterName,int filtreKacinciSirada, int toplamSutunSayisi){
        WebElement all100=Driver.getDriver().findElement(By.xpath("(//select[@name])[1]"));
        Select select=new Select(all100);
        select.selectByVisibleText("All");
        ReusableMethods.bekle(3);
        WebElement filter=Driver.getDriver().findElement(By.xpath("(//th[text()='"+filterName+"'])[1]"));
        ReusableMethods.bekle(2);
        Assert.assertTrue(filter.isDisplayed());
        filter.click();
        ReusableMethods.bekle(4);
        List<String> filtreList=new ArrayList<>();

        for (int i = filtreKacinciSirada; i <toplamSutunSayisi*10 ; i=(i+toplamSutunSayisi)) {

            WebElement hucreElement=Driver.getDriver().findElement(By.xpath("(//td)["+i+"]"));
            filtreList.add(hucreElement.getText());
        }
        List<String> expectedList = new ArrayList<>(filtreList);
        Collections.sort(expectedList);
        Assert.assertEquals(expectedList,filtreList);
    }

    public static void makeFilterTestPatientOPD(String filterName,int filtreKacinciSirada, int toplamSutunSayisi){

        WebElement filter=Driver.getDriver().findElement(By.xpath("(//th[text()='"+filterName+"'])[1]"));
        ReusableMethods.bekle(2);
        Assert.assertTrue(filter.isDisplayed());
        filter.click();
        ReusableMethods.bekle(4);
        List<String> filtreList=new ArrayList<>();

        for (int i = filtreKacinciSirada; i <toplamSutunSayisi*10 ; i=(i+toplamSutunSayisi)) {

            WebElement hucreElement=Driver.getDriver().findElement(By.xpath("(//td)["+i+"]"));
            filtreList.add(hucreElement.getText());
        }
        List<String> expectedList = new ArrayList<>(filtreList);
        Collections.sort(expectedList);
        Assert.assertEquals(expectedList,filtreList);
    }
}




