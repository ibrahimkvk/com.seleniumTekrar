package day02_driver_methodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        // sayfayi tam ekran yapmak icin
        driver.manage().window().fullscreen();

        System.out.println("maximize window boyutlari: " + driver.manage().window().getSize());
        System.out.println("maximize window konumlari: " + driver.manage().window().getPosition());

        Thread.sleep(5000);

        driver.manage().window().fullscreen();

        System.out.println("fullscreen window boyutlari : " +driver.manage().window().getSize());
        System.out.println("fullscreen window konumlari : " +driver.manage().window().getPosition());
        Thread.sleep(800);

        driver.manage().window().setPosition(new Point(100,100));
        driver.manage().window().setSize(new Dimension(300,300));
        Thread.sleep(800);
        driver.close();
    }
}
