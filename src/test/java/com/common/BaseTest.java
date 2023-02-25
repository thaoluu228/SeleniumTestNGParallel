package com.common;

import driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;

public class BaseTest {


    @BeforeClass
    @Parameters({"browser"})
    public void createDriver(@Optional("chrome") String browserName) {

        WebDriver driver = setupBrowser(browserName);
        DriverManager.setDriver(driver);
    }

    public  WebDriver setupBrowser(String browserName) {
        WebDriver driver;
        switch (browserName.trim().toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                break;
            case "edge":
                driver = new EdgeDriver();
                driver.manage().window().maximize();
                break;
            case "safari":
                driver = new SafariDriver();
                driver.manage().window().maximize();
            default:
                System.out.println("Browser: " + browserName + " is invalid, Launching Chrome as browser of choice...");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
        }
        return driver;
    }

    @AfterClass
    public void closeDriver() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (DriverManager.getDriver() != null) {
            DriverManager.quit();
        }

    }

}