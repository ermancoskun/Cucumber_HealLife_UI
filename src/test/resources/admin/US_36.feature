Feature: US_036 As an administrator (admin), I want to have a navbar in the admin panel to manage the admin panel more easily.

  Background: common steps
    * Launch browser.
    * Go to "adminUrl"
    * Login to admin page as "duyguAdminUsername" "duyguAdminPassword"


  Scenario: TC01 Verify that the navbar of the admin panel has the site logo and that it refreshes the admin panel home page when clicked.

    And Verify that the heallife logo is visible in the navbar of the admin panel.
    And Click on the Billing Menu
    And Click on the heallife logo in the Navbar
    And Verify that the admin panel is refreshed when clicking on the heallife logo
    And Close browser


  Scenario: TC02 Verify that there is a menu icon in the navbar and verify that the dashboard menu opens and closes when clicked.

    * Verify that there is a dashboard menu icon in the navbar
    * Click on the menu icon.
    * Verify that the dashboard menu is closed when clicked
    * Click on the menu icon.
    * Verify that the dashboard menu is opened when clicked
    * Close browser


  Scenario: TC03 Navbar'da "Heal Life Hospital & Research Center" text'i bulundugu dogrulanmali.

    And Verify that the Navbar has the text *Heal Life Hospital & Research Center*
    And Close browser


  Scenario: TC04 Panel icinde hasta bilgilerine kolayca erisebilmek icin navbar'da "Search By Patient Name" search box'i oldugu ve dogru sonuc verdigi dogrulanmali.

    * Verify that the *Search By Patient Name* search box is enable in the navbar.
    * Enter a patient name in the *Search By Patient Name* search box.
    * Verify that the Searchbox returns the correct result.


  Scenario: TC05 Panelin dilini degistirmek icin navbar'da bir ikon oldugu dogrulanmali.

    * Verify that there is a flag icon in the navbar to change the language of the admin panel
    * Click on the Turkish flag icon
    * Verify that the language of the panel has changed
    * Close browser


  Scenario: TC06 Navbar'da (yöneticiye gelen) bildirim ikon linki oldugu dogrulanmali.

    * Verify that there is a notification icon link in the navbar.
    * Click on the notification icon.
    * Verify that it redirects to the "notificationUrl" page.
    * Close browser


  Scenario: TC07 Okunmamis bildirim oldugunda bu ikon uzerinde sayi ile belirtildigi ve okuyunca azaldigi dogrulanmali.

    * Verify that unread notifications are indicated by a number on the icon.
    * Click on the notification icon.
    * Click on the unread notification message on the notification page
    * The page refreshes.
    * Verify that the number displayed on the notification icon decreases by one.
    * Close browser


  Scenario: TC08 Navbar'daki bildirim ikonuna tiklaninca acilan sayfada (Type, Subject, Date) basliklarina göre listelenmis Notifications List oldugu dogrulanmali.

    * Click on the notification icon.
    * Verify that the notification page has Type, Subject, Date headers.
    * Close browser


  Scenario: TC09 Bildirim mesajinin uzerine tiklayinca detay görüntülendigi dogrulanmali

    * Click on the notification icon.
    * Click on notification message 1 on the notification page.
    * Verify that the detail is displayed when click on the notification message 1
    * Close browser

  @dg
  Scenario: TC10 Okunan ve okunmayan bildirim ayrimi yapilabildigi dogrulanmali.

    * Click on the notification icon.
    * The number of unread notifications is saved
    * Click on the unread notification message on the notification page
    * The page refreshes.
    * Verify that the number of unread notifications has decreased
    * Close browser


  Scenario: TC11 Tüm bildirimleri tek seferde silebilen 'Delete All' butonunun oldugu ve bildirimleri sildigi dogrulanmali.

    * Click on the notification icon.
    * Click the Delete All button on the notification page.
    * The *Are you sure want to delete?* allert is accepted.
    * Verify that text "Data Deleted Successfully" is displayed.
    * Verify that there are no notifications on the page.
    * Close browser


  Scenario: TC12 Navbar'da (yöneticiye gelen)  mesaj ikon linki bulundugu dogrulanmalı

    * Verify that there is a chat icon link in the navbar.
    * Click on the chat icon.
    * Verify that it redirects to the "chatPageUrl" page.
    * Close browser


  Scenario: TC13 Okunmamis mesaj oldugunda bu ikon uzerinde sayi ile belirtildigi ve okuyunca azaldigi dogrulanmali.

    * A message is sent to the admin.
    * Verify that unread messages are indicated by a number on the icon.
    * Click on the chat icon.
    * Click on the unread message on the message page
    * The page refreshes.
    * Verify that the number displayed on the message icon decreases by one.
    * Close browser


  Scenario: TC14 Navbar'daki mesaj ikon linkine tiklayinca acilan sayfada Chat System penceresi oldugu dogrulanmali.

    * Click on the chat icon.
    * Verify that there is a Chat System window on the Chat page.
    * Close browser


  Scenario: TC15 Daha önceden mesaj gönderilen kullanicilarin görüntülendigi dogrulanmali

    * Click on the chat icon.
    * Verify that there are people who have been previously contacted under the chat system.
    * Close browser


  Scenario: TC16 Chat sayfasinda yeni bir contact eklenebildigi dogrulanmali.

    * Click on the chat icon.
    * Click on the + icon on the Chat System
    * Enter the contact name in the search text box.
    * Click on the +Add button.
    * Verify that text "Record Saved Successfully" is displayed.
    * Verify that the contact added under the chat system is visible.
    * Close browser


  Scenario: TC17 Mesaj yazilip gönderilecek ve gelen mesajin okunabilecegi bir chat bölümü oldugu dogrulanmali

    * Click on the chat icon.
    * Verify that there is a chat section where messages can be written and sent and where the incoming message can be read.
    * Type a message in the *Write Your Message* textbox and send it.
    * Verify that the typed message is visible.
    * Close browser


  Scenario: TC18 Navbar'da calendar ikon linki bulundugu dogrulanmalı.

    * Verify that there is a calendar icon link in the navbar.
    * Click on the calendar icon.
    * Verify that it redirects to the "calendarUrl" page.
    * Close browser


  Scenario: TC19 Navbar'da calendar linkine tiklayinca acilan sayfada bir takvim ve bir To Do List görüldugu dogrulanmali

    * Click on the calendar icon.
    * Verify that there is a calendar and to do list on the page.
    * Close browser


  Scenario: TC20 Takvimde istenilen güne (Public, Protected, Private, All Admin) türünde farkli renkler ile renklendirilmis event eklenebildigi dogrulanmali

    * Click on the calendar icon.
    * Click on day "4" in the calendar
    * Enter the information in the opened window and save.
    * Verify that the event is visible on the selected day.
    * Close browser


  Scenario: TC21 Eklenen event takvim uzerinde (gun hafta ve ay secilerek) filtrelenebildigi dogrulanmali

    * Click on the calendar icon.
    * Verify that the Month, Week, Day buttons are enabled for filtering.
    * Verify that the date change arrows are enabled.
    * Close browser


  Scenario: TC22 To Do LIst'e yeni bir task ekleyenebilmeli ve eklenmis taskler uzerinde update ve delete yapilabildigi dogrulanmali

    * Click on the calendar icon.
    * Add a new task
    * Verify that a new task has been added.
    * Task information is updated
    * Verify that the task has been updated.
    * Task is deleted
    * Verify that the task has been deleted
    * Close browser


  Scenario: TC23 Navbar üzerinde atanmis task'lari gormek icin task ikon linki bulundugu dogrulanmali

    * Verify that there is a task icon link in the navbar
    * Click on the Task icon.
    * Verify that the tasks are visible in the opened window.
    * Close browser


  Scenario: TC24 Navbar'da yatak durumunu ve yatan hastalari gösteren Bed Status linki bulundugu dogrulanmali.

    * Verify that there is a Bed Status link in the navbar.
    * Click on the Bed Status link.
    * Verify that Bed Status information is displayed.
    * Close browser




  Scenario: TC25 Navbar'da bulunan Bed Status linkine tiklaninca acilan sayfada hastanede yatan hastalari(yatagin bulundugu kat ve oda bilgisi ile birlikte) görüntülendigi dogrulanmali

    * Click on the Bed Status link.
    * Verify that inpatient information is displayed.
    * Close browser




  Scenario: TC26 Navbar'da profil ve password bilgilerinin görülebildigi ve logout yapilabildigi bir profil ikonu bulundugu dogrulanmalı.

    * Verify that there is a profile icon link in the navbar.
    * Click on the profile icon link in the navbar.
    * Verify that there are profile, password and logout buttons in the opened window.
    * Close browser



  Scenario: TC27 Navbar'daki profil resmine tiklaninca acilan pencereden Profile ikonuna tiklaninca yöneticinin (Profile, Payroll,Leaves, Staff Attendance, Documents, Timeline, Address, Bank Account Details, Social Media Link) bilgileri detaylariyla görüntülendigi dogrulanmali.

    * Click on the profile icon link in the navbar.
    * Click on the profile picture.
    * Verify that the administrator's information is displayed with details.
    * Close browser

  @dg
  Scenario: TC28 Yönetici profilinin change password ve profil edit islemleri yapilabildigi dogrulanmali.

    * Click on the profile icon link in the navbar.
    * Click on the profile button
    * Click on the edit button
    * Profile information is updated
    * Verify that text Record Updated Succesfully is displayed.
    * Click on the profile icon link in the navbar.
    * Click on the Password button
    * Enter new password information and save
    * Verify that the password can be changed
    * Close browser


