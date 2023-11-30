package days04_xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_XPath {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //2- Add Element butonuna basin
        driver.findElement(By.xpath("//*[text()='Add Element']")).click();
        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu=driver.findElement(By.xpath("//*[text()='Delete']"));
        if(deleteButonu.isDisplayed()){
            System.out.println("delete butonu gorunur oldugu test PASSED");
        } else {
            System.out.println("delete butonu gorunur oldugu test FAILED");
        }

        //4- Delete tusuna basin
        deleteButonu.click();
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

        WebElement addremoveButonu=driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));
        if(addremoveButonu.isDisplayed()){
            System.out.println("add/remove butonu gorunur oldugu test PASSED");
        } else {
            System.out.println("add/remove butonu gorunur oldugu test FAILED");
        }

       Thread.sleep(3000);
        driver.close();

    }


}
