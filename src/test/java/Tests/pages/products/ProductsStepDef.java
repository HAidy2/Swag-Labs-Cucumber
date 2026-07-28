package Tests.pages.products;

import Tests.base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ProductsStepDef extends BaseTest {

//    public Products productsPage;
    @Given("products are visible")
    public void productsAreVisible()
    {
//        productsPage=new Products(login.driver);
        Assert.assertTrue(products.getProduct().isDisplayed());
    }
    
    @Then("verify the product {string} in products page is correct")
    public void verifyTheProductNameCorrect(String name)
    {
        Assert.assertEquals(products.getProductName(),configHandler.getValue(name));
    }

}