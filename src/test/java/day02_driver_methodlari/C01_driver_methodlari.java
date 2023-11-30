package day02_driver_methodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driver_methodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");

        // acilan sayfanin basliginin amazon icerdigini test edin

        String expectedkelime="amazon";
        String actualresult=driver.getTitle();
        if(actualresult.contains(expectedkelime)) {
            System.out.println("Title testi passed");
        } else System.out.println("Title amazon icermiyor test failed");
        System.out.println(driver.getTitle());

        // gittigimiz sayfanin url in https:// amazon.com/ oldugunu test edin

        String expectedUrl="https://www.amazon.com/";
        String actualUrl=driver.getCurrentUrl();
         if(expectedUrl.equals(actualUrl)) {
             System.out.println("url test passed");
         } else System.out.println("url test failed");
        System.out.println(driver.getCurrentUrl());



        Thread.sleep(5000);

        driver.close();
    }
}