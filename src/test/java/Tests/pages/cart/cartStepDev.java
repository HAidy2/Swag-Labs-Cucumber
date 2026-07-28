package Tests.pages.cart;

import Tests.base.BaseTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Cart;
import org.testng.Assert;

public class cartStepDev extends BaseTest {
    @When("click on cart icon button in product details page")
    public void clickOnCartIconButton(){
        productDetails.getCartIconBadge().click();
    }
    @Then("validate the {string} is correct")
    public void validateProductName(String name){
        cart=new Cart(productDetails.driver);
        Assert.assertEquals(cart.getProductName(),configHandler.getValue(name));
    }
    @When("click on checkout button in cart page")
    public void clickOnCheckoutButton(){
      cart.getCheckoutButton().click();
    }
    @Then("validate the checkout page is opened")
    public void validateCheckoutOpened(){

    }
}
