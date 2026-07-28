package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cart extends Base {
private By cartIconButton= By.id("shopping_cart_container");
private By checkoutButton= By.id("checkout");
private By product=By.cssSelector("[data-test='inventory-item-name']");

public Cart(WebDriver driver){
    super(driver);
}

    public WebElement getCartIconButton() {
        return findElement(cartIconButton);
    }
    public WebElement getCheckoutButton() {
        return findElement(checkoutButton);
    }
    public String getProductName(){
      return findElement(product).getText();
    }
}
