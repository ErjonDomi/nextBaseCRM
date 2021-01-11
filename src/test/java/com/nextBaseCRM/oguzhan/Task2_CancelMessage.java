package com.nextBaseCRM.oguzhan;

import com.nextBaseCRM.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task2_CancelMessage {

    public static void main(String[] args) throws InterruptedException {

        // Canceling Message

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://login2.nextbasecrm.com/");

        driver.findElement(By.name("USER_LOGIN")).sendKeys("marketing31@cybertekschool.com");
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser");
        driver.findElement(By.className("login-btn")).click();

        driver.findElement(By.xpath("//div[@id='microoPostFormLHE_blogPostForm_inner']")).click();
        Thread.sleep(5000);
        WebElement frame=driver.findElement(By.xpath("//*[@id=\"bx-html-editor-iframe-cnt-idPostFormLHE_blogPostForm\"]/iframe"));
        driver.switchTo().frame(frame);
        driver.findElement(By.xpath("/html/body")).sendKeys("Hi Everyone! How is everything going?");
        driver.switchTo().parentFrame();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='ui-btn ui-btn-lg ui-btn-link']")).click();

    }
}
