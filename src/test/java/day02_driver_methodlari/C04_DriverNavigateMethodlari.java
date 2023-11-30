package day02_driver_methodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().fullscreen();

        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(5000);
        driver.get("https://wisequarter.com");
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();
        Thread.sleep(5000);
        driver.quit();
    }
}
