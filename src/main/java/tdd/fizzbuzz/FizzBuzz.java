package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int number){
        if (FizzBuzzUtil.isFizz(number)){
            return FizzBuzzResult.FIZZ;
        }
        if (FizzBuzzUtil.isBuzz(number)){
            return FizzBuzzResult.BUZZ;
        }
        if (number%7==0){
            return "Whizz";
        }
        return String.valueOf(number);
    }
}
