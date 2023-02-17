package sampleapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https:/fb.com");
        System.out.println(driver.getCurrentUrl());


        if (driver.getCurrentUrl().matches("https://www.facebook.com/")){
            driver.findElement(By.partialLinkText("Create")).click();
            Thread.sleep(1000);
            driver.findElement(By.name("firstname")).sendKeys("Steven");
            Thread.sleep(1000);
            driver.findElement(By.name("lastname")).sendKeys("Gerrard");
            Thread.sleep(1000);
            driver.findElement(By.name("reg_email__")).sendKeys("bipuldangol21@gmail.com");
            Thread.sleep(1000);
            driver.findElement(By.name("reg_passwd__")).sendKeys("S");
            Thread.sleep(1000);
            driver.findElement(By.name("reg_email_confirmation__")).sendKeys("bipuldangol21@gmail.com");
            Thread.sleep(1000);
            Select month = new Select(driver.findElement(By.name("birthday_month")));
            month.selectByVisibleText("Jan");
            Thread.sleep(1000);
            Select day = new Select(driver.findElement(By.name("birthday_day")));
            day.selectByVisibleText("15");
            Thread.sleep(1000);
            Select year = new Select(driver.findElement(By.name("birthday_year")));
            year.selectByVisibleText("1980");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//label[text()='Male']")).click();
            Thread.sleep(1000);
            driver.findElement(By.name("websubmit")).click();

        }
        else{
            System.out.println("URL does not match");}
    }}

