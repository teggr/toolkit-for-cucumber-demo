package com.robintegg.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CalculatorSteps {

	@Given("I have the numbers {int} and {int}")
	public void i_have_the_numbers_and(Integer int1, Integer int2) {

	}

	@When("I use the calculator to add the two numbers together")
	public void i_use_the_calculator_to_add_the_two_numbers_together() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@When("this is never used")
	public void this_is_never_used() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

}
