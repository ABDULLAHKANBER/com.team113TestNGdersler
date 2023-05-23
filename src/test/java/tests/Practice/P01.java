package tests.Practice;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class P01 {


    @Test (priority = 10)
    public void Didem(){
        System.out.println("Didem");
    }
    @Test (enabled = false)
    public void Sema(){
        System.out.println("Sema");
    }

    @Test (priority = -5)
    public void Kadir(){
        System.out.println("Kadir");
    }
    @Test (dependsOnMethods = "Kerem")
    public void Erdal(){
        System.out.println("Erdal");
    }
    @Test @Ignore
    public void Zeki(){
        System.out.println("Zeki");
    }
    @Test
    public void Nur(){
        System.out.println("Nur");
    }
    @Test (priority = 10)
    public void Kerem(){
        System.out.println("Kerem");
    }

}
