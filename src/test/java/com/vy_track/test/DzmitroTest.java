package com.vy_track.test;

import com.crm.util.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DzmitroTest {
    @Test
    public void us6() throws InterruptedException {
        Driver.getDriver().get("https://qa2.vytrack.com/user/login");
        ///////////////////Login//////////////////////////////////////////////////////
        String[] usernames = {"user184", "storemanager96", "storemanager97", "storemanager98"};
        WebElement username = Driver.getDriver().findElement(By.id("prependedInput"));
        username.sendKeys(usernames[0]);
        WebElement password = Driver.getDriver().findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123");
        WebElement loginBtn = Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
        loginBtn.click();
        ////////////////////////////Locating and Selecting Fleet dropdown///////////////////////////////////////////////////
        WebElement fleetDropdown = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
        fleetDropdown.click();
        ////////////////////////Vehicles option from Fleet select/////////////////
        WebElement vehicleContracts = Driver.getDriver().findElement(By.xpath("//span[.='Vehicles']"));
        vehicleContracts.click();
///////////////////////////Move mouse over three dots to see menu//////////////////////
        for (int i = 1; i < 6; i++) {
            WebElement threeDots = Driver.getDriver().findElement(By.xpath("(//td[@class='action-cell grid-cell grid-body-cell']//a[@href='javascript:void(0);'])[" + i + "]"));
            Actions action = new Actions(Driver.getDriver());
            action.moveToElement(threeDots).pause(1000).click().perform();


        }
    }
}
