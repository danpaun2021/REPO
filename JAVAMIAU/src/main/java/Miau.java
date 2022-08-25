import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Miau {


    WebDriver driver;
    int timeoutOverride = 60;
    void chromeInit() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    void chromeClosed() {
        driver.close();
    }
    void testCase1(String targetAddress,
                   String rejectButton,
                   String searchField,
                   String searchText,
                   String firstResult,
                   String skipAdsButton)
    {

        // Step1: Start Chrome
        chromeInit();

        // Step2: Set timeout value to global variable timeoutOverride
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeoutOverride));

        // Step3: Go to targetAddress
        driver.get(targetAddress);

        // Step4: Find element rejectButton
        WebElement rejectElement = driver.findElement(By.xpath(rejectButton));

        // Step5: Click on rejectButton
        rejectElement.click();

        //Step6: Target searchField
        WebElement searchElement = driver.findElement(By.xpath(searchField));

        //Step7: Click on searchField
        searchElement.click();
        searchElement.click();

        //Step8: Write text songName
        searchElement.sendKeys(searchText);

        //Step9: Press ENTER
        searchElement.sendKeys(Keys.RETURN);

        //Step10: Target firstResult
        WebElement resultElement = driver.findElement(By.xpath(firstResult));

        //Step11: Click on firstResult
        resultElement.click();

        //Step12: Target skipAdsButton
        WebElement skipAdsElement = driver.findElement(By.xpath(skipAdsButton));

        //Step13: Click on skipAdsButton
        skipAdsElement.click();

    }

    void testCase2 (String targetAddress,
                   String rejectButton,
                   String searchField,
                   String searchText,
                   String firstResult,
                   String skipAdsButton)
    {
        //Step1: Run testCase1
        testCase1(
                "https://youtube.com",
                "//*[@aria-label='Reject the use of cookies and other data for the purposes described']",
                "//input[@placeholder='Search']",
                "Cat poti tu de tare",
                "//*[@href='/watch?v=ZhL2-hWfE-k']",
                "//*[@class='ytp-ad-skip-button ytp-button']"
        );

        //Step2: Close Chrome
        chromeClosed();

    }


      @Test
    void testRunner() {

          testCase1(
                  "https://youtube.com",
                  "//*[@aria-label='Reject the use of cookies and other data for the purposes described']",
                  "//input[@placeholder='Search']",
                  "Cat poti tu de tare",
                  "//*[@href='/watch?v=ZhL2-hWfE-k']",
                  "//*[@class='ytp-ad-skip-button ytp-button']"
          );




    }
}









// Create a class to contain everything
// public class Main {
//
//    // Create WebDriver object, called "driver" (we use it later, to control our browser).
//    WebDriver driver;
//
//    // Create a global int object / variable, to act as a general override of the timeout value.
//    int timeoutOverride = 60;
//
//    // Create a method that launches a new Chrome browser window.
//    void chromeInit(){
//
//        // setup ChromeDriver
//        WebDriverManager.chromedriver().setup();
//
//        // start Chrome
//        driver = new ChromeDriver();
//    }
//
//    // Create a method that takes a few parameters, and lists test steps within.
//    void testSteps(String targetAddress,
//                   String rejectButton,
//                   String searchField,
//                   String searchText,
//                   String firstResult,
//                   String skipAdsButton){
//
//        // Step 1 - launch Chrome.
//        chromeInit();
//
//        // Step 1.5 - set timeout = value of our "timeoutOverride" variable, above.
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeoutOverride));
//
//        // Step 2 - go to the address stored in variable "targetAddress".
//        driver.get(targetAddress);
//
//        // Step 3 - target the Reject button.
//        WebElement rejectElement = driver.findElement(By.xpath(rejectButton));
//
//        // Step 4 - click the Reject button.
//        rejectElement.click();
//
//        // Step 5 - target the Search field.
//        WebElement searchElement = driver.findElement(By.xpath(searchField));
//
//        // Step 6 - click in the Search field.
//        searchElement.click();
//
//        // Step 7 - click in the Search field, again.
//        searchElement.click();
//
//        // Step 8 - type text in the Search field.
//        searchElement.sendKeys(searchText);
//
//        // Step 9 - press "Enter" in the Search field.
//        searchElement.sendKeys(Keys.RETURN);
//
//        // Step 10 - target the FIRST RESULT.
//        WebElement firstElement = driver.findElement(By.xpath(firstResult));
//
//        // Step 11 - click on the FIRST RESULT.
//        firstElement.click();
//
//        // Step 12 - target the SKIP ADS button.
//        WebElement skipAds = driver.findElement(By.xpath(skipAdsButton));
//
//        // Step 13 - click the SKIP ADS button.
//        skipAds.click();
//    }
//
//    // Create a method that calls our test, with the desired parameter values.
//    @Test
//    void testRunner(){
//
//        // Call the "testSteps" method we created above, and give it some parameters.
//        testSteps(
//                "https://youtube.com",
//                "//*[@aria-label='Reject the use of cookies and other data for the purposes described']",
//                "//input[@placeholder='Search']",
//                "baby shark",
//                "//*[@href='/watch?v=XqZsoesa55w']",
//                "//*[@class='ytp-ad-skip-button ytp-button']"
//        );
//    }
//}