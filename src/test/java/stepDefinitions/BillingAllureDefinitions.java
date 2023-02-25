package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BillingAllurePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;
import java.io.IOException;

public class BillingAllureDefinitions {
    BillingAllurePage allurePage = new BillingAllurePage();

    @Given("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("allureLogin"));

    }

    @Given("sing in butonuna tiklar")
    public void sing_in_butonuna_tiklar() {
        allurePage.singIn.click();

    }

    @Given("{string} bilgisini girer")
    public void bilgisini_girer(String string) {

        allurePage.allure2UserName.sendKeys(ConfigReader.getProperty("email"));
    }

    @Given("{string} password bilgisini girer")
    public void password_bilgisini_girer(String string) {
        allurePage.allure2Password.sendKeys(ConfigReader.getProperty("password"));
    }


    @Given("SignIn butonuna tiklar")
    public void sign_in_butonuna_tiklar() {
        ReusableMethods.waitFor(1);
        allurePage.signInGiris.click();

    }

    @Given("My Account butonuna tiklar")
    public void my_account_butonuna_tiklar() {
        ReusableMethods.waitFor(5);
       allurePage.myAccound.click();
    }


    @Then("ADRESSES butonuna tiklar")
    public void adresses_butonuna_tiklar() {
        ReusableMethods.waitFor(5);
        JSUtils.clickElementByJS(allurePage.addresses);

    }

    @Then("Billing Adres basliginda ADD butonunun gorunur oldugunu dogrular")
    public void billing_adres_basliginda_add_butonunun_gorunur_oldugunu_dogrular() {
        ReusableMethods.waitFor(3);
        Assert.assertTrue(allurePage.addButonu.isDisplayed());

    }

    @Then("ADD butonuna tiklar")
    public void add_butonuna_tiklar() {
        ReusableMethods.waitFor(1);
        allurePage.addButonu.click();
    }

    @Then("First Name alanina adini yazar")
    public void first_name_alanina_adini_yazar() {
        ReusableMethods.waitFor(1);
        allurePage.firstName.sendKeys(ConfigReader.getProperty("firstName"));
    }

    @Then("Last Name alanina Soyadini yazar")
    public void last_name_alanina_soyadini_yazar() {
        ReusableMethods.waitFor(1);
        allurePage.lastName.sendKeys(ConfigReader.getProperty("lastName"));
    }

    @Then("Country Region alaninindan ulkesini secer")
    public void country_region_alaninindan_ulkesini_secer() {
        ReusableMethods.waitFor(1);
        ReusableMethods.selectFromDropdown(allurePage.country, ConfigReader.getProperty("Country"));
    }

    @Then("Street address alanina cadde adini yazar")
    public void street_address_alanina_cadde_adini_yazar() {
        ReusableMethods.waitFor(1);
        allurePage.street.sendKeys(ConfigReader.getProperty("Street"));
    }

    @Then("Town City alanina ulke adini yazar")
    public void town_city_alanina_ulke_adini_yazar() {
        ReusableMethods.waitFor(1);
        allurePage.town_city.sendKeys(ConfigReader.getProperty("town_city"));
    }

    @Then("Province alanindan yasadigi sehri secer")
    public void prorince_alanindan_yasadigi_sehri_secer() {
        ReusableMethods.waitFor(1);
        ReusableMethods.selectFromDropdown(allurePage.province, "Konya");
    }

    @Then("Zip code alanina posta kodunu girer")
    public void zip_code_alanina_posta_kodunu_girer() {
        ReusableMethods.waitFor(1);
        allurePage.zipCode.sendKeys(ConfigReader.getProperty("zipCode"));
    }

    @Then("phone alanina telefon numarasini yazar")
    public void phone_alanina_telefon_numarasini_yazar() {
        ReusableMethods.waitFor(1);
        allurePage.phoneNumber.sendKeys(ConfigReader.getProperty("phoneNumber"));
    }

    @Then("Email adress alaninda mail adresi oldugunu dogrular")
    public void email_adress_alaninda_mail_adresi_oldugunu_dogrular() {
        ReusableMethods.waitFor(1);
        Assert.assertEquals(ConfigReader.getProperty("email"), ReusableMethods.getValueByJS(ConfigReader.getProperty("idElement")));
    }

    @Then("SAVE  butonuna tiklar")
    public void save_butonuna_tiklar() {
        ReusableMethods.waitFor(1);
        allurePage.saveAddress.click();
    }

    @Then("{string} yazisinin gorunur oldugunu dogrular")
    public void yazisinin_gorunur_oldugunu_dogrular(String string) throws IOException {
        ReusableMethods.waitFor(1);
        ReusableMethods.getScreenshot("Hatice_Billing");
    }

    //ShippingAllure kismi


}
