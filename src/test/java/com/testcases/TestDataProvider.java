package com.testcases;

import org.testng.annotations.DataProvider;

public class TestDataProvider {

    @DataProvider
    public Object[][] dataLoginCRM() {

        return new Object[][]{

                {"admin@example.com", "123456"},
                {"admin@example.com", "123456"},
                {"admin@example.com", "123456"},

        };
    }
}
