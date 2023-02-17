package sampleapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Assignment3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://flipkart.com");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        int linkcount = links.size();
        System.out.println("number of links - " + linkcount);

        for (int i = 1; i < linkcount; i++) {
            WebElement linkname = links.get(i);
            String text = linkname.getText();
            System.out.println(text);
        }
    }

}
