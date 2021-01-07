package com.nextBaseCRM.ilgar;

import com.nextBaseCRM.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Task1 {
//1. Verify users can search a valid info from search box. (employee, doc, post, etc)
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://login2.nextbasecrm.com");
        driver.manage().window().maximize();

        //enter username helpdesk31@cybertekschool.com
        WebElement userName = driver.findElement(By.cssSelector("input[name=\"USER_LOGIN\"]"));
        userName.sendKeys("helpdesk31@cybertekschool.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Enter password UserUser
        WebElement password = driver.findElement(By.cssSelector("input[name='USER_PASSWORD']"));
        password.sendKeys("UserUser");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //click Login button
        driver.findElement(By.cssSelector("input[class='login-btn']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //find search box
        WebElement searchBox = driver.findElement(By.cssSelector("input[class='header-search-input']"));

        //enter valid info=>Employee
        searchBox.sendKeys("Employee");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchBox.click();


    }
}
