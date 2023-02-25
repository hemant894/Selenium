package SeleniumChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirefoxWebdriver {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","C:\\software\\Driver\\geckodriver.exe");
        WebDriver driver =new FirefoxDriver();
        driver.get("https://demo.opencart.com/");
        // the tile page


        System.out.println(" 1. Title page : "+ driver.getTitle());
        // different way we can try is
        String PageTitle = driver.getTitle();
        System.out.println(" 2. Title Page : "+ driver.getTitle());
       // if (PageTitle == "Your Store"){
     //       System.out.println("Page title is correct");}
   //     else
    //    {
     //       System.out.println(" Page title is incorrect");
        // Go to chekc mac price and spec.
    driver.get("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=20_27");
    driver.navigate().refresh();
    // browse the mobiles phones
        driver.get("https://demo.opencart.com/index.php?route=product/product&language=en-gb&path=24&product_id=28");
         driver.manage().wait(3000);
        driver.manage().window().minimize();
        driver.manage().wait(30000);
        driver.navigate().back();

        }
    }
