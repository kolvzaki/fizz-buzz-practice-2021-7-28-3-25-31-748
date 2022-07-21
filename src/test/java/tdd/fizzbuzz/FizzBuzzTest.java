package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    public void should_return_fizz_when_countOff_given_3(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 3;
        String expected = "Fizz";
        String output = fizzBuzz.countOff(number);

        assertThat(output).isEqualTo(expected);
    }
}
