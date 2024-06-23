//package com.jandrespardo.demoblaze.questions;
//
//import com.jandrespardo.demoblaze.userinterfaces.ConfirmationPage;
//import net.serenitybdd.screenplay.Actor;
//import net.serenitybdd.screenplay.Question;
//
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class OrderTotalValue implements Question<String>{
//
//    @Override
//    public String answeredBy(Actor actor) {
//        String texto = ConfirmationPage.AMOUNT_TEXT.resolveFor(actor).getText();
//        String regex = "Amount: (\\d+) USD";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(texto);
//        return matcher.group(1).trim();
//    }
//
//    public static Question<String> value() {
//        return new OrderTotalValue();
//    }
//}
