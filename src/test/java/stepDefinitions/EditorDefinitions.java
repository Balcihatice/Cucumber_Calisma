package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.EditorPage;
import utilities.ConfigReader;
import utilities.Driver;

public class EditorDefinitions {

    EditorPage editorPage = new EditorPage();

    @Given("kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("editorUrl"));

    }

    @Then("New butonuna tiklar")
    public void new_butonuna_tiklar() {
        editorPage.newLogin.click();

    }

    @Then("isim bolumune  {string} yazar")
    public void isim_bolumune_yazar(String firstName) {

        editorPage.firstName.sendKeys(firstName);

    }

    @Then("soyisim bolumune  {string} yazar")
    public void soyisim_bolumune_yazar(String lastName) {

        editorPage.lastNAme.sendKeys(lastName);

    }

    @Then("position bolumune  {string} yazar")
    public void position_bolumune_yazar(String position) {

        editorPage.position.sendKeys(position);

    }

    @Then("office bolumune  {string} yazar")
    public void office_bolumune_yazar(String office) {

        editorPage.office.sendKeys(office);

    }

    @Then("extention bolumune  {string} yazar")
    public void extention_bolumune_yazar(String extention) {
        editorPage.extention.sendKeys(extention);

    }

    @Then("startDate bolumune  {string} yazar")
    public void start_date_bolumune_yazar(String startDate) {
        editorPage.startDate.sendKeys(startDate);

    }

    @Then("salary bolumune  {string} yazar")
    public void salary_bolumune_yazar(String salary) {
        editorPage.salary.sendKeys(salary);

    }

    @Then("create tusuna basar")
    public void create_tusuna_basar() {
        editorPage.create.click();

    }
    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstName) {
        editorPage.search.sendKeys(firstName);
    }


    @And("isim bolumunde {string} oldugunu test eder")
    public void isimBolumundeOldugunuTestEder(String firstName) {
        Assert.assertTrue(editorPage.aramaSonucIlkElement.getText().contains(firstName));
    }


}
