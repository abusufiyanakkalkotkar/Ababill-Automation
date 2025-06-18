package Ababill;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Amazon {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void test1() throws InterruptedException {
        driver.get("https://www.amazon.in/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='nav-line-2 ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("9021598876");
        Thread.sleep(2000);
        driver.findElement(By.id("continue")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000);
        String str = JOptionPane.showInputDialog("Enter verification code");
        WebElement element = driver.findElement(By.xpath("//input[@type='text']"));
        element.sendKeys(str);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@aria-label='Verify OTP Button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='hm-icon-label' and text()='All']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='hmenu-item' and text()='Best Sellers']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='p13n-sc-truncate-desktop-type2  p13n-sc-truncated'])[01]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='a-button-text' and text()=' Add to Cart ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='hm-icon-label' and text()='All']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='hmenu-item' and text()='Sign Out']")).click();
        Thread.sleep(2000);
        driver.close();
    }
    @Test
    public void test2() throws InterruptedException {
        driver.get("https://www.amazon.in/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='nav-line-2 ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("9021598876");
        Thread.sleep(2000);
        driver.findElement(By.id("continue")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000);
        String str = JOptionPane.showInputDialog("Enter verification code");
        WebElement element = driver.findElement(By.xpath("//input[@type='text']"));
        element.sendKeys(str);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@aria-label='Verify OTP Button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='hm-icon-label' and text()='All']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='hmenu-item' and text()='Best Sellers']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='p13n-sc-truncate-desktop-type2  p13n-sc-truncated'])[01]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='a-button-text a-text-center' and text()= ' Go to Cart ' ]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@value='Delete'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='hm-icon-label' and text()='All']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='hmenu-item' and text()='Sign Out']")).click();
        Thread.sleep(2000);
    }
    @AfterClass
    public void after() {
        driver.quit();
    }
}
