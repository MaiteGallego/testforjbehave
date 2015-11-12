import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

/**
 * Created by mego on 12/11/2015.
 */
public class RestServiceTest {
    private String urlMessage;
    private String returnedId;

    @Given("a rest service $URL")
    public void given(String url){
       urlMessage="http://jsonplaceholder.typicode.com/posts/1";
    }

    @When("I send a $message")
    public void when(String message){
        returnedId="";
    }

    @Then("The service returns an $identifier")
    public void then(String identifier){
        Assert.assertEquals(identifier,returnedId);
    }
}
