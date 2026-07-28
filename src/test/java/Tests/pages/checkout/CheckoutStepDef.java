package Tests.pages.checkout;

import Tests.base.BaseTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Checkout;

public class CheckoutStepDef extends BaseTest {

    @When("fill the form checkout with data : {string},{string},{string} in the checkout: your information page")
    public void fillTheForm(String firstName,String lastName,String zipCode){
        checkout=new Checkout(cart.driver);
        checkout.fillCheckoutForm(configHandler.getValue(firstName),configHandler.getValue(lastName),configHandler.getValue(zipCode));
    }
    @When("click on continue button in checkout:your information page")
    public void clickOnContinueButton(){
       checkout.getContinueButton().click();
    }
    @Then("validate navigation to checkout:overview page")
    public void validateNavigation(){
        Assert.assertEquals(checkout.getPagetTitleElement().getText(),"Checkout: Overview");

    }

}
