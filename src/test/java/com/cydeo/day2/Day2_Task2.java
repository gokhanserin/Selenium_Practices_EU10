package com.cydeo.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_Task2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com");
        Thread.sleep(3000);

        WebElement abTesting = driver.findElement(By.linkText("A/B Testing"));
        abTesting.click();
        Thread.sleep(3000);

        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification Passed!");
        }else{
            System.out.println("Title verification Failed!");
        }
        driver.navigate().back();

        expectedTitle = "Practice";
        actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification Passed!");
        }else{
            System.out.println("Title verification Failed!");
        }





    }


}
