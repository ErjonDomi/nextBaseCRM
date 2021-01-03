package com.nextBaseCRM.Erjon;

import com.nextBaseCRM.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//"1. Verify users can send events by clicking ""EVENT"" tab with all the input boxes filled.
public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://login2.nextbasecrm.com/");
        WebElement username = driver.findElement(By.name("USER_LOGIN"));
        username.sendKeys("helpdesk32@cybertekschool.com");
        WebElement password = driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("UserUser");

        driver.findElement(By.className("login-btn")).click();

        WebElement event = driver.findElement(By.id("feed-add-post-form-tab-calendar"));
        event.click();
        Thread.sleep(3000);
        WebElement eventName = driver.findElement(By.xpath("//*[@id=\"feed-cal-contcal_3Jcl\"]/div[1]//input[@id='feed-cal-event-namecal_3Jcl' and @name='EVENT_NAME']"));
        eventName.sendKeys("Cybertek");
        WebElement startDate = driver.findElement(By.xpath("//*[@id=\"feed-cal-from-to-contcal_3Jcl\"]/span[1]/span[1]//input[@id='feed-cal-event-fromcal_3Jcl' and @name='DATE_FROM']"));
        startDate.clear();
        startDate.sendKeys("02/15/2021");
        WebElement endDate=driver.findElement(By.xpath("//*[@id=\"feed-cal-from-to-contcal_3Jcl\"]/span[1]/span[4]//input[@id='feed-cal-event-tocal_3Jcl' and @name='DATE_TO']"));
        endDate.clear();
        endDate.sendKeys("02/15/2021");

        WebElement startTime=driver.findElement(By.xpath("//*[@id=\"feed-cal-from-to-contcal_3Jcl\"]/span[1]/span[2]//input[@id='feed_cal_event_from_timecal_3Jcl' and @name='TIME_FROM_']"));
        startTime.clear();
        startTime.sendKeys(" 10:00 am");

        WebElement endTime= driver.findElement(By.xpath("//*[@id=\"feed-cal-from-to-contcal_3Jcl\"]/span[1]/span[5]//input[@id='feed_cal_event_to_timecal_3Jcl' and @name='TIME_TO_']"));
        endTime.clear();
        endTime.sendKeys("02:00 pm");
        WebElement setReminder= driver.findElement(By.xpath("//*[@id=\"feed-cal-reminder-contcal_3Jcl\"]//input[@ class='feed-event-rem-ch' and @name='EVENT_REMIND' and @type='checkbox'] "));
        setReminder.click();

        WebElement eventLocation= driver.findElement(By.xpath("//*[@id=\"feed-cal-contcal_3Jcl\"]/div[3]/div[4]//input[@id='event-locationcal_3Jcl' and @name='EVENT_LOCATION']"));
        eventLocation.click();

     /*   Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"feed-cal-contcal_3Jcl\"]/div[3]/div[4]//input[@id='event-locationcal_3Jcl' and @name='EVENT_LOCATION'"))).build().perform();
        actions.

      */
        Thread.sleep(3000);
        WebElement sendButton = driver.findElement(By.id("blog-submit-button-save"));
       // sendButton.click();
    }
}

