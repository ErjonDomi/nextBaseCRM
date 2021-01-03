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
        WebElement username = driver.findElement(By.name("USER_LOGIN"));
        username.sendKeys("helpdesk32@cybertekschool.com");
        WebElement password = driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("UserUser");

        driver.findElement(By.className("login-btn")).click();

        WebElement event=driver.findElement(By.id("feed-add-post-form-tab-calendar"));
        event.click();
        Thread.sleep(3000);
        WebElement eventName=  driver.findElement(By.xpath("//*[@id=\"feed-cal-contcal_3Jcl\"]/div[1]//input[@id='feed-cal-event-namecal_3Jcl' and @name='EVENT_NAME']"));
        eventName.sendKeys("Cybertek");
        WebElement sendButton= driver.findElement(By.id("blog-submit-button-save"));
        sendButton.click();
    }
}
/*
//*[@id="feed-cal-contcal_3Jcl"]/div[1]//input[@id='feed-cal-event-namecal_3Jcl' and @name='EVENT_NAME']
 */


