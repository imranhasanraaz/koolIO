package tests;

import aquality.selenium.core.utilities.ISettingsFile;
import aquality.selenium.core.utilities.JsonSettingsFile;
import PageObjects.LoginPage;
import PageObjects.DashBoardPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestKoolio extends BaseTest{
    @Test
    public void TestingLogin() throws InterruptedException {
        ISettingsFile testdata = new JsonSettingsFile("testdata.json");
        logger.info("Navigated to  login page");
        LoginPage loginPage = new LoginPage();

        loginPage.setUsername(testdata.getValue("/username").toString());
        loginPage.setPassword(testdata.getValue("/password").toString());
        loginPage.setLogin();
        DashBoardPage dashboard = new DashBoardPage();
        Assert.assertTrue(dashboard.waitForDisplayed(), "Dashboard is not open");
        logger.info("Login Successful");
        dashboard.setNewProjectButton();
        dashboard.clickedOnUpload(testdata.getValue("/audioPath").toString());
        logger.info("Accept transcription Alert");
        dashboard.clickedOnYes();
        logger.info("Accept One Speaker Alert");
        dashboard.clickedOnYes();
        Thread.sleep(5000);
    }
}
