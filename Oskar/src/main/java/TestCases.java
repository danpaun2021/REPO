public class TestCases {

    Utils utils = new Utils();

    void test1(String browser, int timeoutOverride){
        utils.launchBrowser(browser);
        utils.browserManager(timeoutOverride);


        utils.closeBrowser();
    }
}
