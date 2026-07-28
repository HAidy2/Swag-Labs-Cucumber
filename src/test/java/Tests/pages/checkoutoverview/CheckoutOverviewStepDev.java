package Tests.pages.checkoutoverview;

import Tests.base.BaseTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CheckoutOverview;

public class CheckoutOverviewStepDev extends BaseTest {
    @Then("validate the product name {string} is the same product from cart")
    public void validate_the_product_name_is_displayed_in_checkout_overview(String expectedProductName) {
         checkoutOverview=new CheckoutOverview(checkout.driver);
        Assert.assertEquals(checkoutOverview.getProductTitle().getText(),configHandler.getValue(expectedProductName));
    }

    @When("click on the finish button")
    public void click_on_the_finish_button() {
        checkoutOverview.getFinishButton().click();
    }

    @Then("validate the checkout complete page is opened")
    public void validate_the_checkout_complete_page_is_opened() {
        Assert.assertEquals(checkoutOverview.getPageTitle().getText(),"Checkout: Complete!");
    }
}
