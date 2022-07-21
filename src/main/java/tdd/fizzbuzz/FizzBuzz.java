package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int number){
        if (FizzBuzzUtil.isFizz(number)){
            return FizzBuzzResult.FIZZ;
        }
        if (FizzBuzzUtil.isBuzz(number)){
            return FizzBuzzResult.BUZZ;
        }
        return String.valueOf(number);
    }
}
