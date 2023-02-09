package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoPage {

    public AutoPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
@FindBy(xpath = "//*[text()=' Signup / Login']")
    public WebElement signup;

@FindBy(xpath = "//input[@data-qa='signup-name']")
    public WebElement nameN;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement email;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement signUp;

    @FindBy(xpath = "//input[@id='id_gender1']")
    public WebElement female;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='company']")
    public WebElement company;

    @FindBy(xpath = "//select[@id='country']")
    public WebElement country;

    @FindBy(xpath = "//input[@id='state']")
    public WebElement state;

    @FindBy(xpath = "//input[@id='mobile_number']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//button[text()='Create Account']")
    public WebElement CreateAccount;
    @FindBy(xpath = "//*[text()='Congratulations! Your new account has been successfully created!']")
    public WebElement succesfully;


}
