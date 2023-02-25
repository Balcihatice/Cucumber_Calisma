package stepDefinitions;

import io.cucumber.java.en.Then;
import org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator;
import org.openqa.selenium.support.ui.Select;
import pages.ShippingAllurePage;
import utilities.ConfigReader;
import utilities.JSUtils;
import utilities.ReusableMethods;

import java.io.IOException;

public class ShippingAllureDefinitions {

    ShippingAllurePage shipAllurePage = new ShippingAllurePage();

    @Then("Shipping Adres basliginda ADD butonunun gorunur oldugunu dogrular")
    public void shipping_adres_basliginda_add_butonunun_gorunur_oldugunu_dogrular() {
        shipAllurePage.shippingAdd.isDisplayed();
    }

    @Then("Shipping ADD butonuna tiklar")
    public void shipping_add_butonuna_tiklar() {
        shipAllurePage.shippingAdd.click();
    }

    @Then("Shipping sayfasinda First Name alanina adini yazar")
    public void shipping_sayfasinda_first_name_alanina_adini_yazar() {
        shipAllurePage.shippingFirstName.sendKeys(ConfigReader.getProperty("firstName"));
    }

    @Then("Shipping sayfasinda Last Name alanina Soyadini yazar")
    public void shipping_sayfasinda_last_name_alanina_soyadini_yazar() {
        ReusableMethods.waitFor(2);
        shipAllurePage.shippingLastName.sendKeys(ConfigReader.getProperty("lastName"));
    }

    @Then("Shipping sayfasinda Country Region alaninindan ulkesini secer")
    public void shipping_sayfasinda_country_region_alaninindan_ulkesini_secer() {
        ReusableMethods.waitFor(2);
        Select select = new Select(shipAllurePage.shippingCountry);
        select.selectByVisibleText("Turkey");
    }

    @Then("Shipping sayfasinda Street address alanina cadde adini yazar")
    public void shipping_sayfasinda_street_address_alanina_cadde_adini_yazar() {
        ReusableMethods.waitFor(2);
        shipAllurePage.shippingSetreet.sendKeys(ConfigReader.getProperty("Street"));
    }

    @Then("Shipping sayfasinda Zip code alanina posta kodunu girer")
    public void shipping_sayfasinda_zip_code_alanina_posta_kodunu_girer() {
        ReusableMethods.waitFor(2);
        shipAllurePage.shippingZipCode.sendKeys(ConfigReader.getProperty("zipCode"));
    }

    @Then("Shipping sayfasinda Town City alanina ulke adini yazar")
    public void shipping_sayfasinda_town_city_alanina_ulke_adini_yazar() {
        ReusableMethods.waitFor(2);
        shipAllurePage.shippingTownCity.sendKeys(ConfigReader.getProperty("town_city"));
    }

    @Then("Shipping sayfasinda Province alanindan yasadigi sehri secer")
    public void shipping_sayfasinda_province_alanindan_yasadigi_sehri_secer() {
        ReusableMethods.waitFor(2);
        ReusableMethods.selectFromDropdown(shipAllurePage.shippingState, ConfigReader.getProperty("town_city"));
    }

    @Then("Shipping sayfasinda SAVE  butonuna tiklar")
    public void shipping_sayfasinda_save_butonuna_tiklar() {
        ReusableMethods.waitFor(2);
        JSUtils.clickElementByJS(shipAllurePage.shippingSaveAddresses);
    }

    @Then("Shipping sayfasinda {string} yazisinin gorunur oldugunu dogrular")
    public void shipping_sayfasinda_yazisinin_gorunur_oldugunu_dogrular(String string) throws IOException {
        ReusableMethods.waitFor(2);
        ReusableMethods.getScreenshot("Hatice_Shipping");
    }

}
