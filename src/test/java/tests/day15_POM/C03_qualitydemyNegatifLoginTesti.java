package tests.day15_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;

public class C03_qualitydemyNegatifLoginTesti {

    @Test
    public void test01() throws InterruptedException {

        // qualitydemy anasayfaya gidin
        Driver.getDriver().get("https://www.qualitydemy.com");
        Driver.getDriver().findElement(By.xpath("//a[@onclick='cookieAccept();']")).click();

        // ilk login linkine tiklayin
        QualitydemyPage qualitydemyPage=new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();

        // kullanici adi olarak selenium
        qualitydemyPage.emailKutusu.sendKeys("selenium");

        // password olarak heyecandir yazin
        qualitydemyPage.passwordKutusu.sendKeys("heyecandır");

        // login butonuna tiklayin
        qualitydemyPage.loginButonu.click();
        Thread.sleep(3000);

        // giris yapilamadigini test edin
        Assert.assertTrue(qualitydemyPage.emailKutusu.isEnabled());
        //email kutusu hala gorülüyorsa giriş yapmamıştır.




        // sayfayi kapatin
        Driver.closeDriver();


    }
}
