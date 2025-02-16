package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    public void should_return_fizz_when_countOff_given_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 3;
        String expected = FizzBuzzResult.FIZZ;
        String output = fizzBuzz.countOff(number);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    public void should_return_buzz_when_countOff_given_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 5;
        String expected = FizzBuzzResult.BUZZ;
        String output = fizzBuzz.countOff(number);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    public void should_return_whizz_when_countOff_given_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 7;
        String expected = FizzBuzzResult.WHIZZ;
        String output = fizzBuzz.countOff(number);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    public void should_return_fizzbuzz_when_countOff_given_15(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 15;
        String expected = FizzBuzzResult.FIZZ_BUZZ;
        String output = fizzBuzz.countOff(number);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    public void  should_return_fizzwhizz_when_countOff_given_21(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 21;
        String expected = FizzBuzzResult.FIZZ_WHIZZ;
        String output = fizzBuzz.countOff(number);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    public void should_return_buzzwhizz_when_countOff_given_35(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 35;
        String expected = FizzBuzzResult.BUZZ_WHIZZ;
        String output = fizzBuzz.countOff(number);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    public void should_return_fizzbuzzwhizz_when_countOff_given_105(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 105;
        String expected = FizzBuzzResult.FIZZ_BUZZ_WHIZZ;
        String output = fizzBuzz.countOff(number);
        assertThat(output).isEqualTo(expected);
    }
    @Test
    public void should_return_1_when_countOff_given_1(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 1;
        String expected = "1";
        String output = fizzBuzz.countOff(number);
        assertThat(output).isEqualTo(expected);
    }
}
