import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.pages.amazon.*;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.remote.ErrorCodes.TIMEOUT;


public class testamazon {


    static WebDriver driver;
    @Test
    public static void buyProduct() {
//        System.setProperty(
//                "webdriver.chrome.driver",
//                "C:\\Users\\ADMIN\\Documents\\chromedriver.exe");

        // Instantiate a ChromeDriver class.

        WebDriverManager.chromedriver().setup();
        ChromeOptions ops = new ChromeOptions();

        ops.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(ops);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
        driver.manage().window().maximize();

        // Launch Website

        Login.login(driver);
        Reporter.log("Logged in ");
        HomePage.searchItem(driver);
        Reporter.log("searched item");
        SearchResults.clickonresult(driver);
        Reporter.log("selected the item");
        Cart.addtToCart(driver);
        Reporter.log("added to the cart");
        CheckOut.checkout(driver);
        Reporter.log("checked out the product");
        Address.selectAddress(driver);
        Reporter.log("Address selected ");

        driver.quit();
        Reporter.log("closed browser");

    }


    @AfterTest
    public void tearDown(){
//        driver.quit();


    }
}