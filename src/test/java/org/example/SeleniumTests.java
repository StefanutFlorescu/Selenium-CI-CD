package org.example;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTests {
    @Test
    public void testGoogleTitle() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marius Florescu\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        String pageTitle = driver.getTitle();
        System.out.println("The title is: " + pageTitle);

        if (!pageTitle.equals("Google")) {
            driver.quit();
            throw new RuntimeException("Test failed! Expected title 'Google', but got '" + pageTitle + "'");
        }

        driver.quit();
    }
}
