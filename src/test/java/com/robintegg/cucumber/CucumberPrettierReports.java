package com.robintegg.cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber" })
public class CucumberPrettierReports {

}
