package feature.manualRunner;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by alm_alm_auto on 12/6/2016.
 */
public class MyStepdefs {
    @When("^user is in send email dialog$")
    public void userIsInSendEmailDialog() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("^user click the send button$")
    public void userClickTheSendButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @And("^something new$")
    public void somethingNew() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^spell check should be triggered and prompt user if errors were find$")
    public void spellCheckShouldBeTriggeredAndPromptUserIfErrorsWereFound() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new Exception("this step is no good");

    }

    @And("^something new this part added$")
    public void somethingNewThisPartAdded() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^user is in somthing$")
    public void userIsInSomthing() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("^something$")
    public void something() throws Throwable {
        // Write cde here that turns the phrase above into concrete actions

    }

    @When("^do it$")
    public void doIt() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^check it again")
    public void checkIt() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //Assert.assertEquals("good result", "bad result");
    }

    @And("^something new to this part was added$")
    public void somethingNewToThisPartWasAdded() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new Error("The test has gone CAPOOT");
    }

    @Given("^a customer named \"([^\"]*)\"$")
    public void aCustomerNamed(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Given("^I am logged in as Julio$")
    public void iAmLoggedInAsJulio() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Given("^I have at least one item in cart$")
    public void iHaveAtLeastOneItemInCart() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I try to buy items in my cart$")
    public void iTryToBuyItemsInMyCart() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^I should be asked for my payment method$")
    public void iShouldBeAskedForMyPaymentMethod() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }
}
