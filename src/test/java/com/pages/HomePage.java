package com.pages;

import com.aventstack.extentreports.Status;
import driver.DriverManager;
import keywords.WebUI;
import org.testng.Assert;
import reports.ExtentTestManager;
import utils.LogUtils;


public class HomePage {


    public void verifyURL(String URL, String expectedURL){
        WebUI.openURL(URL);
        Assert.assertEquals(WebUI.getCurrentURL(), expectedURL);
        WebUI.sleep(1);
        LogUtils.info("Check URL: " + URL);
        ExtentTestManager.logMessage(Status.PASS, "Check URL: " + URL);
    }

}
