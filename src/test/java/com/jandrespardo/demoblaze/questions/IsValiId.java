//package com.jandrespardo.demoblaze.questions;
//
//import com.jandrespardo.demoblaze.userinterfaces.ConfirmationPage;
//import net.serenitybdd.screenplay.Actor;
//import net.serenitybdd.screenplay.Question;
//
//public class IsValiId implements Question<Boolean>{
//
//    @Override
//    public Boolean answeredBy(Actor actor) {
//        return Integer.parseInt(ConfirmationPage.NAME_TEXT.resolveFor(actor).getText().split(":")[1])>0;
//    }
//
//    public static Question<Boolean> value() {
//        return new IsValiId();
//    }
//}
