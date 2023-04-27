package WebElements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoginElements {
    public static SelenideElement loginInput = $x("//input[@id='login-form-username']").as("Поле ввода Login");
}
