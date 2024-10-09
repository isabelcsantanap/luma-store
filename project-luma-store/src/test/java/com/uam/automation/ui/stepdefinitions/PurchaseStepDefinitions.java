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
                Login.with()
        );
    }

    @When("{actor} completes the process of purchasing items")
    public void submitsForm(Actor actor) {
        actor.attemptsTo(
                Product.with());
    }

    @Then("{actor} transaction success message is generated")
    public void shouldSeeFormSubmitted(Actor actor) {
        actor.attemptsTo(
                ShippingFormAddress.with("Isabel", "Santana",
                        "Autonoma", "Carrera 20 5-20",
                        "Manizales", "California", "00000"));
    }
}


