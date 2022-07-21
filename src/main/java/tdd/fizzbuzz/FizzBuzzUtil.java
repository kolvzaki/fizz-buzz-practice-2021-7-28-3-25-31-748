package tdd.fizzbuzz;

public class FizzBuzzUtil {
    public static Boolean isFizz(int number){
        return number % 3 == 0;
    }

    public static Boolean isBuzz(int number){
        return number % 5 == 0;
    }
}
