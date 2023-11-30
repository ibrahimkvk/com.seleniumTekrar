package day02_driver_methodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_Driver_methodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://amazon.com");
        System.out.println(driver.getPageSource());

        String pageSource= driver.getPageSource();
        String expectedKelime="MEOW";
        if(pageSource.contains(expectedKelime)){
            System.out.println("page source testi passed");
        } else System.out.println("page source testi FAILED meow kewlimesi bulunamadi");
        Thread.sleep(5000);
        driver.close();

    }
}
