package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports.html",
        "json:target/json-reports/cucumber.json",
        "junit:target/xml-reports/cucumber.xml"
        },

        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@parametre",
        dryRun = false

)
public class Runner {
    /*
    Bir frameworkte bir tek runner classi yeterli olabilir.
    Runner class`inda class body`sinde hic bir sey olmaz.
    Runner clasimizi onemli yapan 2 adet annotation vardir.
    @RunWith(Cucumber.class) notasyonu runner clasina calisma ozelligi katar
    Bu notasyon oldugu icin cucumber frameworumuzde JUnit kullanmayi tercih ediyoruz

    features = runner dosyasinin feature dosyalarini nereden bulacagini tarif eder
    glue = stepDwfinitions dosyalarini nerede bulacagimizi gosterir
    tags = o an hangi tagi calistirmak istiyorsak onu belli eder

    dryRun = iki secenek var,
    dryRun = true ==>> yazdigimizda testimizi calistirmaz sadece eksik adimlari bize verir,
            Eksik adim yoksa hicbir sey yapmaz(kod calismaz)
    dryRun = false ==>> yazdigimiz da testlerimizi calistirir.
     */

}
