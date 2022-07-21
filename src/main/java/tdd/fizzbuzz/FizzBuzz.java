package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int number) {

        if (number%3==0 && number%5==0){
            return "FizzBuzz";
        }

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
