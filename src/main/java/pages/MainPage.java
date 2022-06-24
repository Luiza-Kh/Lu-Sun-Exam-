package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    public static SelenideElement loginInput() {
        return $("#login_field").as("Инпут ввода логина");
    }

    public static SelenideElement passwordInput() {
        return $("#password").as("Инпут ввода пароля");
    }

    public static SelenideElement authButton() {
        return $(".js-sign-in-button").as("Кнопка авторизации");
    }

      public static SelenideElement productTitle() {
        return $(byText("Свитшот ALGA оливковковый 2.0")).as("Название товара");
    }

    public static SelenideElement buttonAddToCart() {
        return $(".ui-component.ui-button.add-to-cart").as("Кнопка добавления в корзину");
    }

    public static SelenideElement ChooseFeaturesModal() {
        return $(".popup-title").as("Модальное окно c выбором характеристик");
    }

    public static SelenideElement buttonAddToSize() {
        return $(".char-value.text").as("Кнопка ХХS размера");
    }

    public static SelenideElement buttonAddToCartinModal() {
        return $(byText ("Добавить в корзину")).as("Кнопка добавления в корзину внутри окна");
    }

    public static SelenideElement ItemInCart() {
        return $("[href='/cart']").as("Товар в корзине");
    }

    public static SelenideElement transitionCheck() {
        return $(".ui-component.ui-button.button").as("Проверка перехода в корзину");
}
}
