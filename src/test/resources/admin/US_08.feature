@US038
Feature: Bir kullanici olarak sayfa ici erisimleri daha efektif kullanabilmek icin ana sayfa alt barinda en cok gidilen sayfalara yönlendirme yapan linklerin bulunmasini istiyorum

  Scenario: TC01 Ana sayfa alt barinda Home, Academics, Gallery, About, Event, Contact US sayfa basliklarinin görünür
  oldugu dogrulanmali.


    Given Go to url
    Then Verify that Home page title is visible in the home page bottom bar.
    Then Verify that Academics page title is visible in the home page bottom bar.
    Then Verify that  Gallery page title is visible in the home page bottom bar.
    Then Verify that  About page title is visible in the home page bottom bar
    Then Verify that Contact US page title is visible in the home page bottom bar




  Scenario: TC02 Ana sayfa alt barinda Home, Academics, Gallery, About, Event, Contact US sayfa basliklarina
 tiklandiginda ilgili sayfalara yönlendrime yaptigi dogrulanmali.

    Given Go to url
    Then Click Home title. Verify that browser redirects to the Home page.
    Then Click Academics title.Verify that browser redirects to the Academics page.
    Then Click About title.Verify that browser redirects to the About page.
    Then Click Contact US title. Verify that browser redirects to the Contact US page.
    Then Click Gallery title.Verify that browser redirects to the  Gallery page.
