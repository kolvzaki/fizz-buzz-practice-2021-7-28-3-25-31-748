package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int number){
        if (FizzBuzzUtil.isFizz(number)){
            return FizzBuzzResult.FIZZ;
        }
        if (number%5==0){
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
