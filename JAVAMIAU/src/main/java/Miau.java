import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Miau {



    private WebDriver driver;

    public WebDriver chromeInit () {

        WebDriverManager.chromedriver().setup();
        return driver = new ChromeDriver();

    }


    public void startBrowser (String adresa, String xPath) {

        chromeInit();
        driver.get(adresa);
        WebElement thisElement = driver.findElement(By.xpath(xPath));
        thisElement.click();
    }
    @Test
    void testRunner () {
        startBrowser("https://qa-practice.netlify.app/","//a[@href='#pageSubmenu']");
    }
}
