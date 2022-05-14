import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBro {


    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://Google.com");
    }
}
