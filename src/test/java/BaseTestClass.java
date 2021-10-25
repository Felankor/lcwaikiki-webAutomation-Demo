import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@TestInstance(TestInstance.Lifecycle.PER_CLASS) //Now we can use non-static variables
@TestMethodOrder(MethodOrderer.OrderAnnotation.class) //with this, we can run methods in order, that how we like
public class BaseTestClass {

    protected WebDriver driver;
    webpage webpage;

    @BeforeAll
    public void setUp(){
        //WebDriverManager.chromedriver().setup();  Well this way, you can avoid chromedriver problem whenever they update it
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.lcwaikiki.com/tr-TR/TR/giris");
        webpage = new webpage(driver);
        System.out.println("You just set up the webpage!");
    }



    @AfterAll
    public void tearDown(){
        System.out.println("ALL DONE!");
        //driver.quit();

    }
}
