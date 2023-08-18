package org.pages.reed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class searchResult {


        static String jobResult = "(//a[@class='gtmJobTitleClickResponsive'])[1]";
        public static void clickonresult(WebDriver driver){

            driver.findElement(By.xpath(jobResult)).click();

        }
    }


