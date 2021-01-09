package com.nextBaseCRM.Nadire;

import com.nextBaseCRM.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserClockInTest {

    public static void main(String[] args) {

        //1.Set up driver
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //open url
        driver.get("http://login2.nextbasecrm.com/");

        WebElement username = driver.findElement(By.name("USER_LOGIN"));

        //log in
        username.sendKeys("helpdesk31@cybertekschool.com");

        WebElement password = driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("UserUser");

        // click...
        driver.findElement(By.className("login-btn")).click();

        // ClockIn






    }

}
