package com.nextBaseCRM.Nadire;

import com.nextBaseCRM.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class EditTaskTest {

    public static void main(String[] args) {
        //1.Set up driver
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //open url
        driver.get("url");

        //log in

        // click...

    }
}

/*

    public static void main(String[] args) {
        //1.Set up driver
        WebDriverManager.chromedriver().setup();

        // 2.Open browser
        WebDriver driver = new ChromeDriver();

        // 3.Get webpage: https://www.facebook.com
        driver.get("https://www.facebook.com");


        // 4.Use .getTitle() method, and store the actual title in a String
        String actualTitle = driver.getTitle();

        // 5.Create expectedTitleString
        String expectedTitle = "Facebook - Log In or Sign Up";

        // 6.Create if conditions to do your verification
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title verification FAILED!!!");
        }

        driver.close();


    }

 */