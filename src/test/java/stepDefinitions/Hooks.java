package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;


public class Hooks {
    /*
    cucumber da extends testbase dememize gerek kalmadan stepdefinition icinde
     before ve after bit notasyon varsa her senaryodan once ve sonra calisacaktir,
    Bu bizim istedigimiz bir sey degildir
    @before ve @after `i Hooks clasi icine koyariz
    Biz her senaryodan sonra test sonucu failed olan senaryio lar icin ScreekShot almasi
    amaciyla @after methodu kullananacagiz
     */


    //scenario failed olunca devreye girecek
    @After
    public void tearDown(Scenario scenario) {
        final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png","screenshots");
        }
        Driver.closeDriver();
    }
}
