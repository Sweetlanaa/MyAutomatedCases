package com.crm.util;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BrowserUtils {
        //Methods are static. Because we do not want to create an object to call those methods.
        // We just want to call those methods with class name. That is why they are static type


    /**
     * This method is used to pause the code for given seconds
     * It is static method we can call with class name
     * BrowserUtils.sleep(3);
     * @param seconds
     */

    public static void sleep(int seconds) {
        // 1 second = 1000 millis
        // millis = seconds*1000

        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            System.out.println("Exception happened in sleep method");
        }
    }

    //Method info:
    //• Name: verifyTitle()
    //• Return type: void
    //• Arg1: WebDriver
    //• Arg2: String expectedTitle

    //BrowserUtils.verifyTitle
    public static void verifyTitle(WebDriver driver, String expectedTitle){

         String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);

    }
}