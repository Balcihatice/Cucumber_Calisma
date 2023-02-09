package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanici amazon ana sayfasinda")
    public void amazona_git() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }


    @Then("kullanici Nutella icin arama yapar")
    public void nutella_ara() {
        amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);

    }


    @Then("sonuclarin Nutella icerdigini test eder")
    public void sonuclarin_nutella_icerdigini_test_et() {
        String expectedWorld = "Nutella";
        String actualWorld = amazonPage.aramaSonucYazisi.getText();
        Assert.assertTrue(expectedWorld.contains(expectedWorld));

    }


    @Then("sayfayi kapatir")
    public void sayfayi_kapat() {
        Driver.closeDriver();
    }

    @Then("kullanici Java icin arama yapar")
    public void kullanici_java_icin_aarama_yapar() {
        amazonPage.aramaKutusu.sendKeys("Java", Keys.ENTER);
    }

    @Then("sonuclarin Java icerdigini test eder")
    public void sonuclarin_java_icerdigini_test_eder() {
        String expectedWorld = "Java";
        String actualWorld = amazonPage.aramaSonucYazisi.getText();
        Assert.assertTrue(expectedWorld.contains(expectedWorld));
    }


    @And("kullanici iPhone icin arama yapar")
    public void kullaniciIPhoneIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("IPhone", Keys.ENTER);
    }

    @Then("sonuclarin IPhone icerdigini test eder")
    public void sonuclarinIPhoneIcerdiginiTestEder() {
        String expectedWorld = "IPhone";
        String actualWorld = amazonPage.aramaSonucYazisi.getText();
        Assert.assertTrue(actualWorld.contains(expectedWorld));
    }

    @Given("kullanici {string} icin arama yapar")
    public void kullanici_icin_arama_yapar(String istenenKelime) {
        amazonPage.aramaKutusu.sendKeys(istenenKelime, Keys.ENTER);
    }

    @Given("sonucun {string} icerdigini test eder")
    public void sonucun_icerdigini_test_eder(String istenenKelime) {
        String arananKelime = istenenKelime;
        String actualWorld = amazonPage.aramaSonucYazisi.getText();
        Assert.assertTrue(actualWorld.contains(arananKelime));
    }

    /*
    1-Cucumber Behaviour Drivern Development(Kullanici Tabanli Programlama
       bir test case yazilirken takip ettigimiz kullanici adimlarinin herbiri Java kodlariyla method haline getirip kullaniyoruz
      2- Yazdigimiz satirin bir method call oldugunu bastaki Gherkin kelimelerinden anlar
       Then, And kelimeleri test case `i okuyanlar icin test adimlarimizi anlamak adina onemlidir.
      Selenium acisindan hic bir fark yoktur
      Tum kelimeler birbirinin yerine kullanilir
      3- Bir test case`i yazmaya feature dosyasindan baslariz. Feature dosyalari frame work umuzde non-java
       bolumunde test clasorunun ltinda olusturdugumuz resources/feature klasorunde bulunur
       4- Feature dosya isimleri genelllikle test case isimleri ile ayni olur.
       5- Feature dosyalarinin ismi onemli degildir ama uzantisi mutlaka" .feature" olmalidir
       6- Feature dosyasina test casein adimlaini yazdiktan sonra java kodu daha onceden
       yazilmamis olan adimlar highlighted olur.Eger test caseimizde oncelikle onun java kodlarini
       olusturmaliyiz.
       7- Eksik adimlari teker teker ustune gelip olusturabiliriz veya testi calistirdigimizda
       Selenium ilk adimdan  baslayarak test casein adimlarini calistirir.Jaava kodlari olmayan
       ilk adimda calisma durur. Selenium bize eksik adimlara ait methodlari verir
       8- testimizi calistirmadan sadece eksik adimlari bize vermesini istersek testimizi Runner classindan
       dryRun=true olarak calistirabiliriz

      */

    @Given("kullanici {string} anasayfasinda")//amazonUrl
    public void kullanici_anasayfasinda(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));

    }

    @Given("url`nin {string} icerdigini test eder")
    public void url_nin_icerdigini_test_eder(String istenenKelime) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(istenenKelime));

    }

    @Then("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int istenenSaniye) {
        try {
            Thread.sleep(istenenSaniye * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
