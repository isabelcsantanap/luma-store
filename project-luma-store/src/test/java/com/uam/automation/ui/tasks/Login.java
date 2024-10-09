package com.uam.automation.ui.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.uam.automation.ui.userinterface.HomePage.*;


public class Login implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            NavigateTo.theFormPage(),
                Click.on(SIGN_IN_OPTION),
                Enter.theValue("icsantanap@gmail.com").into(EMAIL_FIELD),
                Enter.theValue("Mundo123*").into(PASSWORD_FIELD),
                Click.on(SIGN_IN_BUTTON)
                //MoveMouse.to() mapear el atributo a o img
        );
    }

    public static Login with() {
       return new Login();
    }
}
