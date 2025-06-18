package Ababill;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import javax.swing.*;

public class signUp {

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
        appiumOptions.put("appWaitActivity", "com.mosque.ababill.*");
        appiumOptions.put("appPackage", "com.mosque.ababill");
        appiumOptions.put("appActivity", "com.mosque.ababill.MainActivity");

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
                    AppiumBy.androidUIAutomator("new UiSelector().description(\"Next\")")));
            button0.click();
            Thread.sleep(1000);

            driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Next\")")).click();
            Thread.sleep(1000);

            driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Start\")")).click();
            Thread.sleep(1000);

            driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Sign Up\")")).click();
            Thread.sleep(2000);

            driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Choose Profile\")")).click();
            Thread.sleep(2000);

            driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Gallery\")")).click();
            Thread.sleep(2000);

            driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.google.android.providers.media.module:id/icon_thumbnail\").instance(0)")).click();
            Thread.sleep(2000);

            driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.mosque.ababill:id/menu_crop\")")).click();
            Thread.sleep(2000);

            WebElement button1 = wait.until(ExpectedConditions.elementToBeClickable(
                    AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)")));
            button1.click();
            button1.sendKeys("Username_01");
            driver.navigate().back();

            WebElement button2 = wait.until(ExpectedConditions.elementToBeClickable(
                    AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)")));
            button2.click();
            button2.sendKeys("Abu");
            driver.navigate().back();

            WebElement button3 = wait.until(ExpectedConditions.elementToBeClickable(
                    AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(2)")));
            button3.click();
            button3.sendKeys("Sufiyan");
            driver.navigate().back();

            WebElement button4 = wait.until(ExpectedConditions.elementToBeClickable(
                    AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(3)")));
            button4.click();
            button4.sendKeys("abu@gmail.com");
            driver.navigate().back();
            Thread.sleep(2000);


//            WebElement button5 = wait.until(ExpectedConditions.elementToBeClickable(
//                    AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(4)")));
//            button5.click();
//            Thread.sleep(1000);
//            button5.clear();
//            button5.sendKeys("9999999999");
//            driver.navigate().back();

            WebElement button5 = wait.until(ExpectedConditions.elementToBeClickable(
                    AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(4)")));
            button5.click();
            Thread.sleep(1000);
            // Use Appium's "mobile: type" command
            Map<String, Object> params = new HashMap<>();
            params.put("text", "9999999999");
            params.put("elementId", ((RemoteWebElement) button5).getId());
            driver.executeScript("mobile: type", params);
            Thread.sleep(2000);
            driver.navigate().back();// Close the keyboard

//            WebElement element = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(4)"));
//            Assert.assertTrue(element.isDisplayed(), "Element is not displayed");


//            WebElement key9 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(4)"));
//            Point point = key9.getLocation();
//            System.out.println("Key 9 coordinates: " + point.getX() + ", " + point.getY());

//            driver.findElement(AppiumBy.androidUIAutomator(
//                    "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(5).scrollForward();"));
//            Thread.sleep(2000);

            WebElement button6 = wait.until(ExpectedConditions.elementToBeClickable(
                    AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(29)")));
            button6.click();
            driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Male\")")).click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);

            WebElement button7 = wait.until(ExpectedConditions.elementToBeClickable(
                    AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(34)")));
            button7.click();
            Thread.sleep(1000);
            //driver.findElement(AppiumBy.accessibilityId("4, Monday, May 4, 2009")).click();
            driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"OK\")")).click();
            Thread.sleep(2000);
            driver.navigate().back();

//            driver.findElement(AppiumBy.androidUIAutomator(
//                    "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(1).scrollForward()"));
//            Thread.sleep(2000); // Let the scroll animation complete

            driver.findElement(AppiumBy.androidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true))" +
                            ".setMaxSearchSwipes(1).scrollToBeginning(1)")); // Scrolls slightly up
            driver.findElement(AppiumBy.androidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true))" +
                            ".setMaxSearchSwipes(1).scrollForward()"));
            Thread.sleep(2000);

            WebElement button8 = wait.until(ExpectedConditions.elementToBeClickable(
                    AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)")));
            button8.click();
            button8.clear();
            Thread.sleep(500);     // Small wait
            button8.click();  // Ensure it gets focus
            button8.sendKeys("Hotgi Road near Kumtha Naka, Ghanhi Road, Solapur");
            Thread.sleep(2000);
            driver.navigate().back();


            WebElement button10 = wait.until(ExpectedConditions.elementToBeClickable(
                    AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(34)")));
            button10.click();
            Thread.sleep(1000);
            driver.findElement(AppiumBy.accessibilityId("Maharashtra")).click();
            Thread.sleep(2000);
            driver.navigate().back();

//            WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));

            WebElement button11 = wait.until(ExpectedConditions.elementToBeClickable(
                    AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(39)")));
            button11.click();
//            WebElement webElement = driver.findElement(AppiumBy.androidUIAutomator(
//                    "new UiScrollable(new UiSelector().scrollable(true))" +
//                            ".scrollIntoView(new UiSelector().text(\"Pune\"))"));
//            webElement.click();
            driver.findElement(AppiumBy.androidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true))" +
                            ".setMaxSearchSwipes(1).scrollForward()"));
            Thread.sleep(2000);
            driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Pune\")")).click();
            Thread.sleep(2000);
            driver.navigate().back();

            WebElement button12 = wait.until(ExpectedConditions.elementToBeClickable(
                    AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(44)")));
            button12.click();
//            WebElement webElements = driver.findElement(AppiumBy.androidUIAutomator(
//                    "new UiScrollable(new UiSelector().scrollable(true))" +
//                            ".scrollIntoView(new UiSelector().text(\"VADGAON SHERI\"))"));
            driver.findElement(AppiumBy.androidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true))" +
                            ".setMaxSearchSwipes(1).scrollForward()"));
            Thread.sleep(2000);
            driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Vadgaon Sheri\")")).click();
            Thread.sleep(1000);
            driver.navigate().back();

