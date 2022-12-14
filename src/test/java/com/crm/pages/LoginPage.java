package com.crm.pages;

import com.crm.util.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
     /*
        PageFactory class is a Selenium class that support POM
        It has method called initElements. Once it's called it will store all elements specified using @FindBy
        annotation with locator and it wll give elements to the classes when they called
        initElements method accept 2 arg
        WebDriver instance and Page class instance (this) means current instance of this class
         */

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (name = "USER_LOGIN")
    public WebElement loginInput;

    @FindBy (name = "USER_PASSWORD")
    public WebElement passwordInput;

    @FindBy (className = "login-btn")
    public WebElement loginButton;

}
