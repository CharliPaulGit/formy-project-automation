import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Soubhagya\\Desktop\\Seljars\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //driver.get("https://formy-project.herokuapp.com/autocomplete");
        driver.get("https://www.google.com/");
        WebElement location = driver.findElement(By.xpath("//div[@class = 'QS5gu sy4vM' and text() = 'Ik ga akkoord']"));
        location.click();
        WebElement english = driver.findElement(By.xpath("//a[text()='English']"));
        english.click();
        WebElement search = driver.findElement(By.xpath("//input[@class='gLFyf gsfi' and @name = 'q']"));
        search.sendKeys("cetirizine");
        Thread.sleep(5000);
        WebElement searchResult = driver.findElement(By.className("wM6W7d"));
        searchResult.click();


        //WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        //autocomplete.click();
       // autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");
        //Thread.sleep(1000);




        //driver.quit();
    }
}
