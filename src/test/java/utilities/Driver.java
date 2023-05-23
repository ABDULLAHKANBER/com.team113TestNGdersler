package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {
    static WebDriver driver;
    public static WebDriver getDriver(){
        WebDriverManager.chromedriver().setup();
        if (driver==null){       // bu method her calıstırıldığında driver objesini kontrol eder
            //driveri ilk defa olusturyorsam bu 3 adımı yapsın, sonraki kullanımda bunları çalıştırmaması için
            //driver==null demek daha önce çalıtırlmadı,yani new chromedriver atanmadı demektir.
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driver;
    }
    public static void closeDriver(){
        driver.close();
    }

}
