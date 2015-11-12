import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

/**
 * Created by mego on 12/11/2015.
 */
public class RestServiceTest {
    private String urlMessage;
    private int returnedId;
    private ContactHelper helper;

    @Given("a rest service $URL")
    public void given(String url){
       urlMessage="http://jsonplaceholder.typicode.com/posts/1";
        helper = new ContactHelper("","","",urlMessage);
    }

    @When("I send a $message")
    public void when(String message){
        int id = 10;
        Contact contact = helper.GetContact(id);
        returnedId = contact.id;
    }

    @Then("The service returns an $identifier")
    public void then(String identifier){
        Assert.assertEquals(returnedId,10);
    }
}
