package org.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.pages.amazon.*;


import java.util.concurrent.TimeUnit;

public class Amazon {




    public static void buyProduct() {
//        System.setProperty(
//                "webdriver.chrome.driver",
//                "C:\\Users\\ADMIN\\Documents\\chromedriver.exe");

        // Instantiate a ChromeDriver class.
        ChromeOptions ops = new ChromeOptions();

        ops.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(ops);



        // Maximize the browser
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        // Launch Website

        Login.login(driver);
        HomePage.searchItem(driver);
        SearchResults.clickonresult(driver);
        Cart.addtToCart(driver);
        CheckOut.checkout(driver);
        Address.selectAddress(driver);









    }
}
