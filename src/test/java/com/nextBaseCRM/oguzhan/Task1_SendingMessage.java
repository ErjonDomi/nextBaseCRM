package com.nextBaseCRM.oguzhan;

import com.nextBaseCRM.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task1_SendingMessage {

    public static void main(String[] args) throws InterruptedException {

       // sending message.

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://login2.nextbasecrm.com/");

        driver.findElement(By.name("USER_LOGIN")).sendKeys("marketing31@cybertekschool.com");
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser");
        driver.findElement(By.className("login-btn")).click();

        // writing message to iframe
        driver.findElement(By.xpath("//div[@id='microoPostFormLHE_blogPostForm_inner']")).click(); // clicking message button
        Thread.sleep(2000);
        WebElement frame=driver.findElement(By.xpath("//*[@id=\"bx-html-editor-iframe-cnt-idPostFormLHE_blogPostForm\"]/iframe"));
        driver.switchTo().frame(frame); // getting in iframe
        driver.findElement(By.xpath("/html/body")).sendKeys("Hi Everyone! How is everything going?");
        driver.switchTo().parentFrame();// getting out iframe



        // choosing person/people to send message
        driver.findElement(By.xpath("//span[@class='feed-add-post-destination-text']")).click();
       driver.findElement(By.xpath("//div[@class='bx-finder-box-item-t7-name']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[@class='popup-window-close-icon']")).click();
        Thread.sleep(2000);
       // driver.findElement(By.xpath("//a[@class='feed-add-destination-link']")).click();
       // Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='blog-submit-button-save']")).click();
        Thread.sleep(2000);






    }
}
