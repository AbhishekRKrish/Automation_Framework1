import driver.Driver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        Driver.initDriver();
    }

    @AfterTest
    public void tearDown(){
        Driver.quit();
    }
}
