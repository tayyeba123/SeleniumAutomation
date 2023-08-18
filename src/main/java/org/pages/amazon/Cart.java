package org.pages.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart {


    static String addtocart= "//input[@id='add-to-cart-button']";

    public static void addtToCart(WebDriver driver){

        driver.findElement(By.xpath(addtocart)).click();
    }
}
