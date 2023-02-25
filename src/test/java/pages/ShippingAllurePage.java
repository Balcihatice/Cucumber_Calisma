package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ShippingAllurePage {

    public ShippingAllurePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@class='login inline-type']")
    public WebElement singIn;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement allure2UserName;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement allure2Password;

    @FindBy(xpath = "(//*[text()='Sign In'])[2]")
    public WebElement signInGiris;

    @FindBy(xpath = "//*[@id='menu-item-1074']")
    public WebElement myAccound;

    @FindBy(xpath = "//*[@class='icon-box-icon icon-addresses']")
    public WebElement addresses;

    @FindBy(xpath = "(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[2]")
    public WebElement shippingAdd;

    @FindBy(xpath = "//input[@id='shipping_first_name']")
    public WebElement shippingFirstName;

    @FindBy(xpath = "//input[@id='shipping_last_name']")
    public WebElement shippingLastName;

    @FindBy(xpath = "//select[@id='shipping_country']")
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
