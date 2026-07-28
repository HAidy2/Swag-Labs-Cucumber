package Tests.pages.Login;

import Tests.base.BaseTest;
import Tests.drivers.WebDriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginStepDef extends BaseTest {

    @Given("site is opened")
    public void siteIsOpened()
    {
        WebDriverFactory.getDriver("chrome").get(configHandler.getValue("url"));
    }

    @When("enter {string} and enter {string}")
    public void enterAndEnter (String user , String Pass){
        login.enterUserName(configHandler.getValue(user));
        login.enterPassword(configHandler.getValue(Pass));
    }

    @When("click on login button")
    public void clickOnLoginButton()
    {
        products= login.clickLoginButton();
    }

    @Then("verify the login is successful")
    public void verifyTheLoginIsSuccessfully()
    {
        Assert.assertTrue(products.getProduct().isDisplayed());
    }

}
