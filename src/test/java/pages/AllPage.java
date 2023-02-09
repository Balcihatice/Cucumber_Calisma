package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AllPage {

    public AllPage() {
        PageFactory.initElements(Driver.getDriver(), this);
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

    @FindBy(xpath = "//*[text()='Wrong username or password.']")
    public WebElement allWrongPassword;

}
