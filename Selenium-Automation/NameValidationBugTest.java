package base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameValidationBugTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demowebshop.tricentis.com");

        driver.findElement(By.linkText("Register")).click();

        driver.findElement(By.id("gender-male")).click();

        driver.findElement(By.id("FirstName"))
              .sendKeys("Vaishnav#$%");

        driver.findElement(By.id("LastName"))
              .sendKeys("Vadakiniyil@#$");

        driver.findElement(By.id("Email"))
              .sendKeys("bugtest123@gmail.com");

        driver.findElement(By.id("Password"))
              .sendKeys("Test123");

        driver.findElement(By.id("ConfirmPassword"))
              .sendKeys("Test123");

        driver.findElement(By.id("register-button"))
              .click();

        String pageSource = driver.getPageSource();

        if(pageSource.contains("Your registration completed")) {
            System.out.println("BUG CONFIRMED: Special characters accepted in name fields");
        } else {
            System.out.println("Validation working correctly");
        }

        Thread.sleep(3000);
        driver.quit();
    }
}