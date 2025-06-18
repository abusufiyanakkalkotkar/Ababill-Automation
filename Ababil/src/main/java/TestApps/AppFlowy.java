package TestApps;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
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

public class AppFlowy {

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
        appiumOptions.put("appWaitActivity", "com.thealphamerc.flutter_ecommerce_app.*");
        appiumOptions.put("appPackage", "com.thealphamerc.flutter_ecommerce_app");
        appiumOptions.put("appActivity", "com.thealphamerc.flutter_ecommerce_app.MainActivity");

        cap.setCapability("appium:options", appiumOptions);
        cap.setCapability("platformName", "Android");

        URL url = new URL("http://127.0.0.1:4723/");
        driver = new AndroidDriver(url, cap);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void userLoginAndSignup() {
        try {

            driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(13)")).click();
            Thread.sleep(2000);

            driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(14)")).click();
            Thread.sleep(2000);

            WebElement button1 = wait.until(ExpectedConditions.elementToBeClickable(
                    AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(13)")));
            button1.click();
            Thread.sleep(2000);

            WebElement button = wait.until(ExpectedConditions.elementToBeClickable(
                    AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.Button\").instance(6)")));
            button.click();
            Thread.sleep(2000);

            driver.findElement(AppiumBy.androidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(5).scrollForward();"));
            Thread.sleep(2000);

            driver.findElement(AppiumBy.androidUIAutomator(
                    "new UiSelector().className(\"android.widget.Button\").instance(1)")).click();
            Thread.sleep(2000);


            driver.findElement(AppiumBy.androidUIAutomator(
                    "new UiSelector().className(\"android.widget.Button\").instance(0)")).click();
            Thread.sleep(2000);


            WebElement button4 = wait.until(ExpectedConditions.elementToBeClickable(
                    AppiumBy.className("android.widget.EditText")));
            //button4.click();
            button4.sendKeys("Watch");
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

