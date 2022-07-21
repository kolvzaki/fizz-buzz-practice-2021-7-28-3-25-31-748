package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int number){
        if (FizzBuzzUtil.isFizz(number)){
            return FizzBuzzResult.FIZZ;
        }
        return String.valueOf(number);
    }
}
