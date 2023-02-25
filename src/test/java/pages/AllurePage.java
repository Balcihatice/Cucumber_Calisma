package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AllurePage {
    public AllurePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='login inline-type']")
    public WebElement singIn;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement allure2UserName;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement allure2Password;

    @FindBy(xpath = "//button[text()='Sign In']")
    public WebElement signInGiris;


    @FindBy(xpath = "//li[@id='menu-item-1074']")
    public WebElement myAccound;

    @FindBy(xpath = "//*[text()='Addresses']")
    public WebElement addresses;

    @FindBy(xpath = "//a[@class='edit btn btn-link btn-primary btn-underline mb-4']")
    public WebElement addButonu;


    @FindBy(xpath = "//*[@name='billing_first_name']")
    public WebElement firstName;

    @FindBy(xpath = "//*[@name='billing_last_name']")
    public WebElement lastName;

    @FindBy(xpath = "//select[@id='billing_country']")
    public WebElement country;

    @FindBy(xpath = "//*[@id='billing_address_1']")
    public WebElement street;

    @FindBy(xpath = "//input[@id='billing_city']")
    public WebElement town_city;

    @FindBy(xpath = "//select[@id='billing_state']")
    public WebElement province;

    @FindBy(xpath = "//*[@id='billing_postcode']")
    public WebElement zipCode;

    @FindBy(xpath = "//*[@id='billing_phone']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//button[text()='Save address']")
    public WebElement saveAddress;
    @FindBy(xpath = "//*[@class='login inline-type']")
    public WebElement shippingSingIn;

    //shipping kismi
    @FindBy(xpath = "//*[@id='username']")
    public WebElement shippingName;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement shippingPassword;

    @FindBy(xpath = "(//*[text()='Sign In'])[2]")
    public WebElement shippingSignInGiris;

    @FindBy(xpath = "//*[@id='menu-item-1074']")
    public WebElement shippingMyAccound;

    @FindBy(xpath = "//*[@class='icon-box-icon icon-addresses']")
    public WebElement shippingAddresses;

    @FindBy(xpath = "(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[2]")
    public WebElement shippingAdd;

    @FindBy(xpath = "//input[@id='shipping_first_name']")
    public WebElement shippingFirstName;

    @FindBy(xpath = "//input[@id='shipping_last_name']")
    public WebElement shippingLastName;

    @FindBy(xpath = "//span[@id='select2-shipping_country-container']")
    public WebElement shippingCountry;

    @FindBy(xpath = "//input[@id='shipping_address_1']")
    public WebElement shippingSetreet;

    @FindBy(xpath = "//input[@id='shipping_postcode']")
    public WebElement shippingZipCode;

    @FindBy(xpath = "//input[@id='shipping_city']")
    public WebElement shippingTownCity;

    @FindBy(xpath = "//*[@id='shipping_state']")
    public WebElement shippingState;


    @FindBy(xpath = "//button[text()='Save address']")
    public WebElement shippingSaveAddresses;
}





