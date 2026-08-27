package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigReader;

public class BaseTest {

    @BeforeMethod
    public void setUp() {
        String browser = ConfigReader.get("browser");
        DriverFactory.initDriver(browser);
        DriverFactory.getDriver().get(ConfigReader.get("url"));
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
