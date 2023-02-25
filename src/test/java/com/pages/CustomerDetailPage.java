package com.pages;

import keywords.WebUI;
import org.openqa.selenium.WebDriver;

public class CustomerDetailPage extends CustomerPage{

    public void checkCustomerDetails (){

        System.out.println(WebUI.getAttribute(company, "value"));
        System.out.println(WebUI.getAttribute(vat,"value"));
        System.out.println(WebUI.getAttribute(number, "value"));

    }

}
