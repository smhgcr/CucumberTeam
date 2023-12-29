
Feature: US1008 Scnario Outline ile birden fazla data icin test calistirma

  Scenario Outline: TC13 Scenario outline ile amazonda arama yapilabilmeli

     # Amazon anasayfaya gidelim. Nutella, Java iSamsung ve Apple için arama yapip
     # arama sonuçlarının aradığımız kelimeyi içerdiğini test edelim

    Given kullanici "amazonUrl" anasayfaya gider
    Then amazon arama kutusuna "<arananUrun>" yazip aratir
    And arama sonuclarinin "<arananUrun>" icerdigini test eder
    Then sayfayi kapatir

    Examples:
      | arananUrun |
      | Nutella    |
      | Java       |
      | Samsung    |
      | Apple      |
      | Semih      |
