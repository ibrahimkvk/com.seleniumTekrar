package days05_maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_TekrarTesti {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1- www.google.com adresine gidin
        driver.get("https://www.google.com/");

        //2-sayfa basliginin "Google icerdigini test edin
        String expectedTitle ="Google";
        String actualTitle=driver.getTitle();
        if(actualTitle.contains(expectedTitle)){
            System.out.println("sayfa basliginin Google icerdigini testi  PASSED");
        } else {
            System.out.println("sayfa basliginin Google icerdigini testi FAILED");
        }

        // 3- Araba cubuguna nutella yazip aratin
        driver.findElement(By.className("gLFyf")).sendKeys("Nutella"+ Keys.ENTER);

        //4- bulunan sonuc sayisini yazdirin
         WebElement sonuc=driver.findElement(By.id("result-stats"));
        System.out.println(sonuc.getText());

        //5- sonuc sayisinin 10 milyondan fazla oldugunu test edin
        WebElement sonucYaziElementi=driver.findElement(By.id("result-stats"));
        String sonucYazisiStr=sonucYaziElementi.getText();
        String[] sonucYasiziArr=sonucYazisiStr.split(" ");
        String sonucStr=sonucYasiziArr[1];
        System.out.println(sonucStr);
        double sonucInteger=Integer.parseInt(sonucStr);
        System.out.println(sonucInteger);
        if(sonucInteger>10000000) {
            System.out.println("sonuc sayisi 10 milyodan fazla testi PASSED");
        } else {
            System.out.println("sonuc sayisi 10 milyodan fazla testi FAILED");
        }

        Thread.sleep(300);
        driver.close();
    }
}
