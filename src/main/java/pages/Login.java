package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login extends Base {
    private By userName = By.id("user-name");
    private By Password = By.id("password");
    private By loginButton = By.id("login-button");
    public Login(WebDriver driver) {
        super(driver);
    }
    public void enterUserName (String username){
        findElement(userName).sendKeys(username);
    }
    public void enterPassword (String Pass){
        findElement(Password).sendKeys(Pass);
    }
    public Products clickLoginButton (){
        findElement(loginButton).click();
        return new Products(driver);
    }
    public WebElement getUserName(){
        return findElement(userName);
    }
    public WebElement getPassword(){
        return findElement(Password);
    }
    public WebElement getLoginButton(){
        return findElement(loginButton);
    }

}
