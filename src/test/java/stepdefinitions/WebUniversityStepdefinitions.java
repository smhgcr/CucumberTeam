package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import jdk.jshell.execution.Util;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.WebUniversityPage;
import utilities.Driver;

import javax.swing.text.Utilities;
import java.util.Set;

public class WebUniversityStepdefinitions {

    WebUniversityPage webUniversityPage = new WebUniversityPage();
    Faker faker = new Faker();
    String ilkSayfaHandleDegeri;

    @Then("Login Portal elementine kadar asagi iner")
    public void login_portal_elementine_kadar_asagi_iner() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(webUniversityPage.loginPortalButonu);
        actions.perform();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("Login Portal a tiklar")
    public void login_portal_a_tiklar() {
        ilkSayfaHandleDegeri = Driver.getDriver().getWindowHandle();
        webUniversityPage.loginPortalButonu.click();
    }

    @Then("Acilan yeni window a gecer")
    public void acilan_yeni_window_a_gecer() {
        // Eğer yeni window'a geçiyorsa, yeni window açılmadan
        // ilk sayfanın window handle değerini kaydetmeliyiz.

        Set<String> windowHandlesSeti = Driver.getDriver().getWindowHandles();
        String ikinciSayfaHandleDegeri="";

        for (String each : windowHandlesSeti) {
            if (!each.equals(ilkSayfaHandleDegeri)) {
                ikinciSayfaHandleDegeri = each;
            }
        }
        Driver.getDriver().switchTo().window(ikinciSayfaHandleDegeri);

    }

    @Then("username kutusuna deger yazar")
    public void username_kutusuna_deger_yazar() {
        webUniversityPage.userNameKutusu.sendKeys(faker.name().username());
    }

    @Then("password kutusuna deger yazar")
    public void password_kutusuna_deger_yazar() {
        webUniversityPage.passwordKutusu.sendKeys(faker.internet().password());
    }

    @Then("webuniversitylogin butonuna basar")
    public void webuniversitylogin_butonuna_basar() {
        webUniversityPage.loginButonu.click();
    }

    @Then("popup ta cikan yazinin validation failed oldugunu test eder")
    public void popup_ta_cikan_yazinin_validation_failed_oldugunu_test_eder() {
        String actualPopUpyazi = Driver.getDriver().switchTo().alert().getText();
        String expectedYazi = "validation failed";
        Assert.assertEquals(actualPopUpyazi, expectedYazi);
    }

    @Then("OK diyerek popup i kapatir")
    public void ok_diyerek_popup_i_kapatir() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @Then("ilk sayfaya geri doner")
    public void ilk_sayfaya_geri_doner() {
        Driver.getDriver().switchTo().window(ilkSayfaHandleDegeri);
    }

    @Then("ilk sayfaya dondugunu test eder")
    public void ilk_sayfaya_dondugunu_test_eder() {
        Assert.assertTrue(webUniversityPage.contactUsLinki.isDisplayed());
    }
}
