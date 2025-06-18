package TestApps;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Flutter {

    private AppiumDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        HashMap<String, Object> appiumOptions = new HashMap<>();
        appiumOptions.put("deviceName", "Galaxy A31");
        appiumOptions.put("udid", "RZ8R12A64GP");
        appiumOptions.put("platformVersion", "12");
        appiumOptions.put("automationName", "UiAutomator2");
        appiumOptions.put("appWaitActivity", "co.banano.natriumwallet.*");
        appiumOptions.put("appPackage", "co.banano.natriumwallet");
        appiumOptions.put("appActivity", "co.banano.natriumwallet.MainActivity");

        cap.setCapability("appium:options", appiumOptions);
        cap.setCapability("platformName", "Android");

        URL url = new URL("http://127.0.0.1:4723/");
        driver = new AndroidDriver(url, cap);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void flute() throws InterruptedException {
        try {

            WebElement button0 = wait.until(ExpectedConditions.elementToBeClickable(
                    AppiumBy.androidUIAutomator("new UiSelector().description(\"New Wallet\")")));
            button0.click();
            Thread.sleep(2000);

            driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Yes\")")).click();
            Thread.sleep(2000);

            WebElement button1 = wait.until(ExpectedConditions.elementToBeClickable(
                    AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)")));
            button1.click();
            button1.sendKeys("Abu@9021");
            Thread.sleep(2000);

            WebElement button2 = wait.until(ExpectedConditions.elementToBeClickable(
                    AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)")));
            button2.click();
            button2.sendKeys("Abu@9021");
            Thread.sleep(2000);


            driver.navigate().back();
            Thread.sleep(2000);

            driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Next\")")).click();
            Thread.sleep(2000);

            driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Got It!\")")).click();
            Thread.sleep(2000);

            driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Copy\")")).click();
            Thread.sleep(2000);

            driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"I've Backed It Up\")")).click();
            Thread.sleep(2000);

            driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"YES\")")).click();
            Thread.sleep(2000);

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("1"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("2"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("3"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("4"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("5"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("6"))).click();
            Thread.sleep(1000);

            WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));

            waits.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("1"))).click();
            waits.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("2"))).click();
            waits.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("3"))).click();
            waits.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("4"))).click();
            waits.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("5"))).click();
            waits.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("6"))).click();

            driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Receive\")")).click();
            Thread.sleep(2000);

            driver.navigate().back();
            Thread.sleep(2000);

            driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.Button\").instance(0)")).click();
            Thread.sleep(2000);
            driver.navigate().back();

            driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.Button\").instance(0)")).click();
            Thread.sleep(2000);
            driver.findElement(AppiumBy.androidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(5).scrollForward();"));
            Thread.sleep(2000);
            driver.findElement(AppiumBy.androidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(5).scrollBackward();"));
            Thread.sleep(2000);

            driver.findElement(AppiumBy.androidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(5).scrollBackward();"));
            Thread.sleep(2000);
            driver.findElement(AppiumBy.accessibilityId("Theme\nNatrium")).click();
            WebElement indiumElement = wait.until(
                    ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().description(\"Indium\")")));
            indiumElement.click();
            Thread.sleep(2000);

            driver.findElement(AppiumBy.androidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(5).scrollBackward();"));
            driver.findElement(AppiumBy.accessibilityId("Change Currency\n$ US Dollar")).click();
            WebElement YuanElement = wait.until(ExpectedConditions.elementToBeClickable(
                    AppiumBy.androidUIAutomator("new UiSelector().description(\"¥ Chinese Yuan\")")));
            YuanElement.click();
            Thread.sleep(2000);

            driver.findElement(AppiumBy.androidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(5).scrollBackward();"));
            driver.findElement(AppiumBy.accessibilityId("Security")).click();
            WebElement Element1 = wait.until(ExpectedConditions.elementToBeClickable(
                    AppiumBy.accessibilityId("Authentication Method\nBiometrics")));
            Element1.click();
            driver.navigate().back();
            WebElement Element2 = wait.until(ExpectedConditions.elementToBeClickable(
                    AppiumBy.accessibilityId("Automatically Lock\nAfter 1 minute")));
            Element2.click();
            driver.navigate().back();
            WebElement Element3 = wait.until(ExpectedConditions.elementToBeClickable(
                    AppiumBy.accessibilityId("Disable Wallet Password")));
            Element3.click();
            driver.navigate().back();
            driver.navigate().back();

            driver.findElement(AppiumBy.accessibilityId("Notifications\nOn")).click();
            Thread.sleep(2000);
            driver.findElement(AppiumBy.accessibilityId("On")).click();
            driver.findElement(AppiumBy.accessibilityId("Notifications\nOn")).click();
            Thread.sleep(2000);
            driver.findElement(AppiumBy.accessibilityId("Off")).click();

            driver.findElement(AppiumBy.accessibilityId("Natricon\nOn")).click();
            Thread.sleep(2000);
            driver.findElement(AppiumBy.accessibilityId("Off")).click();
            driver.findElement(AppiumBy.accessibilityId("Natricon\nOn")).click();
            Thread.sleep(2000);
            driver.findElement(AppiumBy.accessibilityId("On")).click();

            driver.findElement(AppiumBy.accessibilityId("Block Explorer\nspynano.org")).click();
            Thread.sleep(2000);
            driver.findElement(AppiumBy.accessibilityId("nano.community")).click();
            Thread.sleep(2000);

            System.out.println("Application started successfully.");
        } catch (Exception e) {
            System.out.println("Error encountered: " + e.getMessage());

        }
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("Driver closed successfully.");
        }
    }
}