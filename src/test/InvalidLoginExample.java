package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginExample {
    public static void main(String[] args) {

        // Initialize the WebDriver for Chrome
        WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        // Find the username and password input fields and the login button
        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        // Enter an incorrect username and a valid password
        usernameField.sendKeys("wronguser");
        passwordField.sendKeys("secret_sauce");

        // Click the login button
        loginButton.click();

        // Check if there is an error message indicating invalid login
        WebElement errorElement = driver.findElement(By.cssSelector("h3[data-test='error']"));
        String errorMessage = errorElement.getText();

        if (errorMessage.contains("Username and password do not match any user")) {
            System.out.println("Test Case Passed: Invalid login detected.");
        } else {
            System.out.println("Test Case Failed: Invalid login not detected.");
        }
    }
}