package com.nextBaseCRM.Lola;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_02 {

    public static void main(String[] args) throws InterruptedException {

        //1- Setup web driver manager
        WebDriverManager.chromedriver().setup();

        //2- Create instance of web driver
        // this is the line where the Selenium WebDriver opens the browser
        WebDriver driver = new ChromeDriver();

        driver.get("https://login2.nextbasecrm.com/");

        driver.findElement(By.name("USER_LOGIN")).sendKeys("helpdesk31@cybertekschool.com");
        driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[1]/div[2]/input")).sendKeys("UserUser");

        Thread.sleep(3000);
        driver.findElement(By.className("login-btn")).click();


        //driver.close();
    }
}
