package tests.day15_POM;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C05_QualitydemyLoginTesti {


    @Test
    public void test01() throws InterruptedException {



    // QUALITYDEMY ANA SAYFAYA GIDIN
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));


    // login linkine tiklayin
        QualitydemyPage qualitydemyPage=new QualitydemyPage();
        Driver.getDriver().findElement(By.xpath("//a[@onclick='cookieAccept();']")).click();
        qualitydemyPage.ilkLoginLinki.click();

    // gecerli username ve sifre yi ilgili kutulara yazin
        qualitydemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));


    // login butonuna basin
        qualitydemyPage.loginButonu.click();


    // basarili olarak giris yapildigini test edin
        Assert.assertTrue(qualitydemyPage.basariliGirisKontrolElemeti.isDisplayed());


    // sayfayi kapatin
        Thread.sleep(3000);
        Driver.closeDriver();

    }


}
