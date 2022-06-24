import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Owner("Luiza-Kh")
@Feature("Добавление товара в корзину через быструю корзину")
public class AddingToCart {

    @Test
    @DisplayName("Добавление товара в корзину, через быструю корзину")
    public void addProductToCard() {
        step("Открыть главную страницу", () -> {
            open("https://dshop-alga.dev.cluster.kznexpess.com/");
        });

        step("Заполнить поля логина и пароля и нажать кнопку авторизации", () -> {
            MainPage.loginInput()
                    .sendKeys("Luiza-Kh");
            MainPage.passwordInput()
                    .sendKeys("Rfyfhtqrf11");
            MainPage.authButton()
                    .click();
        });

        step("Навести курсор на карточку товара", () -> {
            MainPage.productTitle();
        });

        step("Нажать на кнопку 'Добавить в корзину' в блоке товара", () -> {
            MainPage.buttonAddToCart()
                    .click();
        });

        step("Нажать на кнопку 'XXS' в линейке размеров", () -> {
            MainPage.buttonAddToSize()
                    .click();
        });

        step("Нажать на кнопку 'Добавить в корзину'", () -> {
            MainPage.buttonAddToCartinModal()
                    .click();
        });

        step("Проверить, наличие плашки с успешным добавлением в корзину", () -> {
            MainPage.ChooseFeaturesModal()
                    .shouldBe(visible);
        });

        step("Проверить, наличие товара в корзине", () -> {
            MainPage.ItemInCart()
                    .click();
            MainPage.transitionCheck()
                            .shouldBe(visible);
            MainPage.productTitle()
                    .shouldBe(visible);
        });

    }
}
