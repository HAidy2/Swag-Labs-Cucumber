package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkout extends Base {


    private final By firstName  = By.id("first-name");
    private final By lastName   = By.id("last-name");
    private final By zipCode = By.name("postalCode");
    private final By continueBtn = By.id("continue");
    private final By pagetitle = By.cssSelector("[data-test='title']");
    public Checkout(WebDriver driver) {
        super(driver);
    }


    public WebElement getFirstName() {
        return findElement(firstName);
    }

    public WebElement getLastName() {
        return findElement(lastName);
    }

    public WebElement getZipCode() {
        return findElement(zipCode);
    }

    public WebElement getPagetTitleElement(){
        return findElement(pagetitle);
    }

    public WebElement getContinueButton() {
        return findElement(continueBtn);
    }

    public void fillCheckoutForm(String first, String last, String zip) {
        getFirstName().clear();
        getFirstName().sendKeys(first);

        getLastName().clear();
        getLastName().sendKeys(last);

        getZipCode().clear();
        getZipCode().sendKeys(zip);
    }
}
