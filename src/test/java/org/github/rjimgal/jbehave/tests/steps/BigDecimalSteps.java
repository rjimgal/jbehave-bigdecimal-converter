package org.github.rjimgal.jbehave.tests.steps;

import java.math.BigDecimal;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.springframework.stereotype.Component;

@Component
public class BigDecimalSteps {

    @Given("a wrong BigDecimal with value $value")
    public void restartScenario(final BigDecimal bigDecimal) {
        System.out.println(String.format("Big Decimal value read is '%s'", String.valueOf(bigDecimal)));
    }

    @Then("this is not executed")
    public void twoExecutions() {
        throw new RuntimeException("********** This shouldn't be executed **********");
    }

}