package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int number) {
        if (FizzBuzzUtil.isFizz(number)) {
            return FizzBuzzResult.FIZZ;
        }
        if (FizzBuzzUtil.isBuzz(number)) {
            return FizzBuzzResult.BUZZ;
        }
        if (FizzBuzzUtil.isWhizz(number)) {
            return FizzBuzzResult.WHIZZ;
        }
        return String.valueOf(number);
    }
}
