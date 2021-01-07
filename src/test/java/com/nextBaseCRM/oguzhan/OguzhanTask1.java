package com.nextBaseCRM.oguzhan;

import com.nextBaseCRM.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OguzhanTask1 {

    public static void main(String[] args) {

       // sending message.

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://login2.nextbasecrm.com/");

        driver.findElement(By.name("USER_LOGIN")).sendKeys("marketing31@cybertekschool.com");
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser");
        driver.findElement(By.className("login-btn")).click();

        driver.findElement(By.xpath("//span[.='Message']")).click();
        driver.findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("Hi Everyone! How is everything going?");





    }
}
