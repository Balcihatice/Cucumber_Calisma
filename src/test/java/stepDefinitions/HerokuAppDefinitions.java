package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HerokuAppPage;
import utilities.ConfigReader;
import utilities.Driver;


public class HerokuAppDefinitions {

    HerokuAppPage herokuApp = new HerokuAppPage();

    @Given("kullanici\"herokuappUrl\" anasayfasina gider")
    public void kullanici_herokuapp_url_anasayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("herokuappUrl"));

    }

    @Given("add element butonuna basar")
    public void add_element_butonuna_basar() {
        herokuApp.addElement.click();

    }

    @Then("delete butonu gorunur oluncaya kadar bekler")
    public void delete_butonu_gorunur_oluncaya_kadar_bekler() throws InterruptedException {
        Thread.sleep(2000);

    }

    @Then("delete butonunun gorunur oldugunu test eder")
    public void delete_butonunun_gorunur_oldugunu_test_eder() {

        herokuApp.delete.isDisplayed();
    }

    @Then("delete butonuna tiklar")
    public void delete_butonuna_tiklar() {
        herokuApp.delete.click();

    }

    @Then("add element butonunun gorunmedigini test eder")
    public void add_element_butonunun_gorunmedigini_test_eder() {
        Assert.assertTrue(herokuApp.addElement.isDisplayed());
    }
}
