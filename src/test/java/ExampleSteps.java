import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

/**
 * Created by mego on 11/11/2015.
 */
public class ExampleSteps {

    private int num1;
    private int num2;
    private int sum;
    @Given("two inputs $number1 and $number2")
    public void given(int number1, int number2){
        num1=number1;
        num2=number2;
    }

    @When("we want add them")
    public void when(){
        Calculator calc = new Calculator();
        sum = calc.addition(num1, num2);

    }

    @Then("it should tell us $result")
    public void then(int result){
        Assert.assertEquals(sum,result);
    }


}

