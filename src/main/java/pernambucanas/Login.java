package pernambucanas;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Validador;

public class Login {

    private By usuario = By.name("login[username]");
    private By senha = By.name("login[password]");
    private By btnEntrar = By.id("send2");
    private By validaMsg = By.xpath("//div[@class='message-error error message']");


    public void entrarLogin(WebDriver driver, String user, String pass) {

        driver.findElement(usuario).sendKeys(user);
        driver.findElement(senha).sendKeys(pass);
        driver.findElement(btnEntrar).submit();


    }

    public void validaMsgErro(WebDriver driver, String msg){

        Validador.waitElement(driver, validaMsg, 30);
        Assert.assertTrue(driver.findElement(validaMsg).getText().contains(msg));

    }
}