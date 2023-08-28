package keywords;

import com.aventstack.extentreports.Status;
import driver.DriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import reports.ExtentTestManager;
import utils.LogUtils;

import java.time.Duration;
import java.util.List;

public class WebUI {
    private static Actions action;
    private static WebElement element;
    private static Select select;
    private static int EXPLICIT_WAIT_TIMEOUT = 10;
    public static void sleep (double seconds) {
        try {
            Thread.sleep((long) (1000*seconds));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public static void waitForElementVisible ( By by){
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(EXPLICIT_WAIT_TIMEOUT));
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        } catch (Throwable error){
            Assert.fail("Timeout waiting for element visible " + by.toString());
            System.out.println("Timeout waiting for element visible " + by.toString());
        }
    }

    public static void waitForElementPresent ( By by){
        try {
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(EXPLICIT_WAIT_TIMEOUT));
            wait.until(ExpectedConditions.presenceOfElementLocated(by));
        } catch (Throwable error){
            Assert.fail("Element not exists " + by.toString());
            System.out.println("Element not exists " + by.toString());
        }
    }

    public static void waitForElementClickable (By by){
        try {
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(EXPLICIT_WAIT_TIMEOUT));
            wait.until(ExpectedConditions.elementToBeClickable(by));
        }catch(Throwable error){
            Assert.fail("Timeout waiting for the element ready to click. " + by.toString());
            System.out.println("Timeout waiting for the element ready to click. " + by.toString());
        }
    }

    public static Boolean checkElementExist(String xpath) {
        List<WebElement> listElement = DriverManager.getDriver().findElements(By.xpath(xpath));

        if (listElement.size() > 0) {
            System.out.println("Element " + xpath + " existing.");
            return true;
        } else {
            System.out.println("Element " + xpath + " NOT exist.");
            return false;
        }
    }

    public static void waitForPageLoaded() {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(20), Duration.ofMillis(500));
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();

        // wait for Javascript to loaded
        ExpectedCondition<Boolean> jsLoad = driver -> ((JavascriptExecutor) DriverManager.getDriver()).executeScript("return document.readyState")
                .toString().equals("complete");

        //Get JS is Ready
        boolean jsReady = js.executeScript("return document.readyState").toString().equals("complete");

        //Wait Javascript until it is Ready!
        if (!jsReady) {
            System.out.println("Javascript in NOT Ready!");
            //Wait for Javascript to load
            try {
                wait.until(jsLoad);
            } catch (Throwable error) {
                error.printStackTrace();
                Assert.fail("Timeout waiting for page load (Javascript). (" + 20 + "s)");
            }
        }
    }

    public static WebElement findElement(By by){
        return DriverManager.getDriver().findElement(by);
    }

    public static void openURL (String URL) {
        DriverManager.getDriver().get(URL);
        waitForPageLoaded();
    }
    public static String getCurrentURL(){
        return DriverManager.getDriver().getCurrentUrl();
    }
    public static void clickToElement ( By by){
        waitForElementVisible(by);
        findElement( by).click();
    }
    public static void sendKeyToElement (By by, String value){
        findElement(by).sendKeys(value);
    }
    public static String getTextElement(By by){
        return findElement(by).getText();
    }
    public static void acceptAlert (){
        WebUI.sleep(2);
        DriverManager.getDriver().switchTo().alert().accept();
    }
    public static void hoverMouseToElement(By by){
        action = new Actions (DriverManager.getDriver());
        element = findElement(by);
        action.moveToElement(element).build().perform();
    }
    public static void selectItemInHTML(By by, String value){
        element = findElement(by);
        select = new Select(element);
        select.selectByVisibleText(value);
    }
    public static void selectItemInCustomDropdown(By parentXpath, By listOptions, String expectedText){
        findElement(parentXpath).click();
        List<WebElement> allItems = DriverManager.getDriver().findElements(listOptions);
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(EXPLICIT_WAIT_TIMEOUT));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(listOptions));
        for (WebElement item : allItems){
            System.out.println("List dropdown: " + item.getText());
            if(item.getText().equals(expectedText)){
                item.click();
                break;
            }
        }

    }
    public static void getFirstItemInHTML(By by){
        element = findElement( by);
        select = new Select(element);
        select.getFirstSelectedOption();
    }

    public static String getAttribute( By by, String attribute){
        return findElement(by).getAttribute(attribute);
    }

    public static void checkTheCheckbox(By by){
        element = findElement( by);
        if(!element.isSelected()){
            element.click();
        }
    }
    public static void scrollToElementWithJS( By by){
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", findElement( by));
    }
    public static boolean isDisplayed(By by){
        waitForPageLoaded();
        sleep(1);
        return findElement(by).isDisplayed();
    }
    public static void sendKeyEnter (By by, String value){
        findElement(by).sendKeys(value, Keys.ENTER);
    }

    public static boolean dragAndDrop(By fromElement, By toElement){
        try{
            action = new Actions(DriverManager.getDriver());
            action.dragAndDrop(findElement(fromElement), findElement(toElement)).build().perform();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }


}