package org.pages.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
    static String searchbox = "//input[@id='twotabsearchtextbox']";
    static String searchbutton = "//input[@id='nav-search-submit-button']";

    public static void searchItem(WebDriver driver ){

        driver.findElement(By.xpath(searchbox)).sendKeys("type c to vga and hdmi");
        driver.findElement(By.xpath(searchbutton)).click();


    }
}
