package guru.qa.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.*;
import static io.qameta.allure.Allure.step;

public class IosTests extends TestBase {

    @Test
    @DisplayName("Alert is visible after clicking the alert button")
    @Tag("ios")
    void tabChangingTest() {
        step("Click on Alert", () ->
                $(name("Alert Button")).click());
        step("Verify that alert appeared", () -> {
            $(name("This is a native alert.")).shouldBe(visible);
            $(name("OK")).shouldBe(visible);});
    }
}
