package com.pages;

import driver.DriverManager;
import keywords.WebUI;
import keywords.WebUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
    private String URL = "https://crm.anhtester.com/admin/authentication";

    By inputEmail = By.id("email");
    By inputPassword = By.id("password");
    By loginButton = By.xpath("//button[normalize-space()='Login']");
    By errMsg = By.xpath("//div[@class='text-center alert alert-danger']");


    public void enterEmail (String email) {

        WebUI.sendKeyToElement(inputEmail,email);
    }
    public void enterPassword (String password) {
        WebUI.sendKeyToElement(inputPassword, password);
    }
    public void clickLoginButton (){
        WebUI.clickToElement(loginButton);
    }
    public void verifyErrMsg (){
        Assert.assertTrue(WebUI.isDisplayed(errMsg),"Fail, error message is not displayed");
        Assert.assertEquals(WebUI.getTextElement(errMsg), "Invalid email or password");
    }
    public DashboardPage login (String email, String password) {
        DriverManager.getDriver().get(URL);
        enterEmail(email);
        enterPassword(password);
        WebUI.sleep(2);
        clickLoginButton();
        WebUI.sleep(2);
        WebUI.checkElementExist( "//li[@class='menu-item-dashboard active']/a//span");
        Assert.assertEquals(WebUI.getTextElement(By.xpath("//li[@class='menu-item-dashboard active']/a//span")),"Dashboard");
        return new DashboardPage();
    }

    public void loginFail (String email, String password) {
        DriverManager.getDriver().get(URL);
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
        WebUI.sleep(2);
        verifyErrMsg();
        WebUI.sleep(2);
    }

}
