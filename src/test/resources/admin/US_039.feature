Feature: Bir kullanici(admin) olarak dashboard panelde Appointment menusunun olmasi gerekir

  Background:
    Given  Gerekli url 'yi girer
    And    Admin Login sayfasında gecerli username  ve password girer



  Scenario: Dashboard sidebar'indaki Appointment linkine tiklaninca ilgili sayfaya yönlendirmeli.
    Given   Dashboardda Appointment sekmesine tiklanir
    And     URl'in appointment icerdigi  dogrulanir.
    And     Logout admin ile sayfa kapatilir


  Scenario: Appointment sayfasindaki Appointment Details List'te gerekli basliklari olmali.
    Given   Dashboardda Appointment sekmesine tiklanir
    Then    Detailsde "Patient Name Appointment No Appointment Date Phone Gender Doctor Source Priority Live Consultant Fees Status" oldugu dogrulanir
    And     Logout admin ile sayfa kapatilir


  Scenario: Appointment sayfasindaki Appointment Details List'te basliklar üzerinden siralama yapilabilmeli.
    Given   Dashboardda Appointment sekmesine tiklanir
    Then    Appointment No ya gore listelendigini kontrol eder
    And     Logout admin ile sayfa kapatilir


  Scenario: Appointment sayfasindaki Appointment Details List'te arama yapabilmek icin sayfada searchBox olmali.
    Given   Dashboardda Appointment sekmesine tiklanir
    Then    Appointment Details sayfasinda search box tiklanir ve "yusuf" datasi gonderilir
    And     2 saniye beklenir
    And     arama sonuclarin dogru goruntulendigi test edilir.
    And     Logout admin ile sayfa kapatilir

  Scenario: Appointment sayfasindaki Appointment Details List'te Action basligi altinda appointment detayi görüntülenmeli.
    Given   Dashboardda Appointment sekmesine tiklanir
    Then    Status sekmesi altinda show butonuna tiklanir
    And     Acilan sayfanin appointment detaylarini icerdigi dogrulanir
    And     Logout admin ile sayfa kapatilir


  Scenario: Appointment sayfasindan doktor secerek ilgili doktordan alinmis randevularinin görüntülenebilecegi bir sayfaya (ilgili islemleri yapabilmek icin) yönlendirme olmali.
    Given   Dashboardda Appointment sekmesine tiklanir
    Then    Doctor Wise butonuna tiklanir
    And     Acilan sayfanin urlinde "patientschedule" bulundugu dogrulanir
    And     Logout admin ile sayfa kapatilir



  Scenario: Doctor Wise Appointment sayfasinda Doctor ve Date secilerek filtrelemeye uygun randevu verileri listelenebilmeli.
    Given   Dashboardda Appointment sekmesine tiklanir
    Then    Doctor Wise butonuna tiklanir ve Doctor hanesinden "yusuf.kombe(9028)" secillir
    And     Date hanesine "12.05.2023" tarihi girilir
    And     Doctor Wise da Search butonuna tiklanir
    And     Sonuclarin goruntulendigi dogrulanir
    Then    Logout admin ile sayfa kapatilir


  Scenario: Appointment sayfasindan (doktor vardiya gün ve slot secilerek) randevu almis hastalari filtreleyebilecegim bir sayfaya (ilgili islemleri yapabilmek icin) yönlendirme olmali.
    Given   Dashboardda Appointment sekmesine tiklanir
    Then    Appointment sayfasinda Queue sekmesine tiklanir
    And     Sayfa URLinin "patientqueue" icerdigi dogrulanir
    And     Logout admin ile sayfa kapatilir


  Scenario: Patient Queue sayfasinda doktor vardiya gün ve slot secildiginde ( filtrelemeye uygun ) randevular listenebilmeli.
    Given   Dashboardda Appointment sekmesine tiklanir
    Then    Appointment sayfasinda Queue sekmesine tiklanir
    And     3 saniye beklenir
    And     Patient Queue sayfasinda doktor hanesine "yusuf.kombe(9028)" girilir
    And     Patient Queue sayfasinda shift hanesine "Morning" girilir
    And     Patient Queue sayfasinda date hanesine "12.05.2023" tarihi girilir
    And     2 saniye beklenir
    And     Patient Queue sayfasinda slota giris yapilir
    Then    Patient Queue sayfasinda search butonuna basilir
    And     Sonuclarin goruntulendigi dogrulanir
    Then    Logout admin ile sayfa kapatilir