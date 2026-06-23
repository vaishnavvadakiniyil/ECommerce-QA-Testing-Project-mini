package base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demowebshop.tricentis.com");

        driver.findElement(By.linkText("Books")).click();

        driver.findElement(By.cssSelector("input[value='Add to cart']")).click();

        Thread.sleep(2000);

        if (driver.getPageSource().contains("The product has been added")) {
            System.out.println("Product added to cart successfully");
        } else {
            System.out.println("Add to cart failed");
        }

        driver.quit();
    }
}