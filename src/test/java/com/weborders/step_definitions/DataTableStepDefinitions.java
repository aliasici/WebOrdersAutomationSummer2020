package com.weborders.step_definitions;

import io.cucumber.java.en.Then;

import java.util.List;

public class DataTableStepDefinitions {

    @Then("User should see blow words displayed")
    public void user_should_see_blow_words_displayed(List<String> fruitList) {
        // print out size of the list
        // size method coming from list

        System.out.println("fruitList.size() = " + fruitList.size());
        System.out.println("fruitList = " + fruitList);

    }

}
