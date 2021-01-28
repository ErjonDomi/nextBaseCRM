package com.nextBaseCRM.oguzhan;


import com.nextBaseCRM.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task3_LinkWithMessage {

    public static void main(String[] args) throws InterruptedException {


        // Link with message

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://login2.nextbasecrm.com/");

        driver.findElement(By.name("USER_LOGIN")).sendKeys("marketing31@cybertekschool.com");
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser");
        driver.findElement(By.className("login-btn")).click();

        driver.findElement(By.xpath("//div[@id='microoPostFormLHE_blogPostForm_inner']")).click(); // clicking message button
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='bxhtmled-top-bar-btn bxhtmled-button-link']")).click();



    }
}
