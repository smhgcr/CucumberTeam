
# "https://webdriveruniversity.com/" adresine gidin
  # "Login Portal"a kadar aşağı inin
  # "Login Portal"a tıklayın
  # Diğer window'a geçin
  # "username" ve "password" kutularına değer yazdırın
  # "login" butonuna nasın
  # Pop-up'ta çıkan yazının "validation failed" olduğunu test edin
  # Ok diyerek pop-up'ı kapatın
  # İlk sayfaya geri dönün
  # İlk sayfaya dönüldüğünü test edin


@wip
Feature: US1012 Window Testti
  
  Scenario: TC17 Kullanici yeni acilan window'u test edebilmeli
    
    Given kullanici "wduUrl" anasayfaya gider
    Then Login Portal elementine kadar asagi iner
    And Login Portal a tiklar
    Then Acilan yeni window a gecer
    And username kutusuna deger yazar
    And password kutusuna deger yazar
    Then webuniversitylogin butonuna basar
    And popup ta cikan yazinin validation failed oldugunu test eder
    And OK diyerek popup i kapatir
    Then ilk sayfaya geri doner
    And ilk sayfaya dondugunu test eder
    And sayfayi kapatir