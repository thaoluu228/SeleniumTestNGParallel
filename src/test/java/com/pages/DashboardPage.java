package com.pages;

import driver.DriverManager;
import keywords.WebUI;
import keywords.WebUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private String URL = "https://crm.anhtester.com/admin/";


    By menuCustomer = By.xpath("//span[normalize-space()='Customers']");
    By menuProject = By.xpath("//li[@class='menu-item-projects']//a");

    public CustomerPage openCustomerPage(){
        WebUI.waitForPageLoaded();
        WebUI.clickToElement(menuCustomer);
        WebUI.sleep(1);
        return new CustomerPage();
    }

    public ProjectPage openProjectPage(){
        WebUI.waitForPageLoaded();
        WebUI.clickToElement(menuProject);
        WebUI.sleep(1);
        return new ProjectPage(DriverManager.getDriver());
    }

}
