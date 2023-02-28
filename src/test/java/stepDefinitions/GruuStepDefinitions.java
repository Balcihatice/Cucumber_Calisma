package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.GruuPage;
import utilities.ConfigReader;
import utilities.Driver;


public class GruuStepDefinitions {
    GruuPage gruuPage = new GruuPage();

    @Given("kullanici ana sayfasina gider")
    public void kullaniciWebSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("web"));
    }

    @Then("tablodaki verileri yazdirir")
    public void tablodakiVerileriYazdirir() {
        String table = gruuPage.liste.getText();
        System.out.println(table);
    }
}
