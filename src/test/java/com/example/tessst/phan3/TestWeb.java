//package com.example.tessst.phan3;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class TestWeb {
//    private WebDriver driver;
//
//    @BeforeEach
//    public void setUp() {
//        WebDriverManager.chromedriver().clearDriverCache().setup();
//
//        driver = new ChromeDriver();
//    }
//
//    @Test
//    public void testThemVaoGioHang() throws InterruptedException {
//        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
//        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//        Thread.sleep(2000);
//        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/SignIn.html");
//        driver.findElement(By.id("usr")).sendKeys("sa");
//        driver.findElement(By.id("pwd")).sendKeys("sa");
//        driver.findElement(By.xpath("//input[@value='Login']")).click();
//
//      Assertions.assertTrue(driver.getTitle().contains("Ace Online Shoe Portal"));
//
//    }
//
//
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
