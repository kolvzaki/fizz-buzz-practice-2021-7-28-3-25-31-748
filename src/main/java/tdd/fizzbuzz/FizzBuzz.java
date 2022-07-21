package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int number) {
        if (FizzBuzzUtil.isFizz(number)) {
            if (FizzBuzzUtil.isFizzBuzz(number)){
                return FizzBuzzResult.FIZZ_BUZZ;
            }
            if (number%3==0&&number%7==0){
                return "FizzWhizz";
            }
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
