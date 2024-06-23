//package com.jandrespardo.demoblaze.questions;
//
//import com.jandrespardo.demoblaze.userinterfaces.ConfirmationPage;
//import net.serenitybdd.screenplay.Actor;
//import net.serenitybdd.screenplay.Question;
//
//public class CardCustomerValue implements Question<String>{
//
//    @Override
//    public String answeredBy(Actor actor) {
//        return ConfirmationPage.CARD_TEXT.resolveFor(actor).getText().split(":")[1].trim();
//    }
//
//    public static Question<String> value() {
//        return new CardCustomerValue();
//    }
//}
