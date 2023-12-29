package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.QualitydemyPage;
import utilities.ConfigReader;

public class QualitydemyStepdefinitions {

    QualitydemyPage qualitydemyPage = new QualitydemyPage();
    @Then("ilk sayfa login linkine click yapar")
    public void ilk_sayfa_login_linkine_click_yapar() {

        qualitydemyPage.ilkLoginLinki.click();
    }
    @Then("kullanici kutusuna {string} yazar")
    public void kullanici_kutusuna_yazar(String istenilenUsername) {

        qualitydemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty(istenilenUsername));
    }
    @Then("password kutusuna {string} yazar")
    public void password_kutusuna_yazar(String istenilenPassword) {

        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty(istenilenPassword));

    }
    @Then("login butonuna basar")
    public void login_butonuna_basar() {

        qualitydemyPage.loginButonu.click();

    }
    @Then("basarili giris yapildiğini test eder")
    public void basarili_giris_yapildiğini_test_eder() {
        Assert.assertTrue(qualitydemyPage.basariliGirisCoursesLinki.isDisplayed());
    }


    @And("giris yapilamadigini test eder")
    public void girisYapilamadiginiTestEder() {

        Assert.assertTrue(qualitydemyPage.kullaniciEmailKutusu.isDisplayed());
    }

    @And("kullanici cerezi kabul eder")
    public void kullaniciCereziKabulEder() {
        qualitydemyPage.cookie.click();
    }

    @And("kullanici kutusuna manuel olarak {string} yazar")
    public void kullaniciKutusunaManuelOlarakYazar(String username) {

        qualitydemyPage.kullaniciEmailKutusu.sendKeys(username);
    }

    @And("password kutusuna manuel olarak {string} yazar")
    public void passwordKutusunaManuelOlarakYazar(String password) {

        qualitydemyPage.passwordKutusu.sendKeys(password);
    }
}
