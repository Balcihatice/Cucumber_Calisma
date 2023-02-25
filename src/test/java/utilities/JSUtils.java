package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.Arrays;

public class JSUtils {

    //This method will takes two parameter: WebElement, and WebDriver
    //When you pass the element, JS will click on that element
    //    JSUtils.clickElementByJS(driver.findElement(By.id("submit-button")));
    public static void clickElementByJS(WebElement element) {
        JavascriptExecutor jsexecutor = ((JavascriptExecutor) Driver.getDriver());
        jsexecutor.executeScript("arguments[0].click();", element);
    }

    //to get the page title with JS
    public static String getTitleByJS() {
        JavascriptExecutor jsexecutor = ((JavascriptExecutor) Driver.getDriver());
        String title = jsexecutor.executeScript("return document.title;").toString();
        return title;
    }

    //Scrolling all the way down
    public static void scrollDownByJS() {
        JavascriptExecutor jsexecutor = ((JavascriptExecutor) Driver.getDriver());
        jsexecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    //    Scroll al the way up of a page
    public static void scrollAllUpByJS(){
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
    }

    //Scroll into view with JS. THIS IS VERY USEFULL <3 <3 <3
    //    JSUtils.scrollIntoViewJS(driver.findElement(By.id("submit-button")));
    public static void scrollIntoViewJS(WebElement element) {
        JavascriptExecutor jsexecutor = ((JavascriptExecutor) Driver.getDriver());
        jsexecutor.executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public static void changeColor(String color, WebElement element) {
        JavascriptExecutor javascriptExecutor = ((JavascriptExecutor) Driver.getDriver());
        javascriptExecutor.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //Flashing the background color
    public static void flash(WebElement element) {
        String bgColor = element.getCssValue("backgroundcolor");
        for (int i = 0; i < 10; i++) {
            changeColor("rgb(0,200,0", element);
            changeColor(bgColor, element);
        }
    }

    //this will generate an alert when needed
    public static void generateAlert(String message) throws InterruptedException {
        JavascriptExecutor javascriptExecutor = ((JavascriptExecutor) Driver.getDriver());
        javascriptExecutor.executeScript("alert('" + message + "')");
        Thread.sleep(3000);
    }

    /*
     * executes the given JavaScript command on given web element
     */
    public static void executeJScommand(WebElement element, String command) {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript(command, element);
    }

    /*
     * executes the given JavaScript command on given web element
     */
    public static void executeJScommand(String command) {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript(command);
    }

    //    Set the value of an input using js executor. Params: WebElement element, String text
    //    This method changes the value attribute of an element.
    //    It changes the input text
    public static void setValueByJS(WebElement element, String text){
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("arguments[0].setAttribute('value','"+text+"')",element);
    }

    //    get the value of an input. param: idOfElement
    public static void getValueByJS(String idOfElement){
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        String value=js.executeScript("return document.getElementById('"+idOfElement+"').value").toString();
        System.out.println(value);
//        How you get get the value of an input box?
//        We can js executor.
//        How?
//        I can get the element using js executor, and get teh value of the element.
//        For example, I can get the element by id, and use value attribute to get the value of in an input
//        I have to do this, cause getText in this case does not return teh text in an input
    }

    public static void addBorderWithJS(WebElement element, String borderStyle){
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("arguments[0].style.border='"+borderStyle+"'",element);
    }
    public static boolean isElementPresent(WebElement element) {
        boolean flag = false;
        try {
            if (element.isDisplayed()
                    || element.isEnabled())
                flag = true;
        } catch (org.openqa.selenium.NoSuchElementException | StaleElementReferenceException e) {
            flag = false;
        }
        return flag;
    }
    public static void mouseHoverJScript(WebElement HoverElement) {
        try {
            if (isElementPresent(HoverElement)) {
                String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover', true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
                ((JavascriptExecutor) Driver.getDriver()).executeScript(mouseOverScript, HoverElement);
            } else {
                System.out.println("Element was not visible to hover " + "\n");
            }

        } catch (StaleElementReferenceException e) {
            System.out.println("Element with " + HoverElement
                    + "is not attached to the page document"
                    + Arrays.toString(e.getStackTrace()));
        }
    }
    public static String get1ValueByJS(String idOfElement) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        String text = js.executeScript("return document.getElementById('" + idOfElement + "').value").toString();
        return text;

    }
}
