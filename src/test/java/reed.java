import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.pages.reed.HomePage;
import org.pages.reed.jobdetails;
import org.pages.reed.searchResult;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class reed {


    static WebDriver driver;


    @Test
    public static void applyJob() {
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

        HomePage.launchsite(driver);
        HomePage.SearchJob(driver);
        searchResult.clickonresult(driver);
        jobdetails.clickonapplybutton(driver);



    }


}
