package com.testcases;

import com.common.BaseTest;
import com.pages.CustomerDetailPage;
import com.pages.CustomerPage;
import com.pages.DashboardPage;
import com.pages.LoginPage;
import org.testng.annotations.Test;

public class CustomerTest extends BaseTest {
    LoginPage loginPage;
    DashboardPage dashboardPage;
    CustomerPage customerPage;
    CustomerDetailPage customerDetail;

    @Test
    public void addNewCustomer() {
        //login
        loginPage = new LoginPage();
        //open Dashboard page
        dashboardPage = loginPage.login("admin@example.com", "123456");
        //open Customer page
        customerPage = dashboardPage.openCustomerPage();
        //add new customer
        customerPage.addNewCustomer();
    }

    @Test
    public void verifyCustomer () {
        loginPage = new LoginPage();
        //open dashboard page
        dashboardPage = loginPage.login("admin@example.com", "123456");
        //open Customer page
        customerPage = dashboardPage.openCustomerPage();
        //verify and delete customer
        customerPage.verifyCustomer();
        customerDetail = customerPage.openCustomerDetail();
        customerDetail.checkCustomerDetails();
        //customerPage.deleteCustomer();

    }
}
