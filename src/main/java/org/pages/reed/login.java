package org.pages.reed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
    static String email = "//input[@name='email']";

    static String pass = "//input[@name='password']";
    static String login = "//input[@id='continue']";
    static String signin = "//input[@id='signInSubmit']";

    public static void login(WebDriver driver){



        driver.get("https://www.amazon.co.uk/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.co.uk%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=gbflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");

        driver.findElement(By.xpath(email)).sendKeys("sonia_chowdhary@hotmail.com");


        driver.findElement(By.xpath(login)).click();

        driver.findElement(By.xpath(pass)).sendKeys("Anaya2017.");


        driver.findElement(By.xpath(signin)).click();
    }
}


