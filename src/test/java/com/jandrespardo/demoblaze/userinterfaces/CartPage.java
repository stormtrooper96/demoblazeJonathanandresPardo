package com.jandrespardo.demoblaze.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;

public class CartPage {
    public static final Target TOTAL_TEXT = Target.the("Label with total order").locatedBy("//*[@id='totalp']");
    public static final Target SUCCESS_BUTTON = Target.the("button for request order").locatedBy(".btn-success");
    public static final Target CONFIRM_BUTTON = Target.the("button for Confirm order").locatedBy("#orderModal .btn-primary");
    public static final Target NAME_INPUT = Target.the("name customer order").locatedBy("//input[@id='name']");
    public static final Target COUNTRY_INPUT = Target.the("country customer order").locatedBy("//input[@id='country']");
    public static final Target CITY_INPUT = Target.the("City customer order").locatedBy("//input[@id='city']");
    public static final Target CARD_INPUT = Target.the("Card customer order").locatedBy("//input[@id='card']");
    public static final Target MONTH_INPUT = Target.the("month customer order").locatedBy("//input[@id='month']");
    public static final Target YEAR_INPUT = Target.the("month customer order").locatedBy("//input[@id='year']");


}
