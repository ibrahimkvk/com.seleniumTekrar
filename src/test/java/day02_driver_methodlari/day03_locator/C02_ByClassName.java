package day02_driver_methodlari.day03_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_ByClassName {
    // amzona gidip nutella icin arama yapin
    //ilk sayfadan cikan urunlerin icerisinden
    // en yuksek fiyati bulun

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        List <WebElement> fiyatlarlIstesi=driver.findElements(By.className("a-price-whole"));
        System.out.println(fiyatlarlIstesi);


        for(WebElement each:fiyatlarlIstesi) {
            System.out.print(each.getText() +" ");
        }

        String fiyatStr;
        Integer fiyatInt;
        Integer enYuksekFiyat=0;
        for(WebElement each:fiyatlarlIstesi) {

            fiyatStr=each.getText();
            fiyatInt=Integer.parseInt(fiyatStr);
            if(fiyatInt>enYuksekFiyat) {
                enYuksekFiyat=fiyatInt;
            }

        }
        System.out.println("  ");
        System.out.println("En pahali nutella: " + enYuksekFiyat);


        Thread.sleep(15);
        driver.close();

    }
}
