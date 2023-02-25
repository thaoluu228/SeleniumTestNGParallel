package com.testcases;

import com.common.BaseTest;
import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.pages.ProjectPage;
import org.testng.annotations.Test;

public class ProjectTest extends BaseTest {
    LoginPage loginPage;
    DashboardPage dashboardPage;
    ProjectPage projectPage;

    @Test
    public void addNewProject() throws Exception {
        loginPage = new LoginPage();
        //open dashboard page
        dashboardPage = loginPage.login("admin@example.com", "123456");
        //open project page
        projectPage = dashboardPage.openProjectPage();
        projectPage.addNewProject();
    }
    @Test
    public void verifyProject() throws Exception {
        loginPage = new LoginPage();
        dashboardPage = loginPage.login("admin@example.com", "123456");
        projectPage = dashboardPage.openProjectPage();
        projectPage.verifyProject();
    }

}
