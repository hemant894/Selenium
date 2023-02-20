package SeleniumChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverEdge {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","\\C:\\software\\Driver\\msedgedriver.exe\\");
  WebDriver  driver =new EdgeDriver();
  // Navitgate to ebay.co.uk
        driver.get("https://www.ebay.co.uk/");
        // Maximise the window
        driver.manage().window().maximize();
        // Full screen
       driver.manage().window().fullscreen();
       // Minimise the window
       driver.manage().window().minimize();
       // Maximise the window
       driver.manage().window().maximize();
       // Refresh the page
        driver.navigate().refresh();
        // Go to daily deals
        driver.get("https://www.ebay.co.uk/deals");
        // go to Register page
        driver.get("https://signup.ebay.co.uk/pa/crte?ru=https%3A%2F%2Fwww.ebay.co.uk%2F");
        // go to sign in page
        driver.get("https://signin.ebay.co.uk/ws/eBayISAPI.dll?SignIn&UsingSSL=1&siteid=3&co_partnerId=2&pageType=2556586&ru=https://www.ebay.co.uk/&regUrl=https%3A%2F%2Fsignup.ebay.co.uk%2Fpa%2Fcrte%3Fru%3Dhttps%253A%252F%252Fwww.ebay.co.uk%252F");

        // close the window and go to yahoo
        driver.navigate().to("https://yahoo.com");
        driver.quit();


    }
}
