package com.vy_track.test;

import com.crm.util.Driver;
import com.vy_track.pages.LoginPage;
import com.vy_track.util.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class EditDeleteCarInfoFromVehiclePageTest {

    @Test
    public void loginTest(){
        Driver.getDriver().get(ConfigurationReader.getProperty("vyTrackEnv"));
        LoginPage loginPage = new LoginPage();
        loginPage.inputUserName.sendKeys("user184");
        loginPage.inputPassword.sendKeys("UserUser123");
        loginPage.loginButton.click();
        loginPage.fleetButton.click();
        loginPage.vehiclesButton.click();

        for (int i = 1; i<6; i++) {
            WebElement threeDots = Driver.getDriver().findElement(By.xpath( "(//td[@class='action-cell grid-cell grid-body-cell']//a[@href='javascript:void(0);'])["+i+"]"));
            Actions actions = new Actions(Driver.getDriver());
            actions.moveToElement(threeDots).pause(1000).click().perform();
        }
    }
}
