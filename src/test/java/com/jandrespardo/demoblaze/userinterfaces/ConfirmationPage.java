package com.jandrespardo.demoblaze.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;

public class ConfirmationPage {
    public static final Target SUCCESS_TEXT = Target.the("Text for confirmate the order is proccesed").locatedBy("//h2[text()='Thank you for your purchase!']");
    public static final Target TEXT_DESCRIPTION = Target.the("id for proccesed order").locatedBy("/html/body/div[10]/p");
    public static final Target BUTTON_OK = Target.the("Button Ok for proccesed order").locatedBy(".confirm");


}
