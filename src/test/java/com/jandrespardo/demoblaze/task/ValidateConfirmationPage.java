package com.jandrespardo.demoblaze.task;

import com.jandrespardo.demoblaze.questions.*;
import com.jandrespardo.demoblaze.userinterfaces.ConfirmationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidateConfirmationPage implements Task {

    public static Performable validateConfirmation(String total,String name, String card){
        return instrumented(ValidateConfirmationPage.class,total,name,card);
    }
    private String total;
    private String name;
    private String card;

    public ValidateConfirmationPage() {
    }

    public ValidateConfirmationPage(String total, String name, String card) {
        this.total = total;
        this.name = name;
        this.card = card;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       String textOrder= OrderConfirmationText.value().answeredBy(actor);

        String[] dataOrder = textOrder.split("\\n");

        actor.attemptsTo(
                WaitUntil.the(
                        ConfirmationPage.SUCCESS_TEXT, isVisible()).forNoMoreThan(10).seconds(),
                Ensure.that(ConfirmationPage.TEXT_DESCRIPTION).isDisplayed()
                                );
        for (String line : dataOrder) {
            String[] parts = line.split(":");
            if (parts.length == 2) {
                String key = parts[0].trim();
                String value = parts[1].trim();

                switch (key) {
                    case "Id":
                        actor.attemptsTo(
                                Ensure.that(value).not().isEqualTo("0")
                        );
                        break;

                    case "Name":
                        actor.attemptsTo(
                                Ensure.that(value).isEqualTo(name)
                        );
                        break;
                    case "Card Number":
                        actor.attemptsTo(
                                Ensure.that(value).isEqualTo(card)
                        );
                        break;
                    case "Amount":
                        try {
                            int amount = Integer.parseInt(value.split(" ")[0]);
                            int totalOrder= Integer.parseInt(total);
                            Ensure.that(amount).isEqualTo(totalOrder);
                        } catch (NumberFormatException e) {
                            System.out.println("Error al parsear el monto: " + value);
                        }
                        break;
                    default:
                        break;
                }
            }
        }
    }
}




