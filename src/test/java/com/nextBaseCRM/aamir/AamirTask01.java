package com.nextBaseCRM.aamir;

import com.nextBaseCRM.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AamirTask01 {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://login2.nextbasecrm.com/");
//locating username and password,entering username and password
        WebElement username = driver.findElement(By.name("USER_LOGIN"));
        username.sendKeys("helpdesk15@cybertekschool.com");
        WebElement password = driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("UserUser");
        driver.findElement(By.className("login-btn")).click();

        //clicking the pool feature
      driver.findElement(By.xpath("//*[@id=\"feed-add-post-form-tab-vote\"]/span")).click();
        driver.switchTo().frame(0);

        driver.findElement(By.xpath("//input[@type='text' and @name='UF_BLOG_POST_VOTE_n0_DATA[QUESTIONS][0][QUESTION]' and @id='question_0']")).click();

    }
}
