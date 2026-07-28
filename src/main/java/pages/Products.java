package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Products extends Base {
//    private final By product= By.xpath("//*[@id=\"item_0_title_link\"]/div");
    private final By product=By.cssSelector(".inventory_item_name");

    public Products(WebDriver driver){
        super(driver);
    }

    public WebElement getProduct(){
        return findElement(product);

    }

    public String getProductName(){
        return findElement(product).getText();

    }

    public WebElement getProductNameLink(){
        return findElement(product);
    }

    public String extractName(){
        return findElement(product).getText();
    }
    public List<String> searchInCsv(){
        List<String> names=new ArrayList<>();
        for (WebElement name:findElementList(product)){
            names.add(name.getText());
        }
        return names;

    }
    public ProductDetails clickOnNameLink(){
        findElement(product).click();
        return new ProductDetails(driver);
    }
}

