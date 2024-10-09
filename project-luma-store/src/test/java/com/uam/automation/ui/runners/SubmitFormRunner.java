package com.uam.automation.ui.runners;

import com.uam.automation.ui.tasks.NavigateTo;
import com.uam.automation.ui.tasks.ShippingFormAddress;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static com.uam.automation.ui.userinterface.HomePage.*;
import static
        io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("/features")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value =
        "io.cucumber.core.plugin.SerenityReporterParallel,pretty,timeline:build/test-results/timeline")
public class SubmitFormRunner {

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                ShippingFormAddress.with("Juan", "Perez", "Manisol", "Calle 123", "Medellín")
        );
    }
}

