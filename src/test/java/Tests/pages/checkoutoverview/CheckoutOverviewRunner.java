package Tests.pages.checkoutoverview;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/Tests/checkoutoverview",
        glue = {"Tests","Hooks"},
        plugin = {"pretty" ,
                "html:target/cucumber-reports.html",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}

)
public class CheckoutOverviewRunner extends AbstractTestNGCucumberTests {
}
