package pernambucanas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Validador;

public class Inicial {

    private By btnAccount = By.className("button-account");
    private By btnEntrar = By.linkText("Entrar");
    private By usuarioLogin = By.name("login[username]");


    public void abrirApp(WebDriver driver, String url) {

        driver.get(url);
        driver.manage().window().maximize();
    }

    public void acessarLogin(WebDriver driver) {
        Validador.waitElement(driver, btnAccount, 30);
        driver.findElement(btnAccount).click();
        driver.findElement(btnEntrar).click();
        Validador.waitElement(driver, usuarioLogin, 30);


    }
}
