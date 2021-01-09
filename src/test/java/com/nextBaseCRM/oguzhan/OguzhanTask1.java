package com.nextBaseCRM.oguzhan;

import com.nextBaseCRM.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OguzhanTask1 {

    public static void main(String[] args) {

       // sending message.

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://login2.nextbasecrm.com/");

        driver.findElement(By.name("USER_LOGIN")).sendKeys("marketing31@cybertekschool.com");
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser");
        driver.findElement(By.className("login-btn")).click();

       driver.findElement(By.xpath("//div[@id='microoPostFormLHE_blogPostForm_inner']")).click();
        WebElement frame=driver.findElement(By.xpath("//*[@id=\"bx-html-editor-iframe-cnt-idPostFormLHE_blogPostForm\"]/iframe"));
        driver.switchTo().frame(frame);
        driver.findElement(By.xpath("/html/body")).sendKeys("Hi Everyone! How is everything going?");
        driver.switchTo().parentFrame();


      /*  driver.findElement(By.xpath("//span[.='Message']")).click();

        WebElement frame = driver.findElement(By.xpath("//iframe[@class='bx-editor-iframe']"));
         driver.switchTo().frame(frame);
                 frame.sendKeys("Hi Everyone! How is everything going?");

       // driver.findElement(By.xpath("//span[.='Message']")).click();

       // WebElement frame = driver.findElement(By.xpath("//div[@id='bx-html-editor-iframe-cnt-idPostFormLHE_blogPostForm']"));
        //driver.switchTo().frame(frame);

      //  driver.findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("Hi Everyone! How is everything going?");
*/




    }
}
