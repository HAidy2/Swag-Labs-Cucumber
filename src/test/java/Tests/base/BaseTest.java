package Tests.base;

import Tests.utils.ConfigHandler;
import Tests.utils.JSONFileManager;
import pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class BaseTest {
    public static WebDriverWait wait;
    public static SoftAssert softAssert;
    public static ConfigHandler configHandler;
    public static JSONFileManager jsonFileManager;
    protected static WebDriver driver;
    public static Login login;
    public static Products products;
    public static ProductDetails productDetails;
    public static Cart cart ;
    public static Checkout checkout;
    public static CheckoutOverview checkoutOverview;


    public WebDriver getDriver(){
        return driver;
    }


//    public void LogOut(){
//    DriverSingleton.getDriverSingleton().getDriver().findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
//        WebElement Waiting = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"logout_sidebar_link\"]")));
//        Waiting.getLocation();
//    DriverSingleton.getDriverSingleton().getDriver().findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
//    }


}
