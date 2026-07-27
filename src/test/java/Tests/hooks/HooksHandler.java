package Tests.hooks;

import Tests.base.BaseTest;
import Tests.drivers.WebDriverFactory;
import Tests.utils.ConfigHandler;
import Tests.utils.JSONFileManager;
import Tests.utils.ScreenShot;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pages.Login;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class HooksHandler extends BaseTest {
    private Logger log =  LogManager.getLogger(HooksHandler.class);
    @Before
    public void setUp(){
        configHandler = new ConfigHandler("src/main/resources/config.properties");
        driver = WebDriverFactory.getDriver(configHandler.getValue("browser"));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        softAssert = new SoftAssert();
        log.debug("Assertion Manager Initialized");
        log.debug("config Manager Initialized");
        jsonFileManager = new JSONFileManager("src/main/resources/Data.json");
        log.debug("Json File Manager Initialized");
        log.debug("Excel File Manager Initialized");
        login = new Login(driver);
    }

    @After
    public void teardown() {
//        driver.quit();
//        log.info("Quit");
        try{
            Allure.addAttachment("log File" , new FileInputStream("logs/application.log"));
        }catch(Exception e){
            e.printStackTrace();
        }

    }
    @AfterStep
    public void checkFail(Scenario scenario) throws IOException {
        if (scenario.isFailed()){
            File scrshoot = ScreenShot.takeScreenShot(driver, "screenshots/"+scenario.getName()+".png");
            Allure.addAttachment("ScreenShot" , new FileInputStream(scrshoot));
        }
    }
}
