package com.vy_track.pages;

import com.crm.util.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (name = "_username")
    public WebElement inputUserName;

    @FindBy (xpath = "//input[@type='password']")
    public WebElement inputPassword;

    @FindBy (xpath = "//button[@class='btn btn-uppercase btn-primary pull-right']")
    public WebElement loginButton;

    @FindBy (xpath = "//li[@class='dropdown dropdown-level-1']//span[@class='title title-level-1']")
    public WebElement fleetButton;

    @FindBy (xpath = "//span[text()='Vehicles']")
    public WebElement vehiclesButton;

    @FindBy (xpath = "(//td[@class='action-cell grid-cell grid-body-cell']//a[@href='javascript:void(0);'])[1]")
    public WebElement threeDots;

//    @FindBy (xpath = "//li[@class='launcher-item'][1]/a[@title='View']")
//    public WebElement viewOption;
//
//    @FindBy (xpath = "//li[@class='launcher-item'][1]/a[@title='Edit']")
//    public WebElement editOption;
//
//    @FindBy (xpath = "//li[@class='launcher-item'][1]/a[@title='Delete']")
//    public WebElement deleteOption;

}
