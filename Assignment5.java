package sampleapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.vitshr.com");
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.name("companyName")).sendKeys("Test company");
        Thread.sleep(1000);
        driver.findElement(By.name("companyWebsite")).sendKeys("Test company.com");
        Thread.sleep(1000);
        driver.findElement(By.name("phoneNo")).sendKeys("123456789");
        Thread.sleep(1000);
        //driver.findElement(By.)).click();
        //.findElement(By.partialLinkText("Enter")).sendKeys("1528 4th Avenue, Oakland, CA, USA");
        //  driver.findElement(By.tagName("Done")).click();
       // Thread.sleep(1000);
        driver.findElement(By.name("otherNo")).sendKeys("987654321");
        //Thread.sleep(1000);
        driver.findElement(By.name("zipcode")).sendKeys("54321");
       // Thread.sleep(1000);
       driver.findElement(By.name("fein")).sendKeys("federalID");
       //Thread.sleep(1000);
      driver.findElement(By.name("employerIdentificationNumber")).sendKeys("123456");
       // Thread.sleep(1000);
        driver.findElement(By.name("email")).sendKeys("test@gmail.com");
       // Thread.sleep(1000);

       driver.findElement(By.name("loginID")).sendKeys("testID");
       //Thread.sleep(1000);
       driver.findElement(By.name("password")).sendKeys("passwordID");



    }
}
