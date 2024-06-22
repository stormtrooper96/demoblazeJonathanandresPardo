package com.jandrespardo.demoblaze.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegistrationPage
{
    public static final Target USERNAME_INPUT = Target.the("input for username").locatedBy("//*[@id='sign-username']");
    public static final Target PASSWORD_INPUT = Target.the("input for password").locatedBy("//*[@id='sign-password']");
    public static final Target SIGN_UP_BUTTON = Target.the("Button for register user").locatedBy("//button[@onclick='register()']");



}
