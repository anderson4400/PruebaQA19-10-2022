import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class TestEXample {
    private  WebDriver driver;
    private LoginPage login;
    private  CompraPage compra;
    @BeforeTest
    void septUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
    }

    @Test (priority = 1)
    void IniciarSeecion(){
         login = new LoginPage(driver);
         login.realizarlogin("standard_user","secret_sauce");
    }
   @Test(priority = 2)
   void ComprarArticulo(){

        login = new LoginPage(driver);
        compra = new CompraPage(driver);
        login.realizarlogin("standard_user","secret_sauce");
       compra.comprarArticulo("dasdasdas","dasdasd","dadasdsa");
   }



}
