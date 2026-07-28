package Tests.pages.productdetails;

import Tests.base.BaseTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProductDetails;
import org.testng.Assert;

public class productDetailsStepDef extends BaseTest {
    @When("click on product name link in products page")
    public void productDetailsOpened(){
        products.clickOnNameLink();
    }
    @Then("validate the product details page is opened")
    public void validateProductDetailsOpened(){
        productDetails=new ProductDetails(products.driver);
       Assert.assertTrue(productDetails.getProduct().isDisplayed());
    }
    @When("click on add to cart button in product details page")
    public void clickOnAddCartButton(){
        productDetails.clickOnAddToCartButton();
    }
    @Then("verify the remove button appears")
    public void verifyRemoveButtonAppears(){
      Assert.assertTrue(productDetails.getRemoveButton().isDisplayed());
    }
    @Then("Verify the cart icon badge change to contain the number one")
    public void verifyUpdateCartIcon(){
     Assert.assertEquals(productDetails.getCartIconBadge().getText(),"1");
    }
}
