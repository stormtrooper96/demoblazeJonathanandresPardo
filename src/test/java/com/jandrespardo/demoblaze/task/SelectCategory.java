package com.jandrespardo.demoblaze.task;


import com.jandrespardo.demoblaze.userinterfaces.PrincipalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectCategory implements Task {
    private String categoryName;

    public SelectCategory() {
    }

    public SelectCategory(String categoryName) {
        this.categoryName = categoryName;
    }

    public  static SelectCategory on(String category){

        return instrumented(SelectCategory.class,category);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                        Click.on(PrincipalPage.CATEGORY_ITEM(categoryName))
        );
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
