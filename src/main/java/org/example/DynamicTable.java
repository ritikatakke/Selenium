package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class DynamicTable {
WebDriver driver;
@BeforeTest
public void getDriver(){
    driver = new ChromeDriver();
}
    @Test
    public void login() {


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



