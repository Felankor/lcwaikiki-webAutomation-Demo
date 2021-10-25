import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends webpage{

    By filterLocator = By.id("filter-label");
    By productNameLocator = By.id("product-item-info");
    By selectSizeLocator = By.id("data-original-title");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void selectProduct(int index) {
        getAllProducts().get(index).click();
    }

    private List<WebElement> getAllProducts(){
        return findAll(productNameLocator);
    }


    public boolean isOnProductPage() {
        return isDisplayed(filterLocator);
    }

    public void selectSize(int index) {
        getAllSizes().get(index).click();
    }

    private List<WebElement> getAllSizes(){ //determines the value from the size of the selected product
        return findAll(selectSizeLocator);
    }
}
