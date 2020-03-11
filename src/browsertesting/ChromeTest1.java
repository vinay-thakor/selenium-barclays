package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeTest1 {
    public static void main(String[] args) {
        String vinUrl = "https://www.barclays.co.uk/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(vinUrl);
        String title = driver.getTitle();
        System.out.println(title);
        driver.manage().window().maximize();
        driver.quit();
    }
}
