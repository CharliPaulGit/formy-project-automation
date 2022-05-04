import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Soubhagya\\Desktop\\Seljars\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement fullName = driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);
        actions.moveToElement(fullName);

        fullName.sendKeys("Charli Paul");
        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("05/03/2022");

        driver.quit();
    }
}