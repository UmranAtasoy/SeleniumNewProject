package techproed.day04_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_getTagNameGetAttribute {
    public static void main(String[] args) {
        System.setProperty("webdriver.com.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");

        // arama kutusunu locate ediniz
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));


        //arama kutusunun tagName'ini "input" oldugunu test edin
        String actuelTagName = aramaKutusu.getTagName();
        String expextedTagName = "input";
        if (actuelTagName.equals(expextedTagName)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }


        //arama kutusunun name attribute'nin degerinin "field-keywords oldugunu test edin
       String actuelAttribute =aramaKutusu.getAttribute("name");
        String expextedAttribute = "field-keywords";
        if (actuelAttribute.equals(expextedAttribute)) {
            System.out.println("Test PASSED");

        }else{
            System.out.println("Test FAILED");
        }


        // sayfayi kapatin
      driver.close();



    }
}
