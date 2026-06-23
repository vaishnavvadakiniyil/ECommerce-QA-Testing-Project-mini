package base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterUser {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demowebshop.tricentis.com");

        driver.findElement(By.linkText("Register")).click();

        driver.findElement(By.id("gender-male")).click();

        driver.findElement(By.id("FirstName"))
              .sendKeys("Vaishnav");

        driver.findElement(By.id("LastName"))
              .sendKeys("V");

        driver.findElement(By.id("Email"))
              .sendKeys("vaishnavqa2026@gmail.com");

        driver.findElement(By.id("Password"))
              .sendKeys("Test123");

        driver.findElement(By.id("ConfirmPassword"))
              .sendKeys("Test123");

        driver.findElement(By.id("register-button"))
              .click();

        System.out.println("Registration Completed");

        driver.quit();
    }
}