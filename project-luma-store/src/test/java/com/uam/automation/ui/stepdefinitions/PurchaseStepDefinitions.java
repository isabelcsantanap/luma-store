package com.uam.automation.ui.stepdefinitions;

import com.uam.automation.ui.tasks.Login;
import com.uam.automation.ui.tasks.Product;
import com.uam.automation.ui.tasks.ShippingFormAddress;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;


public class PurchaseStepDefinitions {
   
    @Given("{actor} is on the homepage")
    public void navigatingOnInternet(Actor actor) {

        actor.wasAbleTo(
                Login.with(),
                Product.with(),
                ShippingFormAddress.with()
        );
    }

    @When("{actor} completes the process of purchasing items")//devuelve un actor que le ingreso en
    public void submitsForm(Actor actor) {
        actor.attemptsTo(

        );

    }

    @Then("{actor} transaction success message is generated")
    public void shouldSeeFormSubmitted(Actor actor) {

    }
}


