package com.cydeo.day4;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day4_Task3 {

    public static void main(String[] args) {

        //TC #6:  XPATH LOCATOR practice
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to http://practice.cydeo.com/multiple_buttons
        driver.get("http://practice.cydeo.com/multiple_buttons");

        //3. Click on Button 1
        WebElement button1 = driver.findElement(By.xpath("//*[@onclick='button1()']"));
        button1.click();

        //4. Verify text displayed is as expected:
        //Expected: “Clicked on button one!”
        WebElement button1Text = driver.findElement(By.xpath("//p[@id='result']"));
        String actualButton1Text = button1Text.getText();
        String expectedButton1Text = "Clicked on button one!";
        if (actualButton1Text.equals(expectedButton1Text)){
            System.out.println("Button1 text verification PASSED!");
        }else{
            System.out.println("Button1 text verification FAILED!");
        }

    }

}
