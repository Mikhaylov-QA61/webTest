import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selenide.open;

public class webTest {

      // Информация ниже для запуска webDriver для работы на Selenium
//    WebDriver driver;
//
//    @BeforeAll
//    static void setupAll() {
//        WebDriverManager.chromedriver().setup();
//    }
//
//    @BeforeEach
//    void setup() {
//        driver = new ChromeDriver();
//    }
//
//    @AfterEach
//    void teardown() {
//        driver.quit();
//    }
//
//    @Test
//    void test() {
//        // Здесь должны быть тесты на Selenium
//    }


    @Test
    void CTest() {
        open("http://localhost:9999");
    }
}
