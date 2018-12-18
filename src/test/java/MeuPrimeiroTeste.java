import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pernambucanas.Inicial;
import pernambucanas.Login;

public class MeuPrimeiroTeste {

    WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resource\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.print("Setup");
    }

    @After
    public void tearDown() {
        driver.close();
        System.out.print("tearDown");
    }

    @Test
    public void testPrimeiroSegunda() throws InterruptedException {

        Inicial inicial = new Inicial ();
        inicial.abrirApp(driver, "https://www.pernambucanas.com.br");
        inicial.acessarLogin(driver);

        Login login = new Login ();
        login.entrarLogin(driver, "juju" , "123456" );
        login.validaMsgErro(driver, "Você não digitou os dados corretamente ou a sua conta está temporariamente desativada." );

     }

}


