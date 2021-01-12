package com.nextBaseCRM.Erjon;

import com.nextBaseCRM.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TC_SendEvent {
    WebDriver driver;

    @BeforeMethod
    public void setupClass() throws InterruptedException {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://login2.nextbasecrm.com/");
        WebElement username = driver.findElement(By.name("USER_LOGIN"));//locating username
        username.sendKeys("helpdesk32@cybertekschool.com");//entering username
        WebElement password = driver.findElement(By.name("USER_PASSWORD"));//locating password
        password.sendKeys("UserUser");//entering password
        Thread.sleep(1000);
        driver.findElement(By.className("login-btn")).click();//locating and clicking on login
    }
    @Test
    public void TC1() throws InterruptedException {
        //"1. Verify users can send events by clicking ""EVENT"" tab with at least an event name.
        WebElement event=driver.findElement(By.id("feed-add-post-form-tab-calendar"));//locating event button
        event.click();
        Thread.sleep(1000);

        //locating the element name input box
        WebElement eventName=  driver.findElement(By.xpath("//input[@id='feed-cal-event-namecal_3Jcl' and @name='EVENT_NAME']"));
        eventName.sendKeys("Cybertek");//element name set to Cybertek
        Thread.sleep(3000);

        //locating send button and clicking on it
        WebElement sendButton= driver.findElement(By.id("blog-submit-button-save"));
        sendButton.click();
    }

    @Test
    public void TC2() throws InterruptedException {
   //"1. Verify users can send events by clicking ""SEND"" button with all the input boxes filled.
        WebElement event = driver.findElement(By.id("feed-add-post-form-tab-calendar"));//locating event button
        event.click();
        Thread.sleep(1000);

        //locating the element name input box
        WebElement eventName = driver.findElement(By.xpath("//input[@id='feed-cal-event-namecal_3Jcl' and @name='EVENT_NAME']"));
        eventName.sendKeys("Cybertek");//element name set to Cybertek
        Thread.sleep(1000);


        WebElement frame=driver.findElement(By.xpath("//*[@id=\"bx-html-editor-iframe-cnt-oCalEditorcal_3Jcl\"]/iframe"));
        driver.switchTo().frame(frame);
        driver.findElement(By.xpath("/html/body")).sendKeys("Hello");
        driver.switchTo().parentFrame();
        Thread.sleep(1000);

        //locating start date input box
        WebElement startDate = driver.findElement(By.xpath("//input[@id='feed-cal-event-fromcal_3Jcl' and @name='DATE_FROM']"));
        startDate.clear();//clearing the input box
        startDate.sendKeys("02/15/2021"); //setting date to 02/15/2021
        Thread.sleep(1000);

        //locating start time input box
        WebElement startTime = driver.findElement(By.xpath("//input[@id='feed_cal_event_from_timecal_3Jcl' and @name='TIME_FROM_']"));
        startTime.clear();//clearing the input box
        startTime.sendKeys("10:00 am"); //setting start time to 10:00 am
        Thread.sleep(1000);

        //locating end date input box
        WebElement endDate = driver.findElement(By.xpath("//input[@id='feed-cal-event-tocal_3Jcl' and @name='DATE_TO']"));
        // endDate.clear();//clearing the input box
        //  endDate.sendKeys("02/15/2021");//setting date to 02/15/2021
        Thread.sleep(1000);


        //locating end time input box
        WebElement endTime = driver.findElement(By.xpath("//input[@id='feed_cal_event_to_timecal_3Jcl' and @name='TIME_TO_']"));
        endTime.clear();//clearing the input box
        endTime.sendKeys("02:00 pm"); //setting end time to 02:00 pm
        Thread.sleep(1000);

        //locating set reminder check box and clicking in it
        WebElement setReminderCheckBox = driver.findElement(By.xpath("//input[@ class='feed-event-rem-ch' and @name='EVENT_REMIND' and @type='checkbox'] "));
        // setReminderCheckBox.click();
        Thread.sleep(1000);

        //Setting the reminder for minutes or hours or days
        Select setReminder = new Select(driver.findElement(By.xpath("//select[@id='event-remind_typecal_3Jcl' and @name='EVENT_REMIND_TYPE']")));
        setReminder.selectByVisibleText("days");
        Thread.sleep(1000);

        //Setting the count for minutes or hours or days
        WebElement countOFMinHourDays = driver.findElement(By.xpath("//input[@class='calendar-inp' and @name='EVENT_REMIND_COUNT']"));
        countOFMinHourDays.clear();//clearing the input box
        countOFMinHourDays.sendKeys("2"); //setting the reminder for 2 days
        Thread.sleep(1000);

        //locating event location input box
        WebElement eventLocation = driver.findElement(By.xpath("//input[@id='event-locationcal_3Jcl' and @class='calendar-inp calendar-inp-time calendar-inp-loc']"));
        eventLocation.sendKeys("Central Meeting Room");//setting the meeting location
        Thread.sleep(1000);

        //locating the input box to tag people for the meeting
        WebElement selectMember = driver.findElement(By.xpath("//*[@id=\"feed-event-dest-cont\"]"));
        selectMember.click();
        Thread.sleep(1000);

        //selecting all the employees for the meeting
        WebElement selectedMembers = driver.findElement(By.xpath("//*[@id=\"calnAJEM3_last_UA\"]/div[3]/div"));
        selectedMembers.click();
        Thread.sleep(3000);


        //locating send button and clicking on it
        WebElement sendButton = driver.findElement(By.id("blog-submit-button-save"));
        sendButton.click();
    }



    @Test
    public void TC3() throws InterruptedException {
        //4. Verify users can choose all day for the event time"
        WebElement event = driver.findElement(By.id("feed-add-post-form-tab-calendar"));//locating event button
        event.click();
        Thread.sleep(2000);

        //locating the element name input box
        WebElement eventName = driver.findElement(By.xpath("//input[@id='feed-cal-event-namecal_3Jcl' and @name='EVENT_NAME']"));
        eventName.sendKeys("Cybertek");//element name set to Cybertek
        Thread.sleep(1000);

        WebElement frame=driver.findElement(By.xpath("//*[@id=\"bx-html-editor-iframe-cnt-oCalEditorcal_3Jcl\"]/iframe"));
        driver.switchTo().frame(frame);
        driver.findElement(By.xpath("/html/body")).sendKeys("Hello Batch 21");
        driver.switchTo().parentFrame();
        Thread.sleep(1000);

        //locating start date input box
        WebElement startDate = driver.findElement(By.xpath("//input[@id='feed-cal-event-fromcal_3Jcl' and @name='DATE_FROM']"));
        startDate.clear();//clearing the input box
        startDate.sendKeys("02/15/2021"); //setting date to 02/15/2021
        Thread.sleep(1000);

       /* //locating start time input box
        WebElement startTime = driver.findElement(By.xpath("//*[@id=\"feed-cal-from-to-contcal_3Jcl\"]/span[1]/span[2]//input[@id='feed_cal_event_from_timecal_3Jcl' and @name='TIME_FROM_']"));
        startTime.clear();//clearing the input box
        startTime.sendKeys("10:00 am"); //setting start time to 10:00 am
        Thread.sleep(1000);

        */

        //locating end date input box
        WebElement endDate = driver.findElement(By.xpath("//input[@id='feed-cal-event-tocal_3Jcl' and @name='DATE_TO']"));
        endDate.clear();//clearing the input box
        // endDate.sendKeys("02/15/2021");//setting date to 02/15/2021
        Thread.sleep(1000);


       /* //locating end time input box
        WebElement endTime = driver.findElement(By.xpath("//*[@id=\"feed-cal-from-to-contcal_3Jcl\"]/span[1]/span[5]//input[@id='feed_cal_event_to_timecal_3Jcl' and @name='TIME_TO_']"));
        endTime.clear();//clearing the input box
        endTime.sendKeys("02:00 pm"); //setting end time to 02:00 pm
        Thread.sleep(1000);

        */
        //Locating All day checkbox and clicking on it
        WebElement selectAllDay= driver.findElement(By.xpath("//input[@id='event-full-daycal_3Jcl' and @name='EVENT_FULL_DAY']"));
        selectAllDay.click();
        Thread.sleep(2000);

        //locating set reminder check box and clicking in it
        WebElement setReminderCheckBox = driver.findElement(By.xpath("//input[@ class='feed-event-rem-ch' and @name='EVENT_REMIND' and @type='checkbox'] "));
        // setReminderCheckBox.click();
        Thread.sleep(2000);

        //Setting the reminder for minutes or hours or days
        Select setReminder = new Select(driver.findElement(By.xpath("//select[@id='event-remind_typecal_3Jcl' and @name='EVENT_REMIND_TYPE']")));
        setReminder.selectByVisibleText("days");
        Thread.sleep(1000);

        //Setting the count for minutes or hours or days
        WebElement countOFMinHourDays = driver.findElement(By.xpath("//input[@class='calendar-inp' and @name='EVENT_REMIND_COUNT']"));
        countOFMinHourDays.clear();//clearing the input box
        countOFMinHourDays.sendKeys("2"); //setting the reminder for 2 days
        Thread.sleep(2000);

        //locating event location input box
        WebElement eventLocation = driver.findElement(By.xpath("//input[@id='event-locationcal_3Jcl' and @class='calendar-inp calendar-inp-time calendar-inp-loc']"));
        eventLocation.sendKeys("Central Meeting Room");//setting the meeting location
        Thread.sleep(1000);

        //locating the input box to tag people for the meeting
        WebElement selectMember = driver.findElement(By.xpath("//*[@id=\"feed-event-dest-cont\"]"));
        selectMember.click();
        Thread.sleep(1000);

        //selecting all the employees for the meeting
        WebElement selectedMembers = driver.findElement(By.xpath("//*[@id=\"calnAJEM3_last_UA\"]/div[3]/div"));
        selectedMembers.click();
        Thread.sleep(3000);


        //locating send button and clicking on it
        WebElement sendButton = driver.findElement(By.id("blog-submit-button-save"));
        sendButton.click();
    }

    @Test
    public void TC4() throws InterruptedException {
        //Verify users can cancel events and Verify users can cancel events by clicking ""CANCEL"" button with all the input boxes filled.
        WebElement event = driver.findElement(By.id("feed-add-post-form-tab-calendar"));//locating event button
        event.click();
        Thread.sleep(2000);

        //locating the element name input box
        WebElement eventName = driver.findElement(By.xpath("//input[@id='feed-cal-event-namecal_3Jcl' and @name='EVENT_NAME']"));
        eventName.sendKeys("Cybertek");//element name set to Cybertek
        Thread.sleep(1000);

        WebElement frame=driver.findElement(By.xpath("//*[@id=\"bx-html-editor-iframe-cnt-oCalEditorcal_3Jcl\"]/iframe"));
        driver.switchTo().frame(frame);
        driver.findElement(By.xpath("/html/body")).sendKeys("Hello");
        driver.switchTo().parentFrame();
        Thread.sleep(1000);

        //locating start date input box
        WebElement startDate = driver.findElement(By.xpath("//input[@name='DATE_FROM']"));
        startDate.clear();//clearing the input box
        startDate.sendKeys("02/15/2021"); //setting date to 02/15/2021
        Thread.sleep(1000);

        //locating start time input box
        WebElement startTime = driver.findElement(By.xpath("//input[@name='TIME_FROM_']"));
        startTime.clear();//clearing the input box
        startTime.sendKeys("10:00 am"); //setting start time to 10:00 am
        Thread.sleep(1000);

        //locating end date input box
        WebElement endDate = driver.findElement(By.xpath("//input[@id='feed-cal-event-tocal_3Jcl' and @name='DATE_TO']"));
        //endDate.clear();//clearing the input box
        //endDate.sendKeys("02/15/2021");//setting date to 02/15/2021
        //Thread.sleep(1000);


        //locating end time input box
        WebElement endTime = driver.findElement(By.xpath("//input[@id='feed_cal_event_to_timecal_3Jcl' and @name='TIME_TO_']"));
        endTime.clear();//clearing the input box
        endTime.sendKeys("02:00 pm"); //setting end time to 02:00 pm
        Thread.sleep(1000);

        //locating set reminder check box and clicking in it
        WebElement setReminderCheckBox = driver.findElement(By.xpath("//input[@ class='feed-event-rem-ch' and @name='EVENT_REMIND' and @type='checkbox'] "));
        // setReminderCheckBox.click();
        Thread.sleep(1000);

        //Setting the reminder for minutes or hours or days
        Select setReminder = new Select(driver.findElement(By.xpath("//select[@id='event-remind_typecal_3Jcl' and @name='EVENT_REMIND_TYPE']")));
        setReminder.selectByVisibleText("days");
        Thread.sleep(1000);

        //Setting the count for minutes or hours or days
        WebElement countOFMinHourDays = driver.findElement(By.xpath("//input[@class='calendar-inp' and @name='EVENT_REMIND_COUNT']"));
        countOFMinHourDays.clear();//clearing the input box
        countOFMinHourDays.sendKeys("2"); //setting the reminder for 2 days
        Thread.sleep(1000);

        //locating event location input box
        WebElement eventLocation = driver.findElement(By.xpath("//input[@id='event-locationcal_3Jcl' or @class='calendar-inp calendar-inp-time calendar-inp-loc']"));
        eventLocation.sendKeys("Central Meeting Room");//setting the meeting location
        Thread.sleep(1000);

        //locating the input box to tag people for the meeting
        WebElement selectMember = driver.findElement(By.xpath("//*[@id=\"feed-event-dest-cont\"]"));
        selectMember.click();
        Thread.sleep(1000);

        //selecting all the employees for the meeting
        WebElement selectedMembers = driver.findElement(By.xpath("//*[@id=\"calnAJEM3_last_UA\"]/div[3]/div"));
        selectedMembers.click();
        Thread.sleep(3000);

        //locating cancel button and clicking on it
        WebElement cancelButton = driver.findElement(By.id("blog-submit-button-cancel"));
        cancelButton.click();

    }

   @AfterMethod
    public void tearDown(){
        driver.close();
    }

}
