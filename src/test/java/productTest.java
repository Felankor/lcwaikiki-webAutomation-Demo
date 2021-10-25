import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class productTest extends BaseTestClass {
    HomePage homePage;
    ProductPage productPage;
    BasketPage basketPage;
    ProductDetailPage productDetailPage;

    @Test
    @Order(4)
    public void search_product(){
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);
        homePage.searchBox().search("Pantolan");
        Assertions.assertTrue(productPage.isOnProductPage(),"Not present on the page");
    }

    @Test
    @Order(5)
    public void select_product(){
        productPage.selectProduct(1);
        Assertions.assertTrue(productPage.isOnProductPage(),"Cant find the product");
    }

    @Test
    @Order(6)
    public void select_size(){
        productPage.selectSize(5);
    }

    @Test
    @Order(7)
    public void add_product_to_basket(){
        productDetailPage = new ProductDetailPage(driver);
        productDetailPage.addToBasket();
        Assertions.assertTrue(productDetailPage.isProductAdded(),"Not added!");
    }

    @Test
    @Order(8)
    public void go_to_basket(){
        basketPage = new BasketPage(driver);
        productDetailPage.goToBasket();
        Assertions.assertTrue(basketPage.checkIfProductAdded(),"Product not added");
    }

}
