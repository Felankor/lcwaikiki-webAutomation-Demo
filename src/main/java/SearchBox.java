import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends webpage{

    By searchBoxLocator = By.id("search_input");
    By searchButtonLocator = By.id("searchButton");

    public SearchBox(WebDriver driver) {
        super(driver);
    }


    private void type(By searchBoxLocator, String text) {
    }

    public void search(String text) {
        type(searchBoxLocator,text);
        click(searchButtonLocator);
    }
}
