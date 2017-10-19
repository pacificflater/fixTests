package fix.app;

import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class navigation {
    @Test
    public void openHomePageByNav() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\chingiz.diarov\\.m2\\repository\\webdriver\\chromedriver.exe");
        System.setProperty("selenide.browser", "Chrome");
        open("http://rulkov.ru/qa/");
        $(byText("Home")).click();
        Assert.assertEquals(WebDriverRunner.url(), "http://rulkov.ru/");
    }

    @Test
    public void openHomePageByIcon() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\chingiz.diarov\\.m2\\repository\\webdriver\\chromedriver.exe");
        System.setProperty("selenide.browser", "Chrome");
        open("http://rulkov.ru/qa/");
        $(byClassName("glyphicon-home")).click();
        Assert.assertEquals(WebDriverRunner.url(), "http://rulkov.ru/");
    }
}
