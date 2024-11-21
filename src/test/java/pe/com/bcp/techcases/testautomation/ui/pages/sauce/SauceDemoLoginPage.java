package pe.com.bcp.techcases.testautomation.ui.pages.sauce;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("page:base.page")
public class SauceDemoLoginPage extends PageObject {

    private By userNameInput;
    private By passwordInput;
    private By loginButton;
    private By errorMessage;

    public void typeUser(String user){
        getDriver().findElement(userNameInput).sendKeys(user);
    }

    public void typePassword(String pass){
        getDriver().findElement(passwordInput).sendKeys(pass);
    }

    public void logIn(){
        getDriver().findElement(loginButton).click();
    }

    public String getErrorMessage(){
        return "<Mensaje de Error>";
    }

}