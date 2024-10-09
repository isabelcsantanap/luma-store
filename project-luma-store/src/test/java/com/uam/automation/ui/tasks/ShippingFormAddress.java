package com.uam.automation.ui.tasks;

import com.uam.automation.ui.userinterface.HomePage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static com.uam.automation.ui.userinterface.HomePage.*;


public class ShippingFormAddress implements Task {
    private final String name;
    private final String lastname;
    private final String company;
    private final String streetAddress;
    private final String city;
    private final String state;
    private final String postcode;
    private final String country;
    private final String telephone;

    public ShippingFormAddress (String name, String lastname, String company,
                                String streetAddress, String city, String state,
                                String postcode, String country, String telephone) {
        this.name = name;
        this.lastname = lastname;
        this.company = company;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.postcode = postcode;
        this.country = country;
        this.telephone = telephone;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Enter.theValue(name).into(FIRST_NAME),
                Enter.theValue(lastname).into(LAST_NAME),
                Enter.theValue(company).into(COMPANY),
                Enter.theValue(streetAddress).into(STREET_ADDRESS),
                Enter.theValue(city).into(CITY),
                SelectFromOptions.byVisibleText(state).from(HomePage.STATE),
                Enter.theValue(postcode).into(POST_CODE),
                SelectFromOptions.byVisibleText(country).from(HomePage.COUNTRY),
                Enter.theValue(telephone).into(TELEPHONE),
                Click.on(METHOD), //Click envio por defecto
                Click.on(NEXT_BUTTON),
                Click.on(ORDER_BUTTON)
        );
    }

    public static ShippingFormAddress with(String name, String lastname, String company,
                                           String streetAddress, String city, String state,
                                           String postcode, String country, String telephone) {

        return new ShippingFormAddress(name, lastname, company, streetAddress,
                city, state, postcode, country, telephone);

    }

}



