package PageObjects;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import frameworks.BaseForm;
import org.openqa.selenium.By;
import utils.RobotUtils;

public class DashBoardPage extends BaseForm {
    public DashBoardPage(){
        super(By.id("add-btn"), "DashBoard Page is not open");
    }
    private final IButton newProjectButton = getElementFactory().getButton(By.xpath("//img[@id='add-btn']"),"NewProjectButton");
    private final IButton uploadButton = getElementFactory().getButton(By.xpath("//img[@aria-label='Upload Project']"), "Upload");
    private final IButton alertYesWhileUploading = getElementFactory().getButton(By.xpath("//button[normalize-space()='Yes']"), "Transcription Accept");
    public void setNewProjectButton(){
        newProjectButton.getJsActions().clickAndWait();
    }
    public void clickedOnUpload(String filePath){
        uploadButton.clickAndWait();
        RobotUtils robot = new RobotUtils();
        robot.uploadFile(filePath);
    }
    public void clickedOnYes(){
        alertYesWhileUploading.clickAndWait();
    }

}
