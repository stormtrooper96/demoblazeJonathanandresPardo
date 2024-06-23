package com.jandrespardo.demoblaze.task;

import com.jandrespardo.demoblaze.userinterfaces.CartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectConfirmButtonCart implements Task {

    public static Performable on(){
        return instrumented(SelectConfirmButtonCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(
                        CartPage.CONFIRM_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to( CartPage.CONFIRM_BUTTON),
        Click.on( CartPage.CONFIRM_BUTTON)


        );


    }
}
