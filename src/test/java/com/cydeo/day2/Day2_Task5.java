package com.cydeo.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_Task5 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/registration_form");
        WebElement header = driver.findElement(By.tagName("h2"));
        String expectedHeader = "Registration form";
        String actualHeader = header.getText();
        if (actualHeader.equals(expectedHeader)){
            System.out.println("Header text is verified");
        }else{
            System.out.println("Header text is not verified");
        }
        WebElement firstNameBox = driver.findElement(By.name("firstname"));
        String expectedPlaceholderValue = "first name";
        String actualPlaceholderValue = firstNameBox.getAttribute("placeholder");
        if (actualPlaceholderValue.equals(expectedPlaceholderValue)){
            System.out.println("Placeholder value is verified");
        }else{
            System.out.println("Placeholder value is not verified!");
        }

        driver.close();




    }


}
