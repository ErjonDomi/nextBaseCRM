package com.nextBaseCRM.ilgar;

import com.nextBaseCRM.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task2 {
    //2. Verify users get menu item and suggested modules when they type in the box.
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://login2.nextbasecrm.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

    @Test
    public void test1() throws InterruptedException {

        WebElement userName = driver.findElement(By.name("USER_LOGIN"));
        userName.sendKeys("helpdesk31@cybertekschool.com");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement passWord = driver.findElement(By.name("USER_PASSWORD"));
        passWord.sendKeys("UserUser");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement login = driver.findElement(By.xpath("//input[@class='login-btn']"));
        login.click();

        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys("Employees" + Keys.ENTER);

        Thread.sleep(2500);
        WebElement employeesSearch = driver.findElement(By.xpath("//*[@id=\"bx_left_menu_menu_company\"]/a/span"));
        employeesSearch.click();

    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
