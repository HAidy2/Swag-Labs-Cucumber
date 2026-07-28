package Tests.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
//import java.util.logging.FileHandler;


public class ScreenShot {
    public static File takeScreenShot(WebDriver driver , String path ) throws IOException {
        TakesScreenshot takeScreenShot = (TakesScreenshot) driver;
       File srcshoot =  takeScreenShot.getScreenshotAs(OutputType.FILE);
       File dest = new File(path);
        FileHandler.copy(srcshoot , dest);
        return dest;

    }
}
