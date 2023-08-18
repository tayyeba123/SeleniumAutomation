package org.pages.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResults {

    static String product = "(//img[@class='s-image'])[1]";
    public static void clickonresult(WebDriver driver){

        driver.findElement(By.xpath(product)).click();
    }
}
