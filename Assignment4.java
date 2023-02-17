package sampleapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment4 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https:/www.ebay.com");

        WebElement search = driver.findElement(By.id("gh-ac"));
        search.sendKeys("Apple Watches");

        Select category = new Select(driver.findElement(By.name("_sacat")));
        category.selectByVisibleText("Cell Phones & Accessories");

        driver.findElement(By.id("gh-btn")).click();
    }
}
