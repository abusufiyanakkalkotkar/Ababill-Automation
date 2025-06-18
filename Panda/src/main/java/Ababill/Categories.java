package Ababill;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Categories {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://admin.pandavapor.shop/dashboard");
    }

    @Test
    public void loginTest() throws InterruptedException {
        Thread.sleep(1000);
        WebElement emailField = driver.findElement(By.xpath("//input[@name='email']"));
        emailField.click();
        emailField.sendKeys("admin@panda.shop");

        Thread.sleep(1000);
        WebElement passwordField = driver.findElement(By.xpath("//input[@type='password']"));
        passwordField.click();
        passwordField.sendKeys("789uio+()JKNM");

        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Categories']")).click();

        Thread.sleep(1000);
        WebElement aa = driver.findElement(By.xpath("//button[@value='on'][1]"));
        aa.click();

        Thread.sleep(2000);
        WebElement sd = driver.findElement(By.xpath("//button[@aria-haspopup='menu']"));
        sd.click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@role='menuitem']")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Delete']")).click();


    }


    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}