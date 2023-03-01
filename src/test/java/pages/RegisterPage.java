package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage {

    public RegisterPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[text()='Register']")
    public WebElement register;

    @FindBy(xpath = "//a[text()='Sign Up']")
    public WebElement signUp;
    @FindBy(xpath = "(//a[text()='Become a Vendor'])[1]")
    public WebElement vendor;

    @FindBy(xpath = "//input[@value='Re-send Code']")
    public WebElement reSendCode;

    @FindBy(xpath = "//input[@id='user_email']")
    public WebElement emailIlk;

    @FindBy(xpath = "//input[@placeholder='Verification Code']")
    public WebElement codeText;
    @FindBy(xpath = "//div[@class='wcfm-message email_verification_message wcfm-success']")
    public WebElement verificationCodeText;

    @FindBy(xpath = "//input[@id='passoword']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='confirm_pwd']")
    public WebElement confirmPassword;

    @FindBy(xpath = "//input[@class='wcfm_submit_button']")
    public WebElement registerB;
    @FindBy(xpath = "//a[text()=\"Let's go!\"]")
    public WebElement lestGo;

    //Store setup sayfasi

    @FindBy(xpath = "//input[@id='store_email']")
    public WebElement storeEmail;
    @FindBy(xpath = "//select[@id='country']")
    public WebElement country;

    @FindBy(xpath = "//input[@id='state']")
    public WebElement storeState;

    //Store sayfasindaki continue
    @FindBy(xpath = "//input[@value='Continue']")
    public WebElement continueButon;

    @FindBy(xpath = "//input[@id='paypal']")
    public WebElement paypalEmail;
    @FindBy(xpath = "//input[@value='Continue']")
    public WebElement paymentContinue;

    //SupportSetup sayfasi
    @FindBy(xpath = "//input[@id='vendor_customer_phone']")
    public WebElement phone;
    @FindBy(xpath = "//input[@value='Continue']")
    public WebElement supportEmail;

    @FindBy(xpath = "//input[@value='Continue']")
    public WebElement storeContinue;

    //SEO setup sayfasi

    @FindBy(xpath = "//input[@id='wcfmmp-seo-meta-title']")
    public WebElement seoTitle;
    @FindBy(xpath = "//input[@id='wcfmmp-seo-og-title']")
    public WebElement facebook;
    @FindBy(xpath = "//input[@id='wcfmmp-seo-twitter-title']")
    public WebElement twitter;

    @FindBy(xpath = "//p//input[@type='submit']")
    public WebElement seoContinue;

    //Social setup sayfasi

    @FindBy(xpath = "//input[@id='twitter']")
    public WebElement socialTwitter;

    @FindBy(xpath = "//input[@id='facebook']")
    public WebElement socialFacebook;

    @FindBy(xpath = "//input[@name='save_step']")
    public WebElement socialContinue;

    @FindBy(xpath = "//h1[.='We are done!']")
    public WebElement done;

    @FindBy(xpath = "//a[text()=\"Let's go to the Dashboard\"]")
    public WebElement letsGoDashboard;
    @FindBy(xpath = "//h2[text()='Store Manager']")
    public WebElement storeManager;

}
