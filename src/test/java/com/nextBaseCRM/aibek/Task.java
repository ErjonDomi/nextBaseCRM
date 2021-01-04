package com.nextBaseCRM.aibek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.nextbasecrm.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"menu-item-516\"]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("login-inp")).sendKeys("helpdesk31@cybertekschool.com");
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser");
        Thread.sleep(2000);
        driver.findElement(By.className("login-btn")).click();

        driver.findElement(By.xpath("//*[@id=\"feed-add-post-form-tab-vote\"]/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("template-bitrix24 no-paddings start-page bitrix24-default-theme")).sendKeys("Testing poll!");
        Thread.sleep(3000);
        driver.findElement(By.name("UF_BLOG_POST_VOTE_n0_DATA[QUESTIONS][0][QUESTION]")).sendKeys("What is the capital of US?");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"answer_0__0_\"]")).sendKeys("Washington");
        Thread.sleep(2000);
        driver.findElement(By.name("UF_BLOG_POST_VOTE_n0_DATA[QUESTIONS][0][ANSWERS][1][MESSAGE]")).sendKeys("Chicago");
        Thread.sleep(2000);
        driver.findElement(By.id("blog-submit-button-save")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("bx-vote-block-inp-substitute")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("ui-btn ui-btn-lg ui-btn-link")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("ui-btn ui-btn-lg ui-btn-link")).click();



    }

}

