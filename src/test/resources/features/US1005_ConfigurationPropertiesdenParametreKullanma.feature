
Feature: US1005 Kullanici configuration.properties'de yazilan datalari parametre olarak kullanir

  # 3 Scenario oluşturup, amazon, iwsequarter ve walmart anasayfalarina gidin
  # ve o anasayfalara gidildiğini test edin
  # parametre olarak kullandığımız kelimeler direkt testte kullanılacak datalar olabileceği gibi
  # configuration.properties'de bulunan key'ler de olabilir
  # Bu durumda stepdefinition'da yolladğımız key ile
  # ConfigReader'daki getProprty() kullanılıp
  # configuration.properties dosyasındaki value testte kullanılabilir

  Scenario: TC06 Kullanici amazon sitesine gidisi test eder

    Given kullanici "amazonUrl" anasayfaya gider
    Then url de "amazon" oldugunu test eder
    And sayfayi kapatir

  Scenario: TC07 Kullanici wisequarter sitesine gidisi test eder

    Given kullanici "wqUrl" anasayfaya gider
    Then url de "wisequarter" oldugunu test eder
    And sayfayi kapatir

  Scenario: TC08 Kullanici wisequarter sitesine gidisi test eder

    Given kullanici "walmartUrl" anasayfaya gider
    Then url de "walmart" oldugunu test eder
    And sayfayi kapatir