package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("----------Starting excecution------------");
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the website you want to test
        driver.get("https://www.example.com");

        // Verify that the page title is correct
        String expectedTitle = "Example Domain";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Page title is correct");
        } else {
            System.out.println("Page title is incorrect");
        }

        // Close the browser
        driver.quit();
        System.out.println("----------Ending excecution------------");

    }
}
