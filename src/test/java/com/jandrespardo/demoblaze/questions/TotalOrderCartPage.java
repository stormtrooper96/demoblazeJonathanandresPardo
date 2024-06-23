package com.jandrespardo.demoblaze.questions;

import com.jandrespardo.demoblaze.userinterfaces.CartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TotalOrderCartPage implements Question<Integer>{

    @Override
    public Integer answeredBy(Actor actor) {
        String valueTotal=CartPage.TOTAL_TEXT.resolveFor(actor).getText();
        return Integer.parseInt(valueTotal);

    }

    public static Question<Integer> value() {
        return new TotalOrderCartPage();
    }
}
