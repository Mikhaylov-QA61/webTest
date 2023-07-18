import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ValidationTest {


    @Test
    void nameEmpty() {
        open("http://localhost:9999");
        SelenideElement form = $(".form");
        form.$("[data-test-id=phone] input").setValue("+79176666666");
        form.$("[data-test-id=agreement]").click();
        form.$(".button").click();
        $(".input_invalid .input__sub").shouldHave();
    }

    @Test
    void phoneEmpty() {
        open("http://localhost:9999");
        SelenideElement form = $(".form");
        form.$("[data-test-id=name] input").setValue("Петров Иван");
        form.$("[data-test-id=agreement]").click();
        form.$(".button").click();
        $(".input_invalid .input__sub").shouldHave();
    }


    @Test
    void phoneEmptyNameEmpty() {
        open("http://localhost:9999");
        SelenideElement form = $(".form");
        form.$("[data-test-id=agreement]").click();
        form.$(".button").click();
        $(".input_invalid .input__sub").shouldHave();
    }

    @Test
    void nameFaultPhoneEmpty() {
        open("http://localhost:9999");
        SelenideElement form = $(".form");
        form.$("[data-test-id=name] input").setValue("Petrov Ivan");
        form.$("[data-test-id=agreement]").click();
        form.$(".button").click();
        $(".input_invalid .input__sub").shouldHave();
    }

    @Test
    void phoneFaultNameEmpty() {
        open("http://localhost:9999");
        SelenideElement form = $(".form");
        form.$("[data-test-id=phone] input").setValue("+7917666");
        form.$("[data-test-id=agreement]").click();
        form.$(".button").click();
        $(".input_invalid .input__sub").shouldHave();
    }

    @Test
    void phoneFaultNameFault() {
        open("http://localhost:9999");
        SelenideElement form = $(".form");
        form.$("[data-test-id=name] input").setValue("Petrov Ivan");
        form.$("[data-test-id=phone] input").setValue("+7917666");
        form.$("[data-test-id=agreement]").click();
        form.$(".button").click();
        $(".input_invalid .input__sub").shouldHave();
    }
}

