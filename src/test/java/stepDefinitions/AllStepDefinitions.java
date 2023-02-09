package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AllPage;
import utilities.ConfigReader;


public class AllStepDefinitions {

    AllPage allPage = new AllPage();


    @Then("Sig In yazisina tiklar")
    public void sig_ın_yazisina_tiklar() {
        allPage.singIn.click();

    }

    @Then("gecerli username girer")
    public void gecerli_username_girer() {
        allPage.allure2UserName.sendKeys(ConfigReader.getProperty("allUserName"));

    }

    @Then("gecerli password girer")
    public void gecerli_password_girer() {
        allPage.allure2Password.sendKeys(ConfigReader.getProperty("allPassword"));

    }

    @Then("SIGN IN butonuna basar")
    public void sıgn_ın_butonuna_basar() {
        allPage.signInGiris.click();

    }

    @Then("sayfaya giris yaptigini test eder")
    public void sayfaya_giris_yaptigini_test_eder() {

        Assert.assertTrue(allPage.myAccound.isDisplayed());
    }


    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        allPage.allure2Password.sendKeys(ConfigReader.getProperty("allWrongPassword"));
    }

    @Then("sayfaya giris yapilamadigini test eder")
    public void sayfayaGirisYapilamadiginiTestEder() {
        Assert.assertTrue(allPage.allWrongPassword.isDisplayed());
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        allPage.allure2UserName.sendKeys(ConfigReader.getProperty("allWrongUsername"));
    }

    @And("gecersiz username olarak {string} girer")
    public void gecersizUsernameOlarakGirer(String allWrongUsername) {
        allPage.allure2UserName.sendKeys(allWrongUsername);
    }

    @And("gecersiz password olarak {string} girer")
    public void gecersizPasswordOlarakGirer(String allWrongPassword) {
        allPage.allure2Password.sendKeys(allWrongPassword);
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(allPage.allWrongPassword.isDisplayed());
    }
}