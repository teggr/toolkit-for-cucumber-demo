package com.robintegg.cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:")
public class CucumberExtent {

}
