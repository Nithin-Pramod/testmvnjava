package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("----------Starting excecution------------");
        System.setProperty("webdriver.chrome.driver", "//usr//local//bin//chromedriver");

        // Create a new instance of the ChromeDriver
        String chrome_driver_binary = "/usr/local/bin/chromedriver";


        ChromeOptions options = new ChromeOptions();

        options.addArguments("--headless");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--whitelisted-ips=\"\"");

        WebDriver driver = new ChromeDriver(options);

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


        ThreadGroup group = Thread.currentThread().getThreadGroup();
        while (group.getParent() != null) {
            group = group.getParent();
        }

        int activeCount = group.activeCount();
        while (activeCount > 0) {
            try {
                Thread.sleep(100);
                group.destroy();

            } catch (InterruptedException e) {
                // ignore
                group.destroy();
            }
            activeCount = group.activeCount();
        }

        group.destroy();

    }
}
