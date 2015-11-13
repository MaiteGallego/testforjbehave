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
       urlMessage="http://jsonplaceholder.typicode.com/posts/";
        helper = new ContactHelper("site","user","password",urlMessage);
    }

    @When("I send a $message")
    public int when(){
        int id = 11;
        Contact contact = helper.GetContact(id);
        return contact.id;
    }

    @Then("The service returns an $identifier")
    public void then(String identifier){

        Assert.assertEquals(when(),11);
    }
}
