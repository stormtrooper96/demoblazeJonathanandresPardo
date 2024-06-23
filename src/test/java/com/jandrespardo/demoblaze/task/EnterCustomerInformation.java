package com.jandrespardo.demoblaze.task;

import com.github.javafaker.Faker;
import com.jandrespardo.demoblaze.userinterfaces.CartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.LocalDate;
import java.util.Date;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EnterCustomerInformation implements Task {

    public static Performable entercustomerInformation(){
        return instrumented(EnterCustomerInformation.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(
                        CartPage.NAME_INPUT, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(Faker.instance().friends().character()).into(CartPage.NAME_INPUT),
                Enter.theValue(Faker.instance().country().name()).into(CartPage.COUNTRY_INPUT),
                Enter.theValue(LocalDate.now().getMonth().name()).into(CartPage.MONTH_INPUT),
                Enter.theValue(Faker.instance().finance().creditCard()).into(CartPage.CARD_INPUT),
                Enter.theValue(Faker.instance().address().city()).into(CartPage.CITY_INPUT),
                Enter.theValue(String.valueOf(LocalDate.now().getYear())).into(CartPage.YEAR_INPUT)




        );


    }
}
