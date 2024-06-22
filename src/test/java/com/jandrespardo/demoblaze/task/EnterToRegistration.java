package com.jandrespardo.demoblaze.task;

import com.jandrespardo.demoblaze.userinterfaces.PrincipalPage;
import com.jandrespardo.demoblaze.userinterfaces.RegistrationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.matchers.statematchers.IsVisibleMatcher;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilTargetIsReady;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EnterToRegistration implements Task {

    public static Performable withEnterRegistration(){
        return instrumented(EnterToRegistration.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(
                        PrincipalPage.REGISTER_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
        Click.on(PrincipalPage.REGISTER_BUTTON),

              Click.on(By.xpath("//div[@id='signInModal']/div/div"))
        );


    }
}
