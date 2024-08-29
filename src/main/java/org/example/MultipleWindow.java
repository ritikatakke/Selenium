package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleWindow {

    WebDriver driver;

    @BeforeTest
    public void getDriver(){

        driver = new FirefoxDriver();
    }
    @Test
    public void login() throws InterruptedException {


        driver.get("https://app.vwo.com");
        WebElement user = driver.findElement(By.name("username"));
        user.sendKeys("Ritika.test.com");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Riha@1234");
        driver.findElement(By.id("js-login-btn")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//a[@data-qa='siluyugiji']")).click();

    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}



