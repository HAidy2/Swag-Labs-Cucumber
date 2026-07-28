package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutOverview extends Base {

    private final By productTitle = By.cssSelector("[data-test='inventory-item-name']");
    private final By finishButton = By.id("finish");
    private final By pageTitle    = By.cssSelector("[data-test='title']");

    public CheckoutOverview(WebDriver driver) {
        super(driver);
    }

    public WebElement getProductTitle() {
        return findElement(productTitle);
    }

    public WebElement getFinishButton() {
        return findElement(finishButton);
    }

    public WebElement getPageTitle() {
        return findElement(pageTitle);
    }
}