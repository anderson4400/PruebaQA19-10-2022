import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
        private WebDriver driver;

        public LoginPage(WebDriver driver){
            this.driver=driver;
        }
    By  inputUsarName = By.xpath("//input[@id='user-name']");
    By  InputPassword = By.xpath("//input[@id='password']");
    By BtnLogin = By.xpath("//input[@id='login-button']");

        public void realizarlogin (String userNasme, String usePasswornd){
            driver.get("https://www.saucedemo.com/");
            driver.findElement(inputUsarName).sendKeys(userNasme);
            driver.findElement(InputPassword).sendKeys(usePasswornd);
            driver.findElement(BtnLogin).click();
        }






}
