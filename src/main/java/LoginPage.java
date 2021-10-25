import org.openqa.selenium.WebDriver;

public class LoginPage extends webpage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnLoginPage() {
        return false;
    }
}
