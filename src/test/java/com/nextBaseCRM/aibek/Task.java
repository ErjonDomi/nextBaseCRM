package com.nextBaseCRM.aibek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) throws InterruptedException {

        //setup chrome browser
        WebDriverManager.chromedriver().setup();

        //opening chrome
        WebDriver driver = new ChromeDriver();

        //opening www,nextbasecrm.com
        driver.get("https://www.nextbasecrm.com");

        //maximizing window
        driver.manage().window().maximize();
        Thread.sleep(2000);

        //locating on login button and clicking
        driver.findElement(By.xpath("//*[@id=\"menu-item-516\"]/a")).click();
        Thread.sleep(2000);

        //locating on login button and typing user name
        driver.findElement(By.className("login-inp")).sendKeys("helpdesk31@cybertekschool.com");

        //locating on password button and typing password
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser");
        Thread.sleep(2000);

        //locating on login button clicking
        driver.findElement(By.className("login-btn")).click();

        //location on vote again button and click
        driver.findElement(By.xpath("//*[@id=\"vote-nSLjLH51\"]/form/div[2]/button[1]")).click();
        Thread.sleep(3000);

        //locating on answer radio button and clicking
        driver.findElement(By.xpath("//*[@id=\"question57\"]/table/tbody/tr[1]/td[1]/div/span/label[1]/span")).click();
        Thread.sleep(2000);

        //locating on vote button and clicking
        driver.findElement(By.xpath("//*[@id=\"vote-nSLjLH51\"]/form/div[2]/button[2]")).click();
        Thread.sleep(2000);

        //locating on vote again button and clicking
        driver.findElement(By.xpath("//*[@id=\"vote-nSLjLH51\"]/form/div[2]/button[1]")).click();
        Thread.sleep(3000);

        //locating on answer radio button and clicking
        driver.findElement(By.xpath("//*[@id=\"question57\"]/table/tbody/tr[2]/td[1]/div/span/label[1]/span")).click();
        Thread.sleep(3000);

        //locating on vote button and clicking
        driver.findElement(By.xpath("//*[@id=\"vote-nSLjLH51\"]/form/div[2]/button[2]")).click();
        Thread.sleep(3000);

        //locating on profile and clicking
        driver.findElement(By.xpath("//span[@class='user-name']")).click();
        Thread.sleep(3000);

        //locating on log out and clicking
        driver.findElement(By.xpath("//span[.='Log out']")).click();
    }

}



