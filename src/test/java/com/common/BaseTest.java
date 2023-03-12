package com.common;

import driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;

public class BaseTest {


    @BeforeClass
    @Parameters({"browser"})
    public void createBrowser(@Optional("chrome") String browserName) {

        WebDriver driver = setupBrowser(browserName);
        DriverManager.setDriver(driver);
    }

    public  WebDriver setupBrowser(String browserName) {
        WebDriver driver;
        switch (browserName.trim().toLowerCase()) {
            case "chrome":
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(options);
                driver.manage().window().maximize();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                break;
            case "edge":
                EdgeOptions option = new EdgeOptions();
                option.addArguments("--remote-allow-origins=*");
                driver = new EdgeDriver(option);
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
        if (DriverManager.getDriver() != null) {
            DriverManager.quit();
        }

    }

}