package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("----------Starting excecution------------");
        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
        // Create a new FirefoxDriver instance
        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(true);
        WebDriver driver = new FirefoxDriver(options);

        // Navigate to a web page
        driver.get("https://www.example.com");

        // Print page title
        System.out.println("Page title is: " + driver.getTitle());

        // Close the browser
        driver.quit();
        System.out.println("----------Ending excecution------------");

    }
}
