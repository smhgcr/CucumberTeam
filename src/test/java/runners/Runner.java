package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports-smoke.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        features = "src/test/resources/features" ,
        glue = "stepdefinitions" ,
        tags = "@smoke" ,
        dryRun = false
)
public class Runner {
    /*
    Cucumber'da Runner class'i boş bir class'tir
    Runner class'ını diğer classlardan farklı kılan
    ve testNG'deki xml dosyaları gibi çalışmasını sağlayan
    2 adet notasyon mevcuttur

    @RunWith notasyonu projemize cucumber junit dependency eklememizin sebebidir.
    bu sayede runer class'larımız cucumber ile çalışır

    @CucumberOptions notasyonu ile istediğimiz özellikleri Runner class'ına ekleyebiliriz.
    Raporlama gibi ekstra opritonları da ileride ekleyeceğiz
    Ancak öncelikli göre features dosyaları ile stepdefinitions'da bulunan
    Java method'larını ilişkilendirmektir.

    tags: features klasörü içerisinde yazılan tag(lari) aratıp
    bulduğu tüm feature veya scenario'ları çalıştırır.

    dryRun: iki değer alabilir
    true: seçilirse, verilen tag ile işaretli olan Feature veya Scenario'daki
          eksik stepdefinitions'lari bulup
          ilgili methodları oluşturur.
          Hiç bir şekilde testlerimiz çalıştırmaz
          eksik adım yoksa test passed olarak işaretler

     false: seçilirse, verilen tag ile işaretlenen Feature veya Scenario'ları çalıştırır
     */
}
