package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoqaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;


public class DemoqaStepDefinitions {

    DemoqaPage demoqaPage = new DemoqaPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));

    @When("kullanici {string} anasayfaya gider")
    public void kullanici_anasayfaya_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("demoqa_url"));
    }

    @Then("alert yazisina tiklar")
    public void alert_yazisina_tiklar() {
        demoqaPage.allerts.click();
        ReusableMethods.waitFor(3);
    }

    @Then("{int}. Click Me butonuna tiklar")
    public void click_me_butonuna_tiklar(Integer int1) {
        demoqaPage.clickMe.click();

    }

    @Then("Allert'in gorunur olmasini bekler")
    public void allert_in_gorunur_olmasini_bekler() throws InterruptedException {
        wait.until(ExpectedConditions.alertIsPresent());
    }

    @Then("Allert uzerindeki yazinin “This alert appeared after {int} seconds” oldugunu test eder")
    public void allert_uzerindeki_yazinin_this_alert_appeared_after_seconds_oldugunu_test_eder(Integer int1) {
        String expextedAlert = "This alert appeared after 5 seconds";
        String alertYazisi = Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(expextedAlert, alertYazisi);
    }

    @Then("OK butonuna basip Allert'i kapatir")
    public void ok_butonuna_basip_allert_i_kapatir() {
        Driver.getDriver().switchTo().alert().accept();
    }

}
