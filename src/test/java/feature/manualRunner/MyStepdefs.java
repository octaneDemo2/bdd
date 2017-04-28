package feature.manualRunner;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by alm_alm_auto on 4/27/2017.
 */
public class MyStepdefs {
    @Given("^i run this$")
    public void iRunThis() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^i define one step to throw exception$")
    public void iDefineOneStepToThrowException() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^an exception will not be thrown$")
    public void anExceptionWillNotBeThrown() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new RuntimeException("I want to see this error from octane log.");
    }

    @Given("^the system is up$")
    public void theSystemIsUp() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^I click username and password$")
    public void iClickUsernameAndPassword() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I login into the system$")
    public void iLoginIntoTheSystem() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new Exception("I want to see that exception from Octane logs");
    }
}
