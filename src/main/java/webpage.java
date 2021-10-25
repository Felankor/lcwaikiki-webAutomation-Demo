import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class webpage {

    private WebDriver driver;
    private By loginMail = By.id("LoginEmail");
    private By loginPass = By.id("Password");
    By loginClick = By.id("loginLink");

    //Setting constructor
    public webpage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement find(By locator){ //to find elements on the page
        return driver.findElement(locator);
    }

    public List<WebElement> findAll(By locator){
        return driver.findElements(locator);
    }

    public void click(By locator){
        find(locator).click();
    }

    public Boolean isDisplayed(By locator){
        return find(locator).isDisplayed();
    }

    //Setting mail placer
    public void set_mail(String mailAddress) {
        WebElement mailSpace = driver.findElement(loginMail);
        mailSpace.click();
        mailSpace.sendKeys(mailAddress);

    }

    //Setting password placer
    public void set_password(String passAsString) {
        WebElement mailPass = driver.findElement(loginPass);
        mailPass.click();
        mailPass.sendKeys(passAsString);
    }

    public void login(){
        WebElement loginButton = driver.findElement(loginClick);
        loginButton.click();
    }

}
