import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.*;

public class GoogleTest {

    @Test
    void selenideSearchTest() {
        open("https://www.google.com");
        $(byName("q")).setValue("Selenide").pressEnter();
        $("html").shouldHave(text("selenide.org"));
    }
}
