package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import pages.RegisterPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import java.io.IOException;

public class RegisterStepDefinitions {
    RegisterPage registerPage = new RegisterPage();
    @Given("kullanici allure2you ana sayfasina gider")
    public void kullanici_allure2you_ana_sayfasina_gider() {
    Driver.getDriver().get(ConfigReader.getProperty("allUrl"));
    }

    @Then("{string} butonuna tiklar")
    public void yazisina_tiklar(String string) {
        ReusableMethods.waitFor(1);
      registerPage.register.click();
    }
    @Then("{string} yazisina tiklar")
    public void yazisinaTiklar(String arg0) {
        ReusableMethods.waitFor(1);
        registerPage.signUp.click();
        ReusableMethods.waitFor(1);
        registerPage.vendor.click();
    }




    @Then("Email alanina {string} adresini yazar")
    public void email_alanina_adresini_yazar(String string) {
        ReusableMethods.getEmail();
        ReusableMethods.waitFor(1);
    }

    @Then("Email adresine gelen codu {string} alanina yazar")
    public void email_adresine_gelen_codu_alanina_yazar(String string) {
        ReusableMethods.getCode();
    }

    @Then("password alanina {string} yazar")
    public void password_alanina_yazar(String string) {
        registerPage.password.sendKeys(ConfigReader.getProperty("password"));
    }

    @Then("Confirm password alanina {string} yazar")
    public void confirm_password_alanina_yazar(String string) {
        registerPage.confirmPassword.sendKeys(ConfigReader.getProperty("password"));
    }

    @Then("{string} kayit butonuna tiklar")
    public void butonuna_tiklar(String string) {
        ReusableMethods.waitFor(2);
        JSUtils.clickElementByJS(registerPage.registerB);
    }


    @Then("Let`s Go yazisinin gorunur oldugunu dogrular")
    public void letSGoYazisininGorunurOldugunuDogrular() throws IOException {
        registerPage.letsGoDashboard.isDisplayed();
        ReusableMethods.getScreenshot("Hatice");
    }
}
