import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Utils {

    WebDriver driver;


    void launchBrowser(String browser){

        switch(browser){

            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;


            default:
                System.out.println("Invalid browser selection.");
                break;


        }
    }

    void browserManager(int timeoutOverride){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeoutOverride));
    }

    void closeBrowser(){
        driver.close();
    }
}
