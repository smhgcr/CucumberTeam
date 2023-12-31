
Feature: US1006 Kullanici configuration dosyasindaki bilgilerle login olabilmeli

  @wip @smoke
  Scenario: TC09 Gecerli Kullanici adi ve sifre ile Pozitif Login Testti
    
    Given kullanici "qdUrl" anasayfaya gider
    Then ilk sayfa login linkine click yapar
    And kullanici kutusuna "qdGecerliUsername" yazar
    And password kutusuna "qdGecersizPassword" yazar
    Then login butonuna basar
    And giris yapilamadigini test eder
    And 2 saniye bekler
    Then sayfayi kapatir