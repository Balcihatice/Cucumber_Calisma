package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutoPage;
import utilities.Driver;

public class AutomationStepDefinition {

    AutoPage autoPage = new AutoPage();
    Faker faker = new Faker();

    @Given("user SignIn-Login linkine tiklar")
    public void user_sign_in_login_linkine_tiklar() {

        autoPage.signup.click();
    }

    @Given("New User Signup! bolumune  name adresi girer")
    public void new_user_signup_bolumune_name_girer() {
        autoPage.nameN.sendKeys("Ali");

    }

    @Given("New User Signup! bolumune   ve email adresi girer")
    public void new_user_signup_bolumune_ve_email_adresi_girer() {
        autoPage.email.sendKeys(faker.internet().emailAddress());

    }

    @Given("SignUp butonuna basar")
    public void sign_up_butonuna_basar() {
        autoPage.signUp.click();

    }

    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {
        Actions actions = new Actions(Driver.getDriver());
       actions.click(autoPage.female)
               .sendKeys(Keys.TAB)
               .sendKeys(faker.name().firstName())
               .sendKeys(Keys.TAB)
               .sendKeys(faker.internet().password())
               .sendKeys(Keys.TAB)
               .sendKeys("10")
               .sendKeys(Keys.TAB)
               .sendKeys("April")
               .sendKeys(Keys.TAB)
               .sendKeys("2020")
               .sendKeys(Keys.TAB)
               .sendKeys(Keys.TAB)
               .sendKeys(Keys.TAB)
               .sendKeys(faker.name().firstName())
               .sendKeys(Keys.TAB)
               .sendKeys(faker.name().lastName())
               .sendKeys(Keys.TAB)
               .sendKeys(faker.company().name())
               .sendKeys(Keys.TAB)
               .sendKeys(faker.address().fullAddress())
               .sendKeys(Keys.TAB)
               .sendKeys(Keys.TAB)
               .sendKeys("India")
               .sendKeys(Keys.TAB)
               .sendKeys(faker.address().state())
               .sendKeys(Keys.TAB)
               .sendKeys(faker.address().city())
               .sendKeys(Keys.TAB)
               .sendKeys(faker.address().zipCode())
               .sendKeys(Keys.TAB)
               .sendKeys(faker.phoneNumber().cellPhone())
               .sendKeys(Keys.TAB).perform();

    }

    @Given("user Creaate Account butonuna tiklar")
    public void user_creaate_account_butonuna_tiklar() {
        autoPage.CreateAccount.click();
    }

    @Then("hesap olustugunu dogrular")
    public void hesap_olustugunu_dogrular() {
        Assert.assertTrue(autoPage.succesfully.isDisplayed());

    }


}
