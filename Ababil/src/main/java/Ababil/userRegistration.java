package Ababil;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class userRegistration {

    private AppiumDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        HashMap<String, Object> appiumOptions = new HashMap<>();
        appiumOptions.put("deviceName", "Galaxy A31");
        appiumOptions.put("udid", "RZ8R12A64GP");
        appiumOptions.put("platformVersion", "12");
        appiumOptions.put("automationName", "UiAutomator2");
        appiumOptions.put("appWaitActivity", "com.mosque.ababill.*");
        appiumOptions.put("appPackage", "com.mosque.ababill");
        appiumOptions.put("appActivity", "com.mosque.ababill.MainActivity");


        cap.setCapability("appium:options", appiumOptions);
        cap.setCapability("platformName", "Android");

        URL url = new URL("http://127.0.0.1:4723/");
        driver = new AndroidDriver(url, cap);

    }

    @Test
    public void UserLoginandSignup() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        ((AndroidDriver) driver).findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().className(\"android.widget.Button\"))"));
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.Button\").instance(1)")).click();
        Thread.sleep(2000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.Button\").instance(1)")).click();
        Thread.sleep(2000);
        driver.findElement(AppiumBy.accessibilityId("Let's Go!")).click();
        Thread.sleep(2000);
        System.out.println("Application started successfully.");


        WebElement aa = wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)")));
        aa.click();
        aa.sendKeys("John@123");
        Thread.sleep(2000);

        WebElement bb = wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)")));
        bb.click();
        bb.sendKeys("John");
        Thread.sleep(2000);

        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(5).scrollForward();"));
        Thread.sleep(2000);

        ((AndroidDriver) driver).findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().className(\"android.widget.Button\"))"));

        WebElement cc = wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(2)")));
        cc.click();
        cc.sendKeys("Marston");
        Thread.sleep(2000);

        WebElement dd = wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(3)")));
        dd.click();
        dd.sendKeys("abusufiyan.akkalkotkar03@gmail.com");
        Thread.sleep(2000);

        WebElement ee = wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(4)")));
        ee.click();
        ee.sendKeys("9021598876");
        Thread.sleep(2000);


        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(5).scrollForward();"));
        Thread.sleep(2000);



        WebElement ff = wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(4)")));
        ff.click();
        ff.sendKeys("9021598876");
        Thread.sleep(2000);
    }
//    @AfterClass
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}
