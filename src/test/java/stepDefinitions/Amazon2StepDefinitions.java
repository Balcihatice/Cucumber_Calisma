package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Amazon2StepDefinitions {
    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanici walmart ana sayfaya gider")
    public void kullanici_walmart_ana_sayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }
    @When("walmart sayfasinda {string} icin arama yapar")
    public void walmart_sayfasinda_icin_arama_yapar(String string) {
        amazonPage.aramaKutusu.sendKeys(string, Keys.ENTER);
    }
    @Then("walmartta sayfa basliginin {string} icerdigini test eder")
    public void walmartta_sayfa_basliginin_icerdigini_test_eder(String word) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(word));
    }



}
