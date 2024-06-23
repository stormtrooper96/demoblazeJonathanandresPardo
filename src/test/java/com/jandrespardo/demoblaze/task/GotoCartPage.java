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

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class GotoCartPage implements Task {

    public static Performable on(){
        return instrumented(GotoCartPage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(
                        PrincipalPage.CART_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                    Click.on(PrincipalPage.CART_BUTTON)

        );


    }
}
