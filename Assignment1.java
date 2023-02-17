package sampleapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("web-driver.firefox.driver", "C:\\Users\\bipul\\Downloads\\Firefox Installer.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://vitshr.com/");
        Thread.sleep(1000);

        String title = driver.getTitle();

        if (title.matches("VITS HR")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        driver.get("https://www.facebook.com");
        Thread.sleep(1000);

        driver.navigate().back();
        Thread.sleep(1000);

        System.out.println(driver.getCurrentUrl());
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.close();


    }

}
