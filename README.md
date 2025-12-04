The Internet Project (POM + Selenium + TestNG)
📌 Overview

This project is an educational Page Object Model (POM) test framework built on
Selenium + TestNG + Java + WebDriverManager.

It uses the demo application:
👉 https://the-internet.herokuapp.com/

The goal of the project is to practice automation architecture,
page navigation, JavaScript alerts handling, and working with nested frames.

📂 Project Structure
```
src
└── test/java/com.theinternet
├── pages
│     ├── HomePage.java
│     ├── JavaScriptAlertsPage.java
│     ├── NestedFramesPage.java
│     └── base/BasePage.java
├── tests
│     ├── HomePageTest.java
│     ├── JavaScriptAlertsTest.java
│     ├── NestedFramesTest.java
│     └── base/TestBase.java
```

**BasePage**

Contains all common UI actions:
* click
* type
* scroll
* getText
* PageFactory initialization

**HomePage**

Represents the main menu with navigation links:
* Form Authentication
* JavaScript Alerts
* Nested Frames

Provides clean methods:
openJavaScriptAlerts();
openNestedFrames();

JavaScriptAlertsPage

Handles:
* JS Alert
* JS Confirm
* JS Prompt

Supports:
* clicking each button
* accepting/dismissing alerts
* entering text into prompts
* reading the result message

NestedFramesPage

Implements switching between:
* top → left
* top → middle
* top → right
* bottom

Each getter automatically switches back to default content.

🧪 Test Scenarios
✔ JavaScript Alerts

Located in: JavaScriptAlertsTest

**_Covers:_**
* Accepting JS Alert
* Accepting JS Confirm
* Canceling JS Confirm
* Entering text into JS Prompt
* Validating alert text

**_Each test:_**
1. Opens homepage
2. Navigates via POM
3. Calls page methods (no locators inside tests)

**✔ Nested Frames**

Located in: NestedFramesTest
Covers:

* Extract text from LEFT frame
* Extract text from MIDDLE frame
* Extract text from RIGHT frame
* Extract text from BOTTOM frame
Each frame has a dedicated getter method.

**🔧 TestBase**

Handles:

* WebDriverManager setup
* ChromeDriver configuration
* Browser window maximizing
* Implicit waits
* Opening the main URL

**▶️ How to Run Tests**

* Clone the repository
* Install Maven dependencies
* Run via IntelliJ (TestNG plugin)
or via console:
mvn clean test

**🎯 Purpose of the Project**

This project is part of a training program and demonstrates:

* Clean POM structure
* Reusable page methods
* Proper WebDriver handling
* Navigation via HomePage
* Real-world alert automation
* Selenium frame switching techniques
* Clean and readable TestNG tests
