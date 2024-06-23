package com.jandrespardo.demoblaze.task;

import com.jandrespardo.demoblaze.userinterfaces.PrincipalPage;
import com.jandrespardo.demoblaze.userinterfaces.ProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Selectproduct implements Task {
    private String productName;

    public Selectproduct() {
    }

    public Selectproduct(String productName) {
        this.productName = productName;
    }

    public  static Selectproduct on(String product){

        return instrumented(Selectproduct.class,product);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(PrincipalPage.PRODUCT_NAME(productName) , isVisible()).forNoMoreThan(5).seconds(),
                        Click.on(PrincipalPage.PRODUCT_NAME(productName)),
                WaitUntil.the(ProductPage.ADD_CART_BUTTON , isVisible()).forNoMoreThan(5).seconds(),
                Click.on(ProductPage.ADD_CART_BUTTON )

                );
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
