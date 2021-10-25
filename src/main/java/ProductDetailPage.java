import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends webpage {


    By basketButtonLocator = By.id("header-bag-icon");
    By addToBasketButtonLocator = By.id("pd_add_to_chart");
    By basketItemCountLocator = By.id("spanCart");
    
    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public void goToBasket() {
        click(basketButtonLocator);
    }

    public void addToBasket() {
        click(addToBasketButtonLocator);
    }

    public boolean isProductAdded() {
        if(basketItemCountLocator == By.id("spanCart")){
            return true;
        }else{
            return false;
        }
    }
}
