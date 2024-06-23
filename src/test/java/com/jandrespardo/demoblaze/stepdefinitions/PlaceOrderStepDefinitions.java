package com.jandrespardo.demoblaze.stepdefinitions;

import com.jandrespardo.demoblaze.questions.TotalOrderCartPage;
import com.jandrespardo.demoblaze.task.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.Product;
import models.ProductsOrders;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;

import java.util.List;

public class PlaceOrderStepDefinitions {
    private ProductsOrders productsOrders;

    @Before
public void setUp() {
        productsOrders = new ProductsOrders();
}

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
    @Given("{actor} adds multiples products with category")
    public void he_adds_multiples_products_with_category(Actor actor,DataTable dataTable) {
        List<List<String>> rows = dataTable.asLists(String.class);

        for (List<String> columns : rows) {
            productsOrders.addProduct(new Product(columns.get(0), columns.get(1)));
            actor.attemptsTo(
                    SelectCategory.on(columns.get(0)),
                    Selectproduct.on(columns.get(1)),
                   ValidateMessage.compareMessages("Product added")
            );

        }
    }

}
