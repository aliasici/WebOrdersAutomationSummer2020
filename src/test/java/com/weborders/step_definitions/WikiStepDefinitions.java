package com.weborders.step_definitions;

import com.weborders.pages.WikiSearchPage;
import com.weborders.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class WikiStepDefinitions {

    WikiSearchPage wikiSearchPage = new WikiSearchPage();

    @Given("User is on the Wikipedia home page")
    public void user_is_on_the_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org");

    }


    @When("User searches {string} in the wiki search page")
    public void user_searches_in_the_wiki_search_page(String string) {
        wikiSearchPage.searchBox.sendKeys(string+ Keys.ENTER);



    }
    @Then("User should see {string} in the wiki title")
    public void user_should_see_in_the_wiki_title(String expectedInTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        //String expectedTitle = "Steve Jobs-Wikipedia";

        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

    @Then("User should see {string} in the main header")
    public void userShouldSeeInTheMainHeader(String expected) {

        String actualHeaderText = wikiSearchPage.mainHeaderAfterSearch.getText();

        Assert.assertTrue(actualHeaderText.equalsIgnoreCase(expected));


    }

    @When("User searches {string} in the wiki {int} search page")
    public void userSearchesInTheWikiSearchPage(String arg0, int arg1) {
    }

    @Then("User should see {string} in the image header")
    public void userShouldSeeInTheImageHeader(String expectedHeader) {

       String actualHeader = wikiSearchPage.imageHeaderAfterSearch.getText();

       Assert.assertEquals(actualHeader,expectedHeader);


    }

    @Then("User should see {string} in the image")
    public void userShouldSeeInTheImage(String expectedImageName) {
        String actualHeader = wikiSearchPage.imageHeaderAfterSearch.getText();

        Assert.assertTrue(actualHeader.equalsIgnoreCase(expectedImageName));



    }
}
