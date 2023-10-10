package test;
import org.openqa.selenium.By;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ValidLoginExample {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("https://www.saucedemo.com/");
        //Maximize window
        driver.manage().window().maximize();

        // Find the username and password
        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        // Enter a valid username and password
        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");

        // Click the login button
        loginButton.click();

        // Check if the login is successful (verify that we are on the inventory page)
        System.out.println(driver.getCurrentUrl());

//        boolean isOnInventoryPage = driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html");

//        if (isOnInventoryPage) {
//            System.out.println("Test Case Passed: Login with valid credentials was successful.");
//        } else {
//            System.out.println("Test Case Failed: Login with valid credentials was not successful.");
//        }
//        Assert.assertEquals("https://www.saucedemo.com/inventory.html",isOnInventoryPage );
//                   System.out.println("Test Case Passed: Login with valid credentials was successful.");

    }
}