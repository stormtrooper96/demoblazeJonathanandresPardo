package com.jandrespardo.demoblaze.stepdefinitions;

import com.jandrespardo.demoblaze.task.EnterToRegistration;
import com.jandrespardo.demoblaze.task.PutInformationRegistration;
import com.jandrespardo.demoblaze.task.ValidateMessage;
import com.jandrespardo.demoblaze.userinterfaces.PrincipalPage;
import com.jandrespardo.demoblaze.userinterfaces.RegistrationPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RegisterStepDefinitions {

@Given("{actor} is on principal page")
public void user_is_on_principal_page(Actor actor) {
    actor.attemptsTo(Open.url("https://www.demoblaze.com/"),
            WaitUntil.the(
                    PrincipalPage.REGISTER_BUTTON, isVisible()).forNoMoreThan(10).seconds());

}
    @Then("{actor} is on the registration page")
    public void userIsOnTheRegistrationPage(Actor actor) {
        actor.attemptsTo(EnterToRegistration.withEnterRegistration() );
    }

    @When("{actor} enters a valid username and password")
    public void heEntersAValidUsernameAndPassword(Actor actor) {
        actor.attemptsTo(PutInformationRegistration.withEnterInformationRegistration() );

    }


    @And("{actor} clicks on the register button")
    public void heClicksOnTheRegisterButton(Actor actor) {
actor.attemptsTo(Click.on(RegistrationPage.SIGN_UP_BUTTON));
}



    @Then("{actor} should see a message {string}")
    public void he_should_see_a_registration(Actor actor,String string) throws InterruptedException {
            actor.attemptsTo(ValidateMessage.compareMessages(string));
    }

    @And("{actor} enters a valid password")
    public void heEntersAValidPassword(Actor actor) {
        actor.attemptsTo(
                Enter.theValue("passordww").into(RegistrationPage.PASSWORD_INPUT)

        );
    }



}
