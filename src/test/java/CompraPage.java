import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompraPage {
    private WebDriver driver;

    public CompraPage(WebDriver driver){
        this.driver=driver;
    }
    By addcar = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
    By  carrtiocompra = By.xpath("//a[@class='shopping_cart_link']");
    By btncheekout = By.xpath("//button[@id='checkout']");
    By inpoutfistname = By.xpath("//input[@id='first-name']");

    By inpouLasName = By.xpath("//input[@id='last-name']");
    By inpouportal = By.xpath("//input[@id='postal-code']");
    By btnContinuar = By.xpath("//input[@id='continue']");
    By btnfinalizar = By.xpath("//button[@id='finish']");

    public void comprarArticulo (String userFistName,String userpouLasName,String userpouportal  ){
        driver.findElement(addcar).click();
        driver.findElement(carrtiocompra).click();
        driver.findElement(btncheekout).click();

        driver.findElement(inpoutfistname).sendKeys(userFistName);
        driver.findElement(inpouLasName).sendKeys(userpouLasName);
        driver.findElement(inpouportal).sendKeys(userpouportal);

        driver.findElement(btnContinuar).click();
        driver.findElement(btnfinalizar).click();
    }
}
