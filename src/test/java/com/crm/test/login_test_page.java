package com.crm.test;

import com.crm.pages.LoginPage;
import com.crm.util.ConfigurationReader;
import com.crm.util.Driver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class login_test_page {

    @Test (dataProvider = "loginData")
      public void loginTest(String userName, String password){
      Driver.getDriver().get(ConfigurationReader.getProperty("env"));

        LoginPage loginPage = new LoginPage();
        loginPage.loginInput.sendKeys(userName);
        loginPage.passwordInput.sendKeys(password);
        loginPage.loginButton.click();

        Driver.closeDriver();


}

    @DataProvider (name = "loginData")
    public Object[] [] userNameAndPassword (){
        return new Object[][]{
                {"hr76@cydeo.com", "UserUser"},
                {"hr77@cydeo.com", "UserUser"},
                {"hr78@cydeo.com", "UserUser"},
                {"helpdesk76@cydeo.com", "UserUser"},
                {"helpdesk77@cydeo.com", "UserUser"},
                {"helpdesk78@cydeo.com","UserUser"},
                {"marketing76@cydeo.com", "UserUser"},
                {"marketing77@cydeo.com", "UserUser"},
                {"marketing78@cydeo.com", "UserUser"}
        };
    }





}
