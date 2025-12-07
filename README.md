📌 HW-27 — Automated Tests for “File Upload” Page (the-internet.herokuapp.com)

This homework implements automated tests for the File Upload functionality on
https://the-internet.herokuapp.com/

All tests navigate from the Home Page (as required) and validate the behavior of the upload component using different file types.

📂 Project Structure
```
com/theinternet
├── pages
│   ├── HomePage.java
│   ├── JavaScriptAlertsPage.java
│   ├── NestedFramesPage.java
│   ├── FileUploadPage.java
│   └── base
│       └── BasePage.java
├── tests
│   ├── HomePageTest.java
│   ├── JavaScriptAlertsTest.java
│   ├── NestedFramesTest.java
│   ├── FileUploadTest.java
│   └── base
│       └── BaseTest.java
└── tests
    └── utils
        └── FileHelper.java


```

🧱 Implemented Functionality

🔹 Page Objects

**_HomePage_**

* Opens the File Upload page
* Keeps navigation methods for other sections (e.g., JavaScript Alerts, Nested Frames)

_**FileUploadPage**_

* Upload file using standard file input
* Read uploaded file name
* Read page title (“File Uploaded!”)
* Utility method for uploading in one step
(uploadFile(path) → choose+submit)

_**BasePage**_

* click(element)
* type(element, text)
* getText(element)
* Scroll helper
* PageFactory initialization to avoid null elements

**🧪 Implemented Tests**

_**FileUploadTest**_
* Upload .txt file
* Upload .png file
* Upload .jpg file

_Each test validates:_
* Correct navigation from homepage
* Successful file upload
* Uploaded file name displayed correctly
* Header “File Uploaded!” appears

**HomePageTest**

_Confirms navigation from Home Page to important sections:_
* Form Authentication
* JavaScript Alerts
* Nested Frames
* File Upload

**📄 Paths & Utilities**

All test files are stored in:
_src/test/resources/_

File paths are resolved automatically using:
_getFilePath("filename.ext");_

via helper:
_FileHelper.getResourceAbsolutePath();_

🚀 How to Run Tests

From IntelliJ:
_Right-click → test folder → Run Tests_

From Maven:
_mvn test_

**🟢 Result**

All tests pass successfully:
* File uploads work for txt / png / jpg
* Page navigation works
* Assertions validate the correct behavior
