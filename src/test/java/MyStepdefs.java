import caculator.Calculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class MyStepdefs {

    private Calculator calc;

    @Given("I have first number {int}")
    public void iHaveFirstNumber(int first) {
        calc = new Calculator();
        calc.setFirst(first);
    }

    @Given("I have second number {int}")
    public void iHaveSecondNumber(int arg0) {
        System.out.println("second " +arg0);
        calc.setSecond(arg0);
    }

    @When("I try to add them")
    public void iTryToAddThem() {
        System.out.println("adding....");
        calc.add();
    }

    @When("I try to multiply them")
    public void i_try_to_multiply_them() {
        calc.mul();
    }

    @Then("I get the result {int}")
    public void iGetTheResult(int arg0) {
        System.out.println("result " +arg0);

        int actual = calc.getResult();
        int expected = arg0;

        assertEquals(expected, actual);
    }




}
