package day01_driver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01driver_get {
    public static void main(String[] args) throws InterruptedException {
    System.getProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.amazon.com");
     Thread.sleep(5000);
    driver.close();
    }
}
