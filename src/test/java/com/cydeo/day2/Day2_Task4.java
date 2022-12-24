package com.cydeo.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_Task4 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://library2.cybertekschool.com/login.html");
        WebElement usernameBox = driver.findElement(By.className("form-control"));
        usernameBox.sendKeys("incorrect@email.com");
        WebElement passwordBox = driver.findElement(By.id("inputPassword"));
        passwordBox.sendKeys("incorrect password");
        WebElement signInButton = driver.findElement(By.tagName("button"));
        signInButton.click();



    }


}
