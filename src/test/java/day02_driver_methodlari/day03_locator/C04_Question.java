package day02_driver_methodlari.day03_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

public class C04_Question {
    public static void main(String[] args) throws InterruptedException {
        //1- Bir test class’i olusturun ilgili ayarlari yapin

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //2- https://www.automationexercise.com/ adresine gidin

        driver.get("https://automationexercise.com/");

        //3- Sayfada 147 adet link bulundugunu test edin.

        List<WebElement> linkListesi=driver.findElements(By.tagName("a"));

        // butun linklerin tag i a oldugu icin a yazdik
        // birde birden fazla element bulacagi Elements yazdik
        if(linkListesi.size()==147) {
            System.out.println("test basarili");
        } else {
            System.out.println("test basarisiz");
        }

        //4- Products linkine tiklayin
        
        driver.findElement(By.partialLinkText(" Products")).click();
        WebElement specialOfferElementi=driver.findElement(By.id("sale_image"));

        if(specialOfferElementi.isDisplayed()) {
            System.out.println("Special offer testi PASSED");
        } else {
            System.out.println("Special testi FAILED");
        }



        //5- special offer yazisinin gorundugunu test edin


/*
            NoSuchElementException driver findElement ile aradigi bir elemnti
            bulamazsa olusur
         */



       Thread.sleep(3000);

        //6- Sayfayi kapatin
        driver.close();
    }
}
