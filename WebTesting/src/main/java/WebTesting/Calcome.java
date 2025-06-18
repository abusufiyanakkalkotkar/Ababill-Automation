package WebTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashSet;

public class Calcome {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void testCalComLogin() throws InterruptedException {
        driver.get("https://cal.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='mr-4 hidden text-sm font-medium lg:flex opacity-100']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='text-brand-500 font-medium']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='visible group-active:translate-y-[0.5px]' and text()='Continue with email']")).click();
        Thread.sleep(2000);

        WebElement username = driver.findElement(By.xpath("//input[@placeholder='username']"));
        username.sendKeys("abzmobz");
        Thread.sleep(2000);

        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("abusufiyan.akkalkotkar03@gmail.com");
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        WebElement password = driver.findElement(By.id(":r2:"));
        password.sendKeys("XCeRqAMTQ5d4%5");
        Thread.sleep(2000);

        driver.findElement(By.id("radix-:r4:")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
    }
    @Test
    public void Test2() throws InterruptedException {
        Thread.sleep(2000);
        driver.get("https://app.cal.com/event-types");
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("abusufiyan.akkalkotkar03@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("XCeRqAMTQ5d4%5");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[@data-testid='bookings-test']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@data-testid='availability-test']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@data-testid='teams-test']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@data-testid='apps-test']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@data-testid='routing-test']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@data-testid='workflows-test']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='visible group-active:translate-y-[0.5px]' and text()='New']")).click();
        Thread.sleep(3000);
        WebElement hj =driver.findElement(By.xpath("//input[@type='text']"));
        hj.sendKeys("Abusufiyan");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='text-emphasis css-n9qnu9']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("radix-:rp:")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='visible group-active:translate-y-[0.5px]'and text()='Save']")).click();
        Thread.sleep(2000);
        //driver.findElement(By.className("partner name is different from child name is absorbed"));

    }
    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
