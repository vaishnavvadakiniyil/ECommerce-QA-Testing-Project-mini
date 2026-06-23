package base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchProductTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demowebshop.tricentis.com");

        driver.findElement(By.id("small-searchterms")).sendKeys("book");

        driver.findElement(By.cssSelector("input.search-box-button")).click();

        if (driver.getPageSource().contains("Search")) {
            System.out.println("Search Test Executed");
        } else {
            System.out.println("Search Test Failed");
        }

        driver.quit();
    }
}