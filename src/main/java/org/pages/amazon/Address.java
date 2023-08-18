package org.pages.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Address {
    static String adress= "//span[@id='orderSummaryPrimaryActionBtn']";

    public static void selectAddress(WebDriver driver){

        driver.findElement(By.xpath(adress)).click();
    }
}
