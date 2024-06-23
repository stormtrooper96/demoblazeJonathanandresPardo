package com.jandrespardo.demoblaze.questions;

import com.jandrespardo.demoblaze.userinterfaces.ConfirmationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class OrderConfirmationText implements Question<String>{

    @Override
    public String answeredBy(Actor actor) {
        return ConfirmationPage.TEXT_DESCRIPTION.resolveFor(actor).getText();
    }

    public static Question<String> value() {
        return new OrderConfirmationText();
    }
}
