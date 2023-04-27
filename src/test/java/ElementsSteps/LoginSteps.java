package ElementsSteps;

import WebElements.BaseElements;

import java.time.Duration;

import static WebElements.BaseElements.*;
import static com.codeborne.selenide.Condition.visible;

public class LoginSteps {
    public static void auth(){
        changeCity().shouldBe(visible, Duration.ofSeconds(20)).click();
        clickButtonInput().shouldBe(visible, Duration.ofSeconds(20)).click();
        baseInpElem("@name","USER_LOGIN").shouldBe(visible, Duration.ofSeconds(20)).sendKeys("Tutukov@list.ru");
        baseInpElem("@name","USER_PASSWORD").shouldBe(visible, Duration.ofSeconds(20)).sendKeys("123456");
        clickButtonAuth().shouldBe(visible, Duration.ofSeconds(20)).click();
    }
}
