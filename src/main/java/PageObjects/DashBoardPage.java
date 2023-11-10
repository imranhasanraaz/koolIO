package PageObjects;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import frameworks.BaseForm;
import org.openqa.selenium.By;

public class DashBoardPage extends BaseForm {
    public DashBoardPage(){
        super(By.id("add-btn"), "DashBoard Page is not open");
    }
    private final IButton newProjectButton = getElementFactory().getButton(By.id("add-btn"),"NewProjectButton");

    public void setNewProjectButton(){
        newProjectButton.click();
    }


}
