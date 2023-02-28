package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.UniversityPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class UniversityStepDefinitions {
    UniversityPage universityPage = new UniversityPage();

    @Given("kullanici {string} anasayfasina gider")
    public void kullanici_anasayfasina_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("university"));
    }

    @When("login portal`a kadar iner")
    public void login_portal_a_kadar_iner() {
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollToElement(universityPage.loginPortal);
        ReusableMethods.waitFor(2);
    }

    @Then("Login Portal a tiklar")
    public void login_portal_a_tiklar() {
        universityPage.loginPortal.click();
        Driver.getDriver().getTitle();
    }

    @Then("Diger window`a gecer")
    public void diger_window_a_gecer() {
        ReusableMethods.switchToWindow(1);
    }

    @Then("{string} alanina deger yazar")
    public void alanina_deger_yazar(String string) {
        ReusableMethods.waitFor(2);
        universityPage.userName.sendKeys(ConfigReader.getProperty("username"));
        universityPage.passwordd.sendKeys(ConfigReader.getProperty("passworrd"));
    }

    @Then("login butonuna tiklar")
    public void login_butonuna_tiklar() {
        ReusableMethods.waitFor(2);
        universityPage.loginButton.click();
    }

    @Then("popup ta cikan yazinin {string} oldugunu test eder")
    public void popup_ta_cikan_yazinin_oldugunu_test_eder(String string) {
        String str = Driver.getDriver().switchTo().alert().getText();
        Assert.assertTrue(str.contains("validation failed"));
        ReusableMethods.waitFor(1);
    }

    @Then("Ok diyerek popup`i kapatir")
    public void ok_diyerek_popup_i_kapatir() {
     Driver.getDriver().switchTo().alert().accept();
        ReusableMethods.waitFor(1);
    }

    @Then("ilk sayfaya geri doner")
    public void ilk_sayfaya_geri_doner() {
        ReusableMethods.switchToWindow(0);
        ReusableMethods.waitFor(1);
    }

    @Then("ilk sayfada oldugunu test eder")
    public void ilk_sayfada_oldugunu_test_eder() {
        Assert.assertTrue(universityPage.loginPortal.isDisplayed());
        ReusableMethods.waitFor(1);
    }
}
