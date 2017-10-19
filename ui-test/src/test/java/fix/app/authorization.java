package fix.app;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;

public class authorization {
    @Test
    public void userLogOn() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\chingiz.diarov\\.m2\\repository\\webdriver\\chromedriver.exe");
        //Doesn't matter chrome or Chrome as this is case insensitive.
        System.setProperty("selenide.browser", "Chrome");
        open("http://rulkov.ru/qa/");
        $(byText("Login")).click();
        $(By.id("username")).setValue("WQA");
        $(By.id("password")).setValue("12345");
        $(byClassName("btn-success")).click();
        $("h3").shouldHave(text("Привет, WQA!"));
    }

    @Test
    public void userLogOut() {
        $(byText("logout")).click();
        $(byText("Операция сложения")).click();
        Assert.assertEquals(url(), "http://rulkov.ru/qa/login");
    }
}
