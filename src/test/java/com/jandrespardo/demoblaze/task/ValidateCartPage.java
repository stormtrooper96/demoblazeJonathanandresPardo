package com.jandrespardo.demoblaze.task;

import com.jandrespardo.demoblaze.questions.TotalOrderCartPage;
import com.jandrespardo.demoblaze.userinterfaces.CartPage;
import com.jandrespardo.demoblaze.userinterfaces.PrincipalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidateCartPage implements Task {

    public static Performable validateCartPage(){
        return instrumented(ValidateCartPage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(
                        PrincipalPage.CART_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                    Click.on(PrincipalPage.CART_BUTTON),
                WaitUntil.the(
                        CartPage.TOTAL_TEXT, isVisible()).forNoMoreThan(10).seconds(),
                Ensure.that(TotalOrderCartPage.value()).isGreaterThan(0)


        );


    }
}
