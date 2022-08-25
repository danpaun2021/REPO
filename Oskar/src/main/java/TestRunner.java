import org.testng.annotations.Test;

public class TestRunner {

    TestCases tc = new TestCases();



    @Test
    void runTest1(){
        tc.test1("chrome", 60);


    }
}
