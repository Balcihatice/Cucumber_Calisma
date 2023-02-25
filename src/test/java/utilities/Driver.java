package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {
    //POM da Driver icin TestBase clasina extend etmek yerine
    // Drive classindan static metodlar kullanarak
    // Driver olusturup ilgili ayarlarin yapilmasi ve en sonda
    // Driverin kapatilmasi tercih edilmistir
    /*POM de Driver classindaki getDriver() nin obje olusturulasak kullanilmasini  engellemek icin
    Singleton pattern kullanimi benimsenmistir.
     Singleton pattern : Bir classin farkli classlardan obje olusturularak kullanilmasini
     engellemek icin kullanilir.herkes static methodu kullansin diye
     Bunu saglamak icin kullanilan constructori private yaptigimizda
     obje olusturmak icin kullanilan constructor`i private yaptiginizda baska
     classlar da Driver class`indan obje olusturulmasi mumkun olamaz.
     */
    public Driver() {

    }

    static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (ConfigReader.getProperty("browser")) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
            }
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}