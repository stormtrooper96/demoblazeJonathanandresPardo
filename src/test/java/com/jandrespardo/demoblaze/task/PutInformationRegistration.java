package com.jandrespardo.demoblaze.task;

import com.github.javafaker.Faker;
import com.jandrespardo.demoblaze.userinterfaces.PrincipalPage;
import com.jandrespardo.demoblaze.userinterfaces.RegistrationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PutInformationRegistration  implements Task {

    public static Performable withEnterInformationRegistration(){
        return instrumented(PutInformationRegistration.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Faker data =new Faker();

        actor.attemptsTo(

                WaitUntil.the(RegistrationPage.SIGN_UP_BUTTON,isClickable()).forNoMoreThan(5).seconds(),
                WaitUntil.the(RegistrationPage.USERNAME_INPUT,isClickable()).forNoMoreThan(5).seconds(),
                WaitUntil.the(RegistrationPage.PASSWORD_INPUT,isClickable()).forNoMoreThan(5).seconds(),
                WaitUntil.the(By.id("signInModal"),isVisible()).forNoMoreThan(5).seconds(),

                Enter.theValue(data.artist().name()+data.dragonBall().character()).into(RegistrationPage.USERNAME_INPUT),
                Enter.theValue(data.internet().password()).into(RegistrationPage.PASSWORD_INPUT)


        );
    }
}
