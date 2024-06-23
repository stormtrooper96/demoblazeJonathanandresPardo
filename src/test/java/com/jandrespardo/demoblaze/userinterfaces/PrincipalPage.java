package com.jandrespardo.demoblaze.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;

public class PrincipalPage {
    public static final Target REGISTER_BUTTON = Target.the("button sign up").locatedBy("//*[@id='signin2']");
    public static final Target CART_BUTTON = Target.the("button cart").locatedBy("//*[@id='cartur']");
    public static final Target HOME_BUTTON = Target.the("button Home").locatedBy("(//a[@href='index.html'])[2]");

    public static Target CATEGORY_ITEM(String category) {
        return Target.the("category item for " + category)
                .locatedBy("//a[contains(text(),'{0}')]")
                .of(category);
    }
    public static Target PRODUCT_NAME(String name) {
        return Target.the("product  " + name)
                .locatedBy("//h4[@class='card-title']/a[contains(text(),'{0}')]")
                .of(name);
    }


}
