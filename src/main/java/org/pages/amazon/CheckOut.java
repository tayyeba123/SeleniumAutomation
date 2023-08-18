package org.pages.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CheckOut {

    static String proceed= "//input[@name='proceedToRetailCheckout']";


    public  static void checkout(WebDriver driver){

        driver.findElement(By.xpath(proceed)).click();
    }
}
