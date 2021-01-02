package com.nextBaseCRM.Nadire;

import com.nextBaseCRM.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserClockInTest {

    public static void main(String[] args) {

        //1.Set up driver
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //open url
        driver.get("login2.nextbasecrm.com");

        driver.manage().window().maximize();



        //log in
        

        // click...
    }

}
