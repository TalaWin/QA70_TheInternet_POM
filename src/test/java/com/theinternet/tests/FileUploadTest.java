package com.theinternet.tests;

import com.theinternet.pages.FileUploadPage;
import com.theinternet.pages.HomePage;
import com.theinternet.tests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTest extends BaseTest {


    private FileUploadPage openFileUploadPage() {
        HomePage home = new HomePage(driver);
        home.openFileUpload();
        return new FileUploadPage(driver);
    }


    @Test
    public void uploadTxtFileTest() {
        FileUploadPage uploadPage = openFileUploadPage();
        String filePath = getFilePath("testFile.txt");
        uploadPage.uploadFile(filePath);

        Assert.assertEquals(
                uploadPage.getTitleText(),
                "File Uploaded!",
                "Неверный заголовок после загрузки файла"
        );


        Assert.assertEquals(
                uploadPage.getUploadedFileName(),
                "testFile.txt",
                "Имя загруженного файла не совпадает"
        );
    }


    @Test
    public void uploadPngFileTest() {
        FileUploadPage uploadPage = openFileUploadPage();
        String filePath = getFilePath("Tala_QA_Tango.png");
        uploadPage.uploadFile(filePath);

        Assert.assertEquals(uploadPage.getTitleText(), "File Uploaded!");
        Assert.assertEquals(uploadPage.getUploadedFileName(), "Tala_QA_Tango.png");
    }


    @Test
    public void uploadJpgFileTest() {
        FileUploadPage uploadPage = openFileUploadPage();
        String filePath = getFilePath("Tala_QA_Tango.jpg");
        uploadPage.uploadFile(filePath);

        Assert.assertEquals(uploadPage.getTitleText(), "File Uploaded!");
        Assert.assertEquals(uploadPage.getUploadedFileName(), "Tala_QA_Tango.jpg");
    }
}
