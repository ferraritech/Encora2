package pe.com.bcp.techcases.testautomation.ui.pages.sauce;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

//@DefaultUrl("page:base.page")
@DefaultUrl("page:saucedemo.page")
public class SauceDemoLoginPage extends PageObject {

    private By userNameInput = By.id("user-name"); // Campo de usuario
    private By passwordInput = By.id("password"); // Campo de contraseña
    private By loginButton = By.id("login-button"); // Botón de inicio de sesión
    private By errorMessage = By.cssSelector(".error-message-container"); // Contenedor de mensajes de error

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
        return getDriver().findElement(errorMessage).getText();
    }

}