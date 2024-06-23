package com.jandrespardo.demoblaze.stepdefinitions;

import com.jandrespardo.demoblaze.questions.TotalOrderCartPage;
import com.jandrespardo.demoblaze.task.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;

public class PlaceOrderStepDefinitions {
    @When("{actor} selects the {string} category")
    public void he_selects_the_category(Actor actor,String category) {
        actor.attemptsTo(
                SelectCategory.on(category)
        );
    }
    @When("{actor} adds a product {string}")
    public void he_adds_a_product(Actor actor,String product) {
        actor.attemptsTo(
                Selectproduct.on(product)
        );
    }

    @Then("{actor} should see the products in the cart")
    public void he_should_see_the_products_in_the_cart(Actor actor) {

        actor.attemptsTo(
                GotoCartPage.on(),
                ValidateCartPage.validateCartPage()


        );





    }
    @Then("{actor} put the buyer information")
    public void he_put_the_buyer_information(Actor actor) {
        actor.attemptsTo(
                SelectSuccessButtonCart.on(),
                EnterCustomerInformation.entercustomerInformation()
        );
    }
    @Then("{actor} places the order")
    public void he_places_the_order(Actor actor) {
        actor.attemptsTo(
                SelectConfirmButtonCart.on()
        );
    }

    @Then("{actor} validate confirmation message")
    public void heValidateConfirmationMessage(Actor actor) {
        actor.attemptsTo(
                ValidateConfirmationPage.validateConfirmation(
                        Serenity.sessionVariableCalled("total"),
                        Serenity.sessionVariableCalled("name"),
                        Serenity.sessionVariableCalled("card"))
        );
    }
}
