package steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.junit.Assert.assertEquals;

/**
 * Created by Reuven on 11/23/14.
 */
public class JbehaveSteps {

    int x;

    @Given("User has value $value")
    public void given(String value) {
        x=Integer.valueOf(value);
    }

    @When("User adds value $value")
    public void when(String value) {
        x=x+Integer.valueOf(value);
    }

    @Then("User has value $value")
    public void then(String value) {
        assertEquals(value,String.valueOf(x));
    }
}
