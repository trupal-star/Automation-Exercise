package glue;

import account.Account;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountSteps {

    Account account = null;

    @Given("^Account exists for Acc No\\. \"([^\"]*)\" with Name \"([^\"]*)\"$")
    public void accountExistsForAccNoWithName(String number, String name) {
        throw new PendingException();
    }

    @Given("^deposits are made$")
    public void deposits_are_made(DataTable arg1) throws Throwable {
       throw new PendingException();
    }

    @Given("^withdrawls are made$")
    public void withdrawls_are_made(DataTable arg1) throws Throwable {
       throw new PendingException();
    }

    @When("^statement is produced$")
    public void statement_is_produced() throws Throwable {
       throw new PendingException();
    }

    @Then("^statement includes \"([^\"]*)\"$")
    public void statement_includes(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^statement include \"([^\"]*)\"$")
    public void statement_include(String arg1) throws Throwable {

        throw new PendingException();
    }

    @Then("^Statement includes \"([^\"]*)\"$")
    public void Statement_includes(String arg1) throws Throwable {

        throw new PendingException();
    }


}
