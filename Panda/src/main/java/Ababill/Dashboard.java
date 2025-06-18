package Ababill;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dashboard {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://admin.pandavapor.shop/dashboard");
    }

    @Test
    public void loginTest() throws InterruptedException {
        Thread.sleep(2000);
        WebElement emailField = driver.findElement(By.xpath("//input[@name='email']"));
        emailField.click();
        emailField.sendKeys("admin@panda.shop");

        Thread.sleep(2000);
        WebElement passwordField = driver.findElement(By.xpath("//input[@type='password']"));
        passwordField.click();
        passwordField.sendKeys("789uio+()JKNM");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(3000);
        js.executeScript("window.scrollTo(0, 0)");

        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@style='pointer-events: none;' and text()='Dubai']")).click();
        Thread.sleep(2000);
        JavascriptExecutor ja = (JavascriptExecutor) driver;
        ja.executeScript("window.scrollBy(0,1000)");
        ja.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//main[@class='flex-1 p-6']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@aria-controls='radix-:r1:']")).click();
        Thread.sleep(2000);
    }


    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}