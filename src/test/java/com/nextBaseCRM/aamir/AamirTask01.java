package com.nextBaseCRM.aamir;

import com.nextBaseCRM.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AamirTask01 {

WebDriver driver;
   @BeforeClass

           public void setupClass() throws InterruptedException {

       WebDriver driver = WebDriverFactory.getDriver("chrome");
       driver.get("http://login2.nextbasecrm.com/");
//locating username and password,entering username and password
       WebElement username = driver.findElement(By.name("USER_LOGIN"));
       username.sendKeys("helpdesk15@cybertekschool.com");
       WebElement password = driver.findElement(By.name("USER_PASSWORD"));
       password.sendKeys("UserUser");
       driver.findElement(By.className("login-btn")).click();
       driver.findElement(By.xpath("//span[@class='feed-add-post-form-link feed-add-post-form-link-active']")).click();
   }
   @Test
           public void TC01() throws InterruptedException {

       Thread.sleep(5000);
       WebElement frame=driver.findElement(By.xpath("//*[@id=\"bx-html-editor-iframe-cnt-idPostFormLHE_blogPostForm\"]/iframe"));
       driver.switchTo().frame(frame);
       driver.findElement(By.xpath("/html/body")).sendKeys("Question and Answer");
       driver.switchTo().parentFrame();


       driver.findElement(By.xpath("//input[@name='UF_BLOG_POST_VOTE_n0_DATA[QUESTIONS][0][QUESTION]']")).sendKeys("Question1");
       driver.findElement(By.xpath("//input[@name='UF_BLOG_POST_VOTE_n0_DATA[QUESTIONS][0][ANSWERS][0][MESSAGE]']")).sendKeys("Answer 1");
       driver.findElement(By.xpath("//*[@id='answer_0__1_']")).sendKeys("Answer 2");
       driver.findElement(By.xpath("//button[@id='blog-submit-button-save']")).click();

   }}
