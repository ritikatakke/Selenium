package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.List;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 class dynamicWebTable {
    WebDriver driver;

    @Test
    public  void login() {

         driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable1.html");
        WebElement table = driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody"));
        List<WebElement> table_rows = table.findElements(By.tagName("tr"));

        for(int i=1; i<table_rows.size();i++){
            List<WebElement> table_columns = table_rows.get(i).findElements(By.tagName("td"));
            for(WebElement element : table_columns){
                System.out.println(element.getText());

            }
        }

    }
    @AfterTest
    public void tearDown(){
        driver.quit();

    }

}

