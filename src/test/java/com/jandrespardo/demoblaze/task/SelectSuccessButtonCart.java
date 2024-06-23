package com.jandrespardo.demoblaze.task;

import com.jandrespardo.demoblaze.userinterfaces.CartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectSuccessButtonCart implements Task {

    public static Performable on(){
        return instrumented(SelectSuccessButtonCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(
                        CartPage.SUCCESS_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
        Click.on( CartPage.SUCCESS_BUTTON)


        );


    }
}
