package tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class P02 {


    //- Birbirine bağımlı testler oluşturun.
    //- beforeClass oluşturup setUp ayarlarini yapin.
    static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }

    //- Birbirine bağımlı testler oluşturarak




    //- ilk once wisequarte'a gidin
    @Test
    public void wisequarter(){
        Driver.getDriver().get(ConfigReader.getProperty("wiseUrl"));
    }

    //- sonra youtube'a bağımlı olarak youtube'a gidin
    @Test //(dependsOnMethods = "amazon")
    public void youtube(){
        Driver.getDriver().get(ConfigReader.getProperty("youtubeUrl"));
    }

    //- daha sonra amazon'a bağımlı olarak amazon' a gidin
    @Test
    public void amazon(){
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    //- driver'i kapatın.
    @AfterClass
    public static void close(){
        Driver.getDriver().quit();
    }









}
