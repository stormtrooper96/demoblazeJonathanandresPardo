package com.jandrespardo.demoblaze.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ValidateMessage implements Task {
    private String message;

    public ValidateMessage() {
    }

    public ValidateMessage(String message) {
        this.message = message;
    }
    public static Performable compareMessages(String messageR){

        return instrumented(ValidateMessage.class,messageR);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(

                Ensure.that(Switch.toAlert().getText()).isEqualTo(message),
                Switch.toAlert().andAccept()
        );

    }
}
