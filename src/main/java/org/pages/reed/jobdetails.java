package org.pages.reed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class jobdetails {


    static String applybutton = "//button[@id='applyButtonSide']";
    public static void clickonapplybutton(WebDriver driver ) {


        driver.findElement(By.xpath(applybutton)).click();

    }








}

