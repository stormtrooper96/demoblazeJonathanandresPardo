package com.jandrespardo.demoblaze.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;

public class PrincipalPage {
    public static final Target REGISTER_BUTTON = Target.the("button sign up").locatedBy("//*[@id='signin2']");
    public static final Target CART_BUTTON = Target.the("button cart").locatedBy("//*[@id='cartur']");
    public static Target CATEGORY_ITEM(String category) {
        return Target.the("category item for " + category)
                .locatedBy("//a[@id='itemc' and contains(@onclick, 'byCat(\"{0}\")')]")
                .of(category);
    }
}
