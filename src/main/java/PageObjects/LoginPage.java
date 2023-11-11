package PageObjects;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import frameworks.BaseForm;
import org.openqa.selenium.By;

public class LoginPage extends BaseForm {
    public LoginPage(){
        super(By.xpath("//span[contains(text(),'Sign up')]"), "login page is not open");
    }
    private final ITextBox username = getElementFactory().getTextBox(By.xpath("//form[@id=\"login-form\"]//input[@placeholder=\"User name or Email\"]"),"Username");
    private final ITextBox password = getElementFactory().getTextBox(By.id("lfpwd"),"Password");
    private final IButton login = getElementFactory().getButton(By.cssSelector(".line-height-input.btn-padding.text-l.auth-button.login-button"), "Login");


    public void setUsername(String value){
        username.clearAndType(value);
    }

    public void setPassword(String value){
        password.clearAndType(value);
    }
    public void setLogin(){
        login.getJsActions().clickAndWait();
    }


}
