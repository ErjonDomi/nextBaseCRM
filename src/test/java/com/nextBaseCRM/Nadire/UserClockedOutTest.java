package com.nextBaseCRM.Nadire;

import com.nextBaseCRM.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserClockedOutTest {

    public static void main(String[] args) throws InterruptedException {

        //1.Set up driver
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //open url
        driver.get("http://login2.nextbasecrm.com/");

        WebElement username = driver.findElement(By.name("USER_LOGIN"));

        //log in
        username.sendKeys("helpdesk12@cybertekschool.com");

        WebElement password = driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("UserUser");

        // click...
        driver.findElement(By.className("login-btn")).click();

        // ClockIn
        driver.findElement(By.id("timeman-status")).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("td.tm-popup-timeman-layout-button > div > span > span")).click();
        Thread.sleep(2000);

        // ClockOut
        driver.findElement(By.id("timeman-status")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//span[@class='webform-small-button-text']")).click();

    }
}