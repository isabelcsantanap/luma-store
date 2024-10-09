package com.uam.automation.ui.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static com.uam.automation.ui.userinterface.HomePage.*;


public class ShippingFormAddress implements Task {
    private final String name;
    private final String lastname;
    private final String company;
    private final String streetAddress;
    private final String city;
    /*private String postalCode;
    private String phoneNumber;
    private String shippingMethods;*/

    public ShippingFormAddress (String name, String lastname, String company, String streetAddress, String city
                                /*String postalCode, String phoneNumber, String shippingMethods*/) {
        this.name = name;
        this.lastname = lastname;
        this.company = company;
        this.streetAddress = streetAddress;
        this.city = city;
        /*this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
        this.shippingMethods = shippingMethods;*/
    }

    public static Performable with() {

        return null;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Enter.theValue(name).into(FIRST_NAME),
                Enter.theValue(lastname).into(LAST_NAME),
                Enter.theValue(company).into(COMPANY),
                Enter.theValue(streetAddress).into(STREET_ADDRESS),
                Enter.theValue(city).into(CITY)
                /*Enter.theValue(city).into(CITY),
                Enter.theValue(city).into(CITY),
                Enter.theValue(city).into(CITY),*/
                //MoveMouse.to() mapear el atributo a o img

        );
    }

    public static ShippingFormAddress with(String name, String lastname, String company, String streetAddress, String city
                                           /*String postalCode, String phoneNumber, String shippingMethods*/) {

        return new ShippingFormAddress(name, lastname, company, streetAddress, city);

    }

}



