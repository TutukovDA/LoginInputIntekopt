package WebElements;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class BaseElements {
    public static SelenideElement baseInpElem(String param1, String param2) {
        return $x("//input["+ param1 + "='" + param2 + "']");
    }

    public static SelenideElement changeCity() {
        return $x("(//a[contains(text(),'Да')])[2]");
    }

    public static SelenideElement clickButtonInput() {
        return $x("//span[contains(text(),'Войти')]");
    }
    public static SelenideElement clickButtonAuth() {
        return $x("//button[contains(text(),'Войти')]");
    }
}