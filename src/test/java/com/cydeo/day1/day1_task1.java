package com.cydeo.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day1_task1 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.yahoo.com");
        String expectedTitle = "Yahoo";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verified");
        }else{
            System.out.println("Title was NOT verified");
        }
        driver.close();

    }


}
