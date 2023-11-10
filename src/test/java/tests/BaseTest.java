package tests;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.core.logging.Logger;
import aquality.selenium.core.utilities.ISettingsFile;
import aquality.selenium.core.utilities.JsonSettingsFile;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

import static aquality.selenium.browser.AqualityServices.getBrowser;

public class BaseTest {
	 private final ISettingsFile configReader = new JsonSettingsFile("config.json");
	    private final String URL = configReader.getValue("/login").toString();
	    public Logger logger = AqualityServices.getLogger();
	    @BeforeTest
	    public void beforeTest(){
	        getBrowser().maximize();
	        getBrowser().goTo(URL);
	        getBrowser().waitForPageToLoad();
	    }
	    @AfterClass
	    public void afterClass(){
	        getBrowser().getDriver().quit();
	    }

}
