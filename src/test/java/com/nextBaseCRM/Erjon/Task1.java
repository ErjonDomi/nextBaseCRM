package com.nextBaseCRM.Erjon;

import com.nextBaseCRM.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//"1. Verify users can send events by clicking ""EVENT"" tab with at least an event name.

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://login2.nextbasecrm.com/");

        //maximizing the window
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.name("USER_LOGIN"));//locating username
        username.sendKeys("helpdesk32@cybertekschool.com");//entering username
        WebElement password = driver.findElement(By.name("USER_PASSWORD"));//locating password
        password.sendKeys("UserUser");//entering password
        Thread.sleep(1000);

        driver.findElement(By.className("login-btn")).click();//locating and clicking on login button

        WebElement event=driver.findElement(By.id("feed-add-post-form-tab-calendar"));//locating event button
        event.click();
        Thread.sleep(1000);

        //locating the element name input box
        WebElement eventName=  driver.findElement(By.xpath("//*[@id=\"feed-cal-contcal_3Jcl\"]/div[1]//input[@id='feed-cal-event-namecal_3Jcl' and @name='EVENT_NAME']"));
        eventName.sendKeys("Cybertek");//element name set to Cybertek
        Thread.sleep(1000);

        //locating send button and clicking on it
        WebElement sendButton= driver.findElement(By.id("blog-submit-button-save"));
        sendButton.click();
    }
}


