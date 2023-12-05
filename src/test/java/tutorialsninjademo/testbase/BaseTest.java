package tutorialsninjademo.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import propertyreader.PropertyReader;
import utilities.Utility;

public class BaseTest extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");
    @BeforeMethod
    public void setup()
    {
        selectBrowser();
    }
    @AfterMethod
    public void tearDown {
        closeBrowser();
    }
}
