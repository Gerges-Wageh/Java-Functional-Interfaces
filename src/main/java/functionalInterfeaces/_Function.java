package functionalInterfeaces;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        // Using Normal Regular Function
        int increment = increment(1);
        System.out.println(increment);

        // Using Function Functional Interface
        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);


        int multiply = multiplyByTen.apply(increment2);
        System.out.println(multiply);

        int incrementThenMultiply = incrementByOneThenMultiplyByTen.apply(1);
        System.out.println(incrementThenMultiply);

    }

    // Functional interfaces

    // Increment the input by 1
    static Function<Integer, Integer> incrementByOneFunction = number -> number +1;

    // Multiply the input by 10
    static Function<Integer, Integer> multiplyByTen = number -> number * 10;

    //Chaining the two methods first it increments by 1 and then multiplies by 10
    static Function<Integer, Integer> incrementByOneThenMultiplyByTen =
            incrementByOneFunction.andThen(multiplyByTen);




    //Normal Regular Functions

    // Increment the input by 1
    static int increment (int number){
        return number +1;
    }

    // Multiply by 10
    static int multiply (int number){
        return number * 10;
    }

}
