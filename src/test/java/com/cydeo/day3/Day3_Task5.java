package com.cydeo.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Day3_Task5 {
    public static void main(String[] args) {

        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        //3- Enter incorrect username into login box:
        WebElement loginBox = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        loginBox.sendKeys("incorrect");

        //4- Click to `Reset password` button
        WebElement resetPasswordButton = driver.findElement(By.xpath("//button[contains(@onclick,'BX.')]"));
        resetPasswordButton.click();

        //5- Verify “error” label is as expected
        //Expected: Login or E-mail not found
        WebElement errorLabel = driver.findElement(By.xpath("//div[.='Login or E-mail not found']"));
        String actualErrorLabel = errorLabel.getText();
        String expectedErrorLabel = "Login or E-mail not found";
        if (actualErrorLabel.equals(expectedErrorLabel)){
            System.out.println("Error label verification PASSED!");
        }else{
            System.out.println("Error label verification FAILED!");
        }

    }

}

/*
TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
3- Enter incorrect username into login box:
4- Click to `Reset password` button
5- Verify “error” label is as expected
Expected: Login or E-mail not found


PS: Inspect and decide which locator you should be using to locate web
elements.
PS2: Pay attention to where to get the text of this button from
 */
