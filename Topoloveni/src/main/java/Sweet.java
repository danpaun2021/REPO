import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sweet {

      WebDriver driver;


      void chromeInit(){

          WebDriverManager.chromedriver().setup();
          driver = new ChromeDriver();
      }

    void testCase1(String targetAddress,
                   String rejectButton,
                   String searchField,
                   String searchText,
                   String firstResult,
                   String skipAdsButton) {

    // Step1: Initializing Chrome
        chromeInit();

    // Step2: Go to targetAddress
        driver.get(targetAddress);




    }
}
