package com.theinternet.pages;

import com.theinternet.pages.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUploadPage extends BasePage {


    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "file-upload")
    private WebElement fileInput;

    @FindBy(id = "file-submit")
    private WebElement uploadButton;

    @FindBy(tagName = "h3")
    private WebElement title;

    @FindBy(id = "uploaded-files")
    private WebElement uploadedFiles;


    public void chooseFile(String absolutePathToFile) {
        fileInput.sendKeys(absolutePathToFile);
    }


    public void clickUpload() {
        click(uploadButton);
    }


    public void uploadFile(String absolutePathToFile) {
        chooseFile(absolutePathToFile);
        clickUpload();
    }


    public String getTitleText() {
        return getText(title);
    }


    public String getUploadedFileName() {
        return getText(uploadedFiles);
    }
}
