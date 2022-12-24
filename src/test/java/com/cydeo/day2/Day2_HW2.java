package com.cydeo.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_HW2 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");
        WebElement headerText = driver.findElement(By.tagName("h3"));
        String expectedHeaderText = "Log in to ZeroBank";
        String actualHeaderText = headerText.getText();
        if (actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Header text is verified!");
        }else{
            System.out.println("Header text is not verified!!!");
        }
        driver.close();



    }


}
/*
TC #2: Zero Bank header verification
1. Open Chrome browser
2. Go to http://zero.webappsecurity.com/login.html
3. Verify header text
Expected: “Log in to ZeroBank”
 */
