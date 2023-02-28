package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GruuPage {
    public GruuPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(xpath = "//table[@class='dataTable']")
    public WebElement liste;
}
