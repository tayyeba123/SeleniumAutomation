package org.pages.reed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


    public class HomePage {
        static String jobName = "//input[@id='main-keywords']";
        static String postcode = "//input[@id='main-location']";

        static String searchButton = "//button[@id='homepageSearchButton']";
        static String agreeButton = "//button[@id='onetrust-accept-btn-handler']";
        static String applybutton = "//button[@id='applyButtonSide']";
        public static void SearchJob(WebDriver driver ){

            driver.findElement(By.xpath(agreeButton)).click();
            driver.findElement(By.xpath(jobName)).sendKeys("selenium");
            driver.findElement(By.xpath(postcode)).sendKeys("lu7 3gn");
            driver.findElement(By.xpath(searchButton)).click();



        }

        public static void launchsite(WebDriver driver){
            driver.get("https://www.reed.co.uk/");
        }

        public static void applybutton(WebDriver driver) {
        }
    }


