package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetails extends Base {
    private final By productName=By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]");
    private final By addToCartButton=By.id("add-to-cart");
    private final By removeButton=By.id("remove");
    private final By cartIconBadge =By.cssSelector("[data-test='shopping-cart-badge']");
    public ProductDetails(WebDriver driver){
        super(driver);
    }
    public WebElement getProduct(){
        return findElement(productName);

    }
    public String getProductName(){
        return findElement(productName).getText();
    }

    public WebElement getAddToCartButton() {
        return findElement(addToCartButton);
    }

    public WebElement getRemoveButton(){
        return findElement(removeButton);
    }
    public WebElement getCartIconBadge(){
        return findElement(cartIconBadge);
    }
    public void clickOnAddToCartButton(){
        findElement(addToCartButton).click();
    }
}
