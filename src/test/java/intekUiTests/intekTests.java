package intekUiTests;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static ElementsSteps.LoginSteps.auth;
import static com.codeborne.selenide.Selenide.open;

public class intekTests {
    @DisplayName("Авторизация на сайте Интэк")
    @Test
    public void authTest(){
        open("https://intekopt.ru/#true-2");
        auth();
        System.out.println("Открыт сайт Интэк");
    }
}
