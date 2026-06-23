package base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoutTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demowebshop.tricentis.com");

        driver.findElement(By.linkText("Log in")).click();

        driver.findElement(By.id("Email"))
              .sendKeys("vaishnavvadakiniyil@gmail.com");

        driver.findElement(By.id("Password"))
              .sendKeys("e9PB!hvrvLA@sU");

        driver.findElement(By.cssSelector("input.login-button"))
              .click();

        Thread.sleep(2000);

        driver.findElement(By.linkText("Log out")).click();

        if (driver.getPageSource().contains("Log in")) {
            System.out.println("Logout Successful");
        } else {
            System.out.println("Logout Failed");
        }

        driver.quit();
    }
}