package com.testcases;

import com.common.BaseTest;
import com.pages.CustomerPage;
import com.pages.DashboardPage;
import com.pages.LoginPage;
import org.testng.annotations.Test;

public class DashboardTest extends BaseTest {
    LoginPage loginPage;
    DashboardPage dashboardPage;
    CustomerPage customerPage;

    @Test
    public void testTotalInDashboard() throws Exception {
        loginPage = new LoginPage();
        dashboardPage = loginPage.login("admin@example.com", "123456");
        customerPage = dashboardPage.openCustomerPage();
    }
}
