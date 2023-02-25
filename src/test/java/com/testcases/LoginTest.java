package com.testcases;

import driver.DriverManager;
import com.common.BaseTest;
import com.pages.LoginPage;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {
    LoginPage loginPage;

    @Test
    public void loginTestSuccess() throws Exception {
        loginPage = new LoginPage();
        loginPage.login("admin@example.com", "123456");
    }
    @Test
    public void loginTestFail()throws Exception {
        loginPage = new LoginPage();
        loginPage.loginFail("admin@example.co", "123456");
    }
}
