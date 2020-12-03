import com.codeborne.selenide.Condition;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTest {

    String searchEngine = "https://ya.ru";
    String searchString = "Selenide";
    String contitionText = "selenide.org";

    @Test
    void selenideSearchTest() {

        // Открываем поисковую систему
        open(searchEngine);

        // Выполняем поисковой запрос
        $(".input__input").setValue(searchString).pressEnter();

        // Убеждаемся, что на странице присутствует ссылка на selenide
        $(".main").shouldHave(Condition.text(contitionText));

    }
}
