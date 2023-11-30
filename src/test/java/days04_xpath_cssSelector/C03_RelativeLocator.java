package days04_xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C03_RelativeLocator {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //1 ) https://www.diemol.com/selenium-4-demo/relative-locators-demo.html  adresine gidin


        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        //2 ) Berlin’i  3 farkli relative locator ile locate edin

        WebElement sailorElementi=driver.findElement(By.xpath("//p[text()='Sailor']"));

        // ilk olarak sailor elementinin ussunde dedik


        WebElement berlin1=
                driver.findElement(RelativeLocator.with(By.tagName("img")).above(sailorElementi));

        // ikinci olarak nyc nin altindaki berlin diyelim

        WebElement nycElementi=driver.findElement(By.xpath("//p[text()='NYC']"));

        WebElement berlin2=
                driver.findElement(RelativeLocator.with(By.tagName("img")).below(nycElementi));

        // ucuncu olarak boston unun saginda diyelim

        WebElement bostonElementi= driver.findElement(By.xpath("//p[text()='Boston']"));
         WebElement berlin3=
                    driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(bostonElementi));


        // Eger bir tane element'den tarif ettigimizde yine de bulamazsak
        // birden fazla elementi refere edebiliriz

        WebElement berlin4= driver.findElement(RelativeLocator.with(By.tagName("img"))
                           .above(sailorElementi)
                           .below(nycElementi)
                           .toRightOf(bostonElementi));





        //3 ) Relative locator’larin dogru calistigini test edin
        //   id'si pid7_thumb oldugunu test edelim


        String expectedId="pid7_thumb";
        String actualId=berlin4.getAttribute("Id");

        if(actualId.contains(expectedId)) {
            System.out.println("Relative Locator testi PASSED");
        } else {
            System.out.println("Relative Locator testi FAILED");
        }






        Thread.sleep(3000);
        driver.close();
    }
}
