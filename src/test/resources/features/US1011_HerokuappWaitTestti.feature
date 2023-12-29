
 # https://the-internet.herokuapp.com/add_remove_elements/ adresine gidilir
    # "Add Element" butonuna basin
    # "Delete" butonunu gorunur oluncaya kadar bekleyin
    # "Delete" butonunun gorunur olduğunu test edin
    # Delete butonuna basarak butonu silin
    # Delete butonunun gorunmediğini test edin

Feature: US1011 Kullanici herokuapp sayfasinda butonlarin gorunur oldugunu test eder

  Scenario: TC16 kullanici bekleyerek butonlarin gorunur olmasini saglamali
    Given kullanici "herokuappUrl" anasayfaya gider
    Then Add Element butonuna basar
    And Delete butonu gorunur oluncaya kadar bekler
    And Delete butonunun gorunur oldugunu test eder
    Then Delete butonuna basarak butonu siler
    And Delete butonunun gorunmedigini test eder



