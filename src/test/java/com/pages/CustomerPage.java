package com.pages;

import driver.DriverManager;
import keywords.WebUI;
import keywords.WebUI;
import org.openqa.selenium.*;
import org.testng.Assert;

public class CustomerPage {
    private String COMPANY = "Jennie";

    By newCustomerButton = By.xpath("//a[normalize-space()='New Customer']");
    By company = By.xpath("//input[@id='company']");
    By vat = By.xpath("//input[@id='vat']");
    By number = By.xpath("//input[@id='phonenumber']");
    By website = By.xpath("//input[@id='website']");
    By group = By.xpath("//label[@for='groups_in[]']/following-sibling::div");
    By group_search = By.xpath("//label[@for='groups_in[]']/following-sibling::div//input[@type='search']");
    By address = By.xpath("//textarea[@id='address']");
    By city = By.xpath("//input[@id='city']");
    By state = By.xpath("//input[@id='state']");
    By zip = By.xpath("//input[@id='zip']");
    By country = By.xpath("//label[@for='country']/following-sibling::div");
    By country_search = By.xpath("//label[@for='country']/following-sibling::div//input[@class='form-control']");
    By saveButton = By.xpath("//button[@class='btn btn-primary only-save customer-form-submiter']");
    By searchCustomer = By.xpath("//input[@class='form-control input-sm']");
    By getCustomer = By.xpath("//tbody/tr[1]/td[3]/a");


    public void addNewCustomer (){
        WebUI.waitForPageLoaded();
        WebUI.clickToElement(newCustomerButton);
        WebUI.waitForPageLoaded();
        WebUI.sendKeyToElement(company, COMPANY);
        WebUI.sendKeyToElement(vat, "1234567");
        WebUI.sendKeyToElement(number, "0364762");
        WebUI.sendKeyToElement(website, "https://cmcglobal.com.vn/vi/home-vi/");
        WebUI.clickToElement(group);
        WebUI.sleep(1);
        WebUI.sendKeyEnter(group_search, "Gold");
        WebUI.sendKeyToElement(address, "235");
        WebUI.sendKeyToElement(city, "Hanoi");
        WebUI.sendKeyToElement(state, "Hanoi");
        WebUI.sendKeyToElement(zip, "0000");
        WebUI.clickToElement(country);
        WebUI.sleep(1);
        WebUI.sendKeyEnter(country_search, "Vietnam");
        WebUI.sleep(1);
        WebUI.clickToElement(saveButton);
        WebUI.sleep(1);
        WebUI.waitForPageLoaded();
        WebUI.waitForElementVisible( By.xpath("//span[@class='alert-title']"));
        //verify message success
        Assert.assertTrue(WebUI.checkElementExist("//span[@class='alert-title']" ));
        System.out.println(WebUI.getTextElement(By.xpath("//span[@class='alert-title']")));
    }
    public void verifyCustomer (){
        WebUI.waitForPageLoaded();
        WebUI.sendKeyToElement(searchCustomer, COMPANY);
        WebUI.sleep(1);
        WebUI.waitForPageLoaded();
        WebUI.waitForElementVisible( getCustomer);
        String getCustomerName = WebUI.getTextElement(getCustomer);
        Assert.assertEquals(getCustomerName, COMPANY, "Fail. Customer name not match");
    }
    public void deleteCustomer() {
        //WebElement element = driver.findElement(By.xpath("//tbody/tr[1]/td[3]/a"));
        //Actions action = new Actions(driver);
        //action.moveToElement(element).build().perform();
        WebUI.hoverMouseToElement(By.xpath("//tbody/tr[1]/td[3]/a"));
        WebUI.sleep(2);
        WebUI.waitForElementVisible( By.xpath("//tbody/tr[1]/td[3]/div/a[contains(text(),'Delete')]"));
        WebUI.clickToElement(By.xpath("//tbody/tr[1]/td[3]/div/a[contains(text(),'Delete')]"));
        //Alert alert = driver.switchTo().alert();
        //WebUI.sleep(2);
        //alert.accept();
        WebUI.acceptAlert();
        WebUI.sleep(2);
        Assert.assertTrue(WebUI.checkElementExist("//span[@class='alert-title']" ));
        System.out.println(WebUI.getTextElement(By.xpath("//span[@class='alert-title']")));
    }
    public CustomerDetailPage openCustomerDetail(){
        WebUI.waitForPageLoaded();
        WebUI.clickToElement(getCustomer);
        WebUI.sleep(1);
        return new CustomerDetailPage();
    }

}
