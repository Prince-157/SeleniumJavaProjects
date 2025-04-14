# SeleniumJavaProjects
Designed and implemented comprehensive test cases for critical e-commerce functionalities, including product 
selection, cart management, and order processing.
Validated and optimized user flow for account registration, login, and profile management, ensuring smooth checkout 
and payment processes.
Tested product search functionality, including filtering and sorting options, for accuracy and relevance.
Conducted cross-browser and device compatibility testing to ensure consistent performance across various platforms, 
delivering a seamless and bug-free user experience.
Tech: Java, JUnit, Selenium WebDriver


# TutorialsNinja Registration Test Suite

This project automates registration scenarios on the [TutorialsNinja Demo Website](https://tutorialsninja.com/demo/) using **Selenium WebDriver** and **TestNG** in Java. The test cases validate various user registration behaviors, including both valid and invalid inputs.

## 🛠️ Technologies Used

- Java
- Selenium WebDriver
- TestNG
- ChromeDriver
- Maven (for build and dependency management)

## 📁 Project Structure
tutorialsninja/ ├── TutorialninjaregisterTC3.java ├── TutorialninjaregisterTC4.java ├── T5.java utils/ └── CommonUtils.java README.md pom.xml

---

## ✅ Test Cases Description

### 🔹 TC3: Register With All Valid Fields
**Class**: `TutorialninjaregisterTC3`  
- Enters valid data in all required fields.
- Subscribes to the newsletter.
- Asserts confirmation messages and successful account creation.
- Verifies presence of "Edit your account information" after login.

---

### 🔹 TC4: Register Without Entering Any Fields
**Class**: `TutorialninjaregisterTC4`  
- Clicks on `Continue` without entering any field.
- Asserts that all proper warning messages are displayed.
- Validates the Privacy Policy alert.

---

### 🔹 T5: Register and Verify Newsletter Subscription
**Class**: `T5`  
- Enters valid data and subscribes to the newsletter.
- After registration, navigates to newsletter settings.
- Asserts that the newsletter subscription is indeed enabled.

---

## 🧪 How to Run the Tests

1. **Clone the repo**  
   ```bash
   git clone https://github.com/your-username/tutorialsninja-tests.git
   cd tutorialsninja-tests
