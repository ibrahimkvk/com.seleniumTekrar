package day02_driver_methodlari.day03_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ByLinkText {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        Thread.sleep(4000);

        WebElement giftCardlinki=driver.findElement(By.linkText("Gift Cards"));
        giftCardlinki.click();
        String expectedKelime="giftCardlinki";
        String actualTitle=driver.getTitle();
        if(actualTitle.contains(expectedKelime)) {
            System.out.println("test BASARILI");
        } else {
            System.out.println("test BASARISIZ");
        }

        Thread.sleep(3000);
        driver.close();
    }

}
