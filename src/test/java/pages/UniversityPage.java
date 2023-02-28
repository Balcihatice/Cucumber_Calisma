package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UniversityPage {

    public UniversityPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Login Portal']")
    public WebElement loginPortal;
    @FindBy(xpath = "//input[@type='text']")
    public WebElement userName;
    @FindBy(xpath = "//*[@id='password']")
    public WebElement passwordd;
    @FindBy(xpath = "//button[@id='login-button']")
    public WebElement loginButton;
    @FindBy(xpath = "")
    public WebElement popup;

}
