
Feature: US1010 Kullanici Scenario Outline ile Editor sayfasinda kayit olusturur


  Scenario Outline: TC15 Editor sayfasinda birden fazla kayit olusturulabilmeli

    Given kullanici "editorUrl" anasayfaya gider
    Then new butonuna basar
    And 1 saniye bekler
    And First name kutusuna "<firstName>" yazar
    And Last name kutusuna "<lastName>" yazar
    And position kutusuna "<position>" yazar
    And Office kutusuna "<office>" yazar
    And Extension kutusuna "<Extension>" yazar
    And Start date kutusuna "<startDate>" yazar
    And Salary kutusuna "<salary>" yazar
    And Create tusuna basar
    When kullanici "<firstName>" arama yapar
    Then isim bolumunda "<firstName>" oldugunu dogrular
    And 2 saniye bekler
    Then sayfayi kapatir


    Examples:
      | firstName | lastName | position | office   | Extension | startDate | salary |
      | Semih     | Gecer    | QA Lead      | Istanbul | Beyoglu | 2023-12-24 | 30000 |
      | Kadir     | Yilmaz    | QA       | Istanbul | Levent | 2023-10-11 | 20000 |
      | Erva     | Tiryaki    | QA       | Istanbul | Uskudar | 2023-05-09 | 15000 |
      | Talha     | Eroglu    | Test       | Istanbul | Eyup | 2023-01-17 | 15000 |