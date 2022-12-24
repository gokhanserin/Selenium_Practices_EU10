package com.cydeo.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_Task3 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        Thread.sleep(3000);
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("apple" + Keys.ENTER);

        String expectedTitleStartsWith = "apple";
        String actualTitle = driver.getTitle();
        if (actualTitle.startsWith(expectedTitleStartsWith)){
            System.out.println("Title starts with apple");
        }else{
            System.out.println("Title does not start with apple");
        }



    }


}