//            driver.findElement(AppiumBy.androidUIAutomator(
//                    "new UiScrollable(new UiSelector().scrollable(true))" +
//                            ".setMaxSearchSwipes(1).scrollToBeginning(1)")); // Scrolls slightly up
            driver.findElement(AppiumBy.androidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true))" +
                            ".setMaxSearchSwipes(1).scrollForward()"));
            Thread.sleep(1000);

            WebElement button13 = wait.until(ExpectedConditions.elementToBeClickable(
                    AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\")")));
            button13.click();
            Thread.sleep(1000);
            // Use Appium's "mobile: type" command
            Map<String, Object> paramr = new HashMap<>();
            paramr.put("text", "783564");
            paramr.put("elementId", ((RemoteWebElement) button13).getId());
            driver.executeScript("mobile: type", paramr);
            Thread.sleep(2000);
            driver.navigate().back();// Close the keyboard

            WebElement button14 = wait.until(ExpectedConditions.elementToBeClickable(
                    AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(19)")));
            button14.click();
            driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Jama Masjid \")")).click();
            Thread.sleep(2000);
            driver.navigate().back();
            driver.findElement(AppiumBy.className("android.widget.ScrollView")).click();
            Thread.sleep(500);

            driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.CheckBox\").instance(1)")).click();
            driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.CheckBox\").instance(2)")).click();
            driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.CheckBox\").instance(3)")).click();
            driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.CheckBox\").instance(4)")).click();

            driver.findElement(AppiumBy.androidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true))" +
                            ".setMaxSearchSwipes(1).scrollForward()"));
            Thread.sleep(1000);

            WebElement button15 = wait.until(ExpectedConditions.elementToBeClickable(
                    AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(22)")));
            button15.click();
            driver.findElement(AppiumBy.accessibilityId("Unemployed")).click();
            WebElement button18 = wait.until(ExpectedConditions.elementToBeClickable(
                    AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(28)")));
            button18.click();
            driver.findElement(AppiumBy.accessibilityId("Bachelor's Degree")).click();
            Thread.sleep(1000);
            WebElement button20 = wait.until(ExpectedConditions.elementToBeClickable(
                    AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)")));
            button20.click();
            button20.sendKeys("Selenium");
            WebElement button21 = wait.until(ExpectedConditions.elementToBeClickable(
                    AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)")));
            button21.click();
            button21.sendKeys("Selenium");


            WebElement button16 = wait.until(ExpectedConditions.elementToBeClickable(
                    AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)")));
            button16.click();
            button16.sendKeys("Test@123");
            Thread.sleep(1000);


            WebElement button17 = wait.until(ExpectedConditions.elementToBeClickable(
                    AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)")));
            button17.click();
            button17.sendKeys("Test@123");
            Thread.sleep(1000);

            driver.findElement(AppiumBy.accessibilityId("Next")).click();
            Thread.sleep(2000);

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