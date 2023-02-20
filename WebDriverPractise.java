package SeleniumChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverPractise {
    public static void main(String[] args) throws InterruptedException {
        // Set up the chrome Driver path
        System.setProperty("webdriver.chrome.driver", "C:\\software\\Driver\\chromedriver.exe");
        // then instance for webdriver.
        WebDriver driver = new ChromeDriver();
//      Navigate to Wegpage
        driver.get("https://demo.nopcommerce.com/");
        // get the title page
        System.out.println("page title is : " + driver.getTitle());
        // other way we can try
        String PageTitle = driver.getTitle();
        System.out.println("page title is :" + PageTitle);
        // Validation Expected vs Actual
        if (PageTitle == "nopCommerce demo store") {
            System.out.println(" Page title is correct");
        } else {
            System.out.println("Page title is incorrect");
        }
        // Navigation
        driver.findElement(By.className("ico-login")).click();
        // Navigation back
        driver.navigate().back();
        // Navigation forward
        driver.navigate().forward();
        // Maximize the window
        driver.manage().window().maximize();
       // Minimize the window
        driver.manage().window().minimize();
        // reload
        driver.navigate().refresh();

        driver.navigate().to("https://demo.nopcommerce.com/electronics");
        driver.quit();
    }
}


