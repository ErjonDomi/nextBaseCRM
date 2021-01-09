package com.nextBaseCRM.aamir;

import com.nextBaseCRM.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc01 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://login2.nextbasecrm.com/");
//locating username and password,entering username and password
        WebElement username = driver.findElement(By.name("USER_LOGIN"));
        username.sendKeys("helpdesk15@cybertekschool.com");
        WebElement password = driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("UserUser");
        driver.findElement(By.className("login-btn")).click();
        driver.findElement(By.xpath("//*[@id='feed-add-post-form-tab-vote']/span")).click();


        // iframe to interact with and enter heading
        Thread.sleep(1000);
        WebElement frame=driver.findElement(By.xpath("//*[@id=\"bx-html-editor-iframe-cnt-idPostFormLHE_blogPostForm\"]/iframe"));
        driver.switchTo().frame(frame);
        driver.findElement(By.xpath("/html/body")).sendKeys("Question and Answer1");
        driver.switchTo().parentFrame();

//filling the values using send keys and clicking send button
        driver.findElement(By.xpath("//input[@name='UF_BLOG_POST_VOTE_n0_DATA[QUESTIONS][0][QUESTION]']")).sendKeys("Question1");
driver.findElement(By.xpath("//input[@name='UF_BLOG_POST_VOTE_n0_DATA[QUESTIONS][0][ANSWERS][0][MESSAGE]']")).sendKeys("Answer 1");
        driver.findElement(By.xpath("//*[@id='answer_0__1_']")).sendKeys("Answer 2");
driver.findElement(By.xpath("//button[@id='blog-submit-button-save']")).click();

    }
}
