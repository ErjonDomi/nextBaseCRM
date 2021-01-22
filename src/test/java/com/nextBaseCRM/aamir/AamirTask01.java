package com.nextBaseCRM.aamir;

import com.nextBaseCRM.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AamirTask01 {

    WebDriver driver;

    @BeforeMethod

    public void setupClass() throws InterruptedException {

        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://login2.nextbasecrm.com/");
//locating username and password,entering username and password
        WebElement username = driver.findElement(By.name("USER_LOGIN"));
        username.sendKeys("helpdesk15@cybertekschool.com");
        WebElement password = driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("UserUser");
        driver.findElement(By.className("login-btn")).click();

    }

//Verify user can creat pool
    @Test
    public void TC01() throws InterruptedException {

        Thread.sleep(5000);
        WebElement event=driver.findElement(By.id("feed-add-post-form-tab-vote"));//locating poll button
        event.click();
        Thread.sleep(1000);

        WebElement frame = driver.findElement(By.xpath("//*[@id=\"bx-html-editor-iframe-cnt-idPostFormLHE_blogPostForm\"]/iframe"));
        driver.switchTo().frame(frame);
        driver.findElement(By.xpath("/html/body")).sendKeys("Question and Answer");
        driver.switchTo().parentFrame();


        driver.findElement(By.xpath("//input[@name='UF_BLOG_POST_VOTE_n0_DATA[QUESTIONS][0][QUESTION]']")).sendKeys("Question1");
        driver.findElement(By.xpath("//input[@name='UF_BLOG_POST_VOTE_n0_DATA[QUESTIONS][0][ANSWERS][0][MESSAGE]']")).sendKeys("Answer 1");
        driver.findElement(By.xpath("//*[@id='answer_0__1_']")).sendKeys("Answer 2");
        driver.findElement(By.xpath("//button[@id='blog-submit-button-save']")).click();

    }




////Verifying if  users can check "allow multiple Choice"
    @Test
    public void Tc02() throws InterruptedException {

        Thread.sleep(5000);
        WebElement event=driver.findElement(By.id("feed-add-post-form-tab-vote"));//locating poll button
        event.click();
        Thread.sleep(1000);

        WebElement frame = driver.findElement(By.xpath("//*[@id=\"bx-html-editor-iframe-cnt-idPostFormLHE_blogPostForm\"]/iframe"));
        driver.switchTo().frame(frame);
        driver.findElement(By.xpath("/html/body")).sendKeys("Question and Answer");
        driver.switchTo().parentFrame();


        driver.findElement(By.xpath("//input[@name='UF_BLOG_POST_VOTE_n0_DATA[QUESTIONS][0][QUESTION]']")).sendKeys("Question1");
        driver.findElement(By.xpath("//input[@name='UF_BLOG_POST_VOTE_n0_DATA[QUESTIONS][0][ANSWERS][0][MESSAGE]']")).sendKeys("Answer 1");
        driver.findElement(By.xpath("//*[@id='answer_0__1_']")).sendKeys("Answer 2");

//Selecting multiple choice question
        WebElement checkbox = driver.findElement(By.xpath("//input[@name='UF_BLOG_POST_VOTE_n0_DATA[QUESTIONS][0][MULTI]']"));
        checkbox.click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='blog-submit-button-save']")).click();
    }


    //Verify users can add questions
    @Test
    public void Tc03() throws InterruptedException {
        Thread.sleep(5000);
        WebElement event=driver.findElement(By.id("feed-add-post-form-tab-vote"));//locating poll button
        event.click();
        Thread.sleep(1000);

        WebElement frame = driver.findElement(By.xpath("//*[@id=\"bx-html-editor-iframe-cnt-idPostFormLHE_blogPostForm\"]/iframe"));
        driver.switchTo().frame(frame);
        driver.findElement(By.xpath("/html/body")).sendKeys("Question and Answer");
        driver.switchTo().parentFrame();


        driver.findElement(By.xpath("//input[@name='UF_BLOG_POST_VOTE_n0_DATA[QUESTIONS][0][QUESTION]']")).sendKeys("Question1");
        driver.findElement(By.xpath("//input[@name='UF_BLOG_POST_VOTE_n0_DATA[QUESTIONS][0][ANSWERS][0][MESSAGE]']")).sendKeys("Answer 1");
        driver.findElement(By.xpath("//*[@id='answer_0__1_']")).sendKeys("Answer 2");
        driver.findElement(By.xpath("//*[@id=\"votes-ac3ab09e1ab5bccbdfe6e02e0dec8cff\"]/div/a")).click();
        driver.findElement(By.xpath("//input[@name='UF_BLOG_POST_VOTE_n0_DATA[QUESTIONS][1][QUESTION]']")).sendKeys("Question 2");
        driver.findElement(By.xpath("//input[@name='UF_BLOG_POST_VOTE_n0_DATA[QUESTIONS][1][ANSWERS][0][MESSAGE]']")).sendKeys("answer 3");
        driver.findElement(By.cssSelector("input[name='UF_BLOG_POST_VOTE_n0_DATA[QUESTIONS][1][ANSWERS][1][MESSAGE]']")).sendKeys("Answer 4");
        Thread.sleep(2000);




    }
    //Clicking the send button to publish
    @Test
    public void Tc04() throws InterruptedException {
        Thread.sleep(5000);
        WebElement event=driver.findElement(By.id("feed-add-post-form-tab-vote"));//locating poll button
        event.click();
        Thread.sleep(1000);

        WebElement frame = driver.findElement(By.xpath("//*[@id=\"bx-html-editor-iframe-cnt-idPostFormLHE_blogPostForm\"]/iframe"));
        driver.switchTo().frame(frame);
        driver.findElement(By.xpath("/html/body")).sendKeys("Question and Answer1");
        driver.switchTo().parentFrame();


        driver.findElement(By.xpath("//input[@name='UF_BLOG_POST_VOTE_n0_DATA[QUESTIONS][0][QUESTION]']")).sendKeys("Question1");
        driver.findElement(By.xpath("//input[@name='UF_BLOG_POST_VOTE_n0_DATA[QUESTIONS][0][ANSWERS][0][MESSAGE]']")).sendKeys("Answer 1");
        driver.findElement(By.xpath("//*[@id='answer_0__1_']")).sendKeys("Answer 2");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='blog-submit-button-save']")).click();
        Thread.sleep(1500);
    }

    // Verify users can cancel poll.
    @Test
    public void Tc05() throws InterruptedException {
        Thread.sleep(5000);
        WebElement event = driver.findElement(By.id("feed-add-post-form-tab-vote"));//locating poll button
        event.click();
        Thread.sleep(1000);

        WebElement frame = driver.findElement(By.xpath("//*[@id=\"bx-html-editor-iframe-cnt-idPostFormLHE_blogPostForm\"]/iframe"));
        driver.switchTo().frame(frame);
        driver.findElement(By.xpath("/html/body")).sendKeys("Question and Answer");
        driver.switchTo().parentFrame();


        driver.findElement(By.xpath("//input[@name='UF_BLOG_POST_VOTE_n0_DATA[QUESTIONS][0][QUESTION]']")).sendKeys("Question1");
        driver.findElement(By.xpath("//input[@name='UF_BLOG_POST_VOTE_n0_DATA[QUESTIONS][0][ANSWERS][0][MESSAGE]']")).sendKeys("Answer 1");
        driver.findElement(By.xpath("//*[@id='answer_0__1_']")).sendKeys("Answer 2");
        driver.findElement(By.xpath("//*[@id=\"blog-submit-button-cancel\"]")).click();

    }
    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }
}
